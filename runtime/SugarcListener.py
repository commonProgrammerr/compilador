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


    # Enter a parse tree produced by SugarcParser#functionDecl.
    def enterFunctionDecl(self, ctx:SugarcParser.FunctionDeclContext):
        pass

    # Exit a parse tree produced by SugarcParser#functionDecl.
    def exitFunctionDecl(self, ctx:SugarcParser.FunctionDeclContext):
        pass


    # Enter a parse tree produced by SugarcParser#field.
    def enterField(self, ctx:SugarcParser.FieldContext):
        pass

    # Exit a parse tree produced by SugarcParser#field.
    def exitField(self, ctx:SugarcParser.FieldContext):
        pass


    # Enter a parse tree produced by SugarcParser#method.
    def enterMethod(self, ctx:SugarcParser.MethodContext):
        pass

    # Exit a parse tree produced by SugarcParser#method.
    def exitMethod(self, ctx:SugarcParser.MethodContext):
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


    # Enter a parse tree produced by SugarcParser#type.
    def enterType(self, ctx:SugarcParser.TypeContext):
        pass

    # Exit a parse tree produced by SugarcParser#type.
    def exitType(self, ctx:SugarcParser.TypeContext):
        pass


    # Enter a parse tree produced by SugarcParser#varDecl.
    def enterVarDecl(self, ctx:SugarcParser.VarDeclContext):
        pass

    # Exit a parse tree produced by SugarcParser#varDecl.
    def exitVarDecl(self, ctx:SugarcParser.VarDeclContext):
        pass


    # Enter a parse tree produced by SugarcParser#ifStmt.
    def enterIfStmt(self, ctx:SugarcParser.IfStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#ifStmt.
    def exitIfStmt(self, ctx:SugarcParser.IfStmtContext):
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


    # Enter a parse tree produced by SugarcParser#forEachStmt.
    def enterForEachStmt(self, ctx:SugarcParser.ForEachStmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#forEachStmt.
    def exitForEachStmt(self, ctx:SugarcParser.ForEachStmtContext):
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


    # Enter a parse tree produced by SugarcParser#thisReference.
    def enterThisReference(self, ctx:SugarcParser.ThisReferenceContext):
        pass

    # Exit a parse tree produced by SugarcParser#thisReference.
    def exitThisReference(self, ctx:SugarcParser.ThisReferenceContext):
        pass


    # Enter a parse tree produced by SugarcParser#notExpr.
    def enterNotExpr(self, ctx:SugarcParser.NotExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#notExpr.
    def exitNotExpr(self, ctx:SugarcParser.NotExprContext):
        pass


    # Enter a parse tree produced by SugarcParser#VarReference.
    def enterVarReference(self, ctx:SugarcParser.VarReferenceContext):
        pass

    # Exit a parse tree produced by SugarcParser#VarReference.
    def exitVarReference(self, ctx:SugarcParser.VarReferenceContext):
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


    # Enter a parse tree produced by SugarcParser#GroupedExpr.
    def enterGroupedExpr(self, ctx:SugarcParser.GroupedExprContext):
        pass

    # Exit a parse tree produced by SugarcParser#GroupedExpr.
    def exitGroupedExpr(self, ctx:SugarcParser.GroupedExprContext):
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