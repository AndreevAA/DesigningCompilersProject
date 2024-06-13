from llvmlite import ir, binding
from ctypes import CFUNCTYPE, c_int

# Инициализация LLVM
binding.initialize()
binding.initialize_native_target()
binding.initialize_native_asmprinter()

# Создание модуля LLVM и builder
llvm_module = ir.Module(name=__file__)
llvm_module.triple = binding.Target.from_default_triple().triple

function_type = ir.FunctionType(ir.IntType(32), [], False)
function = ir.Function(llvm_module, function_type, name="main")
block = function.append_basic_block(name="entry")
builder = ir.IRBuilder(block)

# Генерация кода: `return 42;`
return_value = ir.Constant(ir.IntType(32), 42)
builder.ret(return_value)

# Компиляция модуля
print("LLVM IR код программы:")
print(llvm_module)

target = binding.Target.from_default_triple()
target_machine = target.create_target_machine()
compiled_module = binding.parse_assembly(str(llvm_module))
compiled_module.verify()

# Формируем объектный файл
obj = target_machine.emit_object(compiled_module)

# Сохраняем объектный файл
with open("output.o", "wb") as f:
    f.write(obj)

print("Объектный файл создан как output.o")