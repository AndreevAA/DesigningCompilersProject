import llvmlite.ir as ir
import llvmlite.binding as llvm
from antlr4 import *
from OberonLexer import OberonLexer
from OberonParser import OberonParser
from OberonVisitor import OberonVisitor


class OberonCompiler(OberonVisitor):
    def __init__(self):
        self.module = ir.Module(name="main")
        self.builder = None
        self.symbols = {}

    def visitModule(self, ctx):
        module_name = ctx.ident(0).getText()
        print(f"Compiling module: {module_name}")

        func_type = ir.FunctionType(ir.VoidType(), [], False)
        main_func = ir.Function(self.module, func_type, name="main")
        block = main_func.append_basic_block(name="entry")
        self.builder = ir.IRBuilder(block)

        self.visit(ctx.declarationSequence())
        if ctx.statementSequence():
            self.visit(ctx.statementSequence())

        self.builder.ret_void()
        return self.module

    def visitConstDeclaration(self, ctx):
        name = ctx.identdef().getText()
        value = int(ctx.constExpression().getText())
        const_val = ir.Constant(ir.IntType(32), value)
        self.symbols[name] = const_val

    def visitVariableDeclaration(self, ctx):
        var_type = ctx.type_().getText()
        for var in ctx.identList().identdef():
            var_name = var.getText()
            ptr = self.builder.alloca(ir.IntType(32), name=var_name)
            self.symbols[var_name] = ptr

    def visitAssignment(self, ctx):
        var_name = ctx.designator().getText()
        value = self.visit(ctx.expression())
        ptr = self.symbols.get(var_name)
        if ptr:
            self.builder.store(value, ptr)
        else:
            raise Exception(f"Variable {var_name} not declared.")

    def visitExpression(self, ctx):
        if ctx.simpleExpression():
            if len(ctx.simpleExpression()) == 1:
                return self.visit(ctx.simpleExpression(0))
            else:
                left = self.visit(ctx.simpleExpression(0))
                for i in range(1, len(ctx.simpleExpression())):
                    operator = ctx.relOperator(i - 1).getText()
                    right = self.visit(ctx.simpleExpression(i))

                    if operator == '<':
                        left = self.builder.icmp_signed('<', left, right)
                    elif operator == '<=':
                        left = self.builder.icmp_signed('<=', left, right)
                    elif operator == '>':
                        left = self.builder.icmp_signed('>', left, right)
                    elif operator == '>=':
                        left = self.builder.icmp_signed('>=', left, right)
                    elif operator == '==':
                        left = self.builder.icmp_signed('==', left, right)
                    elif operator == '!=':
                        left = self.builder.icmp_signed('!=', left, right)
                return left

    def visitSimpleExpression(self, ctx):
        if len(ctx.term()) == 1:
            return self.visit(ctx.term(0))
        result = self.visit(ctx.term(0))
        for i in range(1, len(ctx.term())):
            term = self.visit(ctx.term(i))
            if ctx.addOperator(i - 1).getText() == '+':
                result = self.builder.add(result, term)
            elif ctx.addOperator(i - 1).getText() == '-':
                result = self.builder.sub(result, term)
        return result

    def visitTerm(self, ctx):
        if len(ctx.factor()) == 1:
            return self.visit(ctx.factor(0))
        result = self.visit(ctx.factor(0))
        for i in range(1, len(ctx.factor())):
            factor = self.visit(ctx.factor(i))
            if ctx.mulOperator(i - 1).getText() == '*':
                result = self.builder.mul(result, factor)
            elif ctx.mulOperator(i - 1).getText() == '/':
                result = self.builder.sdiv(result, factor)
        return result

    def visitFactor(self, ctx):
        if ctx.number():  # Используем правило number из грамматики
            value = int(ctx.number().getText())
            return ir.Constant(ir.IntType(32), value)
        elif ctx.designator():
            var_name = ctx.designator().getText()
            if var_name in self.symbols:
                return self.builder.load(self.symbols[var_name], var_name)
            else:
                raise Exception(f"Variable {var_name} not declared.")
        elif ctx.expression():
            return self.visit(ctx.expression())
        elif ctx.STRING():
            str_val = ctx.STRING().getText().strip('"')
            # Обработка строк, если требуется (например, создавать LLVM константы)
        elif ctx.NIL():
            # Обработка NIL, если требуется (например, создавать NULL в LLVM)
            pass
        elif ctx.TRUE() or ctx.FALSE():
            bool_val = ctx.TRUE() is not None
            return ir.Constant(ir.IntType(1), int(bool_val))
        else:
            raise Exception("Unsupported factor type")
    def visitIfStatement(self, ctx):
        condition = self.visit(ctx.expression())
        if not condition.type.is_integer:
            raise TypeError("IF expression must be integer")
        true_block = self.builder.append_basic_block(name="if.true")
        false_block = self.builder.append_basic_block(name="if.false")
        end_block = self.builder.append_basic_block(name="if.end")

        self.builder.cbranch(condition, true_block, false_block)

        self.builder.position_at_end(true_block)
        self.visit(ctx.statementSequence(0))
        self.builder.branch(end_block)

        self.builder.position_at_end(false_block)
        if ctx.ELSE():
            self.visit(ctx.statementSequence(1))
        self.builder.branch(end_block)

        self.builder.position_at_end(end_block)

    # Добавьте другие визиты для оставшихся конструкций языка


def compile_file(file_name):
    input_stream = FileStream(file_name)
    lexer = OberonLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = OberonParser(stream)
    tree = parser.module()

    compiler = OberonCompiler()
    ir_module = compiler.visit(tree)

    llvm.initialize()
    llvm.initialize_native_target()
    llvm.initialize_native_asmprinter()

    target = llvm.Target.from_default_triple()
    target_machine = target.create_target_machine()

    with llvm.create_mcjit_compiler(ir_module, target_machine) as engine:
        engine.finalize_object()
        engine.run_static_constructors()

        obj_file = file_name.split('.')[0] + ".o"
        with open(obj_file, 'wb') as f:
            f.write(target_machine.emit_object(ir_module))

    print(f"Object file `{obj_file}` generated.")


if __name__ == '__main__':
    import sys

    file_name = sys.argv[1]
    compile_file(file_name)