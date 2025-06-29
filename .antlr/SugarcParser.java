// Generated from /home/scorel/Documents/projects/compilador/Sugarc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SugarcParser extends Parser {
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
		RULE_stmt = 13, RULE_block = 14, RULE_expr = 15, RULE_expr_list = 16, 
		RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_decl", "function_decl", "field", "method", "params", 
			"param", "type", "var_decl", "if_stmt", "while_stmt", "for_stmt", "for_each_stmt", 
			"stmt", "block", "expr", "expr_list", "literal"
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
	public String getGrammarFileName() { return "Sugarc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SugarcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SugarcParser.EOF, 0); }
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
		public List<Function_declContext> function_decl() {
			return getRuleContexts(Function_declContext.class);
		}
		public Function_declContext function_decl(int i) {
			return getRuleContext(Function_declContext.class,i);
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077592292458L) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36);
					stmt();
					}
					break;
				case 2:
					{
					setState(37);
					class_decl();
					}
					break;
				case 3:
					{
					setState(38);
					function_decl();
					}
					break;
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
		public List<TerminalNode> ID() { return getTokens(SugarcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SugarcParser.ID, i);
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
			setState(46);
			match(T__0);
			setState(47);
			match(ID);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(48);
				match(T__1);
				setState(49);
				match(ID);
				}
			}

			setState(52);
			match(T__2);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488370720L) != 0)) {
				{
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(53);
					field();
					}
					break;
				case 2:
					{
					setState(54);
					method();
					}
					break;
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				{
				setState(62);
				type();
				}
				break;
			case T__4:
				{
				setState(63);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(66);
			match(ID);
			setState(67);
			match(T__5);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488370688L) != 0)) {
				{
				setState(68);
				params();
				}
			}

			setState(71);
			match(T__6);
			setState(72);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
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
			setState(74);
			type();
			setState(75);
			match(ID);
			setState(76);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
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
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case ID:
				{
				setState(78);
				type();
				}
				break;
			case T__4:
				{
				setState(79);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
			match(ID);
			setState(83);
			match(T__5);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737488370688L) != 0)) {
				{
				setState(84);
				params();
				}
			}

			setState(87);
			match(T__6);
			setState(88);
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
			setState(90);
			param();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(91);
				match(T__8);
				setState(92);
				param();
				}
				}
				setState(97);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
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
			setState(98);
			type();
			setState(99);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
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
			setState(101);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
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
			setState(103);
			type();
			setState(104);
			match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(105);
				match(T__13);
				setState(106);
				expr(0);
				}
			}

			setState(109);
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
			setState(111);
			match(T__14);
			setState(112);
			match(T__5);
			setState(113);
			expr(0);
			setState(114);
			match(T__6);
			setState(115);
			block();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(116);
				match(T__15);
				setState(117);
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
			setState(120);
			match(T__16);
			setState(121);
			match(T__5);
			setState(122);
			expr(0);
			setState(123);
			match(T__6);
			setState(124);
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
			setState(126);
			match(T__17);
			setState(127);
			match(T__5);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(128);
				var_decl();
				}
				break;
			case 2:
				{
				setState(129);
				expr(0);
				setState(130);
				match(T__7);
				}
				break;
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
				{
				setState(134);
				expr(0);
				}
			}

			setState(137);
			match(T__7);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
				{
				setState(138);
				expr(0);
				}
			}

			setState(141);
			match(T__6);
			setState(142);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
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
			setState(144);
			match(T__17);
			setState(145);
			match(T__5);
			setState(146);
			type();
			setState(147);
			match(ID);
			setState(148);
			match(T__18);
			setState(149);
			expr(0);
			setState(150);
			match(T__6);
			setState(151);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expr(0);
				setState(155);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				if_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				for_each_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				match(T__19);
				setState(163);
				match(T__7);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				match(T__20);
				setState(165);
				match(T__7);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(166);
				match(T__21);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(167);
					expr(0);
					}
				}

				setState(170);
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
			setState(173);
			match(T__2);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077592292424L) != 0)) {
				{
				{
				setState(174);
				stmt();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
	public static class Grouped_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Grouped_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Relational_exprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Relational_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Function_callContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class This_referenceContext extends ExprContext {
		public This_referenceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_accessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Array_accessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Mul_div_exprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mul_div_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Object_instantiationContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Object_instantiationContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Method_callContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Super_callContext extends ExprContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Super_callContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Not_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Not_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_sub_exprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Add_sub_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class And_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public And_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Member_accessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public Member_accessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Or_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Or_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Literal_exprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Literal_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_referenceContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public Var_referenceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Equality_exprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Equality_exprContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new Object_instantiationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				match(T__23);
				setState(184);
				match(ID);
				setState(185);
				match(T__5);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(186);
					expr_list();
					}
				}

				setState(189);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new Function_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(ID);
				setState(191);
				match(T__5);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(192);
					expr_list();
					}
				}

				setState(195);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new This_referenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__24);
				}
				break;
			case 4:
				{
				_localctx = new Super_callContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				match(T__25);
				setState(198);
				match(T__5);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
					{
					setState(199);
					expr_list();
					}
				}

				setState(202);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new Not_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(T__28);
				setState(204);
				expr(11);
				}
				break;
			case 6:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(ID);
				setState(206);
				match(T__13);
				setState(207);
				expr(4);
				}
				break;
			case 7:
				{
				_localctx = new Literal_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				literal();
				}
				break;
			case 8:
				{
				_localctx = new Var_referenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new Grouped_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__5);
				setState(211);
				expr(0);
				setState(212);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_div_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(217);
						((Mul_div_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((Mul_div_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new Add_sub_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(220);
						((Add_sub_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((Add_sub_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new Relational_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(223);
						((Relational_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
							((Relational_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new Equality_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(226);
						((Equality_exprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((Equality_exprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new And_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(229);
						match(T__39);
						setState(230);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new Or_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(232);
						match(T__40);
						setState(233);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new Member_accessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(235);
						match(T__22);
						setState(236);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new Method_callContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(238);
						match(T__22);
						setState(239);
						match(ID);
						setState(240);
						match(T__5);
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 277077584511040L) != 0)) {
							{
							setState(241);
							expr_list();
							}
						}

						setState(244);
						match(T__6);
						}
						break;
					case 9:
						{
						_localctx = new Array_accessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(246);
						match(T__26);
						setState(247);
						expr(0);
						setState(248);
						match(T__27);
						}
						break;
					}
					} 
				}
				setState(254);
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
	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expr(0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(256);
				match(T__8);
				setState(257);
				expr(0);
				}
				}
				setState(262);
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
		public TerminalNode INT() { return getToken(SugarcParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SugarcParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(SugarcParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SugarcParser.BOOLEAN, 0); }
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
			setState(263);
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
		"\u0004\u00012\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00018\b\u0001\n\u0001"+
		"\f\u0001;\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002F\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005^\b\u0005"+
		"\n\u0005\f\u0005a\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bl\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tw\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0085\b\u000b"+
		"\u0001\u000b\u0003\u000b\u0088\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u008c\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a9\b\r\u0001\r\u0003\r\u00ac\b\r"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00b0\b\u000e\n\u000e\f\u000e\u00b3"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00bc\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c2\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c9\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d7"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f3\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00fb"+
		"\b\u000f\n\u000f\f\u000f\u00fe\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0103\b\u0010\n\u0010\f\u0010\u0106\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0001\u001e\u0012\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0006"+
		"\u0002\u0000\n\r//\u0001\u0000\u001e\u001f\u0001\u0000 !\u0001\u0000\""+
		"%\u0001\u0000&\'\u0001\u0000*.\u0129\u0000)\u0001\u0000\u0000\u0000\u0002"+
		".\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006J\u0001"+
		"\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000"+
		"\fb\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010g\u0001"+
		"\u0000\u0000\u0000\u0012o\u0001\u0000\u0000\u0000\u0014x\u0001\u0000\u0000"+
		"\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000"+
		"\u001a\u00ab\u0001\u0000\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000"+
		"\u001e\u00d6\u0001\u0000\u0000\u0000 \u00ff\u0001\u0000\u0000\u0000\""+
		"\u0107\u0001\u0000\u0000\u0000$(\u0003\u001a\r\u0000%(\u0003\u0002\u0001"+
		"\u0000&(\u0003\u0004\u0002\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000"+
		"\u0000\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000"+
		"\u0000\u0000./\u0005\u0001\u0000\u0000/2\u0005/\u0000\u000001\u0005\u0002"+
		"\u0000\u000013\u0005/\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000049\u0005\u0003\u0000\u000058\u0003"+
		"\u0006\u0003\u000068\u0003\b\u0004\u000075\u0001\u0000\u0000\u000076\u0001"+
		"\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<=\u0005\u0004\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>A\u0003"+
		"\u000e\u0007\u0000?A\u0005\u0005\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005/\u0000\u0000"+
		"CE\u0005\u0006\u0000\u0000DF\u0003\n\u0005\u0000ED\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0007\u0000"+
		"\u0000HI\u0003\u001c\u000e\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0003"+
		"\u000e\u0007\u0000KL\u0005/\u0000\u0000LM\u0005\b\u0000\u0000M\u0007\u0001"+
		"\u0000\u0000\u0000NQ\u0003\u000e\u0007\u0000OQ\u0005\u0005\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0005/\u0000\u0000SU\u0005\u0006\u0000\u0000TV\u0003\n\u0005"+
		"\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0007\u0000\u0000XY\u0003\u001c\u000e\u0000Y\t\u0001"+
		"\u0000\u0000\u0000Z_\u0003\f\u0006\u0000[\\\u0005\t\u0000\u0000\\^\u0003"+
		"\f\u0006\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u000b\u0001\u0000\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000bc\u0003\u000e\u0007\u0000cd\u0005/\u0000"+
		"\u0000d\r\u0001\u0000\u0000\u0000ef\u0007\u0000\u0000\u0000f\u000f\u0001"+
		"\u0000\u0000\u0000gh\u0003\u000e\u0007\u0000hk\u0005/\u0000\u0000ij\u0005"+
		"\u000e\u0000\u0000jl\u0003\u001e\u000f\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\b\u0000\u0000"+
		"n\u0011\u0001\u0000\u0000\u0000op\u0005\u000f\u0000\u0000pq\u0005\u0006"+
		"\u0000\u0000qr\u0003\u001e\u000f\u0000rs\u0005\u0007\u0000\u0000sv\u0003"+
		"\u001c\u000e\u0000tu\u0005\u0010\u0000\u0000uw\u0003\u001c\u000e\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0013\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0011\u0000\u0000yz\u0005\u0006\u0000\u0000z{\u0003"+
		"\u001e\u000f\u0000{|\u0005\u0007\u0000\u0000|}\u0003\u001c\u000e\u0000"+
		"}\u0015\u0001\u0000\u0000\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0084"+
		"\u0005\u0006\u0000\u0000\u0080\u0085\u0003\u0010\b\u0000\u0081\u0082\u0003"+
		"\u001e\u000f\u0000\u0082\u0083\u0005\b\u0000\u0000\u0083\u0085\u0001\u0000"+
		"\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0003\u001e\u000f\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0005\b\u0000\u0000\u008a\u008c\u0003\u001e\u000f"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0007\u0000"+
		"\u0000\u008e\u008f\u0003\u001c\u000e\u0000\u008f\u0017\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0012\u0000\u0000\u0091\u0092\u0005\u0006\u0000"+
		"\u0000\u0092\u0093\u0003\u000e\u0007\u0000\u0093\u0094\u0005/\u0000\u0000"+
		"\u0094\u0095\u0005\u0013\u0000\u0000\u0095\u0096\u0003\u001e\u000f\u0000"+
		"\u0096\u0097\u0005\u0007\u0000\u0000\u0097\u0098\u0003\u001c\u000e\u0000"+
		"\u0098\u0019\u0001\u0000\u0000\u0000\u0099\u00ac\u0003\u0010\b\u0000\u009a"+
		"\u009b\u0003\u001e\u000f\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u00ac"+
		"\u0001\u0000\u0000\u0000\u009d\u00ac\u0003\u0012\t\u0000\u009e\u00ac\u0003"+
		"\u0014\n\u0000\u009f\u00ac\u0003\u0016\u000b\u0000\u00a0\u00ac\u0003\u0018"+
		"\f\u0000\u00a1\u00ac\u0003\u001c\u000e\u0000\u00a2\u00a3\u0005\u0014\u0000"+
		"\u0000\u00a3\u00ac\u0005\b\u0000\u0000\u00a4\u00a5\u0005\u0015\u0000\u0000"+
		"\u00a5\u00ac\u0005\b\u0000\u0000\u00a6\u00a8\u0005\u0016\u0000\u0000\u00a7"+
		"\u00a9\u0003\u001e\u000f\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0005\b\u0000\u0000\u00ab\u0099\u0001\u0000\u0000\u0000\u00ab\u009a"+
		"\u0001\u0000\u0000\u0000\u00ab\u009d\u0001\u0000\u0000\u0000\u00ab\u009e"+
		"\u0001\u0000\u0000\u0000\u00ab\u009f\u0001\u0000\u0000\u0000\u00ab\u00a0"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000\u00ab\u00a2"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a6"+
		"\u0001\u0000\u0000\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad\u00b1"+
		"\u0005\u0003\u0000\u0000\u00ae\u00b0\u0003\u001a\r\u0000\u00af\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0004\u0000\u0000\u00b5\u001d\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006"+
		"\u000f\uffff\uffff\u0000\u00b7\u00b8\u0005\u0018\u0000\u0000\u00b8\u00b9"+
		"\u0005/\u0000\u0000\u00b9\u00bb\u0005\u0006\u0000\u0000\u00ba\u00bc\u0003"+
		" \u0010\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00d7\u0005\u0007"+
		"\u0000\u0000\u00be\u00bf\u0005/\u0000\u0000\u00bf\u00c1\u0005\u0006\u0000"+
		"\u0000\u00c0\u00c2\u0003 \u0010\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00d7\u0005\u0007\u0000\u0000\u00c4\u00d7\u0005\u0019\u0000\u0000"+
		"\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\u00c8\u0005\u0006\u0000\u0000"+
		"\u00c7\u00c9\u0003 \u0010\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00d7\u0005\u0007\u0000\u0000\u00cb\u00cc\u0005\u001d\u0000\u0000\u00cc"+
		"\u00d7\u0003\u001e\u000f\u000b\u00cd\u00ce\u0005/\u0000\u0000\u00ce\u00cf"+
		"\u0005\u000e\u0000\u0000\u00cf\u00d7\u0003\u001e\u000f\u0004\u00d0\u00d7"+
		"\u0003\"\u0011\u0000\u00d1\u00d7\u0005/\u0000\u0000\u00d2\u00d3\u0005"+
		"\u0006\u0000\u0000\u00d3\u00d4\u0003\u001e\u000f\u0000\u00d4\u00d5\u0005"+
		"\u0007\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00b6\u0001"+
		"\u0000\u0000\u0000\u00d6\u00be\u0001\u0000\u0000\u0000\u00d6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00c5\u0001\u0000\u0000\u0000\u00d6\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d6\u00cd\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d7\u00fc\u0001\u0000\u0000\u0000\u00d8\u00d9\n\n"+
		"\u0000\u0000\u00d9\u00da\u0007\u0001\u0000\u0000\u00da\u00fb\u0003\u001e"+
		"\u000f\u000b\u00db\u00dc\n\t\u0000\u0000\u00dc\u00dd\u0007\u0002\u0000"+
		"\u0000\u00dd\u00fb\u0003\u001e\u000f\n\u00de\u00df\n\b\u0000\u0000\u00df"+
		"\u00e0\u0007\u0003\u0000\u0000\u00e0\u00fb\u0003\u001e\u000f\t\u00e1\u00e2"+
		"\n\u0007\u0000\u0000\u00e2\u00e3\u0007\u0004\u0000\u0000\u00e3\u00fb\u0003"+
		"\u001e\u000f\b\u00e4\u00e5\n\u0006\u0000\u0000\u00e5\u00e6\u0005(\u0000"+
		"\u0000\u00e6\u00fb\u0003\u001e\u000f\u0007\u00e7\u00e8\n\u0005\u0000\u0000"+
		"\u00e8\u00e9\u0005)\u0000\u0000\u00e9\u00fb\u0003\u001e\u000f\u0006\u00ea"+
		"\u00eb\n\u0012\u0000\u0000\u00eb\u00ec\u0005\u0017\u0000\u0000\u00ec\u00fb"+
		"\u0005/\u0000\u0000\u00ed\u00ee\n\u0011\u0000\u0000\u00ee\u00ef\u0005"+
		"\u0017\u0000\u0000\u00ef\u00f0\u0005/\u0000\u0000\u00f0\u00f2\u0005\u0006"+
		"\u0000\u0000\u00f1\u00f3\u0003 \u0010\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00fb\u0005\u0007\u0000\u0000\u00f5\u00f6\n\f\u0000\u0000"+
		"\u00f6\u00f7\u0005\u001b\u0000\u0000\u00f7\u00f8\u0003\u001e\u000f\u0000"+
		"\u00f8\u00f9\u0005\u001c\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00d8\u0001\u0000\u0000\u0000\u00fa\u00db\u0001\u0000\u0000\u0000"+
		"\u00fa\u00de\u0001\u0000\u0000\u0000\u00fa\u00e1\u0001\u0000\u0000\u0000"+
		"\u00fa\u00e4\u0001\u0000\u0000\u0000\u00fa\u00e7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00ea\u0001\u0000\u0000\u0000\u00fa\u00ed\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f5\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u001f\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0104\u0003\u001e\u000f\u0000\u0100\u0101\u0005\t\u0000\u0000\u0101"+
		"\u0103\u0003\u001e\u000f\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103"+
		"\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105!\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0007\u0005\u0000\u0000\u0108#\u0001"+
		"\u0000\u0000\u0000\u001a\')279@EPU_kv\u0084\u0087\u008b\u00a8\u00ab\u00b1"+
		"\u00bb\u00c1\u00c8\u00d6\u00f2\u00fa\u00fc\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}