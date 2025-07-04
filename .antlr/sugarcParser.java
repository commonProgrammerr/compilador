// Generated from /Users/andre.escorel/Documents/compilador/Sugarc.g4 by ANTLR 4.13.1
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, INT=52, STRING=53, 
		BOOLEAN=54, FLOAT=55, ID=56, WS=57, COMMENT=58, LINE_COMMENT=59, PREPROCESSOR=60;
	public static final int
		RULE_program = 0, RULE_classDecl = 1, RULE_classInherence = 2, RULE_classContructorDecl = 3, 
		RULE_methodDecl = 4, RULE_classAttrDecl = 5, RULE_functionDecl = 6, RULE_varDecl = 7, 
		RULE_typdefDecl = 8, RULE_params = 9, RULE_param = 10, RULE_type = 11, 
		RULE_basicTypes = 12, RULE_ifStmt = 13, RULE_elseStmt = 14, RULE_whileStmt = 15, 
		RULE_forStmt = 16, RULE_controlStmt = 17, RULE_stmt = 18, RULE_block = 19, 
		RULE_expr = 20, RULE_exprList = 21, RULE_literal = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDecl", "classInherence", "classContructorDecl", "methodDecl", 
			"classAttrDecl", "functionDecl", "varDecl", "typdefDecl", "params", "param", 
			"type", "basicTypes", "ifStmt", "elseStmt", "whileStmt", "forStmt", "controlStmt", 
			"stmt", "block", "expr", "exprList", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'extends'", "'constructor'", "'('", "')'", 
			"';'", "'['", "']'", "'='", "'typedef'", "','", "'const'", "'volatile'", 
			"'static'", "'unsigned'", "'signed'", "'*'", "'short'", "'int'", "'long'", 
			"'bool'", "'char'", "'float'", "'double'", "'void'", "'if'", "'else'", 
			"'while'", "'for'", "'break'", "'continue'", "'return'", "'.'", "'new'", 
			"'super'", "'this'", "'!'", "'/'", "'+'", "'-'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&&'", "'||'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT", "STRING", "BOOLEAN", "FLOAT", "ID", "WS", 
			"COMMENT", "LINE_COMMENT", "PREPROCESSOR"
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
		public List<TerminalNode> PREPROCESSOR() { return getTokens(SugarcParser.PREPROCESSOR); }
		public TerminalNode PREPROCESSOR(int i) {
			return getToken(SugarcParser.PREPROCESSOR, i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1224979098912669698L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					match(PREPROCESSOR);
					}
					break;
				case 2:
					{
					setState(47);
					varDecl();
					}
					break;
				case 3:
					{
					setState(48);
					classDecl();
					}
					break;
				case 4:
					{
					setState(49);
					functionDecl();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ClassInherenceContext classInherence() {
			return getRuleContext(ClassInherenceContext.class,0);
		}
		public List<ClassAttrDeclContext> classAttrDecl() {
			return getRuleContexts(ClassAttrDeclContext.class);
		}
		public ClassAttrDeclContext classAttrDecl(int i) {
			return getRuleContext(ClassAttrDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public List<ClassContructorDeclContext> classContructorDecl() {
			return getRuleContexts(ClassContructorDeclContext.class);
		}
		public ClassContructorDeclContext classContructorDecl(int i) {
			return getRuleContext(ClassContructorDeclContext.class,i);
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
			setState(57);
			match(T__0);
			setState(58);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(59);
				classInherence();
				}
			}

			setState(62);
			match(T__1);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594305822752L) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(63);
					classAttrDecl();
					}
					break;
				case 2:
					{
					setState(64);
					methodDecl();
					}
					break;
				case 3:
					{
					setState(65);
					classContructorDecl();
					}
					break;
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(T__2);
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
	public static class ClassInherenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ClassInherenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInherence; }
	}

	public final ClassInherenceContext classInherence() throws RecognitionException {
		ClassInherenceContext _localctx = new ClassInherenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classInherence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__3);
			setState(74);
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
	public static class ClassContructorDeclContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ClassContructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classContructorDecl; }
	}

	public final ClassContructorDeclContext classContructorDecl() throws RecognitionException {
		ClassContructorDeclContext _localctx = new ClassContructorDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classContructorDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__4);
			setState(77);
			match(T__5);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594305822720L) != 0)) {
				{
				setState(78);
				params();
				}
			}

			setState(81);
			match(T__6);
			setState(82);
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
	public static class MethodDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			type();
			setState(85);
			match(ID);
			setState(86);
			match(T__5);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594305822720L) != 0)) {
				{
				setState(87);
				params();
				}
			}

			setState(90);
			match(T__6);
			setState(91);
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
	public static class ClassAttrDeclContext extends ParserRuleContext {
		public ClassAttrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAttrDecl; }
	 
		public ClassAttrDeclContext() { }
		public void copyFrom(ClassAttrDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDeclarationContext extends ClassAttrDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public AttributeDeclarationContext(ClassAttrDeclContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAttributeDeclarationContext extends ClassAttrDeclContext {
		public Token size;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public TerminalNode INT() { return getToken(SugarcParser.INT, 0); }
		public ArrayAttributeDeclarationContext(ClassAttrDeclContext ctx) { copyFrom(ctx); }
	}

	public final ClassAttrDeclContext classAttrDecl() throws RecognitionException {
		ClassAttrDeclContext _localctx = new ClassAttrDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classAttrDecl);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new AttributeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				type();
				setState(94);
				match(ID);
				setState(95);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new ArrayAttributeDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				type();
				setState(98);
				match(ID);
				setState(99);
				match(T__8);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(100);
					((ArrayAttributeDeclarationContext)_localctx).size = match(INT);
					}
				}

				setState(103);
				match(T__9);
				setState(104);
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			type();
			setState(109);
			match(ID);
			setState(110);
			match(T__5);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594305822720L) != 0)) {
				{
				setState(111);
				params();
				}
			}

			setState(114);
			match(T__6);
			setState(115);
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
	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends VarDeclContext {
		public Token size;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public TerminalNode INT() { return getToken(SugarcParser.INT, 0); }
		public ArrayDeclarationContext(VarDeclContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializationContext extends VarDeclContext {
		public Token size;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public TerminalNode INT() { return getToken(SugarcParser.INT, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArrayInitializationContext(VarDeclContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends VarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclarationContext(VarDeclContext ctx) { copyFrom(ctx); }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				type();
				setState(118);
				match(ID);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(119);
					match(T__10);
					setState(120);
					expr(0);
					}
				}

				setState(123);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				type();
				setState(126);
				match(ID);
				setState(127);
				match(T__8);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(128);
					((ArrayDeclarationContext)_localctx).size = match(INT);
					}
				}

				setState(131);
				match(T__9);
				setState(132);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new ArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				type();
				setState(135);
				match(ID);
				setState(136);
				match(T__8);
				setState(137);
				((ArrayInitializationContext)_localctx).size = match(INT);
				setState(138);
				match(T__9);
				setState(139);
				match(T__10);
				setState(140);
				match(T__1);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
					{
					setState(141);
					exprList();
					}
				}

				setState(144);
				match(T__2);
				setState(145);
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
	public static class TypdefDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public TypdefDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typdefDecl; }
	}

	public final TypdefDeclContext typdefDecl() throws RecognitionException {
		TypdefDeclContext _localctx = new TypdefDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typdefDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__11);
			setState(150);
			type();
			setState(151);
			match(ID);
			setState(152);
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
		enterRule(_localctx, 18, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			param();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(155);
				match(T__12);
				setState(156);
				param();
				}
				}
				setState(161);
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
		enterRule(_localctx, 20, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			type();
			setState(163);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeviatedTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public DeviatedTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends TypeContext {
		public BasicTypesContext basicTypes() {
			return getRuleContext(BasicTypesContext.class,0);
		}
		public PrimitiveTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				_localctx = new PrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) {
					{
					setState(165);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16 || _la==T__17) {
					{
					setState(168);
					_la = _input.LA(1);
					if ( !(_la==T__16 || _la==T__17) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(171);
				basicTypes();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(172);
					match(T__18);
					}
				}

				}
				break;
			case ID:
				_localctx = new DeviatedTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ID);
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
	public static class BasicTypesContext extends ParserRuleContext {
		public BasicTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicTypes; }
	}

	public final BasicTypesContext basicTypes() throws RecognitionException {
		BasicTypesContext _localctx = new BasicTypesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_basicTypes);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(178);
					match(T__19);
					}
				}

				setState(181);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__19);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(T__21);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(184);
					match(T__21);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(T__22);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(T__23);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(T__24);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				match(T__25);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(191);
				match(T__26);
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
	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__27);
			setState(195);
			match(T__5);
			setState(196);
			expr(0);
			setState(197);
			match(T__6);
			setState(198);
			stmt();
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(199);
				elseStmt();
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
	public static class ElseStmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__28);
			setState(203);
			stmt();
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
	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__29);
			setState(206);
			match(T__5);
			setState(207);
			expr(0);
			setState(208);
			match(T__6);
			setState(209);
			stmt();
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
	public static class ForStmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__30);
			setState(212);
			match(T__5);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72057594305822720L) != 0)) {
				{
				setState(213);
				varDecl();
				}
			}

			setState(216);
			match(T__7);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
				{
				setState(217);
				expr(0);
				}
			}

			setState(220);
			match(T__7);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
				{
				setState(221);
				expr(0);
				}
			}

			setState(224);
			match(T__6);
			setState(225);
			stmt();
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
	public static class ControlStmtContext extends ParserRuleContext {
		public ControlStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStmt; }
	 
		public ControlStmtContext() { }
		public void copyFrom(ControlStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends ControlStmtContext {
		public BreakStmtContext(ControlStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ControlStmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ControlStmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends ControlStmtContext {
		public ContinueStmtContext(ControlStmtContext ctx) { copyFrom(ctx); }
	}

	public final ControlStmtContext controlStmt() throws RecognitionException {
		ControlStmtContext _localctx = new ControlStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_controlStmt);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__31);
				setState(228);
				match(T__7);
				}
				break;
			case T__32:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__32);
				setState(230);
				match(T__7);
				}
				break;
			case T__33:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				match(T__33);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
					{
					setState(232);
					expr(0);
					}
				}

				setState(235);
				match(T__7);
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
	public static class StmtContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TypdefDeclContext typdefDecl() {
			return getRuleContext(TypdefDeclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ControlStmtContext controlStmt() {
			return getRuleContext(ControlStmtContext.class,0);
		}
		public TerminalNode PREPROCESSOR() { return getToken(SugarcParser.PREPROCESSOR, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				typdefDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				expr(0);
				setState(241);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				ifStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				whileStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				forStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				controlStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(248);
				match(PREPROCESSOR);
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
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__1);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1294785957483499588L) != 0)) {
				{
				{
				setState(252);
				stmt();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(T__2);
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
	public static class SelfReferenceContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelfReferenceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public MemberAccessContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class AssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInstantiationContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ObjectInstantiationContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class VarReferenceContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public VarReferenceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GroupedExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastContext extends ExprContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeCastContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperCallContext extends ExprContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public SuperCallContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class IndexAssignmentContext extends ExprContext {
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IndexAssignmentContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class MethodCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(SugarcParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public MethodCallContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ObjectInstantiationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(T__35);
				setState(263);
				match(ID);
				setState(264);
				match(T__5);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
					{
					setState(265);
					exprList();
					}
				}

				setState(268);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new SuperCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(T__36);
				setState(270);
				match(T__5);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
					{
					setState(271);
					exprList();
					}
				}

				setState(274);
				match(T__6);
				}
				break;
			case 4:
				{
				_localctx = new SelfReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(T__37);
				setState(276);
				match(T__34);
				setState(277);
				expr(15);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(ID);
				setState(279);
				match(T__5);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
					{
					setState(280);
					exprList();
					}
				}

				setState(283);
				match(T__6);
				}
				break;
			case 6:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(T__38);
				setState(285);
				expr(12);
				}
				break;
			case 7:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(ID);
				setState(287);
				match(T__10);
				setState(288);
				expr(5);
				}
				break;
			case 8:
				{
				_localctx = new IndexAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(ID);
				setState(290);
				match(T__8);
				setState(291);
				expr(0);
				setState(292);
				match(T__9);
				setState(293);
				match(T__10);
				setState(294);
				expr(4);
				}
				break;
			case 9:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				literal();
				}
				break;
			case 10:
				{
				_localctx = new GroupedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(T__5);
				setState(298);
				expr(0);
				setState(299);
				match(T__6);
				}
				break;
			case 11:
				{
				_localctx = new TypeCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(T__5);
				setState(302);
				type();
				setState(303);
				match(T__6);
				setState(304);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(309);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__39) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(312);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(315);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333120L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(318);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(319);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(321);
						match(T__48);
						setState(322);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(324);
						match(T__49);
						setState(325);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new MemberAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(327);
						match(T__34);
						setState(328);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new MethodCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(330);
						match(T__34);
						setState(331);
						match(ID);
						setState(332);
						match(T__5);
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141864419054321728L) != 0)) {
							{
							setState(333);
							exprList();
							}
						}

						setState(336);
						match(T__6);
						}
						break;
					case 9:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(338);
						match(T__8);
						setState(339);
						expr(0);
						setState(340);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 42, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			expr(0);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(348);
				match(T__12);
				setState(349);
				expr(0);
				}
				}
				setState(354);
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
		enterRule(_localctx, 44, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 69805794224242688L) != 0)) ) {
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u0166\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001C\b\u0001\n\u0001\f\u0001"+
		"F\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005k\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006q\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007z\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0082\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u008f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0094\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0005\t\u009e\b\t\n\t\f\t\u00a1\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0003\u000b\u00a7\b\u000b\u0001\u000b\u0003\u000b\u00aa\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00ae\b\u000b\u0001\u000b\u0003\u000b"+
		"\u00b1\b\u000b\u0001\f\u0003\f\u00b4\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00ba\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c1"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c9\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00d7\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00db\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00df\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00ea\b\u0011\u0001\u0011\u0003\u0011\u00ed"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00fa\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00fe\b\u0013"+
		"\n\u0013\f\u0013\u0101\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010b"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0111"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u011a\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0133\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u014f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0157\b\u0014\n\u0014\f\u0014"+
		"\u015a\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u015f\b"+
		"\u0015\n\u0015\f\u0015\u0162\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0000\u0001(\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0007\u0001\u0000\u000e\u0010"+
		"\u0001\u0000\u0011\u0012\u0002\u0000\u0013\u0013((\u0001\u0000)*\u0001"+
		"\u0000+.\u0001\u0000/0\u0001\u000037\u0196\u00004\u0001\u0000\u0000\u0000"+
		"\u00029\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006L"+
		"\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000"+
		"\u0000\fl\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000\u0000\u0000"+
		"\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u009a\u0001\u0000\u0000\u0000"+
		"\u0014\u00a2\u0001\u0000\u0000\u0000\u0016\u00b0\u0001\u0000\u0000\u0000"+
		"\u0018\u00c0\u0001\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000\u0000"+
		"\u001c\u00ca\u0001\u0000\u0000\u0000\u001e\u00cd\u0001\u0000\u0000\u0000"+
		" \u00d3\u0001\u0000\u0000\u0000\"\u00ec\u0001\u0000\u0000\u0000$\u00f9"+
		"\u0001\u0000\u0000\u0000&\u00fb\u0001\u0000\u0000\u0000(\u0132\u0001\u0000"+
		"\u0000\u0000*\u015b\u0001\u0000\u0000\u0000,\u0163\u0001\u0000\u0000\u0000"+
		".3\u0005<\u0000\u0000/3\u0003\u000e\u0007\u000003\u0003\u0002\u0001\u0000"+
		"13\u0003\f\u0006\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000078\u0005\u0000\u0000\u00018\u0001"+
		"\u0001\u0000\u0000\u00009:\u0005\u0001\u0000\u0000:<\u00058\u0000\u0000"+
		";=\u0003\u0004\u0002\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>D\u0005\u0002\u0000\u0000?C\u0003\n\u0005"+
		"\u0000@C\u0003\b\u0004\u0000AC\u0003\u0006\u0003\u0000B?\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u0003\u0000\u0000"+
		"H\u0003\u0001\u0000\u0000\u0000IJ\u0005\u0004\u0000\u0000JK\u00058\u0000"+
		"\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0005\u0005\u0000\u0000MO\u0005"+
		"\u0006\u0000\u0000NP\u0003\u0012\t\u0000ON\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u0007\u0000\u0000"+
		"RS\u0003&\u0013\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0003\u0016\u000b"+
		"\u0000UV\u00058\u0000\u0000VX\u0005\u0006\u0000\u0000WY\u0003\u0012\t"+
		"\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0007\u0000\u0000[\\\u0003&\u0013\u0000\\\t\u0001"+
		"\u0000\u0000\u0000]^\u0003\u0016\u000b\u0000^_\u00058\u0000\u0000_`\u0005"+
		"\b\u0000\u0000`k\u0001\u0000\u0000\u0000ab\u0003\u0016\u000b\u0000bc\u0005"+
		"8\u0000\u0000ce\u0005\t\u0000\u0000df\u00054\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0005"+
		"\n\u0000\u0000hi\u0005\b\u0000\u0000ik\u0001\u0000\u0000\u0000j]\u0001"+
		"\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000k\u000b\u0001\u0000\u0000"+
		"\u0000lm\u0003\u0016\u000b\u0000mn\u00058\u0000\u0000np\u0005\u0006\u0000"+
		"\u0000oq\u0003\u0012\t\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0005\u0007\u0000\u0000st\u0003&\u0013"+
		"\u0000t\r\u0001\u0000\u0000\u0000uv\u0003\u0016\u000b\u0000vy\u00058\u0000"+
		"\u0000wx\u0005\u000b\u0000\u0000xz\u0003(\u0014\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\b\u0000"+
		"\u0000|\u0094\u0001\u0000\u0000\u0000}~\u0003\u0016\u000b\u0000~\u007f"+
		"\u00058\u0000\u0000\u007f\u0081\u0005\t\u0000\u0000\u0080\u0082\u0005"+
		"4\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\n\u0000"+
		"\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0094\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0003\u0016\u000b\u0000\u0087\u0088\u00058\u0000\u0000\u0088"+
		"\u0089\u0005\t\u0000\u0000\u0089\u008a\u00054\u0000\u0000\u008a\u008b"+
		"\u0005\n\u0000\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\u008e\u0005"+
		"\u0002\u0000\u0000\u008d\u008f\u0003*\u0015\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0092\u0005\b\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093u\u0001\u0000\u0000\u0000"+
		"\u0093}\u0001\u0000\u0000\u0000\u0093\u0086\u0001\u0000\u0000\u0000\u0094"+
		"\u000f\u0001\u0000\u0000\u0000\u0095\u0096\u0005\f\u0000\u0000\u0096\u0097"+
		"\u0003\u0016\u000b\u0000\u0097\u0098\u00058\u0000\u0000\u0098\u0099\u0005"+
		"\b\u0000\u0000\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u009f\u0003\u0014"+
		"\n\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c\u009e\u0003\u0014\n\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u0013\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0003\u0016\u000b\u0000\u00a3\u00a4\u00058\u0000\u0000\u00a4"+
		"\u0015\u0001\u0000\u0000\u0000\u00a5\u00a7\u0007\u0000\u0000\u0000\u00a6"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00aa\u0007\u0001\u0000\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\u0018\f\u0000\u00ac\u00ae"+
		"\u0005\u0013\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00b1"+
		"\u00058\u0000\u0000\u00b0\u00a6\u0001\u0000\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u0017\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005"+
		"\u0014\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00c1\u0005"+
		"\u0015\u0000\u0000\u00b6\u00c1\u0005\u0014\u0000\u0000\u00b7\u00b9\u0005"+
		"\u0016\u0000\u0000\u00b8\u00ba\u0005\u0016\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00c1\u0001"+
		"\u0000\u0000\u0000\u00bb\u00c1\u0005\u0017\u0000\u0000\u00bc\u00c1\u0005"+
		"\u0018\u0000\u0000\u00bd\u00c1\u0005\u0019\u0000\u0000\u00be\u00c1\u0005"+
		"\u001a\u0000\u0000\u00bf\u00c1\u0005\u001b\u0000\u0000\u00c0\u00b3\u0001"+
		"\u0000\u0000\u0000\u00c0\u00b6\u0001\u0000\u0000\u0000\u00c0\u00b7\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u0019\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005\u001c\u0000\u0000\u00c3\u00c4\u0005"+
		"\u0006\u0000\u0000\u00c4\u00c5\u0003(\u0014\u0000\u00c5\u00c6\u0005\u0007"+
		"\u0000\u0000\u00c6\u00c8\u0003$\u0012\u0000\u00c7\u00c9\u0003\u001c\u000e"+
		"\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u001b\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u001d\u0000"+
		"\u0000\u00cb\u00cc\u0003$\u0012\u0000\u00cc\u001d\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce\u00cf\u0005\u0006\u0000\u0000"+
		"\u00cf\u00d0\u0003(\u0014\u0000\u00d0\u00d1\u0005\u0007\u0000\u0000\u00d1"+
		"\u00d2\u0003$\u0012\u0000\u00d2\u001f\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u001f\u0000\u0000\u00d4\u00d6\u0005\u0006\u0000\u0000\u00d5\u00d7"+
		"\u0003\u000e\u0007\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0005\b\u0000\u0000\u00d9\u00db\u0003(\u0014\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0005\b\u0000\u0000\u00dd\u00df\u0003("+
		"\u0014\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0007"+
		"\u0000\u0000\u00e1\u00e2\u0003$\u0012\u0000\u00e2!\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005 \u0000\u0000\u00e4\u00ed\u0005\b\u0000\u0000\u00e5"+
		"\u00e6\u0005!\u0000\u0000\u00e6\u00ed\u0005\b\u0000\u0000\u00e7\u00e9"+
		"\u0005\"\u0000\u0000\u00e8\u00ea\u0003(\u0014\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u0005\b\u0000\u0000\u00ec\u00e3\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e5\u0001\u0000\u0000\u0000\u00ec\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ed#\u0001\u0000\u0000\u0000\u00ee\u00fa\u0003\u000e\u0007"+
		"\u0000\u00ef\u00fa\u0003\u0010\b\u0000\u00f0\u00f1\u0003(\u0014\u0000"+
		"\u00f1\u00f2\u0005\b\u0000\u0000\u00f2\u00fa\u0001\u0000\u0000\u0000\u00f3"+
		"\u00fa\u0003\u001a\r\u0000\u00f4\u00fa\u0003\u001e\u000f\u0000\u00f5\u00fa"+
		"\u0003 \u0010\u0000\u00f6\u00fa\u0003&\u0013\u0000\u00f7\u00fa\u0003\""+
		"\u0011\u0000\u00f8\u00fa\u0005<\u0000\u0000\u00f9\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f9\u00ef\u0001\u0000\u0000\u0000\u00f9\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa%\u0001\u0000\u0000\u0000\u00fb\u00ff\u0005\u0002\u0000\u0000"+
		"\u00fc\u00fe\u0003$\u0012\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0003\u0000\u0000\u0103"+
		"\'\u0001\u0000\u0000\u0000\u0104\u0105\u0006\u0014\uffff\uffff\u0000\u0105"+
		"\u0133\u00058\u0000\u0000\u0106\u0107\u0005$\u0000\u0000\u0107\u0108\u0005"+
		"8\u0000\u0000\u0108\u010a\u0005\u0006\u0000\u0000\u0109\u010b\u0003*\u0015"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0133\u0005\u0007\u0000"+
		"\u0000\u010d\u010e\u0005%\u0000\u0000\u010e\u0110\u0005\u0006\u0000\u0000"+
		"\u010f\u0111\u0003*\u0015\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0133\u0005\u0007\u0000\u0000\u0113\u0114\u0005&\u0000\u0000\u0114\u0115"+
		"\u0005#\u0000\u0000\u0115\u0133\u0003(\u0014\u000f\u0116\u0117\u00058"+
		"\u0000\u0000\u0117\u0119\u0005\u0006\u0000\u0000\u0118\u011a\u0003*\u0015"+
		"\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0133\u0005\u0007\u0000"+
		"\u0000\u011c\u011d\u0005\'\u0000\u0000\u011d\u0133\u0003(\u0014\f\u011e"+
		"\u011f\u00058\u0000\u0000\u011f\u0120\u0005\u000b\u0000\u0000\u0120\u0133"+
		"\u0003(\u0014\u0005\u0121\u0122\u00058\u0000\u0000\u0122\u0123\u0005\t"+
		"\u0000\u0000\u0123\u0124\u0003(\u0014\u0000\u0124\u0125\u0005\n\u0000"+
		"\u0000\u0125\u0126\u0005\u000b\u0000\u0000\u0126\u0127\u0003(\u0014\u0004"+
		"\u0127\u0133\u0001\u0000\u0000\u0000\u0128\u0133\u0003,\u0016\u0000\u0129"+
		"\u012a\u0005\u0006\u0000\u0000\u012a\u012b\u0003(\u0014\u0000\u012b\u012c"+
		"\u0005\u0007\u0000\u0000\u012c\u0133\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\u0006\u0000\u0000\u012e\u012f\u0003\u0016\u000b\u0000\u012f\u0130"+
		"\u0005\u0007\u0000\u0000\u0130\u0131\u0003(\u0014\u0001\u0131\u0133\u0001"+
		"\u0000\u0000\u0000\u0132\u0104\u0001\u0000\u0000\u0000\u0132\u0106\u0001"+
		"\u0000\u0000\u0000\u0132\u010d\u0001\u0000\u0000\u0000\u0132\u0113\u0001"+
		"\u0000\u0000\u0000\u0132\u0116\u0001\u0000\u0000\u0000\u0132\u011c\u0001"+
		"\u0000\u0000\u0000\u0132\u011e\u0001\u0000\u0000\u0000\u0132\u0121\u0001"+
		"\u0000\u0000\u0000\u0132\u0128\u0001\u0000\u0000\u0000\u0132\u0129\u0001"+
		"\u0000\u0000\u0000\u0132\u012d\u0001\u0000\u0000\u0000\u0133\u0158\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\n\u000b\u0000\u0000\u0135\u0136\u0007\u0002"+
		"\u0000\u0000\u0136\u0157\u0003(\u0014\f\u0137\u0138\n\n\u0000\u0000\u0138"+
		"\u0139\u0007\u0003\u0000\u0000\u0139\u0157\u0003(\u0014\u000b\u013a\u013b"+
		"\n\t\u0000\u0000\u013b\u013c\u0007\u0004\u0000\u0000\u013c\u0157\u0003"+
		"(\u0014\n\u013d\u013e\n\b\u0000\u0000\u013e\u013f\u0007\u0005\u0000\u0000"+
		"\u013f\u0157\u0003(\u0014\t\u0140\u0141\n\u0007\u0000\u0000\u0141\u0142"+
		"\u00051\u0000\u0000\u0142\u0157\u0003(\u0014\b\u0143\u0144\n\u0006\u0000"+
		"\u0000\u0144\u0145\u00052\u0000\u0000\u0145\u0157\u0003(\u0014\u0007\u0146"+
		"\u0147\n\u0013\u0000\u0000\u0147\u0148\u0005#\u0000\u0000\u0148\u0157"+
		"\u00058\u0000\u0000\u0149\u014a\n\u0012\u0000\u0000\u014a\u014b\u0005"+
		"#\u0000\u0000\u014b\u014c\u00058\u0000\u0000\u014c\u014e\u0005\u0006\u0000"+
		"\u0000\u014d\u014f\u0003*\u0015\u0000\u014e\u014d\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000"+
		"\u0150\u0157\u0005\u0007\u0000\u0000\u0151\u0152\n\r\u0000\u0000\u0152"+
		"\u0153\u0005\t\u0000\u0000\u0153\u0154\u0003(\u0014\u0000\u0154\u0155"+
		"\u0005\n\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0134\u0001"+
		"\u0000\u0000\u0000\u0156\u0137\u0001\u0000\u0000\u0000\u0156\u013a\u0001"+
		"\u0000\u0000\u0000\u0156\u013d\u0001\u0000\u0000\u0000\u0156\u0140\u0001"+
		"\u0000\u0000\u0000\u0156\u0143\u0001\u0000\u0000\u0000\u0156\u0146\u0001"+
		"\u0000\u0000\u0000\u0156\u0149\u0001\u0000\u0000\u0000\u0156\u0151\u0001"+
		"\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159)\u0001\u0000"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u0160\u0003(\u0014"+
		"\u0000\u015c\u015d\u0005\r\u0000\u0000\u015d\u015f\u0003(\u0014\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161+\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0007\u0006\u0000\u0000\u0164-\u0001\u0000\u0000\u0000&24<BDOX"+
		"ejpy\u0081\u008e\u0093\u009f\u00a6\u00a9\u00ad\u00b0\u00b3\u00b9\u00c0"+
		"\u00c8\u00d6\u00da\u00de\u00e9\u00ec\u00f9\u00ff\u010a\u0110\u0119\u0132"+
		"\u014e\u0156\u0158\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}