# Generated from d.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .dParser import dParser
else:
    from dParser import dParser

# This class defines a complete listener for a parse tree produced by dParser.
class dListener(ParseTreeListener):

    # Enter a parse tree produced by dParser#program.
    def enterProgram(self, ctx:dParser.ProgramContext):
        pass

    # Exit a parse tree produced by dParser#program.
    def exitProgram(self, ctx:dParser.ProgramContext):
        pass


    # Enter a parse tree produced by dParser#statement.
    def enterStatement(self, ctx:dParser.StatementContext):
        pass

    # Exit a parse tree produced by dParser#statement.
    def exitStatement(self, ctx:dParser.StatementContext):
        pass


    # Enter a parse tree produced by dParser#varType.
    def enterVarType(self, ctx:dParser.VarTypeContext):
        pass

    # Exit a parse tree produced by dParser#varType.
    def exitVarType(self, ctx:dParser.VarTypeContext):
        pass


    # Enter a parse tree produced by dParser#varDecl.
    def enterVarDecl(self, ctx:dParser.VarDeclContext):
        pass

    # Exit a parse tree produced by dParser#varDecl.
    def exitVarDecl(self, ctx:dParser.VarDeclContext):
        pass


    # Enter a parse tree produced by dParser#varIntDecl.
    def enterVarIntDecl(self, ctx:dParser.VarIntDeclContext):
        pass

    # Exit a parse tree produced by dParser#varIntDecl.
    def exitVarIntDecl(self, ctx:dParser.VarIntDeclContext):
        pass


    # Enter a parse tree produced by dParser#varFloatDecl.
    def enterVarFloatDecl(self, ctx:dParser.VarFloatDeclContext):
        pass

    # Exit a parse tree produced by dParser#varFloatDecl.
    def exitVarFloatDecl(self, ctx:dParser.VarFloatDeclContext):
        pass


    # Enter a parse tree produced by dParser#varStringDecl.
    def enterVarStringDecl(self, ctx:dParser.VarStringDeclContext):
        pass

    # Exit a parse tree produced by dParser#varStringDecl.
    def exitVarStringDecl(self, ctx:dParser.VarStringDeclContext):
        pass


    # Enter a parse tree produced by dParser#varBoolDecl.
    def enterVarBoolDecl(self, ctx:dParser.VarBoolDeclContext):
        pass

    # Exit a parse tree produced by dParser#varBoolDecl.
    def exitVarBoolDecl(self, ctx:dParser.VarBoolDeclContext):
        pass


    # Enter a parse tree produced by dParser#assignStat.
    def enterAssignStat(self, ctx:dParser.AssignStatContext):
        pass

    # Exit a parse tree produced by dParser#assignStat.
    def exitAssignStat(self, ctx:dParser.AssignStatContext):
        pass


    # Enter a parse tree produced by dParser#ifStat.
    def enterIfStat(self, ctx:dParser.IfStatContext):
        pass

    # Exit a parse tree produced by dParser#ifStat.
    def exitIfStat(self, ctx:dParser.IfStatContext):
        pass


    # Enter a parse tree produced by dParser#whileStat.
    def enterWhileStat(self, ctx:dParser.WhileStatContext):
        pass

    # Exit a parse tree produced by dParser#whileStat.
    def exitWhileStat(self, ctx:dParser.WhileStatContext):
        pass


    # Enter a parse tree produced by dParser#block.
    def enterBlock(self, ctx:dParser.BlockContext):
        pass

    # Exit a parse tree produced by dParser#block.
    def exitBlock(self, ctx:dParser.BlockContext):
        pass


    # Enter a parse tree produced by dParser#printStat.
    def enterPrintStat(self, ctx:dParser.PrintStatContext):
        pass

    # Exit a parse tree produced by dParser#printStat.
    def exitPrintStat(self, ctx:dParser.PrintStatContext):
        pass


    # Enter a parse tree produced by dParser#forStat.
    def enterForStat(self, ctx:dParser.ForStatContext):
        pass

    # Exit a parse tree produced by dParser#forStat.
    def exitForStat(self, ctx:dParser.ForStatContext):
        pass


    # Enter a parse tree produced by dParser#functionDef.
    def enterFunctionDef(self, ctx:dParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by dParser#functionDef.
    def exitFunctionDef(self, ctx:dParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by dParser#functionCall.
    def enterFunctionCall(self, ctx:dParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by dParser#functionCall.
    def exitFunctionCall(self, ctx:dParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by dParser#expr.
    def enterExpr(self, ctx:dParser.ExprContext):
        pass

    # Exit a parse tree produced by dParser#expr.
    def exitExpr(self, ctx:dParser.ExprContext):
        pass



del dParser