// Generated from /Users/andre.escorel/Documents/Material de Compiladores/SimpleLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, INT=25, 
		FLOAT=26, STRING=27, WS=28;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varType = 2, RULE_varDecl = 3, 
		RULE_varIntDecl = 4, RULE_varFloatDecl = 5, RULE_varStringDecl = 6, RULE_varBoolDecl = 7, 
		RULE_assignStat = 8, RULE_ifStat = 9, RULE_whileStat = 10, RULE_block = 11, 
		RULE_printStat = 12, RULE_forStat = 13, RULE_functionDef = 14, RULE_functionCall = 15, 
		RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varType", "varDecl", "varIntDecl", "varFloatDecl", 
			"varStringDecl", "varBoolDecl", "assignStat", "ifStat", "whileStat", 
			"block", "printStat", "forStat", "functionDef", "functionCall", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'int'", "'float'", "'string'", "'bool'", "'void'", "'='", 
			"'true'", "'false'", "'if'", "'('", "')'", "'else'", "'while'", "'{'", 
			"'}'", "'print'", "'for'", "','", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "FLOAT", "STRING", "WS"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17220732L) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public PrintStatContext printStat() {
			return getRuleContext(PrintStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				varDecl();
				setState(43);
				match(T__0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				assignStat();
				setState(46);
				match(T__0);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				ifStat();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				whileStat();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				printStat();
				setState(51);
				match(T__0);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				forStat();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class VarTypeContext extends ParserRuleContext {
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 124L) != 0)) ) {
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
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			varType();
			setState(60);
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
	public static class VarIntDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode INT() { return getToken(SimpleLangParser.INT, 0); }
		public VarIntDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIntDecl; }
	}

	public final VarIntDeclContext varIntDecl() throws RecognitionException {
		VarIntDeclContext _localctx = new VarIntDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varIntDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__1);
			setState(63);
			match(ID);
			setState(64);
			match(T__6);
			setState(65);
			match(INT);
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
	public static class VarFloatDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode FLOAT() { return getToken(SimpleLangParser.FLOAT, 0); }
		public VarFloatDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFloatDecl; }
	}

	public final VarFloatDeclContext varFloatDecl() throws RecognitionException {
		VarFloatDeclContext _localctx = new VarFloatDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varFloatDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__2);
			setState(68);
			match(ID);
			setState(69);
			match(T__6);
			setState(70);
			match(FLOAT);
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
	public static class VarStringDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SimpleLangParser.STRING, 0); }
		public VarStringDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStringDecl; }
	}

	public final VarStringDeclContext varStringDecl() throws RecognitionException {
		VarStringDeclContext _localctx = new VarStringDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varStringDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__3);
			setState(73);
			match(ID);
			setState(74);
			match(T__6);
			setState(75);
			match(STRING);
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
	public static class VarBoolDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public VarBoolDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBoolDecl; }
	}

	public final VarBoolDeclContext varBoolDecl() throws RecognitionException {
		VarBoolDeclContext _localctx = new VarBoolDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varBoolDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__4);
			setState(78);
			match(ID);
			setState(79);
			match(T__6);
			setState(80);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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
	public static class AssignStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(T__6);
			setState(84);
			expr(0);
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
	public static class IfStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__9);
			setState(87);
			match(T__10);
			setState(88);
			expr(0);
			setState(89);
			match(T__11);
			setState(90);
			statement();
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(91);
				match(T__12);
				setState(92);
				statement();
				}
				break;
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
	public static class WhileStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__13);
			setState(96);
			match(T__10);
			setState(97);
			expr(0);
			setState(98);
			match(T__11);
			setState(99);
			statement();
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__14);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17220732L) != 0)) {
				{
				{
				setState(102);
				statement();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(T__15);
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
	public static class PrintStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStat; }
	}

	public final PrintStatContext printStat() throws RecognitionException {
		PrintStatContext _localctx = new PrintStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__16);
			setState(111);
			match(T__10);
			setState(112);
			expr(0);
			setState(113);
			match(T__11);
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
	public static class ForStatContext extends ParserRuleContext {
		public List<AssignStatContext> assignStat() {
			return getRuleContexts(AssignStatContext.class);
		}
		public AssignStatContext assignStat(int i) {
			return getRuleContext(AssignStatContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__17);
			setState(116);
			match(T__10);
			setState(117);
			assignStat();
			setState(118);
			match(T__0);
			setState(119);
			expr(0);
			setState(120);
			match(T__0);
			setState(121);
			assignStat();
			setState(122);
			match(T__11);
			setState(123);
			statement();
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
	public static class FunctionDefContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			varType();
			setState(126);
			match(ID);
			setState(127);
			match(T__10);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(128);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(129);
					match(T__18);
					setState(130);
					match(ID);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(138);
			match(T__11);
			setState(139);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(T__10);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 184551424L) != 0)) {
				{
				setState(143);
				expr(0);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(144);
					match(T__18);
					setState(145);
					expr(0);
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(153);
			match(T__11);
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
		public Token op;
		public TerminalNode INT() { return getToken(SimpleLangParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SimpleLangParser.STRING, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(156);
				match(INT);
				}
				break;
			case STRING:
				{
				setState(157);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(158);
				match(ID);
				}
				break;
			case T__10:
				{
				setState(159);
				match(T__10);
				setState(160);
				expr(0);
				setState(161);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(169);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000"+
		"\f\u0000\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t^\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bh\b\u000b"+
		"\n\u000b\f\u000bk\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0084\b\u000e\n\u000e\f\u000e\u0087"+
		"\t\u000e\u0003\u000e\u0089\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0093\b\u000f\n\u000f\f\u000f\u0096\t\u000f\u0003\u000f\u0098\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a4\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00ac\b\u0010\n\u0010\f\u0010\u00af\t\u0010\u0001\u0010\u0000"+
		"\u0001 \u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\u0004\u0001\u0000\u0002\u0006\u0001\u0000"+
		"\b\t\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0017\u00b1\u0000%\u0001"+
		"\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000"+
		"\u0000\u0006;\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nC\u0001"+
		"\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000eM\u0001\u0000\u0000"+
		"\u0000\u0010R\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014"+
		"_\u0001\u0000\u0000\u0000\u0016e\u0001\u0000\u0000\u0000\u0018n\u0001"+
		"\u0000\u0000\u0000\u001as\u0001\u0000\u0000\u0000\u001c}\u0001\u0000\u0000"+
		"\u0000\u001e\u008d\u0001\u0000\u0000\u0000 \u00a3\u0001\u0000\u0000\u0000"+
		"\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000\u0000\u0001"+
		")\u0001\u0001\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0005\u0001"+
		"\u0000\u0000,8\u0001\u0000\u0000\u0000-.\u0003\u0010\b\u0000./\u0005\u0001"+
		"\u0000\u0000/8\u0001\u0000\u0000\u000008\u0003\u0012\t\u000018\u0003\u0014"+
		"\n\u000023\u0003\u0018\f\u000034\u0005\u0001\u0000\u000048\u0001\u0000"+
		"\u0000\u000058\u0003\u001a\r\u000068\u0003\u0016\u000b\u00007*\u0001\u0000"+
		"\u0000\u00007-\u0001\u0000\u0000\u000070\u0001\u0000\u0000\u000071\u0001"+
		"\u0000\u0000\u000072\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0007\u0000"+
		"\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0003\u0004\u0002\u0000"+
		"<=\u0005\u0018\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0002"+
		"\u0000\u0000?@\u0005\u0018\u0000\u0000@A\u0005\u0007\u0000\u0000AB\u0005"+
		"\u0019\u0000\u0000B\t\u0001\u0000\u0000\u0000CD\u0005\u0003\u0000\u0000"+
		"DE\u0005\u0018\u0000\u0000EF\u0005\u0007\u0000\u0000FG\u0005\u001a\u0000"+
		"\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005\u0004\u0000\u0000IJ\u0005"+
		"\u0018\u0000\u0000JK\u0005\u0007\u0000\u0000KL\u0005\u001b\u0000\u0000"+
		"L\r\u0001\u0000\u0000\u0000MN\u0005\u0005\u0000\u0000NO\u0005\u0018\u0000"+
		"\u0000OP\u0005\u0007\u0000\u0000PQ\u0007\u0001\u0000\u0000Q\u000f\u0001"+
		"\u0000\u0000\u0000RS\u0005\u0018\u0000\u0000ST\u0005\u0007\u0000\u0000"+
		"TU\u0003 \u0010\u0000U\u0011\u0001\u0000\u0000\u0000VW\u0005\n\u0000\u0000"+
		"WX\u0005\u000b\u0000\u0000XY\u0003 \u0010\u0000YZ\u0005\f\u0000\u0000"+
		"Z]\u0003\u0002\u0001\u0000[\\\u0005\r\u0000\u0000\\^\u0003\u0002\u0001"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0013\u0001"+
		"\u0000\u0000\u0000_`\u0005\u000e\u0000\u0000`a\u0005\u000b\u0000\u0000"+
		"ab\u0003 \u0010\u0000bc\u0005\f\u0000\u0000cd\u0003\u0002\u0001\u0000"+
		"d\u0015\u0001\u0000\u0000\u0000ei\u0005\u000f\u0000\u0000fh\u0003\u0002"+
		"\u0001\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lm\u0005\u0010\u0000\u0000m\u0017\u0001\u0000"+
		"\u0000\u0000no\u0005\u0011\u0000\u0000op\u0005\u000b\u0000\u0000pq\u0003"+
		" \u0010\u0000qr\u0005\f\u0000\u0000r\u0019\u0001\u0000\u0000\u0000st\u0005"+
		"\u0012\u0000\u0000tu\u0005\u000b\u0000\u0000uv\u0003\u0010\b\u0000vw\u0005"+
		"\u0001\u0000\u0000wx\u0003 \u0010\u0000xy\u0005\u0001\u0000\u0000yz\u0003"+
		"\u0010\b\u0000z{\u0005\f\u0000\u0000{|\u0003\u0002\u0001\u0000|\u001b"+
		"\u0001\u0000\u0000\u0000}~\u0003\u0004\u0002\u0000~\u007f\u0005\u0018"+
		"\u0000\u0000\u007f\u0088\u0005\u000b\u0000\u0000\u0080\u0085\u0005\u0018"+
		"\u0000\u0000\u0081\u0082\u0005\u0013\u0000\u0000\u0082\u0084\u0005\u0018"+
		"\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0005\f\u0000"+
		"\u0000\u008b\u008c\u0003\u0016\u000b\u0000\u008c\u001d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\u0018\u0000\u0000\u008e\u0097\u0005\u000b\u0000"+
		"\u0000\u008f\u0094\u0003 \u0010\u0000\u0090\u0091\u0005\u0013\u0000\u0000"+
		"\u0091\u0093\u0003 \u0010\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u008f\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\f\u0000\u0000\u009a\u001f\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0006\u0010\uffff\uffff\u0000\u009c\u00a4\u0005\u0019\u0000\u0000\u009d"+
		"\u00a4\u0005\u001b\u0000\u0000\u009e\u00a4\u0005\u0018\u0000\u0000\u009f"+
		"\u00a0\u0005\u000b\u0000\u0000\u00a0\u00a1\u0003 \u0010\u0000\u00a1\u00a2"+
		"\u0005\f\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u009b\u0001"+
		"\u0000\u0000\u0000\u00a3\u009d\u0001\u0000\u0000\u0000\u00a3\u009e\u0001"+
		"\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a4\u00ad\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\n\u0006\u0000\u0000\u00a6\u00a7\u0007\u0002"+
		"\u0000\u0000\u00a7\u00ac\u0003 \u0010\u0007\u00a8\u00a9\n\u0005\u0000"+
		"\u0000\u00a9\u00aa\u0007\u0003\u0000\u0000\u00aa\u00ac\u0003 \u0010\u0006"+
		"\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae!\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u000b%7]i\u0085\u0088\u0094\u0097\u00a3"+
		"\u00ab\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}