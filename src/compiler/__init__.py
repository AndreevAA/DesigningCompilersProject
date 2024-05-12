import OssCompiler, OssRISC, OssBB, OssOSP, OssOSG, OssBB, OssOSS
# from src.constants.variable import Variable

import OssOSS as OSS
import OssBB as BB
import OssOSP as OSP
import OssOSG as OSG
import OssBB as Texts

from constants.constant import *
from constants.pointer import *
from constants.variable import *

# Test compiler
OssCompiler.Compile()
OssCompiler.Decode()
OssCompiler.Load()
OssRISC.State()

# Execute the code
OssCompiler.Exec("Multiply 5 5")

class Compiler:

    def __init__(self, source_filename="tests/data/source.mod"):
        self.source_filename = source_filename
        self.loaded = Variable(False)

    def execute(self, S):
        OSG.Exec(S)

    def _init_file(self):
        if self.source_filename is not None:
            OSS.Init(self.source_filename, 0)
            OSP.Module(0)

    def decode(self):
        OSG.Decode()

    def load(self):
        if not OSS.error.m_value and not self.loaded.m_value:
            OSG.Load()
            self.loaded.m_value = True

