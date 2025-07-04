# Generated from Sugarc.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .SugarcParser import SugarcParser
else:
    from SugarcParser import SugarcParser

# This class defines a complete listener for a parse tree produced by SugarcParser.
class SugarcListener(ParseTreeListener):

    # Enter a parse tree produced by SugarcParser#program.
    def enterProgram(self, ctx:SugarcParser.ProgramContext):
        pass

    # Exit a parse tree produced by SugarcParser#program.
    def exitProgram(self, ctx:SugarcParser.ProgramContext):
        pass


    # Enter a parse tree produced by SugarcParser#classDecl.
    def enterClassDecl(self, ctx:SugarcParser.ClassDeclContext):
        pass

    # Exit a parse tree produced by SugarcParser#classDecl.
    def exitClassDecl(self, ctx:SugarcParser.ClassDeclContext):
        pass


    # Enter a parse tree produced by SugarcParser#classInherence.
    def enterClassInherence(self, ctx:SugarcParser.ClassInherenceContext):
        pass

    # Exit a parse tree produced by SugarcParser#classInherence.
    def exitClassInherence(self, ctx:SugarcParser.ClassInherenceContext):
        pass


    # Enter a parse tree produced by SugarcParser#classContructorDecl.
    def enterClassContructorDecl(self, ctx:SugarcParser.ClassContructorDeclContext):
        pass

    # Exit a parse tree produced by SugarcParser#classContructorDecl.
    def exitClassContructorDecl(self, ctx:SugarcParser.ClassContructorDeclContext):
        pass


    # Enter a parse tree produced by SugarcParser#methodDecl.
    def enterMethodDecl(self, ctx:SugarcParser.MethodDeclContext):
        pass

    # Exit a parse tree produced by SugarcParser#methodDecl.
    def exitMethodDecl(self, ctx:SugarcParser.MethodDeclContext):
        pass


    # Enter a parse tree produced by SugarcParser#attributeDeclaration.
    def enterAttributeDeclaration(self, ctx:SugarcParser.AttributeDeclarationContext):
        pass

    # Exit a parse tree produced by SugarcParser#attributeDeclaration.
    def exitAttributeDeclaration(self, ctx:SugarcParser.AttributeDeclarationContext):
        pass


    # Enter a parse tree produced by SugarcParser#arrayAttributeDeclaration.
    def enterArrayAttributeDeclaration(self, ctx:SugarcParser.ArrayAttributeDeclarationContext):
        pass

    # Exit a parse tree produced by SugarcParser#arrayAttributeDeclaration.
    def exitArrayAttributeDeclaration(self, ctx:SugarcParser.ArrayAttributeDeclarationContext):
        pass


    # Enter a parse tree produced by SugarcParser#functionDecl.
    def enterFunctionDecl(self, ctx:SugarcParser.FunctionDeclContext):
        pass

    # Exit a parse tree produced by SugarcParser#functionDecl.
    def exitFunctionDecl(self, ctx:SugarcParser.FunctionDeclContext):
        pass


    # Enter a parse tree produced by SugarcParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:SugarcParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by SugarcParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:SugarcParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by SugarcParser#arrayDeclaration.
    def enterArrayDeclaration(self, ctx:SugarcParser.ArrayDeclarationContext):
        pass

    # Exit a parse tree produced by SugarcParser#arrayDeclaration.
    def exitArrayDeclaration(self, ctx:SugarcParser.ArrayDeclarationContext):
        pass


    # Enter a parse tree produced by SugarcParser#arrayInitialization.
    def enterArrayInitialization(self, ctx:SugarcParser.ArrayInitializationContext):
        pass

    # Exit a parse tree produced by SugarcParser#arrayInitialization.
    def exitArrayInitialization(self, ctx:SugarcParser.ArrayInitializationContext):
        pass


    # Enter a parse tree produced by SugarcParser#typdefDecl.
    def enterTypdefDecl(self, ctx:SugarcParser.TypdefDeclContext):
        pass

    # Exit a parse tree produced by SugarcParser#typdefDecl.
    def exitTypdefDecl(self, ctx:SugarcParser.TypdefDeclContext):
        pass


    # Enter a parse tree produced by SugarcParser#params.
    def enterParams(self, ctx:SugarcParser.ParamsContext):
        pass

    # Exit a parse tree produced by SugarcParser#params.
    def exitParams(self, ctx:SugarcParser.ParamsContext):
        pass


    # Enter a parse tree produced by SugarcParser#param.
    def enterParam(self, ctx:SugarcParser.ParamContext):
        pass

    # Exit a parse tree produced by SugarcParser#param.
    def exitParam(self, ctx:SugarcParser.ParamContext):
        pass


    # Enter a parse tree produced by SugarcParser#primitiveType.
    def enterPrimitiveType(self, ctx:SugarcParser.PrimitiveTypeContext):
        pass

    # Exit a parse tree produced by SugarcParser#primitiveType.
    def exitPrimitiveType(self, ctx:SugarcParser.PrimitiveTypeContext):
        pass


    # Enter a parse tree produced by SugarcParser#deviatedType.
    def enterDeviatedType(self, ctx:SugarcParser.DeviatedTypeContext):
        pass

    # Exit a parse tree produced by SugarcParser#deviatedType.
    def exitDeviatedType(self, ctx:SugarcParser.DeviatedTypeContext):
        pass


    # Enter a parse tree produced by SugarcParser#basicTypes.
    def enterBasicTypes(self, ctx:SugarcParser.BasicTypesContext):
        pass

    # Exit a parse tree produced by SugarcParser#basicTypes.
    def exitBasicTypes(self, ctx:SugarcParser.BasicTypesContext):
        pass


    # Enter a parse tree produced by SugarcParser#ifStmt.
    def enterIfStmt(self, ctx:SugarcParser.IfStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#ifStmt.
    def exitIfStmt(self, ctx:SugarcParser.IfStmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#elseStmt.
    def enterElseStmt(self, ctx:SugarcParser.ElseStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#elseStmt.
    def exitElseStmt(self, ctx:SugarcParser.ElseStmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#whileStmt.
    def enterWhileStmt(self, ctx:SugarcParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#whileStmt.
    def exitWhileStmt(self, ctx:SugarcParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#forStmt.
    def enterForStmt(self, ctx:SugarcParser.ForStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#forStmt.
    def exitForStmt(self, ctx:SugarcParser.ForStmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#breakStmt.
    def enterBreakStmt(self, ctx:SugarcParser.BreakStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#breakStmt.
    def exitBreakStmt(self, ctx:SugarcParser.BreakStmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#continueStmt.
    def enterContinueStmt(self, ctx:SugarcParser.ContinueStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#continueStmt.
    def exitContinueStmt(self, ctx:SugarcParser.ContinueStmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#returnStmt.
    def enterReturnStmt(self, ctx:SugarcParser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#returnStmt.
    def exitReturnStmt(self, ctx:SugarcParser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#stmt.
    def enterStmt(self, ctx:SugarcParser.StmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#stmt.
    def exitStmt(self, ctx:SugarcParser.StmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#block.
    def enterBlock(self, ctx:SugarcParser.BlockContext):
        pass

    # Exit a parse tree produced by SugarcParser#block.
    def exitBlock(self, ctx:SugarcParser.BlockContext):
        pass


    # Enter a parse tree produced by SugarcParser#selfReference.
    def enterSelfReference(self, ctx:SugarcParser.SelfReferenceContext):
        pass

    # Exit a parse tree produced by SugarcParser#selfReference.
    def exitSelfReference(self, ctx:SugarcParser.SelfReferenceContext):
        pass


    # Enter a parse tree produced by SugarcParser#memberAccess.
    def enterMemberAccess(self, ctx:SugarcParser.MemberAccessContext):
        pass

    # Exit a parse tree produced by SugarcParser#memberAccess.
    def exitMemberAccess(self, ctx:SugarcParser.MemberAccessContext):
        pass


    # Enter a parse tree produced by SugarcParser#addSubExpr.
    def enterAddSubExpr(self, ctx:SugarcParser.AddSubExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#addSubExpr.
    def exitAddSubExpr(self, ctx:SugarcParser.AddSubExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#assignment.
    def enterAssignment(self, ctx:SugarcParser.AssignmentContext):
        pass

    # Exit a parse tree produced by SugarcParser#assignment.
    def exitAssignment(self, ctx:SugarcParser.AssignmentContext):
        pass


    # Enter a parse tree produced by SugarcParser#objectInstantiation.
    def enterObjectInstantiation(self, ctx:SugarcParser.ObjectInstantiationContext):
        pass

    # Exit a parse tree produced by SugarcParser#objectInstantiation.
    def exitObjectInstantiation(self, ctx:SugarcParser.ObjectInstantiationContext):
        pass


    # Enter a parse tree produced by SugarcParser#orExpr.
    def enterOrExpr(self, ctx:SugarcParser.OrExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#orExpr.
    def exitOrExpr(self, ctx:SugarcParser.OrExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#relationalExpr.
    def enterRelationalExpr(self, ctx:SugarcParser.RelationalExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#relationalExpr.
    def exitRelationalExpr(self, ctx:SugarcParser.RelationalExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#varReference.
    def enterVarReference(self, ctx:SugarcParser.VarReferenceContext):
        pass

    # Exit a parse tree produced by SugarcParser#varReference.
    def exitVarReference(self, ctx:SugarcParser.VarReferenceContext):
        pass


    # Enter a parse tree produced by SugarcParser#groupedExpr.
    def enterGroupedExpr(self, ctx:SugarcParser.GroupedExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#groupedExpr.
    def exitGroupedExpr(self, ctx:SugarcParser.GroupedExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#typeCast.
    def enterTypeCast(self, ctx:SugarcParser.TypeCastContext):
        pass

    # Exit a parse tree produced by SugarcParser#typeCast.
    def exitTypeCast(self, ctx:SugarcParser.TypeCastContext):
        pass


    # Enter a parse tree produced by SugarcParser#notExpr.
    def enterNotExpr(self, ctx:SugarcParser.NotExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#notExpr.
    def exitNotExpr(self, ctx:SugarcParser.NotExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#functionCall.
    def enterFunctionCall(self, ctx:SugarcParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by SugarcParser#functionCall.
    def exitFunctionCall(self, ctx:SugarcParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by SugarcParser#literalExpr.
    def enterLiteralExpr(self, ctx:SugarcParser.LiteralExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#literalExpr.
    def exitLiteralExpr(self, ctx:SugarcParser.LiteralExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#superCall.
    def enterSuperCall(self, ctx:SugarcParser.SuperCallContext):
        pass

    # Exit a parse tree produced by SugarcParser#superCall.
    def exitSuperCall(self, ctx:SugarcParser.SuperCallContext):
        pass


    # Enter a parse tree produced by SugarcParser#arrayAccess.
    def enterArrayAccess(self, ctx:SugarcParser.ArrayAccessContext):
        pass

    # Exit a parse tree produced by SugarcParser#arrayAccess.
    def exitArrayAccess(self, ctx:SugarcParser.ArrayAccessContext):
        pass


    # Enter a parse tree produced by SugarcParser#mulDivExpr.
    def enterMulDivExpr(self, ctx:SugarcParser.MulDivExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#mulDivExpr.
    def exitMulDivExpr(self, ctx:SugarcParser.MulDivExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#indexAssignment.
    def enterIndexAssignment(self, ctx:SugarcParser.IndexAssignmentContext):
        pass

    # Exit a parse tree produced by SugarcParser#indexAssignment.
    def exitIndexAssignment(self, ctx:SugarcParser.IndexAssignmentContext):
        pass


    # Enter a parse tree produced by SugarcParser#equalityExpr.
    def enterEqualityExpr(self, ctx:SugarcParser.EqualityExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#equalityExpr.
    def exitEqualityExpr(self, ctx:SugarcParser.EqualityExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#andExpr.
    def enterAndExpr(self, ctx:SugarcParser.AndExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#andExpr.
    def exitAndExpr(self, ctx:SugarcParser.AndExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#methodCall.
    def enterMethodCall(self, ctx:SugarcParser.MethodCallContext):
        pass

    # Exit a parse tree produced by SugarcParser#methodCall.
    def exitMethodCall(self, ctx:SugarcParser.MethodCallContext):
        pass


    # Enter a parse tree produced by SugarcParser#exprList.
    def enterExprList(self, ctx:SugarcParser.ExprListContext):
        pass

    # Exit a parse tree produced by SugarcParser#exprList.
    def exitExprList(self, ctx:SugarcParser.ExprListContext):
        pass


    # Enter a parse tree produced by SugarcParser#literal.
    def enterLiteral(self, ctx:SugarcParser.LiteralContext):
        pass

    # Exit a parse tree produced by SugarcParser#literal.
    def exitLiteral(self, ctx:SugarcParser.LiteralContext):
        pass



del SugarcParser