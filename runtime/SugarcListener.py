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


    # Enter a parse tree produced by SugarcParser#class_decl.
    def enterClass_decl(self, ctx:SugarcParser.Class_declContext):
        pass

    # Exit a parse tree produced by SugarcParser#class_decl.
    def exitClass_decl(self, ctx:SugarcParser.Class_declContext):
        pass


    # Enter a parse tree produced by SugarcParser#function_decl.
    def enterFunction_decl(self, ctx:SugarcParser.Function_declContext):
        pass

    # Exit a parse tree produced by SugarcParser#function_decl.
    def exitFunction_decl(self, ctx:SugarcParser.Function_declContext):
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


    # Enter a parse tree produced by SugarcParser#var_decl.
    def enterVar_decl(self, ctx:SugarcParser.Var_declContext):
        pass

    # Exit a parse tree produced by SugarcParser#var_decl.
    def exitVar_decl(self, ctx:SugarcParser.Var_declContext):
        pass


    # Enter a parse tree produced by SugarcParser#if_stmt.
    def enterIf_stmt(self, ctx:SugarcParser.If_stmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#if_stmt.
    def exitIf_stmt(self, ctx:SugarcParser.If_stmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#while_stmt.
    def enterWhile_stmt(self, ctx:SugarcParser.While_stmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#while_stmt.
    def exitWhile_stmt(self, ctx:SugarcParser.While_stmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#for_stmt.
    def enterFor_stmt(self, ctx:SugarcParser.For_stmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#for_stmt.
    def exitFor_stmt(self, ctx:SugarcParser.For_stmtContext):
        pass


    # Enter a parse tree produced by SugarcParser#for_each_stmt.
    def enterFor_each_stmt(self, ctx:SugarcParser.For_each_stmtContext):
        pass

    # Exit a parse tree produced by SugarcParser#for_each_stmt.
    def exitFor_each_stmt(self, ctx:SugarcParser.For_each_stmtContext):
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


    # Enter a parse tree produced by SugarcParser#grouped_expr.
    def enterGrouped_expr(self, ctx:SugarcParser.Grouped_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#grouped_expr.
    def exitGrouped_expr(self, ctx:SugarcParser.Grouped_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#relational_expr.
    def enterRelational_expr(self, ctx:SugarcParser.Relational_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#relational_expr.
    def exitRelational_expr(self, ctx:SugarcParser.Relational_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#function_call.
    def enterFunction_call(self, ctx:SugarcParser.Function_callContext):
        pass

    # Exit a parse tree produced by SugarcParser#function_call.
    def exitFunction_call(self, ctx:SugarcParser.Function_callContext):
        pass


    # Enter a parse tree produced by SugarcParser#this_reference.
    def enterThis_reference(self, ctx:SugarcParser.This_referenceContext):
        pass

    # Exit a parse tree produced by SugarcParser#this_reference.
    def exitThis_reference(self, ctx:SugarcParser.This_referenceContext):
        pass


    # Enter a parse tree produced by SugarcParser#array_access.
    def enterArray_access(self, ctx:SugarcParser.Array_accessContext):
        pass

    # Exit a parse tree produced by SugarcParser#array_access.
    def exitArray_access(self, ctx:SugarcParser.Array_accessContext):
        pass


    # Enter a parse tree produced by SugarcParser#assignment.
    def enterAssignment(self, ctx:SugarcParser.AssignmentContext):
        pass

    # Exit a parse tree produced by SugarcParser#assignment.
    def exitAssignment(self, ctx:SugarcParser.AssignmentContext):
        pass


    # Enter a parse tree produced by SugarcParser#mul_div_expr.
    def enterMul_div_expr(self, ctx:SugarcParser.Mul_div_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#mul_div_expr.
    def exitMul_div_expr(self, ctx:SugarcParser.Mul_div_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#object_instantiation.
    def enterObject_instantiation(self, ctx:SugarcParser.Object_instantiationContext):
        pass

    # Exit a parse tree produced by SugarcParser#object_instantiation.
    def exitObject_instantiation(self, ctx:SugarcParser.Object_instantiationContext):
        pass


    # Enter a parse tree produced by SugarcParser#method_call.
    def enterMethod_call(self, ctx:SugarcParser.Method_callContext):
        pass

    # Exit a parse tree produced by SugarcParser#method_call.
    def exitMethod_call(self, ctx:SugarcParser.Method_callContext):
        pass


    # Enter a parse tree produced by SugarcParser#super_call.
    def enterSuper_call(self, ctx:SugarcParser.Super_callContext):
        pass

    # Exit a parse tree produced by SugarcParser#super_call.
    def exitSuper_call(self, ctx:SugarcParser.Super_callContext):
        pass


    # Enter a parse tree produced by SugarcParser#not_expr.
    def enterNot_expr(self, ctx:SugarcParser.Not_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#not_expr.
    def exitNot_expr(self, ctx:SugarcParser.Not_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#add_sub_expr.
    def enterAdd_sub_expr(self, ctx:SugarcParser.Add_sub_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#add_sub_expr.
    def exitAdd_sub_expr(self, ctx:SugarcParser.Add_sub_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#and_expr.
    def enterAnd_expr(self, ctx:SugarcParser.And_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#and_expr.
    def exitAnd_expr(self, ctx:SugarcParser.And_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#member_access.
    def enterMember_access(self, ctx:SugarcParser.Member_accessContext):
        pass

    # Exit a parse tree produced by SugarcParser#member_access.
    def exitMember_access(self, ctx:SugarcParser.Member_accessContext):
        pass


    # Enter a parse tree produced by SugarcParser#or_expr.
    def enterOr_expr(self, ctx:SugarcParser.Or_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#or_expr.
    def exitOr_expr(self, ctx:SugarcParser.Or_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#literal_expr.
    def enterLiteral_expr(self, ctx:SugarcParser.Literal_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#literal_expr.
    def exitLiteral_expr(self, ctx:SugarcParser.Literal_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#var_reference.
    def enterVar_reference(self, ctx:SugarcParser.Var_referenceContext):
        pass

    # Exit a parse tree produced by SugarcParser#var_reference.
    def exitVar_reference(self, ctx:SugarcParser.Var_referenceContext):
        pass


    # Enter a parse tree produced by SugarcParser#equality_expr.
    def enterEquality_expr(self, ctx:SugarcParser.Equality_exprContext):
        pass

    # Exit a parse tree produced by SugarcParser#equality_expr.
    def exitEquality_expr(self, ctx:SugarcParser.Equality_exprContext):
        pass


    # Enter a parse tree produced by SugarcParser#expr_list.
    def enterExpr_list(self, ctx:SugarcParser.Expr_listContext):
        pass

    # Exit a parse tree produced by SugarcParser#expr_list.
    def exitExpr_list(self, ctx:SugarcParser.Expr_listContext):
        pass


    # Enter a parse tree produced by SugarcParser#literal.
    def enterLiteral(self, ctx:SugarcParser.LiteralContext):
        pass

    # Exit a parse tree produced by SugarcParser#literal.
    def exitLiteral(self, ctx:SugarcParser.LiteralContext):
        pass



del SugarcParser