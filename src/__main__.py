# from llvmpy import *
# from antlr4-tools import *

# import sys
# sys.path.append('constants/')

# import isa

# import OssCompiler

import system
import processor
import compiler

# tmp_compiler = Compiler()
# # tmp_compiler.compile()
# tmp_compiler.decode()
# tmp_compiler.load()
# tmp_compiler.execute("Multiply 5 5")
# # tmp_compiler.state()

from constants.isa import *

def main():
    # Test compiler
    compiler.Compile(filename="input.mod")
    compiler.Decode()
    compiler.Load()

    # print(compiler.Exec("Divide 9 5"))
    # print()
    # print(compiler.Exec("Divide -1 5"))
    # print()
    # print(compiler.Exec("Divide 12 9"))
    # print()
    # print(compiler.Exec("BinSearch 9 2 3 4 5 6 7 8 9 10 2"))
    # print()
    # print(compiler.Exec("Fibonacci 20"), " 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765")
    # # processor.State()

    print(compiler.Exec("ReverseArray 5 1 2 3 4 5"))


    # Execute the code
#     print(compiler.Exec("Multiply 0 0"))
#     print()
#     print(compiler.Exec("Multiply -1 -1"))
#     print()
#     print(compiler.Exec("Multiply 0 -1"))
#     print()
#     print(compiler.Exec("Multiply 1000 9999"))
#     print()
#     0
#     0
#     0
#
#
# ()
# -1 - 1
# 0
# ()
# 0 - 1
# 0
# ()
# 0
# 10238976
# 9999000

print(" 0 40 25" == compiler.Exec("Multiply 5 5"))


if __name__ == '__main__':
    main()