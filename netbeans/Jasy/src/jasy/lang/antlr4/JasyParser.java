// Generated from /home/jakob/github/jasy/netbeans/Jasy/src/jasy/lang/antlr4/Jasy.g4 by ANTLR 4.1
package jasy.lang.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JasyParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, HAT=5, AT=6, DOLLAR=7, HASH=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, LT=13, LTE=14, GT=15, GTE=16, EQUALS=17, 
		NOT_EQUALS=18, ASSIGN_OP=19, ASSIGN_ADD=20, ASSIGN_SUB=21, ASSIGN_MULT=22, 
		ASSIGN_DIV=23, REPLACE_OP=24, KW_THIS_RESULT=25, KW_NEW=26, KW_TRY=27, 
		KW_CATCH=28, KW_FINALLY=29, KW_IF=30, KW_ELSE=31, KW_RETURN=32, KW_THROW=33, 
		KW_CLASS=34, KW_TRUE=35, KW_FALSE=36, KW_WHILE=37, WILD_CARD=38, SEMI_COLON=39, 
		COLON=40, DOT=41, ACC_MOD_PUBLIC=42, ACC_MOD_PRIVATE=43, ACC_MOD_PROTECTED=44, 
		MOD_STATIC=45, ID=46, OPEN_BRA=47, CLOSE_BRA=48, INTEGER=49, LONG=50, 
		STRING=51, WS=52, SINGLELINE_COMMENT=53, MULTI_LINE_COMMENT=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", 
		"'+'", "'-'", "MULT", "'/'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'='", "'+='", "'-='", "'*='", "'/='", "'=>'", "'thisResult'", "'new'", 
		"'try'", "'catch'", "'finally'", "'if'", "'else'", "'return'", "'throw'", 
		"'class'", "'true'", "'false'", "'while'", "WILD_CARD", "';'", "':'", 
		"'.'", "'public'", "'private'", "'protected'", "'static'", "ID", "'{'", 
		"'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_classTransformer = 1, RULE_classTransformerMembers = 2, 
		RULE_classTransformerMemberDefinition = 3, RULE_classTransformerMember = 4, 
		RULE_classTransformerMemberField = 5, RULE_classTransformerMemberMethod = 6, 
		RULE_classTransformerMemberMethodBlody = 7, RULE_block = 8, RULE_parameters = 9, 
		RULE_parameter = 10, RULE_expression = 11, RULE_variableAssignment = 12, 
		RULE_assignmentOperator = 13, RULE_equalityExpression = 14, RULE_equalityOperator = 15, 
		RULE_relationalExpression = 16, RULE_relationalOperator = 17, RULE_additiveExpression = 18, 
		RULE_additiveOperator = 19, RULE_multiplicativeExpression = 20, RULE_multiplicativeOperator = 21, 
		RULE_leafExpression = 22, RULE_embeddedExpression = 23, RULE_leafExpressionChain = 24, 
		RULE_thisResult = 25, RULE_invocation = 26, RULE_arguments = 27, RULE_lookup = 28, 
		RULE_unqualifiedLookup = 29, RULE_qualifiedLookup = 30, RULE_statements = 31, 
		RULE_statement = 32, RULE_nonDelimitedStatement = 33, RULE_proceedStatement = 34, 
		RULE_metaExpression = 35, RULE_quotedExpression = 36, RULE_newExpression = 37, 
		RULE_tryCatchStatement = 38, RULE_tryStatement = 39, RULE_catchStatement = 40, 
		RULE_finallyStatement = 41, RULE_ifElseStatement = 42, RULE_whileStatement = 43, 
		RULE_delimitedStatement = 44, RULE_variableDeclaration = 45, RULE_returnStatement = 46, 
		RULE_throwStatement = 47, RULE_literal = 48, RULE_stringLiteral = 49, 
		RULE_integerLiteral = 50, RULE_longLiteral = 51, RULE_booleanLiteral = 52, 
		RULE_metaBlock = 53, RULE_singleOrMultiStatement = 54, RULE_annotation = 55, 
		RULE_annotations = 56, RULE_typeQualifier = 57, RULE_modStatic = 58, RULE_accessModifier = 59, 
		RULE_identifier = 60;
	public static final String[] ruleNames = {
		"program", "classTransformer", "classTransformerMembers", "classTransformerMemberDefinition", 
		"classTransformerMember", "classTransformerMemberField", "classTransformerMemberMethod", 
		"classTransformerMemberMethodBlody", "block", "parameters", "parameter", 
		"expression", "variableAssignment", "assignmentOperator", "equalityExpression", 
		"equalityOperator", "relationalExpression", "relationalOperator", "additiveExpression", 
		"additiveOperator", "multiplicativeExpression", "multiplicativeOperator", 
		"leafExpression", "embeddedExpression", "leafExpressionChain", "thisResult", 
		"invocation", "arguments", "lookup", "unqualifiedLookup", "qualifiedLookup", 
		"statements", "statement", "nonDelimitedStatement", "proceedStatement", 
		"metaExpression", "quotedExpression", "newExpression", "tryCatchStatement", 
		"tryStatement", "catchStatement", "finallyStatement", "ifElseStatement", 
		"whileStatement", "delimitedStatement", "variableDeclaration", "returnStatement", 
		"throwStatement", "literal", "stringLiteral", "integerLiteral", "longLiteral", 
		"booleanLiteral", "metaBlock", "singleOrMultiStatement", "annotation", 
		"annotations", "typeQualifier", "modStatic", "accessModifier", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "Jasy.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JasyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassTransformerContext> classTransformer() {
			return getRuleContexts(ClassTransformerContext.class);
		}
		public ClassTransformerContext classTransformer(int i) {
			return getRuleContext(ClassTransformerContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_CLASS) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << ID))) != 0)) {
				{
				{
				setState(122); classTransformer();
				}
				}
				setState(127);
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

	public static class ClassTransformerContext extends ParserRuleContext {
		public IdentifierContext variableId;
		public ClassTransformerMembersContext members;
		public ClassTransformerMembersContext classTransformerMembers() {
			return getRuleContext(ClassTransformerMembersContext.class,0);
		}
		public TerminalNode KW_CLASS() { return getToken(JasyParser.KW_CLASS, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(JasyParser.ASSIGN_OP, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public ClassTransformerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitClassTransformer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerContext classTransformer() throws RecognitionException {
		ClassTransformerContext _localctx = new ClassTransformerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classTransformer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(128); ((ClassTransformerContext)_localctx).variableId = identifier();
				setState(129); match(ASSIGN_OP);
				}
			}

			setState(133); annotations();
			setState(135);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(134); accessModifier();
				}
			}

			setState(137); match(KW_CLASS);
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(138); typeQualifier();
				}
				break;
			}
			setState(145);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(141); match(OPEN_BRA);
				setState(142); ((ClassTransformerContext)_localctx).members = classTransformerMembers();
				setState(143); match(CLOSE_BRA);
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

	public static class ClassTransformerMembersContext extends ParserRuleContext {
		public List<ClassTransformerMemberDefinitionContext> classTransformerMemberDefinition() {
			return getRuleContexts(ClassTransformerMemberDefinitionContext.class);
		}
		public ClassTransformerMemberDefinitionContext classTransformerMemberDefinition(int i) {
			return getRuleContext(ClassTransformerMemberDefinitionContext.class,i);
		}
		public ClassTransformerMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMembers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitClassTransformerMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMembersContext classTransformerMembers() throws RecognitionException {
		ClassTransformerMembersContext _localctx = new ClassTransformerMembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classTransformerMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << AT) | (1L << PLUS) | (1L << ASSIGN_OP) | (1L << SEMI_COLON) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << MOD_STATIC) | (1L << ID))) != 0)) {
				{
				{
				setState(147); classTransformerMemberDefinition();
				}
				}
				setState(152);
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

	public static class ClassTransformerMemberDefinitionContext extends ParserRuleContext {
		public IdentifierContext variableId;
		public ClassTransformerMemberContext member;
		public TerminalNode ASSIGN_OP() { return getToken(JasyParser.ASSIGN_OP, 0); }
		public ClassTransformerMemberContext classTransformerMember() {
			return getRuleContext(ClassTransformerMemberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(JasyParser.PLUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTransformerMemberDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitClassTransformerMemberDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberDefinitionContext classTransformerMemberDefinition() throws RecognitionException {
		ClassTransformerMemberDefinitionContext _localctx = new ClassTransformerMemberDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classTransformerMemberDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(153); match(PLUS);
				}
				break;

			case 2:
				{
				{
				setState(154); ((ClassTransformerMemberDefinitionContext)_localctx).variableId = identifier();
				setState(155); match(ASSIGN_OP);
				}
				}
				break;
			}
			setState(159); ((ClassTransformerMemberDefinitionContext)_localctx).member = classTransformerMember();
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

	public static class ClassTransformerMemberContext extends ParserRuleContext {
		public ClassTransformerMemberMethodContext classTransformerMemberMethod() {
			return getRuleContext(ClassTransformerMemberMethodContext.class,0);
		}
		public ClassTransformerMemberFieldContext classTransformerMemberField() {
			return getRuleContext(ClassTransformerMemberFieldContext.class,0);
		}
		public ClassTransformerMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitClassTransformerMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberContext classTransformerMember() throws RecognitionException {
		ClassTransformerMemberContext _localctx = new ClassTransformerMemberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classTransformerMember);
		try {
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); classTransformerMemberField();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); classTransformerMemberMethod();
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

	public static class ClassTransformerMemberFieldContext extends ParserRuleContext {
		public ExpressionContext value;
		public TerminalNode SEMI_COLON() { return getToken(JasyParser.SEMI_COLON, 0); }
		public ModStaticContext modStatic() {
			return getRuleContext(ModStaticContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(JasyParser.ASSIGN_OP, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public ClassTransformerMemberFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberField; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitClassTransformerMemberField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberFieldContext classTransformerMemberField() throws RecognitionException {
		ClassTransformerMemberFieldContext _localctx = new ClassTransformerMemberFieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classTransformerMemberField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); annotations();
			setState(167);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(166); accessModifier();
				}
			}

			setState(170);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(169); modStatic();
				}
			}

			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(172); typeQualifier();
				}
				break;
			}
			setState(176);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(175); identifier();
				}
			}

			setState(180);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(178); match(ASSIGN_OP);
				setState(179); ((ClassTransformerMemberFieldContext)_localctx).value = expression();
				}
			}

			setState(182); match(SEMI_COLON);
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

	public static class ClassTransformerMemberMethodContext extends ParserRuleContext {
		public ClassTransformerMemberMethodBlodyContext body;
		public ClassTransformerMemberMethodBlodyContext classTransformerMemberMethodBlody() {
			return getRuleContext(ClassTransformerMemberMethodBlodyContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ModStaticContext modStatic() {
			return getRuleContext(ModStaticContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public ClassTransformerMemberMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitClassTransformerMemberMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberMethodContext classTransformerMemberMethod() throws RecognitionException {
		ClassTransformerMemberMethodContext _localctx = new ClassTransformerMemberMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classTransformerMemberMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); annotations();
			setState(186);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(185); accessModifier();
				}
			}

			setState(189);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(188); modStatic();
				}
			}

			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(191); typeQualifier();
				}
				break;
			}
			setState(195);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(194); identifier();
				}
			}

			setState(197); match(OPEN_PAR);
			setState(198); parameters();
			setState(199); match(CLOSE_PAR);
			setState(200); ((ClassTransformerMemberMethodContext)_localctx).body = classTransformerMemberMethodBlody();
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

	public static class ClassTransformerMemberMethodBlodyContext extends ParserRuleContext {
		public MetaBlockContext metaBlock() {
			return getRuleContext(MetaBlockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ClassTransformerMemberMethodBlodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberMethodBlody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitClassTransformerMemberMethodBlody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberMethodBlodyContext classTransformerMemberMethodBlody() throws RecognitionException {
		ClassTransformerMemberMethodBlodyContext _localctx = new ClassTransformerMemberMethodBlodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classTransformerMemberMethodBlody);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); metaBlock();
				}
				break;
			case OPEN_BRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); block();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(OPEN_BRA);
			setState(207); statements();
			setState(208); match(CLOSE_BRA);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasyParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(210); parameter();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(211); match(COMMA);
					setState(212); parameter();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); typeQualifier();
			setState(221); identifier();
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
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); variableAssignment();
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public VariableAssignmentContext value;
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAssignment);
		try {
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); identifier();
				setState(226); assignmentOperator();
				setState(227); ((VariableAssignmentContext)_localctx).value = variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); equalityExpression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode ASSIGN_MULT() { return getToken(JasyParser.ASSIGN_MULT, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(JasyParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(JasyParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(JasyParser.ASSIGN_OP, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(JasyParser.ASSIGN_SUB, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			((AssignmentOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN_OP) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MULT) | (1L << ASSIGN_DIV))) != 0)) ) {
				((AssignmentOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext first;
		public RelationalExpressionContext rest;
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<EqualityOperatorContext> equalityOperator() {
			return getRuleContexts(EqualityOperatorContext.class);
		}
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public EqualityOperatorContext equalityOperator(int i) {
			return getRuleContext(EqualityOperatorContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234); ((EqualityExpressionContext)_localctx).first = relationalExpression();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(235); equalityOperator();
					setState(236); ((EqualityExpressionContext)_localctx).rest = relationalExpression();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class EqualityOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode EQUALS() { return getToken(JasyParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(JasyParser.NOT_EQUALS, 0); }
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((EqualityOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==NOT_EQUALS) ) {
				((EqualityOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext first;
		public AdditiveExpressionContext rest;
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245); ((RelationalExpressionContext)_localctx).first = additiveExpression();
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(246); relationalOperator();
					setState(247); ((RelationalExpressionContext)_localctx).rest = additiveExpression();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode LT() { return getToken(JasyParser.LT, 0); }
		public TerminalNode GTE() { return getToken(JasyParser.GTE, 0); }
		public TerminalNode GT() { return getToken(JasyParser.GT, 0); }
		public TerminalNode LTE() { return getToken(JasyParser.LTE, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((RelationalOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
				((RelationalOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext first;
		public MultiplicativeExpressionContext rest;
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additiveExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256); ((AdditiveExpressionContext)_localctx).first = multiplicativeExpression();
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(257); additiveOperator();
					setState(258); ((AdditiveExpressionContext)_localctx).rest = multiplicativeExpression();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode PLUS() { return getToken(JasyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JasyParser.MINUS, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			((AdditiveOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((AdditiveOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public LeafExpressionContext first;
		public LeafExpressionContext rest;
		public List<LeafExpressionContext> leafExpression() {
			return getRuleContexts(LeafExpressionContext.class);
		}
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public LeafExpressionContext leafExpression(int i) {
			return getRuleContext(LeafExpressionContext.class,i);
		}
		public MultiplicativeOperatorContext multiplicativeOperator(int i) {
			return getRuleContext(MultiplicativeOperatorContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267); ((MultiplicativeExpressionContext)_localctx).first = leafExpression();
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(268); multiplicativeOperator();
					setState(269); ((MultiplicativeExpressionContext)_localctx).rest = leafExpression();
					}
					} 
				}
				setState(275);
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
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode MULT() { return getToken(JasyParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(JasyParser.DIV, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((MultiplicativeOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
				((MultiplicativeOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LeafExpressionContext extends ParserRuleContext {
		public LeafExpressionChainContext leafExpressionChain() {
			return getRuleContext(LeafExpressionChainContext.class,0);
		}
		public ProceedStatementContext proceedStatement() {
			return getRuleContext(ProceedStatementContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public MetaExpressionContext metaExpression() {
			return getRuleContext(MetaExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public EmbeddedExpressionContext embeddedExpression() {
			return getRuleContext(EmbeddedExpressionContext.class,0);
		}
		public QuotedExpressionContext quotedExpression() {
			return getRuleContext(QuotedExpressionContext.class,0);
		}
		public ThisResultContext thisResult() {
			return getRuleContext(ThisResultContext.class,0);
		}
		public LeafExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leafExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitLeafExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeafExpressionContext leafExpression() throws RecognitionException {
		LeafExpressionContext _localctx = new LeafExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_leafExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(278); invocation();
				}
				break;

			case 2:
				{
				setState(279); literal();
				}
				break;

			case 3:
				{
				setState(280); lookup();
				}
				break;

			case 4:
				{
				setState(281); thisResult();
				}
				break;

			case 5:
				{
				setState(282); proceedStatement();
				}
				break;

			case 6:
				{
				setState(283); metaExpression();
				}
				break;

			case 7:
				{
				setState(284); quotedExpression();
				}
				break;

			case 8:
				{
				setState(285); newExpression();
				}
				break;

			case 9:
				{
				setState(286); embeddedExpression();
				}
				break;
			}
			setState(289); leafExpressionChain();
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

	public static class EmbeddedExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public EmbeddedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embeddedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitEmbeddedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmbeddedExpressionContext embeddedExpression() throws RecognitionException {
		EmbeddedExpressionContext _localctx = new EmbeddedExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_embeddedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291); match(OPEN_PAR);
			setState(292); expression();
			setState(293); match(CLOSE_PAR);
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

	public static class LeafExpressionChainContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(JasyParser.DOT); }
		public List<InvocationContext> invocation() {
			return getRuleContexts(InvocationContext.class);
		}
		public List<LookupContext> lookup() {
			return getRuleContexts(LookupContext.class);
		}
		public LookupContext lookup(int i) {
			return getRuleContext(LookupContext.class,i);
		}
		public TerminalNode DOT(int i) {
			return getToken(JasyParser.DOT, i);
		}
		public InvocationContext invocation(int i) {
			return getRuleContext(InvocationContext.class,i);
		}
		public LeafExpressionChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leafExpressionChain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitLeafExpressionChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeafExpressionChainContext leafExpressionChain() throws RecognitionException {
		LeafExpressionChainContext _localctx = new LeafExpressionChainContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_leafExpressionChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(295); match(DOT);
					setState(298);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						setState(296); lookup();
						}
						break;

					case 2:
						{
						setState(297); invocation();
						}
						break;
					}
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class ThisResultContext extends ParserRuleContext {
		public TerminalNode KW_THIS_RESULT() { return getToken(JasyParser.KW_THIS_RESULT, 0); }
		public ThisResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisResult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitThisResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisResultContext thisResult() throws RecognitionException {
		ThisResultContext _localctx = new ThisResultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_thisResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); match(KW_THIS_RESULT);
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

	public static class InvocationContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); identifier();
			setState(308); match(OPEN_PAR);
			setState(309); arguments();
			setState(310); match(CLOSE_PAR);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(JasyParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(JasyParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(312); expression();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(313); match(COMMA);
					setState(314); expression();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class LookupContext extends ParserRuleContext {
		public UnqualifiedLookupContext unqualifiedLookup() {
			return getRuleContext(UnqualifiedLookupContext.class,0);
		}
		public QualifiedLookupContext qualifiedLookup() {
			return getRuleContext(QualifiedLookupContext.class,0);
		}
		public LookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lookup);
		try {
			setState(324);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(322); unqualifiedLookup();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); qualifiedLookup();
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

	public static class UnqualifiedLookupContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnqualifiedLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedLookup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitUnqualifiedLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnqualifiedLookupContext unqualifiedLookup() throws RecognitionException {
		UnqualifiedLookupContext _localctx = new UnqualifiedLookupContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unqualifiedLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); identifier();
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

	public static class QualifiedLookupContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JasyParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QualifiedLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedLookup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitQualifiedLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedLookupContext qualifiedLookup() throws RecognitionException {
		QualifiedLookupContext _localctx = new QualifiedLookupContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_qualifiedLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(COLON);
			setState(329); expression();
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_WHILE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				{
				setState(331); statement();
				}
				}
				setState(336);
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
		public TerminalNode SEMI_COLON() { return getToken(JasyParser.SEMI_COLON, 0); }
		public NonDelimitedStatementContext nonDelimitedStatement() {
			return getRuleContext(NonDelimitedStatementContext.class,0);
		}
		public MetaBlockContext metaBlock() {
			return getRuleContext(MetaBlockContext.class,0);
		}
		public DelimitedStatementContext delimitedStatement() {
			return getRuleContext(DelimitedStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337); metaBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); nonDelimitedStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339); delimitedStatement();
				setState(340); match(SEMI_COLON);
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

	public static class NonDelimitedStatementContext extends ParserRuleContext {
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public NonDelimitedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonDelimitedStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitNonDelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonDelimitedStatementContext nonDelimitedStatement() throws RecognitionException {
		NonDelimitedStatementContext _localctx = new NonDelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nonDelimitedStatement);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case KW_TRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(344); tryCatchStatement();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(345); ifElseStatement();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(346); whileStatement();
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

	public static class ProceedStatementContext extends ParserRuleContext {
		public TerminalNode ELLIPSES() { return getToken(JasyParser.ELLIPSES, 0); }
		public ProceedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceedStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitProceedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProceedStatementContext proceedStatement() throws RecognitionException {
		ProceedStatementContext _localctx = new ProceedStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_proceedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); match(ELLIPSES);
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

	public static class MetaExpressionContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(JasyParser.DOLLAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public MetaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitMetaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaExpressionContext metaExpression() throws RecognitionException {
		MetaExpressionContext _localctx = new MetaExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_metaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(DOLLAR);
			setState(357);
			switch (_input.LA(1)) {
			case ELLIPSES:
			case OPEN_PAR:
			case DOLLAR:
			case HASH:
			case KW_THIS_RESULT:
			case KW_NEW:
			case KW_TRUE:
			case KW_FALSE:
			case COLON:
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				{
				setState(352); expression();
				}
				break;
			case OPEN_BRA:
				{
				setState(353); match(OPEN_BRA);
				setState(354); statements();
				setState(355); match(CLOSE_BRA);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QuotedExpressionContext extends ParserRuleContext {
		public NonDelimitedStatementContext nonDelimitedStatement() {
			return getRuleContext(NonDelimitedStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DelimitedStatementContext delimitedStatement() {
			return getRuleContext(DelimitedStatementContext.class,0);
		}
		public TerminalNode HASH() { return getToken(JasyParser.HASH, 0); }
		public QuotedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitQuotedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedExpressionContext quotedExpression() throws RecognitionException {
		QuotedExpressionContext _localctx = new QuotedExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_quotedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(HASH);
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(360); expression();
				}
				break;

			case 2:
				{
				setState(361); nonDelimitedStatement();
				}
				break;

			case 3:
				{
				setState(362); delimitedStatement();
				}
				break;

			case 4:
				{
				setState(363); block();
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

	public static class NewExpressionContext extends ParserRuleContext {
		public TypeQualifierContext className;
		public List<TerminalNode> COMMA() { return getTokens(JasyParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode KW_NEW() { return getToken(JasyParser.KW_NEW, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(JasyParser.COMMA, i);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitNewExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); match(KW_NEW);
			setState(367); ((NewExpressionContext)_localctx).className = typeQualifier();
			setState(368); match(OPEN_PAR);
			setState(377);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(369); expression();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(370); match(COMMA);
					setState(371); expression();
					}
					}
					setState(376);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(379); match(CLOSE_PAR);
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

	public static class TryCatchStatementContext extends ParserRuleContext {
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public FinallyStatementContext finallyStatement() {
			return getRuleContext(FinallyStatementContext.class,0);
		}
		public CatchStatementContext catchStatement() {
			return getRuleContext(CatchStatementContext.class,0);
		}
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); tryStatement();
			setState(387);
			switch (_input.LA(1)) {
			case KW_CATCH:
				{
				{
				setState(382); catchStatement();
				setState(384);
				_la = _input.LA(1);
				if (_la==KW_FINALLY) {
					{
					setState(383); finallyStatement();
					}
				}

				}
				}
				break;
			case KW_FINALLY:
				{
				setState(386); finallyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TryStatementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode KW_TRY() { return getToken(JasyParser.KW_TRY, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(KW_TRY);
			setState(390); match(OPEN_BRA);
			setState(391); statements();
			setState(392); match(CLOSE_BRA);
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

	public static class CatchStatementContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode KW_CATCH() { return getToken(JasyParser.KW_CATCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public CatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchStatementContext catchStatement() throws RecognitionException {
		CatchStatementContext _localctx = new CatchStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(KW_CATCH);
			setState(395); match(OPEN_PAR);
			setState(396); parameter();
			setState(397); match(CLOSE_PAR);
			setState(398); match(OPEN_BRA);
			setState(399); statements();
			setState(400); match(CLOSE_BRA);
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

	public static class FinallyStatementContext extends ParserRuleContext {
		public TerminalNode KW_FINALLY() { return getToken(JasyParser.KW_FINALLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); match(KW_FINALLY);
			setState(403); match(OPEN_BRA);
			setState(404); statements();
			setState(405); match(CLOSE_BRA);
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

	public static class IfElseStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public SingleOrMultiStatementContext ifTrueBlock;
		public SingleOrMultiStatementContext ifFalseBlock;
		public List<SingleOrMultiStatementContext> singleOrMultiStatement() {
			return getRuleContexts(SingleOrMultiStatementContext.class);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleOrMultiStatementContext singleOrMultiStatement(int i) {
			return getRuleContext(SingleOrMultiStatementContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(JasyParser.KW_ELSE, 0); }
		public TerminalNode KW_IF() { return getToken(JasyParser.KW_IF, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(KW_IF);
			setState(408); match(OPEN_PAR);
			setState(409); ((IfElseStatementContext)_localctx).condition = expression();
			setState(410); match(CLOSE_PAR);
			setState(411); ((IfElseStatementContext)_localctx).ifTrueBlock = singleOrMultiStatement();
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(412); match(KW_ELSE);
				setState(413); ((IfElseStatementContext)_localctx).ifFalseBlock = singleOrMultiStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public SingleOrMultiStatementContext whileTrueBlock;
		public TerminalNode KW_WHILE() { return getToken(JasyParser.KW_WHILE, 0); }
		public SingleOrMultiStatementContext singleOrMultiStatement() {
			return getRuleContext(SingleOrMultiStatementContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(KW_WHILE);
			setState(417); match(OPEN_PAR);
			setState(418); ((WhileStatementContext)_localctx).condition = expression();
			setState(419); match(CLOSE_PAR);
			setState(420); ((WhileStatementContext)_localctx).whileTrueBlock = singleOrMultiStatement();
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

	public static class DelimitedStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DelimitedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimitedStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitDelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimitedStatementContext delimitedStatement() throws RecognitionException {
		DelimitedStatementContext _localctx = new DelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_delimitedStatement);
		try {
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422); returnStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423); throwStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424); variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425); expression();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext id;
		public ExpressionContext value;
		public TerminalNode ASSIGN_OP() { return getToken(JasyParser.ASSIGN_OP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); typeQualifier();
			setState(429); ((VariableDeclarationContext)_localctx).id = identifier();
			setState(432);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(430); match(ASSIGN_OP);
				setState(431); ((VariableDeclarationContext)_localctx).value = expression();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode KW_RETURN() { return getToken(JasyParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(KW_RETURN);
			setState(435); expression();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode KW_THROW() { return getToken(JasyParser.KW_THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(KW_THROW);
			setState(438); expression();
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

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LongLiteralContext longLiteral() {
			return getRuleContext(LongLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		try {
			setState(444);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); stringLiteral();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(441); integerLiteral();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 3);
				{
				setState(442); longLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(443); booleanLiteral();
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

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JasyParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(STRING);
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

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(JasyParser.INTEGER, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); match(INTEGER);
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

	public static class LongLiteralContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(JasyParser.LONG, 0); }
		public LongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitLongLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongLiteralContext longLiteral() throws RecognitionException {
		LongLiteralContext _localctx = new LongLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(LONG);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(JasyParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(JasyParser.KW_FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==KW_TRUE || _la==KW_FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MetaBlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(JasyParser.DOLLAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public MetaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitMetaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaBlockContext metaBlock() throws RecognitionException {
		MetaBlockContext _localctx = new MetaBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_metaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); match(DOLLAR);
			setState(455); match(OPEN_BRA);
			setState(456); statements();
			setState(457); match(CLOSE_BRA);
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

	public static class SingleOrMultiStatementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public SingleOrMultiStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleOrMultiStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitSingleOrMultiStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleOrMultiStatementContext singleOrMultiStatement() throws RecognitionException {
		SingleOrMultiStatementContext _localctx = new SingleOrMultiStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_singleOrMultiStatement);
		try {
			setState(464);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(459); match(OPEN_BRA);
				setState(460); statements();
				setState(461); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
			case DOLLAR:
			case HASH:
			case KW_THIS_RESULT:
			case KW_NEW:
			case KW_TRY:
			case KW_IF:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case KW_WHILE:
			case COLON:
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(463); statement();
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

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JasyParser.AT, 0); }
		public TerminalNode PLUS() { return getToken(JasyParser.PLUS, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); match(AT);
			setState(468);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(467); match(PLUS);
				}
			}

			setState(470); typeQualifier();
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

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(472); annotation();
				}
				}
				setState(477);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(JasyParser.DOT); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(JasyParser.DOT, i);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); identifier();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(479); match(DOT);
				setState(480); identifier();
				}
				}
				setState(485);
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

	public static class ModStaticContext extends ParserRuleContext {
		public TerminalNode MOD_STATIC() { return getToken(JasyParser.MOD_STATIC, 0); }
		public ModStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modStatic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitModStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModStaticContext modStatic() throws RecognitionException {
		ModStaticContext _localctx = new ModStaticContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_modStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); match(MOD_STATIC);
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

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode ACC_MOD_PROTECTED() { return getToken(JasyParser.ACC_MOD_PROTECTED, 0); }
		public TerminalNode ACC_MOD_PRIVATE() { return getToken(JasyParser.ACC_MOD_PRIVATE, 0); }
		public TerminalNode ACC_MOD_PUBLIC() { return getToken(JasyParser.ACC_MOD_PUBLIC, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JasyParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(ID);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\7\2~\n\2\f\2\16\2\u0081\13\2\3\3\3\3\3\3\5\3\u0086\n\3\3\3"+
		"\3\3\5\3\u008a\n\3\3\3\3\3\5\3\u008e\n\3\3\3\3\3\3\3\3\3\5\3\u0094\n\3"+
		"\3\4\7\4\u0097\n\4\f\4\16\4\u009a\13\4\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3"+
		"\5\3\5\3\6\3\6\5\6\u00a6\n\6\3\7\3\7\5\7\u00aa\n\7\3\7\5\7\u00ad\n\7\3"+
		"\7\5\7\u00b0\n\7\3\7\5\7\u00b3\n\7\3\7\3\7\5\7\u00b7\n\7\3\7\3\7\3\b\3"+
		"\b\5\b\u00bd\n\b\3\b\5\b\u00c0\n\b\3\b\5\b\u00c3\n\b\3\b\5\b\u00c6\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00cf\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\7\13\u00d8\n\13\f\13\16\13\u00db\13\13\5\13\u00dd\n\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e9\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20\u00f1\n\20\f\20\16\20\u00f4\13\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22\u00fc\n\22\f\22\16\22\u00ff\13\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\7\24\u0107\n\24\f\24\16\24\u010a\13\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\7\26\u0112\n\26\f\26\16\26\u0115\13\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0122\n\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\5\32\u012d\n\32\7\32\u012f\n\32\f\32\16\32\u0132"+
		"\13\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u013e\n"+
		"\35\f\35\16\35\u0141\13\35\5\35\u0143\n\35\3\36\3\36\5\36\u0147\n\36\3"+
		"\37\3\37\3 \3 \3 \3!\7!\u014f\n!\f!\16!\u0152\13!\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0159\n\"\3#\3#\3#\5#\u015e\n#\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0168\n"+
		"%\3&\3&\3&\3&\3&\5&\u016f\n&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0177\n\'\f\'"+
		"\16\'\u017a\13\'\5\'\u017c\n\'\3\'\3\'\3(\3(\3(\5(\u0183\n(\3(\5(\u0186"+
		"\n(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3,\5,\u01a1\n,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\5.\u01ad\n.\3/\3/"+
		"\3/\3/\5/\u01b3\n/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5"+
		"\62\u01bf\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\58\u01d3\n8\39\39\59\u01d7\n9\39\39\3:\7:\u01dc"+
		"\n:\f:\16:\u01df\13:\3;\3;\3;\7;\u01e4\n;\f;\16;\u01e7\13;\3<\3<\3=\3"+
		"=\3>\3>\3>\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\t\3\2\25\31\3\2\23\24\3\2\17"+
		"\22\3\2\13\f\3\2\r\16\3\2%&\3\2,.\u01f1\2\177\3\2\2\2\4\u0085\3\2\2\2"+
		"\6\u0098\3\2\2\2\b\u009f\3\2\2\2\n\u00a5\3\2\2\2\f\u00a7\3\2\2\2\16\u00ba"+
		"\3\2\2\2\20\u00ce\3\2\2\2\22\u00d0\3\2\2\2\24\u00dc\3\2\2\2\26\u00de\3"+
		"\2\2\2\30\u00e1\3\2\2\2\32\u00e8\3\2\2\2\34\u00ea\3\2\2\2\36\u00ec\3\2"+
		"\2\2 \u00f5\3\2\2\2\"\u00f7\3\2\2\2$\u0100\3\2\2\2&\u0102\3\2\2\2(\u010b"+
		"\3\2\2\2*\u010d\3\2\2\2,\u0116\3\2\2\2.\u0121\3\2\2\2\60\u0125\3\2\2\2"+
		"\62\u0130\3\2\2\2\64\u0133\3\2\2\2\66\u0135\3\2\2\28\u0142\3\2\2\2:\u0146"+
		"\3\2\2\2<\u0148\3\2\2\2>\u014a\3\2\2\2@\u0150\3\2\2\2B\u0158\3\2\2\2D"+
		"\u015d\3\2\2\2F\u015f\3\2\2\2H\u0161\3\2\2\2J\u0169\3\2\2\2L\u0170\3\2"+
		"\2\2N\u017f\3\2\2\2P\u0187\3\2\2\2R\u018c\3\2\2\2T\u0194\3\2\2\2V\u0199"+
		"\3\2\2\2X\u01a2\3\2\2\2Z\u01ac\3\2\2\2\\\u01ae\3\2\2\2^\u01b4\3\2\2\2"+
		"`\u01b7\3\2\2\2b\u01be\3\2\2\2d\u01c0\3\2\2\2f\u01c2\3\2\2\2h\u01c4\3"+
		"\2\2\2j\u01c6\3\2\2\2l\u01c8\3\2\2\2n\u01d2\3\2\2\2p\u01d4\3\2\2\2r\u01dd"+
		"\3\2\2\2t\u01e0\3\2\2\2v\u01e8\3\2\2\2x\u01ea\3\2\2\2z\u01ec\3\2\2\2|"+
		"~\5\4\3\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\3\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5z>\2\u0083\u0084\7\25\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\5r:\2\u0088\u008a\5x=\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7$\2\2\u008c\u008e\5t;\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0093\3\2\2\2\u008f\u0090\7\61"+
		"\2\2\u0090\u0091\5\6\4\2\u0091\u0092\7\62\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094\5\3\2\2\2\u0095\u0097\5\b\5\2"+
		"\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\7\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00a0\7\13\2\2\u009c"+
		"\u009d\5z>\2\u009d\u009e\7\25\2\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2"+
		"\2\2\u009f\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\5\n\6\2\u00a2\t\3\2\2\2\u00a3\u00a6\5\f\7\2\u00a4\u00a6\5\16\b"+
		"\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00a9"+
		"\5r:\2\u00a8\u00aa\5x=\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00ad\5v<\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2"+
		"\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\5t;\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5z>\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b7\5"+
		"\30\r\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\7)\2\2\u00b9\r\3\2\2\2\u00ba\u00bc\5r:\2\u00bb\u00bd\5x=\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00c0\5v"+
		"<\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00c3\5t;\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2"+
		"\2\u00c4\u00c6\5z>\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\7\5\2\2\u00c8\u00c9\5\24\13\2\u00c9\u00ca\7\6\2\2"+
		"\u00ca\u00cb\5\20\t\2\u00cb\17\3\2\2\2\u00cc\u00cf\5l\67\2\u00cd\u00cf"+
		"\5\22\n\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\21\3\2\2\2\u00d0"+
		"\u00d1\7\61\2\2\u00d1\u00d2\5@!\2\u00d2\u00d3\7\62\2\2\u00d3\23\3\2\2"+
		"\2\u00d4\u00d9\5\26\f\2\u00d5\u00d6\7\4\2\2\u00d6\u00d8\5\26\f\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\25\3\2\2\2\u00de\u00df\5t;\2\u00df\u00e0\5z>\2\u00e0"+
		"\27\3\2\2\2\u00e1\u00e2\5\32\16\2\u00e2\31\3\2\2\2\u00e3\u00e4\5z>\2\u00e4"+
		"\u00e5\5\34\17\2\u00e5\u00e6\5\32\16\2\u00e6\u00e9\3\2\2\2\u00e7\u00e9"+
		"\5\36\20\2\u00e8\u00e3\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\33\3\2\2\2\u00ea"+
		"\u00eb\t\2\2\2\u00eb\35\3\2\2\2\u00ec\u00f2\5\"\22\2\u00ed\u00ee\5 \21"+
		"\2\u00ee\u00ef\5\"\22\2\u00ef\u00f1\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\37\3\2\2"+
		"\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\t\3\2\2\u00f6!\3\2\2\2\u00f7\u00fd"+
		"\5&\24\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\5&\24\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f8\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe#\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\t\4\2\2\u0101%\3\2"+
		"\2\2\u0102\u0108\5*\26\2\u0103\u0104\5(\25\2\u0104\u0105\5*\26\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\'\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c"+
		"\t\5\2\2\u010c)\3\2\2\2\u010d\u0113\5.\30\2\u010e\u010f\5,\27\2\u010f"+
		"\u0110\5.\30\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114+\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0117\t\6\2\2\u0117-\3\2\2\2\u0118\u0122\5\66\34\2\u0119"+
		"\u0122\5b\62\2\u011a\u0122\5:\36\2\u011b\u0122\5\64\33\2\u011c\u0122\5"+
		"F$\2\u011d\u0122\5H%\2\u011e\u0122\5J&\2\u011f\u0122\5L\'\2\u0120\u0122"+
		"\5\60\31\2\u0121\u0118\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011a\3\2\2\2"+
		"\u0121\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\5\62\32\2\u0124/\3\2\2\2\u0125\u0126\7\5\2\2\u0126\u0127\5\30\r"+
		"\2\u0127\u0128\7\6\2\2\u0128\61\3\2\2\2\u0129\u012c\7+\2\2\u012a\u012d"+
		"\5:\36\2\u012b\u012d\5\66\34\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012f\3\2\2\2\u012e\u0129\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\63\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\7\33\2\2\u0134\65\3\2\2\2\u0135\u0136\5z>\2\u0136\u0137\7\5\2\2"+
		"\u0137\u0138\58\35\2\u0138\u0139\7\6\2\2\u0139\67\3\2\2\2\u013a\u013f"+
		"\5\30\r\2\u013b\u013c\7\4\2\2\u013c\u013e\5\30\r\2\u013d\u013b\3\2\2\2"+
		"\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u013a\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"9\3\2\2\2\u0144\u0147\5<\37\2\u0145\u0147\5> \2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147;\3\2\2\2\u0148\u0149\5z>\2\u0149=\3\2\2\2\u014a\u014b"+
		"\7*\2\2\u014b\u014c\5\30\r\2\u014c?\3\2\2\2\u014d\u014f\5B\"\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"A\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0159\5l\67\2\u0154\u0159\5D#\2\u0155"+
		"\u0156\5Z.\2\u0156\u0157\7)\2\2\u0157\u0159\3\2\2\2\u0158\u0153\3\2\2"+
		"\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0159C\3\2\2\2\u015a\u015e"+
		"\5N(\2\u015b\u015e\5V,\2\u015c\u015e\5X-\2\u015d\u015a\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015c\3\2\2\2\u015eE\3\2\2\2\u015f\u0160\7\3\2\2\u0160"+
		"G\3\2\2\2\u0161\u0167\7\t\2\2\u0162\u0168\5\30\r\2\u0163\u0164\7\61\2"+
		"\2\u0164\u0165\5@!\2\u0165\u0166\7\62\2\2\u0166\u0168\3\2\2\2\u0167\u0162"+
		"\3\2\2\2\u0167\u0163\3\2\2\2\u0168I\3\2\2\2\u0169\u016e\7\n\2\2\u016a"+
		"\u016f\5\30\r\2\u016b\u016f\5D#\2\u016c\u016f\5Z.\2\u016d\u016f\5\22\n"+
		"\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d"+
		"\3\2\2\2\u016fK\3\2\2\2\u0170\u0171\7\34\2\2\u0171\u0172\5t;\2\u0172\u017b"+
		"\7\5\2\2\u0173\u0178\5\30\r\2\u0174\u0175\7\4\2\2\u0175\u0177\5\30\r\2"+
		"\u0176\u0174\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0173\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\6\2\2\u017eM\3\2\2\2"+
		"\u017f\u0185\5P)\2\u0180\u0182\5R*\2\u0181\u0183\5T+\2\u0182\u0181\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0186\5T+\2\u0185\u0180"+
		"\3\2\2\2\u0185\u0184\3\2\2\2\u0186O\3\2\2\2\u0187\u0188\7\35\2\2\u0188"+
		"\u0189\7\61\2\2\u0189\u018a\5@!\2\u018a\u018b\7\62\2\2\u018bQ\3\2\2\2"+
		"\u018c\u018d\7\36\2\2\u018d\u018e\7\5\2\2\u018e\u018f\5\26\f\2\u018f\u0190"+
		"\7\6\2\2\u0190\u0191\7\61\2\2\u0191\u0192\5@!\2\u0192\u0193\7\62\2\2\u0193"+
		"S\3\2\2\2\u0194\u0195\7\37\2\2\u0195\u0196\7\61\2\2\u0196\u0197\5@!\2"+
		"\u0197\u0198\7\62\2\2\u0198U\3\2\2\2\u0199\u019a\7 \2\2\u019a\u019b\7"+
		"\5\2\2\u019b\u019c\5\30\r\2\u019c\u019d\7\6\2\2\u019d\u01a0\5n8\2\u019e"+
		"\u019f\7!\2\2\u019f\u01a1\5n8\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2"+
		"\2\u01a1W\3\2\2\2\u01a2\u01a3\7\'\2\2\u01a3\u01a4\7\5\2\2\u01a4\u01a5"+
		"\5\30\r\2\u01a5\u01a6\7\6\2\2\u01a6\u01a7\5n8\2\u01a7Y\3\2\2\2\u01a8\u01ad"+
		"\5^\60\2\u01a9\u01ad\5`\61\2\u01aa\u01ad\5\\/\2\u01ab\u01ad\5\30\r\2\u01ac"+
		"\u01a8\3\2\2\2\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2"+
		"\2\2\u01ad[\3\2\2\2\u01ae\u01af\5t;\2\u01af\u01b2\5z>\2\u01b0\u01b1\7"+
		"\25\2\2\u01b1\u01b3\5\30\r\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"]\3\2\2\2\u01b4\u01b5\7\"\2\2\u01b5\u01b6\5\30\r\2\u01b6_\3\2\2\2\u01b7"+
		"\u01b8\7#\2\2\u01b8\u01b9\5\30\r\2\u01b9a\3\2\2\2\u01ba\u01bf\5d\63\2"+
		"\u01bb\u01bf\5f\64\2\u01bc\u01bf\5h\65\2\u01bd\u01bf\5j\66\2\u01be\u01ba"+
		"\3\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf"+
		"c\3\2\2\2\u01c0\u01c1\7\65\2\2\u01c1e\3\2\2\2\u01c2\u01c3\7\63\2\2\u01c3"+
		"g\3\2\2\2\u01c4\u01c5\7\64\2\2\u01c5i\3\2\2\2\u01c6\u01c7\t\7\2\2\u01c7"+
		"k\3\2\2\2\u01c8\u01c9\7\t\2\2\u01c9\u01ca\7\61\2\2\u01ca\u01cb\5@!\2\u01cb"+
		"\u01cc\7\62\2\2\u01ccm\3\2\2\2\u01cd\u01ce\7\61\2\2\u01ce\u01cf\5@!\2"+
		"\u01cf\u01d0\7\62\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01d3\5B\"\2\u01d2\u01cd"+
		"\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3o\3\2\2\2\u01d4\u01d6\7\b\2\2\u01d5"+
		"\u01d7\7\13\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3"+
		"\2\2\2\u01d8\u01d9\5t;\2\u01d9q\3\2\2\2\u01da\u01dc\5p9\2\u01db\u01da"+
		"\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"s\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e5\5z>\2\u01e1\u01e2\7+\2\2\u01e2"+
		"\u01e4\5z>\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2"+
		"\2\u01e5\u01e6\3\2\2\2\u01e6u\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9"+
		"\7/\2\2\u01e9w\3\2\2\2\u01ea\u01eb\t\b\2\2\u01eby\3\2\2\2\u01ec\u01ed"+
		"\7\60\2\2\u01ed{\3\2\2\2\62\177\u0085\u0089\u008d\u0093\u0098\u009f\u00a5"+
		"\u00a9\u00ac\u00af\u00b2\u00b6\u00bc\u00bf\u00c2\u00c5\u00ce\u00d9\u00dc"+
		"\u00e8\u00f2\u00fd\u0108\u0113\u0121\u012c\u0130\u013f\u0142\u0146\u0150"+
		"\u0158\u015d\u0167\u016e\u0178\u017b\u0182\u0185\u01a0\u01ac\u01b2\u01be"+
		"\u01d2\u01d6\u01dd\u01e5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}