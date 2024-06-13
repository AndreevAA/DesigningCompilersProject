from antlr4 import *
from OberonLexer import OberonLexer
from OberonParser import OberonParser
from OberonListener import OberonListener


class BubbleSortCompiler(OberonListener):
    def __init__(self):
        self.variables = {}

    def processCode(self, code):
        lexer = OberonLexer(InputStream(code))
        stream = CommonTokenStream(lexer)
        parser = OberonParser(stream)
        tree = parser.module()
        walker = ParseTreeWalker()
        walker.walk(self, tree)

    def enterStatement(self, ctx: OberonParser.StatementContext):
        # Handle Oberon statements, including bubble sort
        if ctx.sort_statement():
            self.bubbleSort()

    def bubbleSort(self):
        if 'numbers' in self.variables:
            numbers = self.variables['numbers']
            n = len(numbers)
            for i in range(n):
                for j in range(0, n - i - 1):
                    if numbers[j] > numbers[j + 1]:
                        numbers[j], numbers[j + 1] = numbers[j + 1], numbers[j]

    def exitAssignment(self, ctx: OberonParser.AssignmentContext):
        var_name = ctx.IDENT().getText()
        var_value = int(ctx.expression().getText())
        self.variables[var_name] = var_value


# Example Oberon program with bubble sort
sample_code = """
MODULE hello;
VAR
    arr: ARRAY 3 OF INTEGER;
    n, k: INTEGER;

BEGIN
    arr[0] := 1;
    arr[1] := 2;
    arr[2] := 3;
    k := 2;
    n := arr[0] + arr[1] * arr[2] DIV (k + 1);

    RETURN n;
END hello.
"""

compiler = BubbleSortCompiler()
compiler.processCode(sample_code)