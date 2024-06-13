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
        if ctx.forStatement():
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
        var_name = ctx.getChild(0).getText()
        var_value = int(ctx.expression().getText())
        self.variables[var_name] = var_value


# Example Oberon program with bubble sort
sample_code = """
MODULE BubbleSort;
VAR
    numbers: ARRAY 5 OF INTEGER;
    i, j, temp: INTEGER;

BEGIN
    numbers[0] := 4;
    numbers[1] := 2;
    numbers[2] := 7;
    numbers[3] := 1;
    numbers[4] := 5;

    FOR i := 0 TO 4 DO
        FOR j := 0 TO 4 - i DO
            IF numbers[j] > numbers[j + 1] THEN
                temp := numbers[j];
                numbers[j] := numbers[j + 1];
                numbers[j + 1] := temp;
            END;
        END;
    END;

    FOR i := 0 TO 4 DO
        WriteInt(numbers[i]);
        WriteString(" ");
    END;

END BubbleSort.
"""

compiler = BubbleSortCompiler()
compiler.processCode(sample_code)