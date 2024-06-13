# Generated from ArrayReverse.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,5,21,2,0,7,0,2,1,7,1,2,2,7,2,1,0,1,0,1,0,1,0,1,1,1,1,1,1,5,1,
        14,8,1,10,1,12,1,17,9,1,1,2,1,2,1,2,0,0,3,0,2,4,0,0,18,0,6,1,0,0,
        0,2,10,1,0,0,0,4,18,1,0,0,0,6,7,5,1,0,0,7,8,3,2,1,0,8,9,5,2,0,0,
        9,1,1,0,0,0,10,15,3,4,2,0,11,12,5,3,0,0,12,14,3,4,2,0,13,11,1,0,
        0,0,14,17,1,0,0,0,15,13,1,0,0,0,15,16,1,0,0,0,16,3,1,0,0,0,17,15,
        1,0,0,0,18,19,5,4,0,0,19,5,1,0,0,0,1,15
    ]

class ArrayReverseParser ( Parser ):

    grammarFileName = "ArrayReverse.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'['", "']'", "','" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "INT", "WS" ]

    RULE_array = 0
    RULE_elements = 1
    RULE_element = 2

    ruleNames =  [ "array", "elements", "element" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    INT=4
    WS=5

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ArrayContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def elements(self):
            return self.getTypedRuleContext(ArrayReverseParser.ElementsContext,0)


        def getRuleIndex(self):
            return ArrayReverseParser.RULE_array

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray" ):
                listener.enterArray(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray" ):
                listener.exitArray(self)




    def array(self):

        localctx = ArrayReverseParser.ArrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_array)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 6
            self.match(ArrayReverseParser.T__0)
            self.state = 7
            self.elements()
            self.state = 8
            self.match(ArrayReverseParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ArrayReverseParser.ElementContext)
            else:
                return self.getTypedRuleContext(ArrayReverseParser.ElementContext,i)


        def getRuleIndex(self):
            return ArrayReverseParser.RULE_elements

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElements" ):
                listener.enterElements(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElements" ):
                listener.exitElements(self)




    def elements(self):

        localctx = ArrayReverseParser.ElementsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_elements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 10
            self.element()
            self.state = 15
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==3:
                self.state = 11
                self.match(ArrayReverseParser.T__2)
                self.state = 12
                self.element()
                self.state = 17
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INT(self):
            return self.getToken(ArrayReverseParser.INT, 0)

        def getRuleIndex(self):
            return ArrayReverseParser.RULE_element

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElement" ):
                listener.enterElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElement" ):
                listener.exitElement(self)




    def element(self):

        localctx = ArrayReverseParser.ElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_element)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            self.match(ArrayReverseParser.INT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





