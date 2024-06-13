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
        var_value = self.evaluateExpression(ctx.expression())  # Вызов метода для оценки выражения
        self.variables[var_name] = var_value

    def evaluateExpression(self, ctx):
        if isinstance(ctx, OberonParser.NumberContext):
            return int(ctx.getText())
        elif isinstance(ctx, OberonParser.DesignatorContext):
            return self.evaluateDesignator(ctx)
        elif isinstance(ctx, OberonParser.ExpressionContext):
            return self.evaluateExpression(ctx.expression())
        else:
            return None  # Обработка других случаев по мере необходимости

    def evaluateArrayIndex(self, ctx):
        array_name = ctx.qualident().getText()
        index = int(ctx.arrayIndex().expression().getText())
        if array_name in self.arrays:
            array = self.arrays[array_name]
            if 0 <= index < len(array):
                return array[index]
            else:
                print(f"Error: Index out of bounds for array {array_name}.")
        else:
            print(f"Error: Array {array_name} not found.")

    def getQualifiedIdentifierValue(self, ctx):
        ident_name = ctx.IDENT().getText()
        if ident_name in self.variables:
            return self.variables[ident_name]
        elif ident_name in self.functions:
            # You can handle function calls here if needed
            return None

        return None

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
    n := arr[0] + arr[1] * arr[2];

    RETURN n;
END hello.
"""

compiler = BubbleSortCompiler()
compiler.processCode(sample_code)