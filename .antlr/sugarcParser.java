// Generated from /home/scorel/Documents/projects/compilador/sugarc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class sugarcParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, INT=43, STRING=44, BOOLEAN=45, 
		FLOAT=46, ID=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static final int
		RULE_program = 0, RULE_class_decl = 1, RULE_function_decl = 2, RULE_field = 3, 
		RULE_method = 4, RULE_params = 5, RULE_param = 6, RULE_type = 7, RULE_var_decl = 8, 
		RULE_if_stmt = 9, RULE_while_stmt = 10, RULE_for_stmt = 11, RULE_for_each_stmt = 12, 
		RULE_stmt = 13, RULE_block = 14, RULE_expr = 15, RULE_exprList = 16, RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_decl", "function_decl", "field", "method", "params", 
			"param", "type", "var_decl", "if_stmt", "while_stmt", "for_stmt", "for_each_stmt", 
			"stmt", "block", "expr", "exprList", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'extends'", "'{'", "'}'", "'void'", "'('", "')'", "';'", 
			"','", "'int'", "'string'", "'bool'", "'float'", "'='", "'if'", "'else'", 
			"'while'", "'for'", "':'", "'break'", "'continue'", "'return'", "'.'", 
			"'new'", "'this'", "'super'", "'['", "']'", "'!'", "'*'", "'/'", "'+'", 
			"'-'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "STRING", "BOOLEAN", 
			"FLOAT", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "sugarc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sugarcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(sugarcParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<Class_declContext> class_decl() {
			return getRuleContexts(Class_declContext.class);
		}
		public Class_declContext class_decl(int i) {
			return getRuleContext(Class_declContext.class,i);
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
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077592292426L) != 0)) {
				{
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__5:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__14:
				case T__16:
				case T__17:
				case T__19:
				case T__20:
				case T__21:
				case T__23:
				case T__24:
				case T__25:
				case T__28:
				case T__41:
				case INT:
				case STRING:
				case BOOLEAN:
				case FLOAT:
				case ID:
					{
					setState(36);
					stmt();
					}
					break;
				case T__0:
					{
					setState(37);
					class_decl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
	public static class Class_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sugarcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sugarcParser.ID, i);
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
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(ID);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(47);
				match(T__1);
				setState(48);
				match(ID);
				}
			}

			setState(51);
			match(T__2);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488370720L) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(52);
					field();
					}
					break;
				case 2:
					{
					setState(53);
					method();
					}
					break;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
	public static class Function_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				{
				setState(61);
				type();
				}
				break;
			case T__4:
				{
				setState(62);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			match(ID);
			setState(66);
			match(T__5);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488370688L) != 0)) {
				{
				setState(67);
				params();
				}
			}

			setState(70);
			match(T__6);
			setState(71);
			block();
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type();
			setState(74);
			match(ID);
			setState(75);
			match(T__7);
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				{
				setState(77);
				type();
				}
				break;
			case T__4:
				{
				setState(78);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
			match(ID);
			setState(82);
			match(T__5);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488370688L) != 0)) {
				{
				setState(83);
				params();
				}
			}

			setState(86);
			match(T__6);
			setState(87);
			block();
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
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			param();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(90);
				match(T__8);
				setState(91);
				param();
				}
				}
				setState(96);
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			type();
			setState(98);
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488370688L) != 0)) ) {
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
	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			type();
			setState(103);
			match(ID);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(104);
				match(T__13);
				setState(105);
				expr(0);
				}
			}

			setState(108);
			match(T__7);
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
	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__14);
			setState(111);
			match(T__5);
			setState(112);
			expr(0);
			setState(113);
			match(T__6);
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
	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__16);
			setState(120);
			match(T__5);
			setState(121);
			expr(0);
			setState(122);
			match(T__6);
			setState(123);
			block();
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
	public static class For_stmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__17);
			setState(126);
			match(T__5);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(127);
				var_decl();
				}
				break;
			case 2:
				{
				setState(128);
				expr(0);
				setState(129);
				match(T__7);
				}
				break;
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
				{
				setState(133);
				expr(0);
				}
			}

			setState(136);
			match(T__7);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
				{
				setState(137);
				expr(0);
				}
			}

			setState(140);
			match(T__6);
			setState(141);
			block();
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
	public static class For_each_stmtContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_each_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_stmt; }
	}

	public final For_each_stmtContext for_each_stmt() throws RecognitionException {
		For_each_stmtContext _localctx = new For_each_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_each_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__17);
			setState(144);
			match(T__5);
			setState(145);
			type();
			setState(146);
			match(ID);
			setState(147);
			match(T__18);
			setState(148);
			expr(0);
			setState(149);
			match(T__6);
			setState(150);
			block();
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
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public For_each_stmtContext for_each_stmt() {
			return getRuleContext(For_each_stmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				expr(0);
				setState(154);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				for_each_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(T__19);
				setState(162);
				match(T__7);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				match(T__20);
				setState(164);
				match(T__7);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(165);
				match(T__21);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(166);
					expr(0);
					}
				}

				setState(169);
				match(T__7);
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
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__2);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077592292424L) != 0)) {
				{
				{
				setState(173);
				stmt();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(sugarcParser.ID, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ObjectInstantiationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				match(T__23);
				setState(183);
				match(ID);
				setState(184);
				match(T__5);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(185);
					exprList();
					}
				}

				setState(188);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(ID);
				setState(190);
				match(T__5);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(191);
					exprList();
					}
				}

				setState(194);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new ThisReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__24);
				}
				break;
			case 4:
				{
				_localctx = new SuperCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__25);
				setState(197);
				match(T__5);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(198);
					exprList();
					}
				}

				setState(201);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(T__28);
				setState(203);
				expr(11);
				}
				break;
			case 6:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(ID);
				setState(205);
				match(T__13);
				setState(206);
				expr(4);
				}
				break;
			case 7:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new GroupedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(T__5);
				setState(210);
				expr(0);
				setState(211);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(216);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(219);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(220);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(222);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(225);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(228);
						match(T__39);
						setState(229);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(231);
						match(T__40);
						setState(232);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(234);
						match(T__22);
						setState(235);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(237);
						match(T__22);
						setState(238);
						match(ID);
						setState(239);
						match(T__5);
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
							{
							setState(240);
							exprList();
							}
						}

						setState(243);
						match(T__6);
						}
						break;
					case 9:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(244);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(245);
						match(T__26);
						setState(246);
						expr(0);
						setState(247);
						match(T__27);
						}
						break;
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 32, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expr(0);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(255);
				match(T__8);
				setState(256);
				expr(0);
				}
				}
				setState(261);
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
		public TerminalNode INT() { return getToken(sugarcParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(sugarcParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(sugarcParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(sugarcParser.BOOLEAN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 136339441844224L) != 0)) ) {
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
		case 15:
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
		"\u0004\u00012\u0109\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001"+
		":\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"@\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004P\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005]\b\u0005\n\u0005"+
		"\f\u0005`\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tv\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0084\b\u000b\u0001"+
		"\u000b\u0003\u000b\u0087\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008b"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00a8\b\r\u0001\r\u0003\r\u00ab\b\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00af\b\u000e\n\u000e\f\u000e\u00b2\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00bb\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00c1\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c8\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d6\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00f2\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00fa\b\u000f\n"+
		"\u000f\f\u000f\u00fd\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0102\b\u0010\n\u0010\f\u0010\u0105\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0000\u0001\u001e\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0006\u0002"+
		"\u0000\n\r//\u0001\u0000\u001e\u001f\u0001\u0000 !\u0001\u0000\"%\u0001"+
		"\u0000&\'\u0001\u0000*.\u0127\u0000(\u0001\u0000\u0000\u0000\u0002-\u0001"+
		"\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000"+
		"\u0000\bO\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\fa\u0001"+
		"\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000"+
		"\u0000\u0012n\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016"+
		"}\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u00aa"+
		"\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000\u0000\u0000\u001e\u00d5"+
		"\u0001\u0000\u0000\u0000 \u00fe\u0001\u0000\u0000\u0000\"\u0106\u0001"+
		"\u0000\u0000\u0000$\'\u0003\u001a\r\u0000%\'\u0003\u0002\u0001\u0000&"+
		"$\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0000\u0000\u0001,\u0001"+
		"\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000.1\u0005/\u0000\u0000"+
		"/0\u0005\u0002\u0000\u000002\u0005/\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000038\u0005\u0003\u0000"+
		"\u000047\u0003\u0006\u0003\u000057\u0003\b\u0004\u000064\u0001\u0000\u0000"+
		"\u000065\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0004\u0000\u0000<\u0003\u0001\u0000\u0000"+
		"\u0000=@\u0003\u000e\u0007\u0000>@\u0005\u0005\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005"+
		"/\u0000\u0000BD\u0005\u0006\u0000\u0000CE\u0003\n\u0005\u0000DC\u0001"+
		"\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FG\u0005\u0007\u0000\u0000GH\u0003\u001c\u000e\u0000H\u0005\u0001\u0000"+
		"\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005/\u0000\u0000KL\u0005\b"+
		"\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MP\u0003\u000e\u0007\u0000"+
		"NP\u0005\u0005\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005/\u0000\u0000RT\u0005\u0006\u0000"+
		"\u0000SU\u0003\n\u0005\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u0003\u001c"+
		"\u000e\u0000X\t\u0001\u0000\u0000\u0000Y^\u0003\f\u0006\u0000Z[\u0005"+
		"\t\u0000\u0000[]\u0003\f\u0006\u0000\\Z\u0001\u0000\u0000\u0000]`\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\u000b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0003\u000e"+
		"\u0007\u0000bc\u0005/\u0000\u0000c\r\u0001\u0000\u0000\u0000de\u0007\u0000"+
		"\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0003\u000e\u0007\u0000"+
		"gj\u0005/\u0000\u0000hi\u0005\u000e\u0000\u0000ik\u0003\u001e\u000f\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000lm\u0005\b\u0000\u0000m\u0011\u0001\u0000\u0000\u0000no\u0005\u000f"+
		"\u0000\u0000op\u0005\u0006\u0000\u0000pq\u0003\u001e\u000f\u0000qr\u0005"+
		"\u0007\u0000\u0000ru\u0003\u001c\u000e\u0000st\u0005\u0010\u0000\u0000"+
		"tv\u0003\u001c\u000e\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0005\u0011\u0000\u0000xy\u0005"+
		"\u0006\u0000\u0000yz\u0003\u001e\u000f\u0000z{\u0005\u0007\u0000\u0000"+
		"{|\u0003\u001c\u000e\u0000|\u0015\u0001\u0000\u0000\u0000}~\u0005\u0012"+
		"\u0000\u0000~\u0083\u0005\u0006\u0000\u0000\u007f\u0084\u0003\u0010\b"+
		"\u0000\u0080\u0081\u0003\u001e\u000f\u0000\u0081\u0082\u0005\b\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000"+
		"\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u001e\u000f\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0005\b\u0000\u0000\u0089"+
		"\u008b\u0003\u001e\u000f\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u0007\u0000\u0000\u008d\u008e\u0003\u001c\u000e\u0000\u008e"+
		"\u0017\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0012\u0000\u0000\u0090"+
		"\u0091\u0005\u0006\u0000\u0000\u0091\u0092\u0003\u000e\u0007\u0000\u0092"+
		"\u0093\u0005/\u0000\u0000\u0093\u0094\u0005\u0013\u0000\u0000\u0094\u0095"+
		"\u0003\u001e\u000f\u0000\u0095\u0096\u0005\u0007\u0000\u0000\u0096\u0097"+
		"\u0003\u001c\u000e\u0000\u0097\u0019\u0001\u0000\u0000\u0000\u0098\u00ab"+
		"\u0003\u0010\b\u0000\u0099\u009a\u0003\u001e\u000f\u0000\u009a\u009b\u0005"+
		"\b\u0000\u0000\u009b\u00ab\u0001\u0000\u0000\u0000\u009c\u00ab\u0003\u0012"+
		"\t\u0000\u009d\u00ab\u0003\u0014\n\u0000\u009e\u00ab\u0003\u0016\u000b"+
		"\u0000\u009f\u00ab\u0003\u0018\f\u0000\u00a0\u00ab\u0003\u001c\u000e\u0000"+
		"\u00a1\u00a2\u0005\u0014\u0000\u0000\u00a2\u00ab\u0005\b\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0015\u0000\u0000\u00a4\u00ab\u0005\b\u0000\u0000\u00a5\u00a7"+
		"\u0005\u0016\u0000\u0000\u00a6\u00a8\u0003\u001e\u000f\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005\b\u0000\u0000\u00aa\u0098\u0001"+
		"\u0000\u0000\u0000\u00aa\u0099\u0001\u0000\u0000\u0000\u00aa\u009c\u0001"+
		"\u0000\u0000\u0000\u00aa\u009d\u0001\u0000\u0000\u0000\u00aa\u009e\u0001"+
		"\u0000\u0000\u0000\u00aa\u009f\u0001\u0000\u0000\u0000\u00aa\u00a0\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa\u00a3\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000\u0000\u0000\u00ab\u001b\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b0\u0005\u0003\u0000\u0000\u00ad\u00af\u0003"+
		"\u001a\r\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0004\u0000\u0000\u00b4\u001d\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0006\u000f\uffff\uffff\u0000\u00b6\u00b7\u0005"+
		"\u0018\u0000\u0000\u00b7\u00b8\u0005/\u0000\u0000\u00b8\u00ba\u0005\u0006"+
		"\u0000\u0000\u00b9\u00bb\u0003 \u0010\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00d6\u0005\u0007\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000"+
		"\u00be\u00c0\u0005\u0006\u0000\u0000\u00bf\u00c1\u0003 \u0010\u0000\u00c0"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00d6\u0005\u0007\u0000\u0000\u00c3"+
		"\u00d6\u0005\u0019\u0000\u0000\u00c4\u00c5\u0005\u001a\u0000\u0000\u00c5"+
		"\u00c7\u0005\u0006\u0000\u0000\u00c6\u00c8\u0003 \u0010\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00d6\u0005\u0007\u0000\u0000\u00ca\u00cb"+
		"\u0005\u001d\u0000\u0000\u00cb\u00d6\u0003\u001e\u000f\u000b\u00cc\u00cd"+
		"\u0005/\u0000\u0000\u00cd\u00ce\u0005\u000e\u0000\u0000\u00ce\u00d6\u0003"+
		"\u001e\u000f\u0004\u00cf\u00d6\u0003\"\u0011\u0000\u00d0\u00d6\u0005/"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000\u00d2\u00d3\u0003\u001e"+
		"\u000f\u0000\u00d3\u00d4\u0005\u0007\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00b5\u0001\u0000\u0000\u0000\u00d5\u00bd\u0001\u0000"+
		"\u0000\u0000\u00d5\u00c3\u0001\u0000\u0000\u0000\u00d5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d5\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d5\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d1\u0001\u0000\u0000\u0000\u00d6\u00fb\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\n\n\u0000\u0000\u00d8\u00d9\u0007\u0001\u0000"+
		"\u0000\u00d9\u00fa\u0003\u001e\u000f\u000b\u00da\u00db\n\t\u0000\u0000"+
		"\u00db\u00dc\u0007\u0002\u0000\u0000\u00dc\u00fa\u0003\u001e\u000f\n\u00dd"+
		"\u00de\n\b\u0000\u0000\u00de\u00df\u0007\u0003\u0000\u0000\u00df\u00fa"+
		"\u0003\u001e\u000f\t\u00e0\u00e1\n\u0007\u0000\u0000\u00e1\u00e2\u0007"+
		"\u0004\u0000\u0000\u00e2\u00fa\u0003\u001e\u000f\b\u00e3\u00e4\n\u0006"+
		"\u0000\u0000\u00e4\u00e5\u0005(\u0000\u0000\u00e5\u00fa\u0003\u001e\u000f"+
		"\u0007\u00e6\u00e7\n\u0005\u0000\u0000\u00e7\u00e8\u0005)\u0000\u0000"+
		"\u00e8\u00fa\u0003\u001e\u000f\u0006\u00e9\u00ea\n\u0012\u0000\u0000\u00ea"+
		"\u00eb\u0005\u0017\u0000\u0000\u00eb\u00fa\u0005/\u0000\u0000\u00ec\u00ed"+
		"\n\u0011\u0000\u0000\u00ed\u00ee\u0005\u0017\u0000\u0000\u00ee\u00ef\u0005"+
		"/\u0000\u0000\u00ef\u00f1\u0005\u0006\u0000\u0000\u00f0\u00f2\u0003 \u0010"+
		"\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00fa\u0005\u0007\u0000"+
		"\u0000\u00f4\u00f5\n\f\u0000\u0000\u00f5\u00f6\u0005\u001b\u0000\u0000"+
		"\u00f6\u00f7\u0003\u001e\u000f\u0000\u00f7\u00f8\u0005\u001c\u0000\u0000"+
		"\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00da\u0001\u0000\u0000\u0000\u00f9\u00dd\u0001\u0000\u0000\u0000"+
		"\u00f9\u00e0\u0001\u0000\u0000\u0000\u00f9\u00e3\u0001\u0000\u0000\u0000"+
		"\u00f9\u00e6\u0001\u0000\u0000\u0000\u00f9\u00e9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00ec\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u001f\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0103\u0003\u001e\u000f\u0000"+
		"\u00ff\u0100\u0005\t\u0000\u0000\u0100\u0102\u0003\u001e\u000f\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"!\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0007\u0005\u0000\u0000\u0107#\u0001\u0000\u0000\u0000\u001a&(168?DO"+
		"T^ju\u0083\u0086\u008a\u00a7\u00aa\u00b0\u00ba\u00c0\u00c7\u00d5\u00f1"+
		"\u00f9\u00fb\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}