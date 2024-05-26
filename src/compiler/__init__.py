
# from src.constants.variable import Variable

import keywords as OSS

import operations as OSP
import global_ops as OSG


from constants.constant import *
from constants.pointer import *
from constants.variable import *
#
# # Test compiler
# OssCompiler.Compile()
# OssCompiler.Decode()
# OssCompiler.Load()
# processor.State()
#
# # Execute the code
# OssCompiler.Exec("Multiply 5 5")
#
# class Compiler:
#
#     def __init__(self, source_filename="tests/data/source.mod"):
#         self.source_filename = source_filename
#         self.loaded = Variable(False)
#
#     def execute(self, S):
#         OSG.Exec(S)
#
#     def _init_file(self):
#         if self.source_filename is not None:
#             OSS.Init(self.source_filename, 0)
#             OSP.Module(0)
#
#     def decode(self):
#         OSG.Decode()
#
#     def load(self):
#         if not OSS.error.m_value and not self.loaded.m_value:
#             OSG.Load()
#             self.loaded.m_value = True
#


# import system as OSS
# import OssBB as BB
# import system as OSP
# import global_ops as OSG
# import OssBB as Texts
#
# from Util import *
#
# from constants.constant import *
# from constants.pointer import *
# from constants.variable import *

loaded = Variable(False)

def Compile():
    # Variables
    t = "tests/data/source.mod" # TODO: To devise a way to pass the file name in future
    loaded.m_value = False
    if t is not None:
        OSS.Init(t, 0)
        OSP.Module(0)

def Decode():
    OSG.Decode()

def Load():
    if not OSS.error.m_value and not loaded.m_value:
        OSG.Load()
        loaded.m_value = True

def Exec(S):
    OSG.Exec(S)
