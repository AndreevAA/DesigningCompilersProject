// Generated from Oberon.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OberonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ARRAY=25, OF=26, END=27, TO=28, OR=29, DIV=30, MOD=31, NIL=32, TRUE=33, 
		FALSE=34, IF=35, THEN=36, ELSIF=37, ELSE=38, CASE=39, WHILE=40, DO=41, 
		FOR=42, BY=43, BEGIN=44, RETURN=45, CONST=46, TYPE=47, VAR=48, PROCEDURE=49, 
		MODULE=50, IMPORT=51, STRING=52, IDENT=53, LETTER=54, DIGIT=55, COMMENT=56, 
		WS=57;
	public static final int
		RULE_module = 0, RULE_importList = 1, RULE_importItem = 2, RULE_declarationSequence = 3, 
		RULE_constDeclaration = 4, RULE_constExpression = 5, RULE_typeDeclaration = 6, 
		RULE_type_ = 7, RULE_arrayType = 8, RULE_identList = 9, RULE_variableDeclaration = 10, 
		RULE_procedureDeclaration = 11, RULE_formalParameters = 12, RULE_fpSection = 13, 
		RULE_statementSequence = 14, RULE_statement = 15, RULE_assignment = 16, 
		RULE_procedureCall = 17, RULE_ifStatement = 18, RULE_whileStatement = 19, 
		RULE_forStatement = 20, RULE_returnStatement = 21, RULE_expression = 22, 
		RULE_relation = 23, RULE_simpleExpression = 24, RULE_addOperator = 25, 
		RULE_term = 26, RULE_mulOperator = 27, RULE_factor = 28, RULE_designator = 29, 
		RULE_selector = 30, RULE_set_ = 31, RULE_element = 32, RULE_expList = 33, 
		RULE_actualParameters = 34, RULE_ident = 35, RULE_qualident = 36, RULE_identdef = 37, 
		RULE_integer = 38, RULE_real = 39, RULE_number = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "importList", "importItem", "declarationSequence", "constDeclaration", 
			"constExpression", "typeDeclaration", "type_", "arrayType", "identList", 
			"variableDeclaration", "procedureDeclaration", "formalParameters", "fpSection", 
			"statementSequence", "statement", "assignment", "procedureCall", "ifStatement", 
			"whileStatement", "forStatement", "returnStatement", "expression", "relation", 
			"simpleExpression", "addOperator", "term", "mulOperator", "factor", "designator", 
			"selector", "set_", "element", "expList", "actualParameters", "ident", 
			"qualident", "identdef", "integer", "real", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "','", "'='", "':'", "'*'", "'('", "')'", "':='", 
			"'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'/'", "'&'", "'~'", 
			"'['", "']'", "'{'", "'}'", "'..'", "'ARRAY'", "'OF'", "'END'", "'TO'", 
			"'OR'", "'DIV'", "'MOD'", "'NIL'", "'TRUE'", "'FALSE'", "'IF'", "'THEN'", 
			"'ELSIF'", "'ELSE'", "'CASE'", "'WHILE'", "'DO'", "'FOR'", "'BY'", "'BEGIN'", 
			"'RETURN'", "'CONST'", "'TYPE'", "'VAR'", "'PROCEDURE'", "'MODULE'", 
			"'IMPORT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ARRAY", "OF", "END", "TO", "OR", "DIV", "MOD", "NIL", "TRUE", 
			"FALSE", "IF", "THEN", "ELSIF", "ELSE", "CASE", "WHILE", "DO", "FOR", 
			"BY", "BEGIN", "RETURN", "CONST", "TYPE", "VAR", "PROCEDURE", "MODULE", 
			"IMPORT", "STRING", "IDENT", "LETTER", "DIGIT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Oberon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OberonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(OberonParser.MODULE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DeclarationSequenceContext declarationSequence() {
			return getRuleContext(DeclarationSequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OberonParser.EOF, 0); }
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(OberonParser.BEGIN, 0); }
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(MODULE);
			setState(83);
			ident();
			setState(84);
			match(T__0);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORT) {
				{
				setState(85);
				importList();
				}
			}

			setState(88);
			declarationSequence();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BEGIN) {
				{
				setState(89);
				match(BEGIN);
				setState(90);
				statementSequence();
				}
			}

			setState(93);
			match(T__1);
			setState(94);
			ident();
			setState(95);
			match(T__1);
			setState(96);
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

	public static class ImportListContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(OberonParser.IMPORT, 0); }
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitImportList(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IMPORT);
			setState(99);
			importItem();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(100);
				match(T__2);
				setState(101);
				importItem();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__0);
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

	public static class ImportItemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitImportItem(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			ident();
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

	public static class DeclarationSequenceContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(OberonParser.CONST, 0); }
		public TerminalNode TYPE() { return getToken(OberonParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(OberonParser.VAR, 0); }
		public List<ProcedureDeclarationContext> procedureDeclaration() {
			return getRuleContexts(ProcedureDeclarationContext.class);
		}
		public ProcedureDeclarationContext procedureDeclaration(int i) {
			return getRuleContext(ProcedureDeclarationContext.class,i);
		}
		public List<ConstDeclarationContext> constDeclaration() {
			return getRuleContexts(ConstDeclarationContext.class);
		}
		public ConstDeclarationContext constDeclaration(int i) {
			return getRuleContext(ConstDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public DeclarationSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterDeclarationSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitDeclarationSequence(this);
		}
	}

	public final DeclarationSequenceContext declarationSequence() throws RecognitionException {
		DeclarationSequenceContext _localctx = new DeclarationSequenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(111);
				match(CONST);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(112);
					constDeclaration();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(120);
				match(TYPE);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(121);
					typeDeclaration();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(129);
				match(VAR);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT) {
					{
					{
					setState(130);
					variableDeclaration();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(138);
				procedureDeclaration();
				}
				}
				setState(143);
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public IdentdefContext identdef() {
			return getRuleContext(IdentdefContext.class,0);
		}
		public ConstExpressionContext constExpression() {
			return getRuleContext(ConstExpressionContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			identdef();
			setState(145);
			match(T__3);
			setState(146);
			constExpression();
			setState(147);
			match(T__0);
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

	public static class ConstExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterConstExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitConstExpression(this);
		}
	}

	public final ConstExpressionContext constExpression() throws RecognitionException {
		ConstExpressionContext _localctx = new ConstExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expression();
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public IdentdefContext identdef() {
			return getRuleContext(IdentdefContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			identdef();
			setState(152);
			match(T__3);
			setState(153);
			type_();
			setState(154);
			match(T__0);
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

	public static class Type_Context extends ParserRuleContext {
		public QualidentContext qualident() {
			return getRuleContext(QualidentContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_type_);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				qualident();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				arrayType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(OberonParser.ARRAY, 0); }
		public ConstExpressionContext constExpression() {
			return getRuleContext(ConstExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(OberonParser.OF, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ARRAY);
			setState(161);
			constExpression();
			setState(162);
			match(OF);
			setState(163);
			type_();
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

	public static class IdentListContext extends ParserRuleContext {
		public List<IdentdefContext> identdef() {
			return getRuleContexts(IdentdefContext.class);
		}
		public IdentdefContext identdef(int i) {
			return getRuleContext(IdentdefContext.class,i);
		}
		public IdentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterIdentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitIdentList(this);
		}
	}

	public final IdentListContext identList() throws RecognitionException {
		IdentListContext _localctx = new IdentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			identdef();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(166);
				match(T__2);
				setState(167);
				identdef();
				}
				}
				setState(172);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentListContext identList() {
			return getRuleContext(IdentListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			identList();
			setState(174);
			match(T__4);
			setState(175);
			type_();
			setState(176);
			match(T__0);
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(OberonParser.PROCEDURE, 0); }
		public IdentdefContext identdef() {
			return getRuleContext(IdentdefContext.class,0);
		}
		public DeclarationSequenceContext declarationSequence() {
			return getRuleContext(DeclarationSequenceContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(OberonParser.BEGIN, 0); }
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public TerminalNode END() { return getToken(OberonParser.END, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitProcedureDeclaration(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(PROCEDURE);
			setState(179);
			identdef();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(180);
				formalParameters();
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(183);
				match(T__5);
				}
			}

			setState(186);
			match(T__0);
			setState(187);
			declarationSequence();
			setState(188);
			match(BEGIN);
			setState(189);
			statementSequence();
			setState(190);
			match(END);
			setState(191);
			ident();
			setState(192);
			match(T__0);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FpSectionContext> fpSection() {
			return getRuleContexts(FpSectionContext.class);
		}
		public FpSectionContext fpSection(int i) {
			return getRuleContext(FpSectionContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__6);
			setState(195);
			fpSection();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(196);
				match(T__0);
				setState(197);
				fpSection();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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

	public static class FpSectionContext extends ParserRuleContext {
		public IdentListContext identList() {
			return getRuleContext(IdentListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VAR() { return getToken(OberonParser.VAR, 0); }
		public FpSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterFpSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitFpSection(this);
		}
	}

	public final FpSectionContext fpSection() throws RecognitionException {
		FpSectionContext _localctx = new FpSectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fpSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(205);
				match(VAR);
				}
			}

			setState(208);
			identList();
			setState(209);
			match(T__4);
			setState(210);
			type_();
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

	public static class StatementSequenceContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterStatementSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitStatementSequence(this);
		}
	}

	public final StatementSequenceContext statementSequence() throws RecognitionException {
		StatementSequenceContext _localctx = new StatementSequenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			statement();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(213);
				match(T__0);
				setState(214);
				statement();
				}
				}
				setState(219);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				procedureCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				returnStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			designator();
			setState(229);
			match(T__8);
			setState(230);
			expression();
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

	public static class ProcedureCallContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterProcedureCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitProcedureCall(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_procedureCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			designator();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(233);
				actualParameters();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(OberonParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(OberonParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(OberonParser.THEN, i);
		}
		public List<StatementSequenceContext> statementSequence() {
			return getRuleContexts(StatementSequenceContext.class);
		}
		public StatementSequenceContext statementSequence(int i) {
			return getRuleContext(StatementSequenceContext.class,i);
		}
		public TerminalNode END() { return getToken(OberonParser.END, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(OberonParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(OberonParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(OberonParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IF);
			setState(237);
			expression();
			setState(238);
			match(THEN);
			setState(239);
			statementSequence();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(240);
				match(ELSIF);
				setState(241);
				expression();
				setState(242);
				match(THEN);
				setState(243);
				statementSequence();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(250);
				match(ELSE);
				setState(251);
				statementSequence();
				}
			}

			setState(254);
			match(END);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(OberonParser.WHILE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DO() { return getTokens(OberonParser.DO); }
		public TerminalNode DO(int i) {
			return getToken(OberonParser.DO, i);
		}
		public List<StatementSequenceContext> statementSequence() {
			return getRuleContexts(StatementSequenceContext.class);
		}
		public StatementSequenceContext statementSequence(int i) {
			return getRuleContext(StatementSequenceContext.class,i);
		}
		public TerminalNode END() { return getToken(OberonParser.END, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(OberonParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(OberonParser.ELSIF, i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(WHILE);
			setState(257);
			expression();
			setState(258);
			match(DO);
			setState(259);
			statementSequence();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(260);
				match(ELSIF);
				setState(261);
				expression();
				setState(262);
				match(DO);
				setState(263);
				statementSequence();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(END);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OberonParser.FOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(OberonParser.TO, 0); }
		public TerminalNode DO() { return getToken(OberonParser.DO, 0); }
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public TerminalNode END() { return getToken(OberonParser.END, 0); }
		public TerminalNode BY() { return getToken(OberonParser.BY, 0); }
		public ConstExpressionContext constExpression() {
			return getRuleContext(ConstExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(FOR);
			setState(273);
			ident();
			setState(274);
			match(T__8);
			setState(275);
			expression();
			setState(276);
			match(TO);
			setState(277);
			expression();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(278);
				match(BY);
				setState(279);
				constExpression();
				}
			}

			setState(282);
			match(DO);
			setState(283);
			statementSequence();
			setState(284);
			match(END);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(OberonParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(RETURN);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << NIL) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << IDENT) | (1L << DIGIT))) != 0)) {
				{
				setState(287);
				expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			simpleExpression();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(291);
				relation();
				setState(292);
				simpleExpression();
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddOperatorContext> addOperator() {
			return getRuleContexts(AddOperatorContext.class);
		}
		public AddOperatorContext addOperator(int i) {
			return getRuleContext(AddOperatorContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__15) {
				{
				setState(298);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(301);
			term();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << OR))) != 0)) {
				{
				{
				setState(302);
				addOperator();
				setState(303);
				term();
				}
				}
				setState(309);
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

	public static class AddOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(OberonParser.OR, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterAddOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitAddOperator(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << OR))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulOperatorContext> mulOperator() {
			return getRuleContexts(MulOperatorContext.class);
		}
		public MulOperatorContext mulOperator(int i) {
			return getRuleContext(MulOperatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			factor();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(313);
				mulOperator();
				setState(314);
				factor();
				}
				}
				setState(320);
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

	public static class MulOperatorContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(OberonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(OberonParser.MOD, 0); }
		public MulOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterMulOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitMulOperator(this);
		}
	}

	public final MulOperatorContext mulOperator() throws RecognitionException {
		MulOperatorContext _localctx = new MulOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mulOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class FactorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(OberonParser.STRING, 0); }
		public TerminalNode NIL() { return getToken(OberonParser.NIL, 0); }
		public TerminalNode TRUE() { return getToken(OberonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OberonParser.FALSE, 0); }
		public Set_Context set_() {
			return getRuleContext(Set_Context.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(STRING);
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(NIL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				match(FALSE);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				set_();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(329);
				designator();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(330);
					actualParameters();
					}
				}

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 8);
				{
				setState(333);
				match(T__6);
				setState(334);
				expression();
				setState(335);
				match(T__7);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 9);
				{
				setState(337);
				match(T__18);
				setState(338);
				factor();
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

	public static class DesignatorContext extends ParserRuleContext {
		public QualidentContext qualident() {
			return getRuleContext(QualidentContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitDesignator(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			qualident();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(342);
				selector();
				}
				}
				setState(347);
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

	public static class SelectorContext extends ParserRuleContext {
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__19);
			setState(349);
			expList();
			setState(350);
			match(T__20);
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

	public static class Set_Context extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Set_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitSet_(this);
		}
	}

	public final Set_Context set_() throws RecognitionException {
		Set_Context _localctx = new Set_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_set_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__21);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << NIL) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << IDENT) | (1L << DIGIT))) != 0)) {
				{
				setState(353);
				element();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(354);
					match(T__2);
					setState(355);
					element();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(363);
			match(T__22);
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

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			expression();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(366);
				match(T__23);
				setState(367);
				expression();
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

	public static class ExpListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitExpList(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			expression();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(371);
				match(T__2);
				setState(372);
				expression();
				}
				}
				setState(377);
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

	public static class ActualParametersContext extends ParserRuleContext {
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public ActualParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterActualParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitActualParameters(this);
		}
	}

	public final ActualParametersContext actualParameters() throws RecognitionException {
		ActualParametersContext _localctx = new ActualParametersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_actualParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__6);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__21) | (1L << NIL) | (1L << TRUE) | (1L << FALSE) | (1L << STRING) | (1L << IDENT) | (1L << DIGIT))) != 0)) {
				{
				setState(379);
				expList();
				}
			}

			setState(382);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(OberonParser.IDENT, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(IDENT);
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

	public static class QualidentContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public QualidentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterQualident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitQualident(this);
		}
	}

	public final QualidentContext qualident() throws RecognitionException {
		QualidentContext _localctx = new QualidentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_qualident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			ident();
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387);
					match(T__1);
					setState(388);
					ident();
					}
					} 
				}
				setState(393);
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
			exitRule();
		}
		return _localctx;
	}

	public static class IdentdefContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IdentdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterIdentdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitIdentdef(this);
		}
	}

	public final IdentdefContext identdef() throws RecognitionException {
		IdentdefContext _localctx = new IdentdefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			ident();
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(395);
				match(T__5);
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

	public static class IntegerContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(OberonParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(OberonParser.DIGIT, i);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(398);
				match(DIGIT);
				}
				}
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(OberonParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(OberonParser.DIGIT, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(403);
				match(DIGIT);
				}
				}
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(408);
			match(T__1);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT) {
				{
				{
				setState(409);
				match(DIGIT);
				}
				}
				setState(414);
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

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OberonListener ) ((OberonListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_number);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				real();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u01a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\5\2Y\n\2\3\2\3\2\3\2\5\2^\n\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3i\n\3\f\3\16\3l\13\3\3\3\3\3\3\4\3\4\3\5\3\5\7\5t\n\5\f\5\16\5"+
		"w\13\5\5\5y\n\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\5\5\u0082\n\5\3\5"+
		"\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\5\5\u008b\n\5\3\5\7\5\u008e\n\5"+
		"\f\5\16\5\u0091\13\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\5\t\u00a1\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00ab\n\13"+
		"\f\13\16\13\u00ae\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00b8\n\r"+
		"\3\r\5\r\u00bb\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16\u00c9\n\16\f\16\16\16\u00cc\13\16\3\16\3\16\3\17\5\17\u00d1\n\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00da\n\20\f\20\16\20\u00dd\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e5\n\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u00ed\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u00f8\n\24\f\24\16\24\u00fb\13\24\3\24\3\24\5\24\u00ff\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u010c\n\25\f\25"+
		"\16\25\u010f\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5"+
		"\26\u011b\n\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u0123\n\27\3\30\3\30"+
		"\3\30\3\30\5\30\u0129\n\30\3\31\3\31\3\32\5\32\u012e\n\32\3\32\3\32\3"+
		"\32\3\32\7\32\u0134\n\32\f\32\16\32\u0137\13\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\7\34\u013f\n\34\f\34\16\34\u0142\13\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u014e\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u0156\n\36\3\37\3\37\7\37\u015a\n\37\f\37\16\37\u015d\13\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\7!\u0167\n!\f!\16!\u016a\13!\5!\u016c\n!\3!\3"+
		"!\3\"\3\"\3\"\5\"\u0173\n\"\3#\3#\3#\7#\u0178\n#\f#\16#\u017b\13#\3$\3"+
		"$\5$\u017f\n$\3$\3$\3%\3%\3&\3&\3&\7&\u0188\n&\f&\16&\u018b\13&\3\'\3"+
		"\'\5\'\u018f\n\'\3(\6(\u0192\n(\r(\16(\u0193\3)\6)\u0197\n)\r)\16)\u0198"+
		"\3)\3)\7)\u019d\n)\f)\16)\u01a0\13)\3*\3*\5*\u01a4\n*\3*\2\2+\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\6"+
		"\4\2\6\6\f\20\3\2\21\22\4\2\21\22\37\37\5\2\b\b\23\24 !\2\u01b1\2T\3\2"+
		"\2\2\4d\3\2\2\2\6o\3\2\2\2\bx\3\2\2\2\n\u0092\3\2\2\2\f\u0097\3\2\2\2"+
		"\16\u0099\3\2\2\2\20\u00a0\3\2\2\2\22\u00a2\3\2\2\2\24\u00a7\3\2\2\2\26"+
		"\u00af\3\2\2\2\30\u00b4\3\2\2\2\32\u00c4\3\2\2\2\34\u00d0\3\2\2\2\36\u00d6"+
		"\3\2\2\2 \u00e4\3\2\2\2\"\u00e6\3\2\2\2$\u00ea\3\2\2\2&\u00ee\3\2\2\2"+
		"(\u0102\3\2\2\2*\u0112\3\2\2\2,\u0120\3\2\2\2.\u0124\3\2\2\2\60\u012a"+
		"\3\2\2\2\62\u012d\3\2\2\2\64\u0138\3\2\2\2\66\u013a\3\2\2\28\u0143\3\2"+
		"\2\2:\u0155\3\2\2\2<\u0157\3\2\2\2>\u015e\3\2\2\2@\u0162\3\2\2\2B\u016f"+
		"\3\2\2\2D\u0174\3\2\2\2F\u017c\3\2\2\2H\u0182\3\2\2\2J\u0184\3\2\2\2L"+
		"\u018c\3\2\2\2N\u0191\3\2\2\2P\u0196\3\2\2\2R\u01a3\3\2\2\2TU\7\64\2\2"+
		"UV\5H%\2VX\7\3\2\2WY\5\4\3\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z]\5\b\5\2["+
		"\\\7.\2\2\\^\5\36\20\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\4\2\2`a\5H%\2"+
		"ab\7\4\2\2bc\7\2\2\3c\3\3\2\2\2de\7\65\2\2ej\5\6\4\2fg\7\5\2\2gi\5\6\4"+
		"\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\3\2"+
		"\2n\5\3\2\2\2op\5H%\2p\7\3\2\2\2qu\7\60\2\2rt\5\n\6\2sr\3\2\2\2tw\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xq\3\2\2\2xy\3\2\2\2y\u0081"+
		"\3\2\2\2z~\7\61\2\2{}\5\16\b\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081z\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u008a\3\2\2\2\u0083\u0087\7\62\2\2\u0084\u0086\5\26\f\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u0083\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008f\3\2\2\2\u008c\u008e\5\30\r\2\u008d\u008c\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\t\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\5L\'\2\u0093\u0094\7\6\2\2"+
		"\u0094\u0095\5\f\7\2\u0095\u0096\7\3\2\2\u0096\13\3\2\2\2\u0097\u0098"+
		"\5.\30\2\u0098\r\3\2\2\2\u0099\u009a\5L\'\2\u009a\u009b\7\6\2\2\u009b"+
		"\u009c\5\20\t\2\u009c\u009d\7\3\2\2\u009d\17\3\2\2\2\u009e\u00a1\5J&\2"+
		"\u009f\u00a1\5\22\n\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\21"+
		"\3\2\2\2\u00a2\u00a3\7\33\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\34\2\2"+
		"\u00a5\u00a6\5\20\t\2\u00a6\23\3\2\2\2\u00a7\u00ac\5L\'\2\u00a8\u00a9"+
		"\7\5\2\2\u00a9\u00ab\5L\'\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\25\3\2\2\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\5\20\t\2\u00b2"+
		"\u00b3\7\3\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\7\63\2\2\u00b5\u00b7\5L\'"+
		"\2\u00b6\u00b8\5\32\16\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00bb\7\b\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\5\b\5\2\u00be"+
		"\u00bf\7.\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\7\35\2\2\u00c1\u00c2\5"+
		"H%\2\u00c2\u00c3\7\3\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00ca"+
		"\5\34\17\2\u00c6\u00c7\7\3\2\2\u00c7\u00c9\5\34\17\2\u00c8\u00c6\3\2\2"+
		"\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\n\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00d1\7\62\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00d3\5\24\13\2\u00d3\u00d4\7\7\2\2\u00d4\u00d5\5\20\t\2"+
		"\u00d5\35\3\2\2\2\u00d6\u00db\5 \21\2\u00d7\u00d8\7\3\2\2\u00d8\u00da"+
		"\5 \21\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e5\5\"\22"+
		"\2\u00df\u00e5\5$\23\2\u00e0\u00e5\5&\24\2\u00e1\u00e5\5(\25\2\u00e2\u00e5"+
		"\5*\26\2\u00e3\u00e5\5,\27\2\u00e4\u00de\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5!\3\2\2\2\u00e6\u00e7\5<\37\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9"+
		"\5.\30\2\u00e9#\3\2\2\2\u00ea\u00ec\5<\37\2\u00eb\u00ed\5F$\2\u00ec\u00eb"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed%\3\2\2\2\u00ee\u00ef\7%\2\2\u00ef\u00f0"+
		"\5.\30\2\u00f0\u00f1\7&\2\2\u00f1\u00f9\5\36\20\2\u00f2\u00f3\7\'\2\2"+
		"\u00f3\u00f4\5.\30\2\u00f4\u00f5\7&\2\2\u00f5\u00f6\5\36\20\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7("+
		"\2\2\u00fd\u00ff\5\36\20\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\7\35\2\2\u0101\'\3\2\2\2\u0102\u0103\7*\2\2"+
		"\u0103\u0104\5.\30\2\u0104\u0105\7+\2\2\u0105\u010d\5\36\20\2\u0106\u0107"+
		"\7\'\2\2\u0107\u0108\5.\30\2\u0108\u0109\7+\2\2\u0109\u010a\5\36\20\2"+
		"\u010a\u010c\3\2\2\2\u010b\u0106\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7\35\2\2\u0111)\3\2\2\2\u0112\u0113\7,\2\2\u0113\u0114\5H%\2\u0114"+
		"\u0115\7\13\2\2\u0115\u0116\5.\30\2\u0116\u0117\7\36\2\2\u0117\u011a\5"+
		".\30\2\u0118\u0119\7-\2\2\u0119\u011b\5\f\7\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7+\2\2\u011d\u011e\5\36"+
		"\20\2\u011e\u011f\7\35\2\2\u011f+\3\2\2\2\u0120\u0122\7/\2\2\u0121\u0123"+
		"\5.\30\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123-\3\2\2\2\u0124"+
		"\u0128\5\62\32\2\u0125\u0126\5\60\31\2\u0126\u0127\5\62\32\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0125\3\2\2\2\u0128\u0129\3\2\2\2\u0129/\3\2\2\2\u012a"+
		"\u012b\t\2\2\2\u012b\61\3\2\2\2\u012c\u012e\t\3\2\2\u012d\u012c\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0135\5\66\34\2\u0130"+
		"\u0131\5\64\33\2\u0131\u0132\5\66\34\2\u0132\u0134\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\63\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\t\4\2\2\u0139\65\3\2\2\2\u013a"+
		"\u0140\5:\36\2\u013b\u013c\58\35\2\u013c\u013d\5:\36\2\u013d\u013f\3\2"+
		"\2\2\u013e\u013b\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\67\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\t\5\2"+
		"\2\u01449\3\2\2\2\u0145\u0156\5R*\2\u0146\u0156\7\66\2\2\u0147\u0156\7"+
		"\"\2\2\u0148\u0156\7#\2\2\u0149\u0156\7$\2\2\u014a\u0156\5@!\2\u014b\u014d"+
		"\5<\37\2\u014c\u014e\5F$\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0156\3\2\2\2\u014f\u0150\7\t\2\2\u0150\u0151\5.\30\2\u0151\u0152\7\n"+
		"\2\2\u0152\u0156\3\2\2\2\u0153\u0154\7\25\2\2\u0154\u0156\5:\36\2\u0155"+
		"\u0145\3\2\2\2\u0155\u0146\3\2\2\2\u0155\u0147\3\2\2\2\u0155\u0148\3\2"+
		"\2\2\u0155\u0149\3\2\2\2\u0155\u014a\3\2\2\2\u0155\u014b\3\2\2\2\u0155"+
		"\u014f\3\2\2\2\u0155\u0153\3\2\2\2\u0156;\3\2\2\2\u0157\u015b\5J&\2\u0158"+
		"\u015a\5> \2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2"+
		"\2\u015b\u015c\3\2\2\2\u015c=\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f"+
		"\7\26\2\2\u015f\u0160\5D#\2\u0160\u0161\7\27\2\2\u0161?\3\2\2\2\u0162"+
		"\u016b\7\30\2\2\u0163\u0168\5B\"\2\u0164\u0165\7\5\2\2\u0165\u0167\5B"+
		"\"\2\u0166\u0164\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u0163\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7\31\2\2\u016e"+
		"A\3\2\2\2\u016f\u0172\5.\30\2\u0170\u0171\7\32\2\2\u0171\u0173\5.\30\2"+
		"\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173C\3\2\2\2\u0174\u0179\5"+
		".\30\2\u0175\u0176\7\5\2\2\u0176\u0178\5.\30\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017aE\3\2\2\2"+
		"\u017b\u0179\3\2\2\2\u017c\u017e\7\t\2\2\u017d\u017f\5D#\2\u017e\u017d"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\7\n\2\2\u0181"+
		"G\3\2\2\2\u0182\u0183\7\67\2\2\u0183I\3\2\2\2\u0184\u0189\5H%\2\u0185"+
		"\u0186\7\4\2\2\u0186\u0188\5H%\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2"+
		"\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018aK\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018c\u018e\5H%\2\u018d\u018f\7\b\2\2\u018e\u018d\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018fM\3\2\2\2\u0190\u0192\79\2\2\u0191\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194O\3\2\2\2"+
		"\u0195\u0197\79\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019e\7\4\2\2\u019b"+
		"\u019d\79\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019fQ\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a4"+
		"\5N(\2\u01a2\u01a4\5P)\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"S\3\2\2\2,X]jux~\u0081\u0087\u008a\u008f\u00a0\u00ac\u00b7\u00ba\u00ca"+
		"\u00d0\u00db\u00e4\u00ec\u00f9\u00fe\u010d\u011a\u0122\u0128\u012d\u0135"+
		"\u0140\u014d\u0155\u015b\u0168\u016b\u0172\u0179\u017e\u0189\u018e\u0193"+
		"\u0198\u019e\u01a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}