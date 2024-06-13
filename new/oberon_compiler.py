from antlr4 import *
from OberonLexer import OberonLexer
from OberonParser import OberonParser
from OberonListener import OberonListener
from llvmlite import ir, binding
import sys
import re
import subprocess
import os
import operator

ops = {
    '+': operator.add,
    '-': operator.sub,
    '*': operator.mul,
    '/': operator.floordiv,
    '<': operator.lt,
    '>': operator.gt,
    '<=': operator.le,
    '>=': operator.ge,
    '==': operator.eq,
    '!=': operator.ne,
}


class OberonToLLVM(OberonListener):
    def __init__(self):
        self.module = ir.Module(name='oberon_module')
        self.builder = None
        self.symbols = {}
        self.current_function = None
        self.printf = None

    def enterModule(self, ctx: OberonParser.ModuleContext):
        voidptr_ty = ir.IntType(8).as_pointer()

        # Declare printf
        self.printf = ir.Function(
            self.module, ir.FunctionType(ir.IntType(32), [voidptr_ty], var_arg=True), name="printf"
        )

        # Create main function
        func_type = ir.FunctionType(ir.IntType(32), [], False)
        self.current_function = ir.Function(self.module, func_type, name='main')
        block = self.current_function.append_basic_block(name='entry')
        self.builder = ir.IRBuilder(block)

    def exitModule(self, ctx: OberonParser.ModuleContext):
        # Return the value of n
        if 'n' in self.symbols:
            self.builder.ret(self.builder.load(self.symbols['n']))
        else:
            self.builder.ret(ir.Constant(ir.IntType(32), 0))

    def declare_global_string(self, string_value):
        string_type = ir.ArrayType(ir.IntType(8), len(string_value) + 1)
        global_string = ir.GlobalVariable(self.module, string_type, name=f".str{len(self.symbols)}")
        global_string.initializer = ir.Constant(string_type, bytearray(string_value.encode("utf8") + b'\00'))
        global_string.global_constant = True
        return global_string

    def enterVariableDeclaration(self, ctx: OberonParser.VariableDeclarationContext):
        var_type_name = ctx.type_().getText().upper()  # Changed type to type_

        # Получаем список идентификаторов через метод identList()
        id_list_ctx = ctx.identList()

        # Сбор текстов для каждого идентификатора в списке identificatorList
        var_names = [ident.getText() for ident in id_list_ctx.identdef()]

        var_type = None
        array_pattern = re.compile(r"ARRAY\s*(\d+)\s*OF\s*(\w+)", re.IGNORECASE)
        match = array_pattern.match(var_type_name)

        if match:
            size = int(match.group(1))
            element_type_str = match.group(2).upper()
            if element_type_str == "INTEGER":
                var_type = ir.ArrayType(ir.IntType(32), size)
            else:
                print(f"Error: Unsupported array element type {element_type_str}")
                sys.exit(1)
        else:
            if var_type_name == "INTEGER":
                var_type = ir.IntType(32)
            else:
                print(f"Error: Unsupported variable type {var_type_name}")
                sys.exit(1)

        for name in var_names:
            if var_type is not None:
                self.symbols[name] = self.builder.alloca(var_type, name=name)

    def enterAssignment(self, ctx):
        designator_ctx = ctx.designator()
        var_name_ctx = designator_ctx.qualident().ident()
        var_name = var_name_ctx.getText()

        expression_ctx = ctx.expression()
        var_value = self.evaluate_expression(expression_ctx.getText())

        if var_name not in self.symbols:
            var_alloca = self.builder.alloca(ir.IntType(32), name=var_name)
            self.symbols[var_name] = var_alloca

        self.builder.store(var_value, self.symbols[var_name])
        print(f"Assigned {var_value.constant} to variable {var_name}")

    def evaluate_expression(self, expression_text):
        for op_symbol, op_func in ops.items():
            if op_symbol in expression_text:
                left_text, right_text = map(lambda s: s.strip(), expression_text.split(op_symbol, 1))
                left_value = self.evaluate_expression(left_text)
                right_value = self.evaluate_expression(right_text)

                # Load values if they are of the AllocaInstr type
                if isinstance(left_value, ir.instructions.AllocaInstr):
                    left_value = self.builder.load(left_value)
                if isinstance(right_value, ir.instructions.AllocaInstr):
                    right_value = self.builder.load(right_value)

                # Perform the operation and create a new instruction
                if isinstance(left_value, ir.Constant) and isinstance(right_value, ir.Constant):
                    result_value = op_func(left_value.constant, right_value.constant)
                    return ir.Constant(ir.IntType(32), result_value)
                else:
                    return op_func(left_value, right_value)

        # Check if the expression is a variable and load it if necessary
        if expression_text in self.symbols:
            variable = self.symbols[expression_text]
            if isinstance(variable, ir.instructions.AllocaInstr):
                return self.builder.load(variable)
            return variable

        # Attempt to interpret the expression as a constant integer
        try:
            return ir.Constant(ir.IntType(32), int(expression_text))
        except ValueError:
            raise ValueError(f"Unknown identifier or complex expression: '{expression_text}'")

    def enterWhileStatement(self, ctx: OberonParser.WhileStatementContext):
        from llvmlite import ir

        # Создаем базовые блоки для цикла
        loop_entry = self.builder.append_basic_block('loop_entry')
        loop_body = self.builder.append_basic_block('loop_body')
        loop_end = self.builder.append_basic_block('loop_end')

        # Переходим к началу цикла
        self.builder.branch(loop_entry)
        self.builder.position_at_end(loop_entry)

        # Получаем выражение условия и вычисляем его
        condition_expression = ctx.expression(0).getText()
        condition = self.evaluate_expression(condition_expression)
        self.builder.cbranch(condition, loop_body, loop_end)

        # Генерируем код тела цикла
        self.builder.position_at_end(loop_body)
        self.enterStatementSequence(ctx.statementSequence())
        self.builder.branch(loop_entry)

        # Завершаем цикл
        self.builder.position_at_end(loop_end)

    def enterStatementSequence(self, ctx: OberonParser.StatementSequenceContext):
        for statement in ctx.statement():
            if isinstance(statement, OberonParser.AssignmentContext):
                self.enterAssignment(statement)
            elif isinstance(statement, OberonParser.WhileStatementContext):
                self.enterWhileStatement(statement)
            elif isinstance(statement, OberonParser.IfStatementContext):
                self.enterIfStatement(statement)
            elif isinstance(statement, OberonParser.RepeatStatementContext):
                self.enterRepeatStatement(statement)
            elif isinstance(statement, OberonParser.ForStatementContext):
                self.enterForStatement(statement)
            elif isinstance(statement, OberonParser.ProcedureCallContext):
                self.enterProcedureCall(statement)
            else:
                print(f"Unknown statement type: {type(statement)}")

    def enterIfStatement(self, ctx: OberonParser.IfStatementContext):
        if_entry = self.builder.append_basic_block('if_entry')
        if_end = self.builder.append_basic_block('if_end')

        condition_expression = ctx.expression().getText()
        condition = self.evaluate_expression(condition_expression)

        self.builder.cbranch(condition, if_entry, if_end)

        self.builder.position_at_end(if_entry)
        self.enterStatementSequence(ctx.statementSequence(0))
        self.builder.branch(if_end)

        self.builder.position_at_end(if_end)

    def enterRepeatStatement(self, ctx: OberonParser.RepeatStatementContext):
        repeat_entry = self.builder.append_basic_block('repeat_entry')
        repeat_body = self.builder.append_basic_block('repeat_body')
        repeat_end = self.builder.append_basic_block('repeat_end')

        self.builder.branch(repeat_entry)
        self.builder.position_at_end(repeat_entry)

        self.builder.branch(repeat_body)
        self.builder.position_at_end(repeat_body)
        self.enterStatementSequence(ctx.statementSequence())

        condition_expression = ctx.expression().getText()
        condition = self.evaluate_expression(condition_expression)
        self.builder.cbranch(condition, repeat_entry, repeat_end)

        self.builder.position_at_end(repeat_end)

    def enterForStatement(self, ctx: OberonParser.ForStatementContext):
        for_entry = self.builder.append_basic_block('for_entry')
        for_body = self.builder.append_basic_block('for_body')
        for_end = self.builder.append_basic_block('for_end')

        self.builder.branch(for_entry)
        self.builder.position_at_end(for_entry)

        init_expr = self.evaluate_expression(ctx.expression(0).getText())
        end_expr = self.evaluate_expression(ctx.expression(1).getText())
        step_expr = self.evaluate_expression(ctx.expression(2).getText()) if ctx.expression(2) else ir.Constant(
            ir.IntType(32), 1)

        var_name = ctx.ident().getText()
        self.symbols[var_name] = init_expr

        self.builder.branch(for_body)
        self.builder.position_at_end(for_body)
        self.enterStatementSequence(ctx.statementSequence())

        self.symbols[var_name] = ops['+'](self.symbols[var_name].constant, step_expr.constant)
        if self.symbols[var_name].constant != end_expr.constant:
            self.builder.branch(for_entry)
        else:
            self.builder.branch(for_end)

        self.builder.position_at_end(for_end)

    def enterProcedureCall(self, ctx: OberonParser.ProcedureCallContext):
        func_name = ctx.designator().ident().getText()
        if func_name in self.symbols:
            self.builder.call(self.symbols[func_name], [])


def main(input_file):
    input_stream = FileStream(input_file)
    lexer = OberonLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = OberonParser(stream)

    tree = parser.module()

    listener = OberonToLLVM()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    with open("output.ll", "w") as f:
        f.write(str(listener.module))

    def generate_object_file(llvm_ir_file, output_obj_file):
        try:
            subprocess.run(
                ['llc', '-mtriple=x86_64-apple-macosx10.15.0', '-filetype=obj', '-o', output_obj_file, llvm_ir_file],
                check=True)
        except FileNotFoundError:
            print("Error: 'llc' not found. Make sure LLVM is installed and 'llc' is in your PATH.")
            sys.exit(1)

    def generate_executable(object_file, executable_file):
        try:
            subprocess.run(['gcc', object_file, '-o', executable_file], check=True)
        except FileNotFoundError:
            print("Error: 'gcc' not found. Make sure GCC is installed and 'gcc' is in your PATH.")
            sys.exit(1)

    llvm_ir_file = "output.ll"
    object_file = "output.o"
    executable_file = "output"

    generate_object_file(llvm_ir_file, object_file)
    generate_executable(object_file, executable_file)


if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("Usage: python3 oberon_compiler.py <input_file>")
        sys.exit(1)
    input_file = sys.argv[1]
    main(input_file)