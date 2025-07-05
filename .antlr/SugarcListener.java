// Generated from /Users/andre.escorel/Documents/Material de Compiladores/Sugarc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SugarcParser}.
 */
public interface SugarcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SugarcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SugarcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SugarcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(SugarcParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(SugarcParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#classInherence}.
	 * @param ctx the parse tree
	 */
	void enterClassInherence(SugarcParser.ClassInherenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#classInherence}.
	 * @param ctx the parse tree
	 */
	void exitClassInherence(SugarcParser.ClassInherenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(SugarcParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(SugarcParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SugarcParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SugarcParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SugarcParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SugarcParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SugarcParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SugarcParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SugarcParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SugarcParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SugarcParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SugarcParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(SugarcParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(SugarcParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(SugarcParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(SugarcParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(SugarcParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(SugarcParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(SugarcParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(SugarcParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForEachStmt(SugarcParser.ForEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForEachStmt(SugarcParser.ForEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link SugarcParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(SugarcParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link SugarcParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(SugarcParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link SugarcParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(SugarcParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link SugarcParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(SugarcParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link SugarcParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(SugarcParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link SugarcParser#controlStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(SugarcParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SugarcParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SugarcParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SugarcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SugarcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(SugarcParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(SugarcParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(SugarcParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(SugarcParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SugarcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SugarcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInstantiation}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiation(SugarcParser.ObjectInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInstantiation}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiation(SugarcParser.ObjectInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(SugarcParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(SugarcParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(SugarcParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(SugarcParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisReference}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisReference(SugarcParser.ThisReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisReference}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisReference(SugarcParser.ThisReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(SugarcParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(SugarcParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(SugarcParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarReference}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(SugarcParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SugarcParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SugarcParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(SugarcParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(SugarcParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superCall}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuperCall(SugarcParser.SuperCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superCall}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuperCall(SugarcParser.SuperCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(SugarcParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(SugarcParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(SugarcParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(SugarcParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpr(SugarcParser.GroupedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpr(SugarcParser.GroupedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(SugarcParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(SugarcParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(SugarcParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(SugarcParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(SugarcParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link SugarcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(SugarcParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(SugarcParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(SugarcParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SugarcParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SugarcParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SugarcParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SugarcParser.LiteralContext ctx);
}