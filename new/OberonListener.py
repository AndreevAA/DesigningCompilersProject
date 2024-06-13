# Generated from Oberon.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .OberonParser import OberonParser
else:
    from OberonParser import OberonParser

# This class defines a complete listener for a parse tree produced by OberonParser.
class OberonListener(ParseTreeListener):

    # Enter a parse tree produced by OberonParser#importDeclaration.
    def enterImportDeclaration(self, ctx:OberonParser.ImportDeclarationContext):
        pass

    # Exit a parse tree produced by OberonParser#importDeclaration.
    def exitImportDeclaration(self, ctx:OberonParser.ImportDeclarationContext):
        pass


    # Enter a parse tree produced by OberonParser#ident.
    def enterIdent(self, ctx:OberonParser.IdentContext):
        pass

    # Exit a parse tree produced by OberonParser#ident.
    def exitIdent(self, ctx:OberonParser.IdentContext):
        pass


    # Enter a parse tree produced by OberonParser#qualident.
    def enterQualident(self, ctx:OberonParser.QualidentContext):
        pass

    # Exit a parse tree produced by OberonParser#qualident.
    def exitQualident(self, ctx:OberonParser.QualidentContext):
        pass


    # Enter a parse tree produced by OberonParser#identdef.
    def enterIdentdef(self, ctx:OberonParser.IdentdefContext):
        pass

    # Exit a parse tree produced by OberonParser#identdef.
    def exitIdentdef(self, ctx:OberonParser.IdentdefContext):
        pass


    # Enter a parse tree produced by OberonParser#integer.
    def enterInteger(self, ctx:OberonParser.IntegerContext):
        pass

    # Exit a parse tree produced by OberonParser#integer.
    def exitInteger(self, ctx:OberonParser.IntegerContext):
        pass


    # Enter a parse tree produced by OberonParser#real.
    def enterReal(self, ctx:OberonParser.RealContext):
        pass

    # Exit a parse tree produced by OberonParser#real.
    def exitReal(self, ctx:OberonParser.RealContext):
        pass


    # Enter a parse tree produced by OberonParser#number.
    def enterNumber(self, ctx:OberonParser.NumberContext):
        pass

    # Exit a parse tree produced by OberonParser#number.
    def exitNumber(self, ctx:OberonParser.NumberContext):
        pass


    # Enter a parse tree produced by OberonParser#constDeclaration.
    def enterConstDeclaration(self, ctx:OberonParser.ConstDeclarationContext):
        pass

    # Exit a parse tree produced by OberonParser#constDeclaration.
    def exitConstDeclaration(self, ctx:OberonParser.ConstDeclarationContext):
        pass


    # Enter a parse tree produced by OberonParser#constExpression.
    def enterConstExpression(self, ctx:OberonParser.ConstExpressionContext):
        pass

    # Exit a parse tree produced by OberonParser#constExpression.
    def exitConstExpression(self, ctx:OberonParser.ConstExpressionContext):
        pass


    # Enter a parse tree produced by OberonParser#typeDeclaration.
    def enterTypeDeclaration(self, ctx:OberonParser.TypeDeclarationContext):
        pass

    # Exit a parse tree produced by OberonParser#typeDeclaration.
    def exitTypeDeclaration(self, ctx:OberonParser.TypeDeclarationContext):
        pass


    # Enter a parse tree produced by OberonParser#type_.
    def enterType_(self, ctx:OberonParser.Type_Context):
        pass

    # Exit a parse tree produced by OberonParser#type_.
    def exitType_(self, ctx:OberonParser.Type_Context):
        pass


    # Enter a parse tree produced by OberonParser#arrayType.
    def enterArrayType(self, ctx:OberonParser.ArrayTypeContext):
        pass

    # Exit a parse tree produced by OberonParser#arrayType.
    def exitArrayType(self, ctx:OberonParser.ArrayTypeContext):
        pass


    # Enter a parse tree produced by OberonParser#length.
    def enterLength(self, ctx:OberonParser.LengthContext):
        pass

    # Exit a parse tree produced by OberonParser#length.
    def exitLength(self, ctx:OberonParser.LengthContext):
        pass


    # Enter a parse tree produced by OberonParser#identList.
    def enterIdentList(self, ctx:OberonParser.IdentListContext):
        pass

    # Exit a parse tree produced by OberonParser#identList.
    def exitIdentList(self, ctx:OberonParser.IdentListContext):
        pass


    # Enter a parse tree produced by OberonParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:OberonParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by OberonParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:OberonParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by OberonParser#expression.
    def enterExpression(self, ctx:OberonParser.ExpressionContext):
        pass

    # Exit a parse tree produced by OberonParser#expression.
    def exitExpression(self, ctx:OberonParser.ExpressionContext):
        pass


    # Enter a parse tree produced by OberonParser#relation.
    def enterRelation(self, ctx:OberonParser.RelationContext):
        pass

    # Exit a parse tree produced by OberonParser#relation.
    def exitRelation(self, ctx:OberonParser.RelationContext):
        pass


    # Enter a parse tree produced by OberonParser#simpleExpression.
    def enterSimpleExpression(self, ctx:OberonParser.SimpleExpressionContext):
        pass

    # Exit a parse tree produced by OberonParser#simpleExpression.
    def exitSimpleExpression(self, ctx:OberonParser.SimpleExpressionContext):
        pass


    # Enter a parse tree produced by OberonParser#addOperator.
    def enterAddOperator(self, ctx:OberonParser.AddOperatorContext):
        pass

    # Exit a parse tree produced by OberonParser#addOperator.
    def exitAddOperator(self, ctx:OberonParser.AddOperatorContext):
        pass


    # Enter a parse tree produced by OberonParser#term.
    def enterTerm(self, ctx:OberonParser.TermContext):
        pass

    # Exit a parse tree produced by OberonParser#term.
    def exitTerm(self, ctx:OberonParser.TermContext):
        pass


    # Enter a parse tree produced by OberonParser#mulOperator.
    def enterMulOperator(self, ctx:OberonParser.MulOperatorContext):
        pass

    # Exit a parse tree produced by OberonParser#mulOperator.
    def exitMulOperator(self, ctx:OberonParser.MulOperatorContext):
        pass


    # Enter a parse tree produced by OberonParser#factor.
    def enterFactor(self, ctx:OberonParser.FactorContext):
        pass

    # Exit a parse tree produced by OberonParser#factor.
    def exitFactor(self, ctx:OberonParser.FactorContext):
        pass


    # Enter a parse tree produced by OberonParser#designator.
    def enterDesignator(self, ctx:OberonParser.DesignatorContext):
        pass

    # Exit a parse tree produced by OberonParser#designator.
    def exitDesignator(self, ctx:OberonParser.DesignatorContext):
        pass


    # Enter a parse tree produced by OberonParser#selector.
    def enterSelector(self, ctx:OberonParser.SelectorContext):
        pass

    # Exit a parse tree produced by OberonParser#selector.
    def exitSelector(self, ctx:OberonParser.SelectorContext):
        pass


    # Enter a parse tree produced by OberonParser#set_.
    def enterSet_(self, ctx:OberonParser.Set_Context):
        pass

    # Exit a parse tree produced by OberonParser#set_.
    def exitSet_(self, ctx:OberonParser.Set_Context):
        pass


    # Enter a parse tree produced by OberonParser#element.
    def enterElement(self, ctx:OberonParser.ElementContext):
        pass

    # Exit a parse tree produced by OberonParser#element.
    def exitElement(self, ctx:OberonParser.ElementContext):
        pass


    # Enter a parse tree produced by OberonParser#expList.
    def enterExpList(self, ctx:OberonParser.ExpListContext):
        pass

    # Exit a parse tree produced by OberonParser#expList.
    def exitExpList(self, ctx:OberonParser.ExpListContext):
        pass


    # Enter a parse tree produced by OberonParser#actualParameters.
    def enterActualParameters(self, ctx:OberonParser.ActualParametersContext):
        pass

    # Exit a parse tree produced by OberonParser#actualParameters.
    def exitActualParameters(self, ctx:OberonParser.ActualParametersContext):
        pass


    # Enter a parse tree produced by OberonParser#statement.
    def enterStatement(self, ctx:OberonParser.StatementContext):
        pass

    # Exit a parse tree produced by OberonParser#statement.
    def exitStatement(self, ctx:OberonParser.StatementContext):
        pass


    # Enter a parse tree produced by OberonParser#assignment.
    def enterAssignment(self, ctx:OberonParser.AssignmentContext):
        pass

    # Exit a parse tree produced by OberonParser#assignment.
    def exitAssignment(self, ctx:OberonParser.AssignmentContext):
        pass


    # Enter a parse tree produced by OberonParser#statementSequence.
    def enterStatementSequence(self, ctx:OberonParser.StatementSequenceContext):
        pass

    # Exit a parse tree produced by OberonParser#statementSequence.
    def exitStatementSequence(self, ctx:OberonParser.StatementSequenceContext):
        pass


    # Enter a parse tree produced by OberonParser#ifStatement.
    def enterIfStatement(self, ctx:OberonParser.IfStatementContext):
        pass

    # Exit a parse tree produced by OberonParser#ifStatement.
    def exitIfStatement(self, ctx:OberonParser.IfStatementContext):
        pass


    # Enter a parse tree produced by OberonParser#whileStatement.
    def enterWhileStatement(self, ctx:OberonParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by OberonParser#whileStatement.
    def exitWhileStatement(self, ctx:OberonParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by OberonParser#forStatement.
    def enterForStatement(self, ctx:OberonParser.ForStatementContext):
        pass

    # Exit a parse tree produced by OberonParser#forStatement.
    def exitForStatement(self, ctx:OberonParser.ForStatementContext):
        pass


    # Enter a parse tree produced by OberonParser#declarationSequence.
    def enterDeclarationSequence(self, ctx:OberonParser.DeclarationSequenceContext):
        pass

    # Exit a parse tree produced by OberonParser#declarationSequence.
    def exitDeclarationSequence(self, ctx:OberonParser.DeclarationSequenceContext):
        pass


    # Enter a parse tree produced by OberonParser#module.
    def enterModule(self, ctx:OberonParser.ModuleContext):
        pass

    # Exit a parse tree produced by OberonParser#module.
    def exitModule(self, ctx:OberonParser.ModuleContext):
        pass



del OberonParser