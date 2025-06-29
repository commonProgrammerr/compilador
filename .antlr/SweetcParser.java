// Generated from /home/scorel/Documents/projects/compilador/Sweetc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SweetcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INT=39, STRING=40, BOOLEAN=41, ID=42, WS=43, COMMENT=44, LINE_COMMENT=45;
	public static final int
		RULE_program = 0, RULE_classDecl = 1, RULE_field = 2, RULE_method = 3, 
		RULE_params = 4, RULE_param = 5, RULE_type = 6, RULE_varDecl = 7, RULE_stmt = 8, 
		RULE_block = 9, RULE_expr = 10, RULE_exprList = 11, RULE_literal = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDecl", "field", "method", "params", "param", "type", 
			"varDecl", "stmt", "block", "expr", "exprList", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'extends'", "'{'", "'}'", "';'", "'void'", "'('", "')'", 
			"'return'", "','", "'int'", "'string'", "'boolean'", "'='", "'if'", "'else'", 
			"'while'", "'System.out.println'", "'.'", "'new'", "'this'", "'super'", 
			"'['", "']'", "'!'", "'*'", "'/'", "'+'", "'-'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT", "STRING", "BOOLEAN", "ID", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sweetc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SweetcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SweetcParser.EOF, 0); }
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(26);
				classDecl();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SweetcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SweetcParser.ID, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
			setState(35);
			match(ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(36);
				match(T__1);
				setState(37);
				match(ID);
				}
			}

			setState(40);
			match(T__2);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046525504L) != 0)) {
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(41);
					field();
					}
					break;
				case 2:
					{
					setState(42);
					method();
					}
					break;
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			type();
			setState(51);
			match(ID);
			setState(52);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(54);
				type();
				}
				break;
			case 2:
				{
				setState(55);
				match(T__5);
				}
				break;
			}
			setState(58);
			match(ID);
			setState(59);
			match(T__6);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046525504L) != 0)) {
				{
				setState(60);
				params();
				}
			}

			setState(63);
			match(T__7);
			setState(64);
			match(T__2);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					varDecl();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521256450240L) != 0)) {
				{
				{
				setState(71);
				stmt();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(77);
				match(T__8);
				setState(78);
				expr(0);
				setState(79);
				match(T__4);
				}
			}

			setState(83);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			param();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(86);
				match(T__9);
				setState(87);
				param();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			type();
			setState(94);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046525504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			type();
			setState(99);
			match(ID);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(100);
				match(T__13);
				setState(101);
				expr(0);
				}
			}

			setState(104);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				expr(0);
				setState(108);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(T__14);
				setState(111);
				match(T__6);
				setState(112);
				expr(0);
				setState(113);
				match(T__7);
				setState(114);
				block();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(115);
					match(T__15);
					setState(116);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__16);
				setState(120);
				match(T__6);
				setState(121);
				expr(0);
				setState(122);
				match(T__7);
				setState(123);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(T__17);
				setState(126);
				match(T__6);
				setState(127);
				expr(0);
				setState(128);
				match(T__7);
				setState(129);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__2);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521256450240L) != 0)) {
				{
				{
				setState(134);
				stmt();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperCallContext extends ExprContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SuperCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisReferenceContext extends ExprContext {
		public ThisReferenceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MethodCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarReferenceContext extends ExprContext {
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public VarReferenceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInstantiationContext extends ExprContext {
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjectInstantiationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public MemberAccessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(SweetcParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GroupedExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ObjectInstantiationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				match(T__19);
				setState(144);
				match(ID);
				setState(145);
				match(T__6);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521256009856L) != 0)) {
					{
					setState(146);
					exprList();
					}
				}

				setState(149);
				match(T__7);
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(ID);
				setState(151);
				match(T__6);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521256009856L) != 0)) {
					{
					setState(152);
					exprList();
					}
				}

				setState(155);
				match(T__7);
				}
				break;
			case 3:
				{
				_localctx = new ThisReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__20);
				}
				break;
			case 4:
				{
				_localctx = new SuperCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__21);
				setState(158);
				match(T__6);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521256009856L) != 0)) {
					{
					setState(159);
					exprList();
					}
				}

				setState(162);
				match(T__7);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(T__24);
				setState(164);
				expr(11);
				}
				break;
			case 6:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(ID);
				setState(166);
				match(T__13);
				setState(167);
				expr(4);
				}
				break;
			case 7:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new GroupedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__6);
				setState(171);
				expr(0);
				setState(172);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(177);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(180);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(186);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(189);
						match(T__35);
						setState(190);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
						match(T__36);
						setState(193);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(195);
						match(T__18);
						setState(196);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(198);
						match(T__18);
						setState(199);
						match(ID);
						setState(200);
						match(T__6);
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8521256009856L) != 0)) {
							{
							setState(201);
							exprList();
							}
						}

						setState(204);
						match(T__7);
						}
						break;
					case 9:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(206);
						match(T__22);
						setState(207);
						expr(0);
						setState(208);
						match(T__23);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			expr(0);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(216);
				match(T__9);
				setState(217);
				expr(0);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SweetcParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SweetcParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SweetcParser.BOOLEAN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u00e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003C\b\u0003\n\u0003\f\u0003"+
		"F\t\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003L\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003R\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004Y\b"+
		"\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007g\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bv\b"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0084\b\b\u0001\t\u0001\t\u0005\t\u0088"+
		"\b\t\n\t\f\t\u008b\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0094\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009a"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00a1\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00af\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00cb\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00d3\b\n\n\n\f\n\u00d6\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00db\b\u000b\n\u000b\f\u000b\u00de\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0000\u0001\u0014\r\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0006\u0003\u0000\u0006"+
		"\u0006\u000b\r**\u0001\u0000\u001a\u001b\u0001\u0000\u001c\u001d\u0001"+
		"\u0000\u001e!\u0001\u0000\"#\u0001\u0000&)\u00fb\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000"+
		"\u0000\u00068\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n]\u0001"+
		"\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000"+
		"\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000\u0000"+
		"\u0000\u0014\u00ae\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000\u0000"+
		"\u0000\u0018\u00df\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		" !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000\u0000\"#\u0005\u0001"+
		"\u0000\u0000#&\u0005*\u0000\u0000$%\u0005\u0002\u0000\u0000%\'\u0005*"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(-\u0005\u0003\u0000\u0000),\u0003\u0004\u0002\u0000"+
		"*,\u0003\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005"+
		"\u0004\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0003\f\u0006\u0000"+
		"34\u0005*\u0000\u000045\u0005\u0005\u0000\u00005\u0005\u0001\u0000\u0000"+
		"\u000069\u0003\f\u0006\u000079\u0005\u0006\u0000\u000086\u0001\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005*\u0000"+
		"\u0000;=\u0005\u0007\u0000\u0000<>\u0003\b\u0004\u0000=<\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\b\u0000"+
		"\u0000@D\u0005\u0003\u0000\u0000AC\u0003\u000e\u0007\u0000BA\u0001\u0000"+
		"\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EJ\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000"+
		"GI\u0003\u0010\b\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KQ\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\t\u0000\u0000NO\u0003\u0014\n"+
		"\u0000OP\u0005\u0005\u0000\u0000PR\u0001\u0000\u0000\u0000QM\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0004\u0000\u0000T\u0007\u0001\u0000\u0000\u0000UZ\u0003\n\u0005\u0000"+
		"VW\u0005\n\u0000\u0000WY\u0003\n\u0005\u0000XV\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\t\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0003\f"+
		"\u0006\u0000^_\u0005*\u0000\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0007"+
		"\u0000\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0003\f\u0006\u0000cf"+
		"\u0005*\u0000\u0000de\u0005\u000e\u0000\u0000eg\u0003\u0014\n\u0000fd"+
		"\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0005\u0000\u0000i\u000f\u0001\u0000\u0000\u0000j\u0084"+
		"\u0003\u000e\u0007\u0000kl\u0003\u0014\n\u0000lm\u0005\u0005\u0000\u0000"+
		"m\u0084\u0001\u0000\u0000\u0000no\u0005\u000f\u0000\u0000op\u0005\u0007"+
		"\u0000\u0000pq\u0003\u0014\n\u0000qr\u0005\b\u0000\u0000ru\u0003\u0012"+
		"\t\u0000st\u0005\u0010\u0000\u0000tv\u0003\u0012\t\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0084\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0011\u0000\u0000xy\u0005\u0007\u0000\u0000yz\u0003\u0014\n\u0000"+
		"z{\u0005\b\u0000\u0000{|\u0003\u0012\t\u0000|\u0084\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0012\u0000\u0000~\u007f\u0005\u0007\u0000\u0000\u007f"+
		"\u0080\u0003\u0014\n\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0082"+
		"\u0005\u0005\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083j\u0001"+
		"\u0000\u0000\u0000\u0083k\u0001\u0000\u0000\u0000\u0083n\u0001\u0000\u0000"+
		"\u0000\u0083w\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0084"+
		"\u0011\u0001\u0000\u0000\u0000\u0085\u0089\u0005\u0003\u0000\u0000\u0086"+
		"\u0088\u0003\u0010\b\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0004\u0000\u0000\u008d\u0013"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0006\n\uffff\uffff\u0000\u008f\u0090"+
		"\u0005\u0014\u0000\u0000\u0090\u0091\u0005*\u0000\u0000\u0091\u0093\u0005"+
		"\u0007\u0000\u0000\u0092\u0094\u0003\u0016\u000b\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u00af\u0005\b\u0000\u0000\u0096\u0097\u0005*"+
		"\u0000\u0000\u0097\u0099\u0005\u0007\u0000\u0000\u0098\u009a\u0003\u0016"+
		"\u000b\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00af\u0005\b\u0000"+
		"\u0000\u009c\u00af\u0005\u0015\u0000\u0000\u009d\u009e\u0005\u0016\u0000"+
		"\u0000\u009e\u00a0\u0005\u0007\u0000\u0000\u009f\u00a1\u0003\u0016\u000b"+
		"\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00af\u0005\b\u0000\u0000"+
		"\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4\u00af\u0003\u0014\n\u000b\u00a5"+
		"\u00a6\u0005*\u0000\u0000\u00a6\u00a7\u0005\u000e\u0000\u0000\u00a7\u00af"+
		"\u0003\u0014\n\u0004\u00a8\u00af\u0003\u0018\f\u0000\u00a9\u00af\u0005"+
		"*\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ac\u0003\u0014"+
		"\n\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad\u00af\u0001\u0000\u0000"+
		"\u0000\u00ae\u008e\u0001\u0000\u0000\u0000\u00ae\u0096\u0001\u0000\u0000"+
		"\u0000\u00ae\u009c\u0001\u0000\u0000\u0000\u00ae\u009d\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a3\u0001\u0000\u0000\u0000\u00ae\u00a5\u0001\u0000\u0000"+
		"\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00af\u00d4\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\n\n\u0000\u0000\u00b1\u00b2\u0007\u0001\u0000\u0000"+
		"\u00b2\u00d3\u0003\u0014\n\u000b\u00b3\u00b4\n\t\u0000\u0000\u00b4\u00b5"+
		"\u0007\u0002\u0000\u0000\u00b5\u00d3\u0003\u0014\n\n\u00b6\u00b7\n\b\u0000"+
		"\u0000\u00b7\u00b8\u0007\u0003\u0000\u0000\u00b8\u00d3\u0003\u0014\n\t"+
		"\u00b9\u00ba\n\u0007\u0000\u0000\u00ba\u00bb\u0007\u0004\u0000\u0000\u00bb"+
		"\u00d3\u0003\u0014\n\b\u00bc\u00bd\n\u0006\u0000\u0000\u00bd\u00be\u0005"+
		"$\u0000\u0000\u00be\u00d3\u0003\u0014\n\u0007\u00bf\u00c0\n\u0005\u0000"+
		"\u0000\u00c0\u00c1\u0005%\u0000\u0000\u00c1\u00d3\u0003\u0014\n\u0006"+
		"\u00c2\u00c3\n\u0012\u0000\u0000\u00c3\u00c4\u0005\u0013\u0000\u0000\u00c4"+
		"\u00d3\u0005*\u0000\u0000\u00c5\u00c6\n\u0011\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0013\u0000\u0000\u00c7\u00c8\u0005*\u0000\u0000\u00c8\u00ca\u0005"+
		"\u0007\u0000\u0000\u00c9\u00cb\u0003\u0016\u000b\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00d3\u0005\b\u0000\u0000\u00cd\u00ce\n\f\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0017\u0000\u0000\u00cf\u00d0\u0003\u0014\n\u0000"+
		"\u00d0\u00d1\u0005\u0018\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00b0\u0001\u0000\u0000\u0000\u00d2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00b6\u0001\u0000\u0000\u0000\u00d2\u00b9\u0001\u0000\u0000\u0000"+
		"\u00d2\u00bc\u0001\u0000\u0000\u0000\u00d2\u00bf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00c2\u0001\u0000\u0000\u0000\u00d2\u00c5\u0001\u0000\u0000\u0000"+
		"\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u0015\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00dc\u0003\u0014\n\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9"+
		"\u00db\u0003\u0014\n\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u0017\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0007\u0005\u0000\u0000\u00e0\u0019"+
		"\u0001\u0000\u0000\u0000\u0016\u001d&+-8=DJQZfu\u0083\u0089\u0093\u0099"+
		"\u00a0\u00ae\u00ca\u00d2\u00d4\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}