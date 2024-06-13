import sys
from antlr4 import *
from OberonLexer import OberonLexer
from OberonParser import OberonParser
from llvmlite import ir, binding

# Начальная инициализация LLVM
binding.initialize()
binding.initialize_native_target()
binding.initialize_native_asmprinter()

class ModuleContext:
    def __init__(self, name, body):
        self.name = name
        self.body = body
        
class OberonCompiler:
    def __init__(self):
        # Создаем модуль LLVM
        self.module = ir.Module(name=__file__)
        self.module.triple = binding.Target.from_default_triple().triple
        
        # Создаем исполнителя (builder) и контекст
        self.builder = None
        self.context = ir.Context()

    def compile(self, file_path):
        with open(file_path, 'r', encoding='utf-8') as file:
            input_stream = InputStream(file.read())

        lexer = OberonLexer(input_stream)
        stream = CommonTokenStream(lexer)
        parser = OberonParser(stream)
        tree = parser.module()
        self.visitModule(tree)

    def getType(self, typename):
        if typename == 'integer':
            return ir.IntType(32)
        elif typename == 'boolean':
            return ir.IntType(1)
        else:
            raise Exception("Unsupported type: " + typename)

    def visitModule(self, node):
        print("Compiling module:", node.name)
        self.builder = ir.IRBuilder(self.context)

        # Обработка глобальных переменных, констант и типов
        self.visitGlobals(node.globals)
        self.visitConstants(node.constants)
        self.visitTypes(node.types)

        # Компиляция всех функций в модуле
        for func in node.functions:
            self.visitFunction(func)

        print(str(self.module))

    def visitGlobals(self, globals):
        for g in globals:
            var_type = self.getType(g.type)
            global_var = ir.GlobalVariable(self.module, var_type, name=g.name)
            if g.initial_value:
                # Присваивание начального значения, если оно есть
                global_var.initializer = ir.Constant(var_type, g.initial_value)
            global_var.linkage = 'internal'

    def visitConstants(self, constants):
        for const in constants:
            const_type = self.getType(const.type)
            # Создаем глобальные константы
            self.module.add_global(const_type, const.name, initializer=const.value)

    def visitTypes(self, types):
        # В Oberon типы могут быть сложными, здесь простая реализация
        for typ in types:
            if isinstance(typ, ArrayType):
                array_type = ir.ArrayType(self.getType(typ.element_type), typ.size)
                self.module.context.get_identified_type(typ.name).set_body(array_type)
            elif isinstance(typ, RecordType):
                fields = [(self.getType(f.type), f.name) for f in typ.fields]
                record_type = self.context.get_identified_type(typ.name)
                record_type.set_body(*fields)

    def visitFunction(self, function):
        func_type = ir.FunctionType(self.getType(function.returnType),
                                    [self.getType(arg.type) for arg in function.args])
        function = ir.Function(self.module, func_type, name=function.name)
        block = function.append_basic_block(name="entry")
        self.builder.position_at_end(block)

        for statement in function.body:
            self.processStatement(statement)

        self.builder.ret_void()  # Возврат из функции

    def processStatement(self, statement):
        if isinstance(statement, VariableDeclaration):
            var_type = self.getType(statement.var_type)
            alloca = self.builder.alloca(var_type, name=statement.var_name)
            if statement.initial_value:
                init_val = ir.Constant(var_type, statement.initial_value)
                self.builder.store(init_val, alloca)
        elif isinstance(statement, AssignStatement):
            # Находим существующую переменную
            variable = self.builder.function.get_entry_block().get_variable_named(statement.var_name)
            value = self.builder.load(self.getType(variable.type), name=statement.value)
            self.builder.store(value, variable)
        elif isinstance(statement, ReturnStatement):
            ret_value = self.builder.load(self.getType(statement.value.type), name=statement.value)
            self.builder.ret(ret_value)
        else:
            raise NotImplementedError("Statement type not implemented: " + type(statement).__name__)

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python compile_oberon.py <file.oberon>")
        sys.exit(1)
    compiler = OberonCompiler()
    compiler.compile(sys.argv[1])

# import sys
# from antlr4 import *
# from OberonLexer import OberonLexer
# from OberonParser import OberonParser
# from llvmlite import ir, binding

# # Начальная инициализация LLVM
# binding.initialize()
# binding.initialize_native_target()
# binding.initialize_native_asmprinter()

# class OberonCompiler:
#     def __init__(self):
#         # Создаем модуль LLVM
#         self.module = ir.Module(name=__file__)
#         self.module.triple = binding.Target.from_default_triple().triple

#         # Создаем исполнителя (builder) и контекст
#         self.builder = None
#         self.context = ir.Context()

#     def compile(self, file_path):
#         # Откроем файл с явным указанием кодировки UTF-8
#         with open(file_path, 'r', encoding='utf-8') as file:
#             input_stream = InputStream(file.read())

#         lexer = OberonLexer(input_stream)
#         stream = CommonTokenStream(lexer)
#         parser = OberonParser(stream)
#         tree = parser.module()

#         # Здесь можно вызвать метод для обхода дерева
#         self.visitModule(tree)

#     def visitModule(self, node):
#         print(node.getText().split(";")[0])
#         # Компилирование модуля
#         print("Компилирование модуля:", node.getText().split(";")[0])

#         # Сначала определяем глобальные переменные и константы модуля
#         self.visitGlobals(node.getGlobalVars())
#         self.visitConstants(node.getConstants())

#         # Определяем типы данных модуля
#         self.visitTypes(node.getTypes())

#         # Обрабатываем все функции модуля
#         for function in node.getFunctions():
#             self.visitFunction(function)

#     def visitGlobals(self, globals):
#         for var in globals:
#             # Создаем глобальные переменные в LLVM IR
#             ir_variable = ir.GlobalVariable(self.module, self.getType(var.type), var.name)
#             ir_variable.initializer = ir.Constant(self.getType(var.type), var.initialValue)
#             ir_variable.linkage = 'internal'

#     def visitConstants(self, constants):
#         for const in constants:
#             # Обрабатываем константы аналогично переменным
#             ir_constant = ir.GlobalVariable(self.module, self.getType(const.type), const.name)
#             ir_constant.initializer = ir.Constant(self.getType(const.type), const.value)
#             ir_constant.linkage = 'internal'
#             ir_constant.global_constant = True

#     def visitTypes(self, types):
#         # Опционально, если в языке есть пользовательские типы данных
#         pass

#     def visitFunction(self, function):
#         # Создаем функцию в IR
#         func_type = ir.FunctionType(self.getType(function.returnType), [self.getType(arg.type) for arg in function.args])
#         func = ir.Function(self.module, func_type, name=function.name)
#         block = func.append_basic_block(name="entry")
#         self.builder.position_at_end(block)
        
#         # Теперь необходимо обработать тело функции
#         for statement in function.body:
#             self.processStatement(statement)
        
#         # Добавляем возврат из функции, если необходим
#         self.builder.ret(ir.Constant(self.getType(function.returnType), 0))

#     def create_ir(self):
#        # Функция для создания функций и глобальных переменных
#        # Для примера создадим функцию "main"
#        function_type = ir.FunctionType(ir.IntType(32), [], False)
#        main_function = ir.Function(self.module, function_type, name="main")
#        block = main_function.append_basic_block(name="entry")
#        self.builder.position_at_end(block)
#        self.builder.ret(ir.Constant(ir.IntType(32), 0))

#     def save_ir(self, filename):
#         # Сохраняем IR в файл
#         with open(filename, 'w') as f:
#             f.write(str(self.module))

#     def compile_ir_to_binary(self, ir_filename):
#         target = binding.Target.from_default_triple()
#         target_machine = target.create_target_machine()
#         with open(ir_filename) as f:
#             llvm_ir = f.read()

#         mod = binding.parse_assembly(llvm_ir)
#         mod.verify()

#         # Компилирование модуля в код машины
#         with binding.PassManagerBuilder() as pmb:
#             with binding.ModulePassManager() as mpm:
#                 pmb.opt_level = 3
#                 pmb.populate(mpm)
#                 mpm.run(mod)

#         object_file = target_machine.emit_object(mod)
#         with open("output.o", "wb") as out:
#             out.write(object_file)

# def main():
#     compiler = OberonCompiler()
#     if len(sys.argv) > 1:
#         input_file = sys.argv[1]
#         compiler.compile(input_file)
#         compiler.create_ir()
#         compiler.save_ir('output.ll')
#         compiler.compile_ir_to_binary('output.ll')
#     else:
#         print("Укажите файл для компиляции")

# if __name__ == '__main__':
#     main()