# Generated from Oberon.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .OberonParser import OberonParser
else:
    from OberonParser import OberonParser

# This class defines a complete generic visitor for a parse tree produced by OberonParser.

class OberonVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by OberonParser#ident.
    def visitIdent(self, ctx:OberonParser.IdentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#qualident.
    def visitQualident(self, ctx:OberonParser.QualidentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#identdef.
    def visitIdentdef(self, ctx:OberonParser.IdentdefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#integer.
    def visitInteger(self, ctx:OberonParser.IntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#real.
    def visitReal(self, ctx:OberonParser.RealContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#number.
    def visitNumber(self, ctx:OberonParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#constDeclaration.
    def visitConstDeclaration(self, ctx:OberonParser.ConstDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#constExpression.
    def visitConstExpression(self, ctx:OberonParser.ConstExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#typeDeclaration.
    def visitTypeDeclaration(self, ctx:OberonParser.TypeDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#type_.
    def visitType_(self, ctx:OberonParser.Type_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#arrayType.
    def visitArrayType(self, ctx:OberonParser.ArrayTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#length.
    def visitLength(self, ctx:OberonParser.LengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#identList.
    def visitIdentList(self, ctx:OberonParser.IdentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#variableDeclaration.
    def visitVariableDeclaration(self, ctx:OberonParser.VariableDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#expression.
    def visitExpression(self, ctx:OberonParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#relation.
    def visitRelation(self, ctx:OberonParser.RelationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#simpleExpression.
    def visitSimpleExpression(self, ctx:OberonParser.SimpleExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#addOperator.
    def visitAddOperator(self, ctx:OberonParser.AddOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#term.
    def visitTerm(self, ctx:OberonParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#mulOperator.
    def visitMulOperator(self, ctx:OberonParser.MulOperatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#factor.
    def visitFactor(self, ctx:OberonParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#designator.
    def visitDesignator(self, ctx:OberonParser.DesignatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#selector.
    def visitSelector(self, ctx:OberonParser.SelectorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#set_.
    def visitSet_(self, ctx:OberonParser.Set_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#element.
    def visitElement(self, ctx:OberonParser.ElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#expList.
    def visitExpList(self, ctx:OberonParser.ExpListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#actualParameters.
    def visitActualParameters(self, ctx:OberonParser.ActualParametersContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#statement.
    def visitStatement(self, ctx:OberonParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#assignment.
    def visitAssignment(self, ctx:OberonParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#statementSequence.
    def visitStatementSequence(self, ctx:OberonParser.StatementSequenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#ifStatement.
    def visitIfStatement(self, ctx:OberonParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#whileStatement.
    def visitWhileStatement(self, ctx:OberonParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#forStatement.
    def visitForStatement(self, ctx:OberonParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#declarationSequence.
    def visitDeclarationSequence(self, ctx:OberonParser.DeclarationSequenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by OberonParser#module.
    def visitModule(self, ctx:OberonParser.ModuleContext):
        return self.visitChildren(ctx)



del OberonParser