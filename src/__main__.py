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
    compiler.Compile()
    compiler.Decode()
    compiler.Load()
    # processor.State()

    # Execute the code
    compiler.Exec("Multiply 5 5")


if __name__ == '__main__':
    main()