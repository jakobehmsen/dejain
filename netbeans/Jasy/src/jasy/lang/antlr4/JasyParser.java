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
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, HAT=5, AT=6, INC=7, DEC=8, 
		TILDE=9, EXCLA=10, DOLLAR=11, HASH=12, PLUS=13, MINUS=14, MULT=15, DIV=16, 
		REM=17, LT=18, LTE=19, GT=20, GTE=21, EQUALS=22, NOT_EQUALS=23, ASSIGN_OP=24, 
		ASSIGN_ADD=25, ASSIGN_SUB=26, ASSIGN_MULT=27, ASSIGN_DIV=28, REPLACE_OP=29, 
		KW_THIS_RESULT=30, KW_NEW=31, KW_TRY=32, KW_CATCH=33, KW_FINALLY=34, KW_IF=35, 
		KW_ELSE=36, KW_RETURN=37, KW_THROW=38, KW_CLASS=39, KW_TRUE=40, KW_FALSE=41, 
		KW_WHILE=42, KW_FOR=43, WILD_CARD=44, SEMI_COLON=45, COLON=46, DOT=47, 
		ACC_MOD_PUBLIC=48, ACC_MOD_PRIVATE=49, ACC_MOD_PROTECTED=50, MOD_STATIC=51, 
		ID=52, OPEN_BRA=53, CLOSE_BRA=54, INTEGER=55, LONG=56, STRING=57, WS=58, 
		SINGLELINE_COMMENT=59, MULTI_LINE_COMMENT=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'...'", "','", "'('", "')'", "'^'", "'@'", "'++'", "'--'", 
		"'~'", "'!'", "'$'", "'#'", "'+'", "'-'", "MULT", "'/'", "'%'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'!='", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'=>'", "'thisResult'", "'new'", "'try'", "'catch'", "'finally'", 
		"'if'", "'else'", "'return'", "'throw'", "'class'", "'true'", "'false'", 
		"'while'", "'for'", "WILD_CARD", "';'", "':'", "'.'", "'public'", "'private'", 
		"'protected'", "'static'", "ID", "'{'", "'}'", "INTEGER", "LONG", "STRING", 
		"WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
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
		RULE_unaryPrefixExpression = 22, RULE_unaryPrefixOperator = 23, RULE_unaryPostfixExpression = 24, 
		RULE_unaryPostfixOperator = 25, RULE_leafExpression = 26, RULE_embeddedExpression = 27, 
		RULE_leafExpressionChain = 28, RULE_thisResult = 29, RULE_invocation = 30, 
		RULE_arguments = 31, RULE_lookup = 32, RULE_unqualifiedLookup = 33, RULE_qualifiedLookup = 34, 
		RULE_statements = 35, RULE_statement = 36, RULE_nonDelimitedStatement = 37, 
		RULE_proceedStatement = 38, RULE_metaExpression = 39, RULE_quotedExpression = 40, 
		RULE_newExpression = 41, RULE_tryCatchStatement = 42, RULE_tryStatement = 43, 
		RULE_catchStatement = 44, RULE_finallyStatement = 45, RULE_ifElseStatement = 46, 
		RULE_whileStatement = 47, RULE_forStatement = 48, RULE_commaBlock = 49, 
		RULE_delimitedStatement = 50, RULE_variableDeclaration = 51, RULE_returnStatement = 52, 
		RULE_throwStatement = 53, RULE_literal = 54, RULE_stringLiteral = 55, 
		RULE_integerLiteral = 56, RULE_longLiteral = 57, RULE_booleanLiteral = 58, 
		RULE_metaBlock = 59, RULE_singleOrMultiStatement = 60, RULE_annotation = 61, 
		RULE_annotations = 62, RULE_typeQualifier = 63, RULE_modStatic = 64, RULE_accessModifier = 65, 
		RULE_identifier = 66;
	public static final String[] ruleNames = {
		"program", "classTransformer", "classTransformerMembers", "classTransformerMemberDefinition", 
		"classTransformerMember", "classTransformerMemberField", "classTransformerMemberMethod", 
		"classTransformerMemberMethodBlody", "block", "parameters", "parameter", 
		"expression", "variableAssignment", "assignmentOperator", "equalityExpression", 
		"equalityOperator", "relationalExpression", "relationalOperator", "additiveExpression", 
		"additiveOperator", "multiplicativeExpression", "multiplicativeOperator", 
		"unaryPrefixExpression", "unaryPrefixOperator", "unaryPostfixExpression", 
		"unaryPostfixOperator", "leafExpression", "embeddedExpression", "leafExpressionChain", 
		"thisResult", "invocation", "arguments", "lookup", "unqualifiedLookup", 
		"qualifiedLookup", "statements", "statement", "nonDelimitedStatement", 
		"proceedStatement", "metaExpression", "quotedExpression", "newExpression", 
		"tryCatchStatement", "tryStatement", "catchStatement", "finallyStatement", 
		"ifElseStatement", "whileStatement", "forStatement", "commaBlock", "delimitedStatement", 
		"variableDeclaration", "returnStatement", "throwStatement", "literal", 
		"stringLiteral", "integerLiteral", "longLiteral", "booleanLiteral", "metaBlock", 
		"singleOrMultiStatement", "annotation", "annotations", "typeQualifier", 
		"modStatic", "accessModifier", "identifier"
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_CLASS) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << ID))) != 0)) {
				{
				{
				setState(134); classTransformer();
				}
				}
				setState(139);
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
			setState(143);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(140); ((ClassTransformerContext)_localctx).variableId = identifier();
				setState(141); match(ASSIGN_OP);
				}
			}

			setState(145); annotations();
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(146); accessModifier();
				}
			}

			setState(149); match(KW_CLASS);
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(150); typeQualifier();
				}
				break;
			}
			setState(157);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(153); match(OPEN_BRA);
				setState(154); ((ClassTransformerContext)_localctx).members = classTransformerMembers();
				setState(155); match(CLOSE_BRA);
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
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << AT) | (1L << PLUS) | (1L << ASSIGN_OP) | (1L << SEMI_COLON) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << MOD_STATIC) | (1L << ID))) != 0)) {
				{
				{
				setState(159); classTransformerMemberDefinition();
				}
				}
				setState(164);
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
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(165); match(PLUS);
				}
				break;

			case 2:
				{
				{
				setState(166); ((ClassTransformerMemberDefinitionContext)_localctx).variableId = identifier();
				setState(167); match(ASSIGN_OP);
				}
				}
				break;
			}
			setState(171); ((ClassTransformerMemberDefinitionContext)_localctx).member = classTransformerMember();
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
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); classTransformerMemberField();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); classTransformerMemberMethod();
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
			setState(177); annotations();
			setState(179);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(178); accessModifier();
				}
			}

			setState(182);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(181); modStatic();
				}
			}

			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(184); typeQualifier();
				}
				break;
			}
			setState(188);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(187); identifier();
				}
			}

			setState(192);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(190); match(ASSIGN_OP);
				setState(191); ((ClassTransformerMemberFieldContext)_localctx).value = expression();
				}
			}

			setState(194); match(SEMI_COLON);
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
			setState(196); annotations();
			setState(198);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(197); accessModifier();
				}
			}

			setState(201);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(200); modStatic();
				}
			}

			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(203); typeQualifier();
				}
				break;
			}
			setState(207);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(206); identifier();
				}
			}

			setState(209); match(OPEN_PAR);
			setState(210); parameters();
			setState(211); match(CLOSE_PAR);
			setState(212); ((ClassTransformerMemberMethodContext)_localctx).body = classTransformerMemberMethodBlody();
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
			setState(216);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); metaBlock();
				}
				break;
			case OPEN_BRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); block();
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
			setState(218); match(OPEN_BRA);
			setState(219); statements();
			setState(220); match(CLOSE_BRA);
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
			setState(230);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(222); parameter();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(223); match(COMMA);
					setState(224); parameter();
					}
					}
					setState(229);
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
			setState(232); typeQualifier();
			setState(233); identifier();
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
			setState(235); variableAssignment();
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
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); identifier();
				setState(238); assignmentOperator();
				setState(239); ((VariableAssignmentContext)_localctx).value = variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241); equalityExpression();
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
			setState(244);
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
			setState(246); ((EqualityExpressionContext)_localctx).first = relationalExpression();
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(247); equalityOperator();
					setState(248); ((EqualityExpressionContext)_localctx).rest = relationalExpression();
					}
					} 
				}
				setState(254);
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
			setState(255);
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
			setState(257); ((RelationalExpressionContext)_localctx).first = additiveExpression();
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(258); relationalOperator();
					setState(259); ((RelationalExpressionContext)_localctx).rest = additiveExpression();
					}
					} 
				}
				setState(265);
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
			setState(266);
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
			setState(268); ((AdditiveExpressionContext)_localctx).first = multiplicativeExpression();
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(269); additiveOperator();
					setState(270); ((AdditiveExpressionContext)_localctx).rest = multiplicativeExpression();
					}
					} 
				}
				setState(276);
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
			setState(277);
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
		public UnaryPrefixExpressionContext first;
		public UnaryPrefixExpressionContext rest;
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public UnaryPrefixExpressionContext unaryPrefixExpression(int i) {
			return getRuleContext(UnaryPrefixExpressionContext.class,i);
		}
		public List<UnaryPrefixExpressionContext> unaryPrefixExpression() {
			return getRuleContexts(UnaryPrefixExpressionContext.class);
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
			setState(279); ((MultiplicativeExpressionContext)_localctx).first = unaryPrefixExpression();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(280); multiplicativeOperator();
					setState(281); ((MultiplicativeExpressionContext)_localctx).rest = unaryPrefixExpression();
					}
					} 
				}
				setState(287);
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
		public TerminalNode REM() { return getToken(JasyParser.REM, 0); }
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
			setState(288);
			((MultiplicativeOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << REM))) != 0)) ) {
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

	public static class UnaryPrefixExpressionContext extends ParserRuleContext {
		public UnaryPrefixExpressionContext operand;
		public UnaryPrefixOperatorContext unaryPrefixOperator() {
			return getRuleContext(UnaryPrefixOperatorContext.class,0);
		}
		public UnaryPrefixExpressionContext unaryPrefixExpression() {
			return getRuleContext(UnaryPrefixExpressionContext.class,0);
		}
		public UnaryPostfixExpressionContext unaryPostfixExpression() {
			return getRuleContext(UnaryPostfixExpressionContext.class,0);
		}
		public UnaryPrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPrefixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitUnaryPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPrefixExpressionContext unaryPrefixExpression() throws RecognitionException {
		UnaryPrefixExpressionContext _localctx = new UnaryPrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryPrefixExpression);
		try {
			setState(294);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
			case TILDE:
			case EXCLA:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(290); unaryPrefixOperator();
				setState(291); ((UnaryPrefixExpressionContext)_localctx).operand = unaryPrefixExpression();
				}
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(293); unaryPostfixExpression();
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

	public static class UnaryPrefixOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode DEC() { return getToken(JasyParser.DEC, 0); }
		public TerminalNode INC() { return getToken(JasyParser.INC, 0); }
		public TerminalNode EXCLA() { return getToken(JasyParser.EXCLA, 0); }
		public TerminalNode PLUS() { return getToken(JasyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JasyParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(JasyParser.TILDE, 0); }
		public UnaryPrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPrefixOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitUnaryPrefixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPrefixOperatorContext unaryPrefixOperator() throws RecognitionException {
		UnaryPrefixOperatorContext _localctx = new UnaryPrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unaryPrefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((UnaryPrefixOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << TILDE) | (1L << EXCLA) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				((UnaryPrefixOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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

	public static class UnaryPostfixExpressionContext extends ParserRuleContext {
		public LeafExpressionContext leafExpression() {
			return getRuleContext(LeafExpressionContext.class,0);
		}
		public UnaryPostfixOperatorContext unaryPostfixOperator() {
			return getRuleContext(UnaryPostfixOperatorContext.class,0);
		}
		public UnaryPostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPostfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitUnaryPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPostfixExpressionContext unaryPostfixExpression() throws RecognitionException {
		UnaryPostfixExpressionContext _localctx = new UnaryPostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryPostfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); leafExpression();
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(299); unaryPostfixOperator();
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

	public static class UnaryPostfixOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode DEC() { return getToken(JasyParser.DEC, 0); }
		public TerminalNode INC() { return getToken(JasyParser.INC, 0); }
		public UnaryPostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryPostfixOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitUnaryPostfixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryPostfixOperatorContext unaryPostfixOperator() throws RecognitionException {
		UnaryPostfixOperatorContext _localctx = new UnaryPostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryPostfixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			((UnaryPostfixOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
				((UnaryPostfixOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 52, RULE_leafExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(304); invocation();
				}
				break;

			case 2:
				{
				setState(305); literal();
				}
				break;

			case 3:
				{
				setState(306); lookup();
				}
				break;

			case 4:
				{
				setState(307); thisResult();
				}
				break;

			case 5:
				{
				setState(308); proceedStatement();
				}
				break;

			case 6:
				{
				setState(309); metaExpression();
				}
				break;

			case 7:
				{
				setState(310); quotedExpression();
				}
				break;

			case 8:
				{
				setState(311); newExpression();
				}
				break;

			case 9:
				{
				setState(312); embeddedExpression();
				}
				break;
			}
			setState(315); leafExpressionChain();
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
		enterRule(_localctx, 54, RULE_embeddedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(OPEN_PAR);
			setState(318); expression();
			setState(319); match(CLOSE_PAR);
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
		enterRule(_localctx, 56, RULE_leafExpressionChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(321); match(DOT);
					setState(324);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(322); lookup();
						}
						break;

					case 2:
						{
						setState(323); invocation();
						}
						break;
					}
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 58, RULE_thisResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(KW_THIS_RESULT);
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
		enterRule(_localctx, 60, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); identifier();
			setState(334); match(OPEN_PAR);
			setState(335); arguments();
			setState(336); match(CLOSE_PAR);
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
		enterRule(_localctx, 62, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << INC) | (1L << DEC) | (1L << TILDE) | (1L << EXCLA) | (1L << DOLLAR) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(338); expression();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(339); match(COMMA);
					setState(340); expression();
					}
					}
					setState(345);
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
		enterRule(_localctx, 64, RULE_lookup);
		try {
			setState(350);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(348); unqualifiedLookup();
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(349); qualifiedLookup();
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
		enterRule(_localctx, 66, RULE_unqualifiedLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); identifier();
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
		enterRule(_localctx, 68, RULE_qualifiedLookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(COLON);
			setState(355); expression();
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
		enterRule(_localctx, 70, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << INC) | (1L << DEC) | (1L << TILDE) | (1L << EXCLA) | (1L << DOLLAR) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_WHILE) | (1L << KW_FOR) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				{
				setState(357); statement();
				}
				}
				setState(362);
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
		enterRule(_localctx, 72, RULE_statement);
		try {
			setState(368);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363); metaBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364); nonDelimitedStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365); delimitedStatement();
				setState(366); match(SEMI_COLON);
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
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
		enterRule(_localctx, 74, RULE_nonDelimitedStatement);
		try {
			setState(374);
			switch (_input.LA(1)) {
			case KW_TRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(370); tryCatchStatement();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(371); ifElseStatement();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(372); whileStatement();
				}
				break;
			case KW_FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(373); forStatement();
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
		enterRule(_localctx, 76, RULE_proceedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); match(ELLIPSES);
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
		enterRule(_localctx, 78, RULE_metaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); match(DOLLAR);
			setState(384);
			switch (_input.LA(1)) {
			case ELLIPSES:
			case OPEN_PAR:
			case INC:
			case DEC:
			case TILDE:
			case EXCLA:
			case DOLLAR:
			case HASH:
			case PLUS:
			case MINUS:
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
				setState(379); expression();
				}
				break;
			case OPEN_BRA:
				{
				setState(380); match(OPEN_BRA);
				setState(381); statements();
				setState(382); match(CLOSE_BRA);
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
		enterRule(_localctx, 80, RULE_quotedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(HASH);
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(387); expression();
				}
				break;

			case 2:
				{
				setState(388); nonDelimitedStatement();
				}
				break;

			case 3:
				{
				setState(389); delimitedStatement();
				}
				break;

			case 4:
				{
				setState(390); block();
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
		enterRule(_localctx, 82, RULE_newExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(KW_NEW);
			setState(394); ((NewExpressionContext)_localctx).className = typeQualifier();
			setState(395); match(OPEN_PAR);
			setState(404);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << INC) | (1L << DEC) | (1L << TILDE) | (1L << EXCLA) | (1L << DOLLAR) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(396); expression();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(397); match(COMMA);
					setState(398); expression();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(406); match(CLOSE_PAR);
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
		enterRule(_localctx, 84, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); tryStatement();
			setState(414);
			switch (_input.LA(1)) {
			case KW_CATCH:
				{
				{
				setState(409); catchStatement();
				setState(411);
				_la = _input.LA(1);
				if (_la==KW_FINALLY) {
					{
					setState(410); finallyStatement();
					}
				}

				}
				}
				break;
			case KW_FINALLY:
				{
				setState(413); finallyStatement();
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
		enterRule(_localctx, 86, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(KW_TRY);
			setState(417); match(OPEN_BRA);
			setState(418); statements();
			setState(419); match(CLOSE_BRA);
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
		enterRule(_localctx, 88, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(KW_CATCH);
			setState(422); match(OPEN_PAR);
			setState(423); parameter();
			setState(424); match(CLOSE_PAR);
			setState(425); match(OPEN_BRA);
			setState(426); statements();
			setState(427); match(CLOSE_BRA);
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
		enterRule(_localctx, 90, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); match(KW_FINALLY);
			setState(430); match(OPEN_BRA);
			setState(431); statements();
			setState(432); match(CLOSE_BRA);
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
		enterRule(_localctx, 92, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(KW_IF);
			setState(435); match(OPEN_PAR);
			setState(436); ((IfElseStatementContext)_localctx).condition = expression();
			setState(437); match(CLOSE_PAR);
			setState(438); ((IfElseStatementContext)_localctx).ifTrueBlock = singleOrMultiStatement();
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(439); match(KW_ELSE);
				setState(440); ((IfElseStatementContext)_localctx).ifFalseBlock = singleOrMultiStatement();
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
		enterRule(_localctx, 94, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(KW_WHILE);
			setState(444); match(OPEN_PAR);
			setState(445); ((WhileStatementContext)_localctx).condition = expression();
			setState(446); match(CLOSE_PAR);
			setState(447); ((WhileStatementContext)_localctx).whileTrueBlock = singleOrMultiStatement();
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
		public CommaBlockContext initialization;
		public ExpressionContext condition;
		public CommaBlockContext update;
		public SingleOrMultiStatementContext whileTrueBlock;
		public List<CommaBlockContext> commaBlock() {
			return getRuleContexts(CommaBlockContext.class);
		}
		public TerminalNode KW_FOR() { return getToken(JasyParser.KW_FOR, 0); }
		public SingleOrMultiStatementContext singleOrMultiStatement() {
			return getRuleContext(SingleOrMultiStatementContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(JasyParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(JasyParser.SEMI_COLON, i);
		}
		public CommaBlockContext commaBlock(int i) {
			return getRuleContext(CommaBlockContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(KW_FOR);
			setState(450); match(OPEN_PAR);
			setState(452);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << INC) | (1L << DEC) | (1L << TILDE) | (1L << EXCLA) | (1L << DOLLAR) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(451); ((ForStatementContext)_localctx).initialization = commaBlock();
				}
			}

			setState(454); match(SEMI_COLON);
			setState(456);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << INC) | (1L << DEC) | (1L << TILDE) | (1L << EXCLA) | (1L << DOLLAR) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(455); ((ForStatementContext)_localctx).condition = expression();
				}
			}

			setState(458); match(SEMI_COLON);
			setState(460);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << INC) | (1L << DEC) | (1L << TILDE) | (1L << EXCLA) | (1L << DOLLAR) | (1L << HASH) | (1L << PLUS) | (1L << MINUS) | (1L << KW_THIS_RESULT) | (1L << KW_NEW) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << COLON) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(459); ((ForStatementContext)_localctx).update = commaBlock();
				}
			}

			setState(462); match(CLOSE_PAR);
			setState(463); ((ForStatementContext)_localctx).whileTrueBlock = singleOrMultiStatement();
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

	public static class CommaBlockContext extends ParserRuleContext {
		public DelimitedStatementContext delimitedStatement(int i) {
			return getRuleContext(DelimitedStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasyParser.COMMA); }
		public List<DelimitedStatementContext> delimitedStatement() {
			return getRuleContexts(DelimitedStatementContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(JasyParser.COMMA, i);
		}
		public CommaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitCommaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaBlockContext commaBlock() throws RecognitionException {
		CommaBlockContext _localctx = new CommaBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_commaBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(465); delimitedStatement();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(466); match(COMMA);
				setState(467); delimitedStatement();
				}
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 100, RULE_delimitedStatement);
		try {
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473); returnStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474); throwStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475); variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476); expression();
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
		enterRule(_localctx, 102, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); typeQualifier();
			setState(480); ((VariableDeclarationContext)_localctx).id = identifier();
			setState(483);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(481); match(ASSIGN_OP);
				setState(482); ((VariableDeclarationContext)_localctx).value = expression();
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
		enterRule(_localctx, 104, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); match(KW_RETURN);
			setState(486); expression();
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
		enterRule(_localctx, 106, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); match(KW_THROW);
			setState(489); expression();
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
		enterRule(_localctx, 108, RULE_literal);
		try {
			setState(495);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(491); stringLiteral();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(492); integerLiteral();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 3);
				{
				setState(493); longLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(494); booleanLiteral();
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
		enterRule(_localctx, 110, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(STRING);
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
		enterRule(_localctx, 112, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(INTEGER);
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
		enterRule(_localctx, 114, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); match(LONG);
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
		enterRule(_localctx, 116, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		enterRule(_localctx, 118, RULE_metaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); match(DOLLAR);
			setState(506); match(OPEN_BRA);
			setState(507); statements();
			setState(508); match(CLOSE_BRA);
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
		enterRule(_localctx, 120, RULE_singleOrMultiStatement);
		try {
			setState(515);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(510); match(OPEN_BRA);
				setState(511); statements();
				setState(512); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
			case INC:
			case DEC:
			case TILDE:
			case EXCLA:
			case DOLLAR:
			case HASH:
			case PLUS:
			case MINUS:
			case KW_THIS_RESULT:
			case KW_NEW:
			case KW_TRY:
			case KW_IF:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case KW_WHILE:
			case KW_FOR:
			case COLON:
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(514); statement();
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
		enterRule(_localctx, 122, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); match(AT);
			setState(519);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(518); match(PLUS);
				}
			}

			setState(521); typeQualifier();
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
		enterRule(_localctx, 124, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(523); annotation();
				}
				}
				setState(528);
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
		enterRule(_localctx, 126, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); identifier();
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(530); match(DOT);
				setState(531); identifier();
				}
				}
				setState(536);
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
		enterRule(_localctx, 128, RULE_modStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); match(MOD_STATIC);
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
		enterRule(_localctx, 130, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
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
		enterRule(_localctx, 132, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(ID);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3>\u0222\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\7\2\u008a\n\2\f\2\16\2"+
		"\u008d\13\2\3\3\3\3\3\3\5\3\u0092\n\3\3\3\3\3\5\3\u0096\n\3\3\3\3\3\5"+
		"\3\u009a\n\3\3\3\3\3\3\3\3\3\5\3\u00a0\n\3\3\4\7\4\u00a3\n\4\f\4\16\4"+
		"\u00a6\13\4\3\5\3\5\3\5\3\5\5\5\u00ac\n\5\3\5\3\5\3\6\3\6\5\6\u00b2\n"+
		"\6\3\7\3\7\5\7\u00b6\n\7\3\7\5\7\u00b9\n\7\3\7\5\7\u00bc\n\7\3\7\5\7\u00bf"+
		"\n\7\3\7\3\7\5\7\u00c3\n\7\3\7\3\7\3\b\3\b\5\b\u00c9\n\b\3\b\5\b\u00cc"+
		"\n\b\3\b\5\b\u00cf\n\b\3\b\5\b\u00d2\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5"+
		"\t\u00db\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00e4\n\13\f\13\16\13"+
		"\u00e7\13\13\5\13\u00e9\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00f5\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00fd\n\20\f\20"+
		"\16\20\u0100\13\20\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0108\n\22\f\22"+
		"\16\22\u010b\13\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0113\n\24\f\24"+
		"\16\24\u0116\13\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u011e\n\26\f\26"+
		"\16\26\u0121\13\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0129\n\30\3\31"+
		"\3\31\3\32\3\32\5\32\u012f\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u013c\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\5\36\u0147\n\36\7\36\u0149\n\36\f\36\16\36\u014c\13\36\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\7!\u0158\n!\f!\16!\u015b\13!\5!\u015d\n!\3\""+
		"\3\"\5\"\u0161\n\"\3#\3#\3$\3$\3$\3%\7%\u0169\n%\f%\16%\u016c\13%\3&\3"+
		"&\3&\3&\3&\5&\u0173\n&\3\'\3\'\3\'\3\'\5\'\u0179\n\'\3(\3(\3)\3)\3)\3"+
		")\3)\3)\5)\u0183\n)\3*\3*\3*\3*\3*\5*\u018a\n*\3+\3+\3+\3+\3+\3+\7+\u0192"+
		"\n+\f+\16+\u0195\13+\5+\u0197\n+\3+\3+\3,\3,\3,\5,\u019e\n,\3,\5,\u01a1"+
		"\n,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u01bc\n\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\5\62\u01c7\n\62\3\62\3\62\5\62\u01cb\n\62\3\62\3\62\5"+
		"\62\u01cf\n\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u01d7\n\63\f\63\16\63"+
		"\u01da\13\63\3\64\3\64\3\64\3\64\5\64\u01e0\n\64\3\65\3\65\3\65\3\65\5"+
		"\65\u01e6\n\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\58\u01f2\n8\3"+
		"9\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\5>\u0206\n>\3?\3"+
		"?\5?\u020a\n?\3?\3?\3@\7@\u020f\n@\f@\16@\u0212\13@\3A\3A\3A\7A\u0217"+
		"\nA\fA\16A\u021a\13A\3B\3B\3C\3C\3D\3D\3D\2E\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\2\13\3\2\32\36\3\2\30\31\3\2\24\27\3\2\17\20"+
		"\3\2\21\23\4\2\t\f\17\20\3\2\t\n\3\2*+\3\2\62\64\u0225\2\u008b\3\2\2\2"+
		"\4\u0091\3\2\2\2\6\u00a4\3\2\2\2\b\u00ab\3\2\2\2\n\u00b1\3\2\2\2\f\u00b3"+
		"\3\2\2\2\16\u00c6\3\2\2\2\20\u00da\3\2\2\2\22\u00dc\3\2\2\2\24\u00e8\3"+
		"\2\2\2\26\u00ea\3\2\2\2\30\u00ed\3\2\2\2\32\u00f4\3\2\2\2\34\u00f6\3\2"+
		"\2\2\36\u00f8\3\2\2\2 \u0101\3\2\2\2\"\u0103\3\2\2\2$\u010c\3\2\2\2&\u010e"+
		"\3\2\2\2(\u0117\3\2\2\2*\u0119\3\2\2\2,\u0122\3\2\2\2.\u0128\3\2\2\2\60"+
		"\u012a\3\2\2\2\62\u012c\3\2\2\2\64\u0130\3\2\2\2\66\u013b\3\2\2\28\u013f"+
		"\3\2\2\2:\u014a\3\2\2\2<\u014d\3\2\2\2>\u014f\3\2\2\2@\u015c\3\2\2\2B"+
		"\u0160\3\2\2\2D\u0162\3\2\2\2F\u0164\3\2\2\2H\u016a\3\2\2\2J\u0172\3\2"+
		"\2\2L\u0178\3\2\2\2N\u017a\3\2\2\2P\u017c\3\2\2\2R\u0184\3\2\2\2T\u018b"+
		"\3\2\2\2V\u019a\3\2\2\2X\u01a2\3\2\2\2Z\u01a7\3\2\2\2\\\u01af\3\2\2\2"+
		"^\u01b4\3\2\2\2`\u01bd\3\2\2\2b\u01c3\3\2\2\2d\u01d3\3\2\2\2f\u01df\3"+
		"\2\2\2h\u01e1\3\2\2\2j\u01e7\3\2\2\2l\u01ea\3\2\2\2n\u01f1\3\2\2\2p\u01f3"+
		"\3\2\2\2r\u01f5\3\2\2\2t\u01f7\3\2\2\2v\u01f9\3\2\2\2x\u01fb\3\2\2\2z"+
		"\u0205\3\2\2\2|\u0207\3\2\2\2~\u0210\3\2\2\2\u0080\u0213\3\2\2\2\u0082"+
		"\u021b\3\2\2\2\u0084\u021d\3\2\2\2\u0086\u021f\3\2\2\2\u0088\u008a\5\4"+
		"\3\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\3\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\u0086"+
		"D\2\u008f\u0090\7\32\2\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\5~@\2\u0094\u0096\5\u0084"+
		"C\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\7)\2\2\u0098\u009a\5\u0080A\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009f\3\2\2\2\u009b\u009c\7\67\2\2\u009c\u009d\5\6\4\2\u009d"+
		"\u009e\78\2\2\u009e\u00a0\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\5\3\2\2\2\u00a1\u00a3\5\b\5\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00ac\7\17\2\2\u00a8\u00a9\5\u0086D\2\u00a9\u00aa"+
		"\7\32\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5\n\6\2\u00ae\t\3"+
		"\2\2\2\u00af\u00b2\5\f\7\2\u00b0\u00b2\5\16\b\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00b5\5~@\2\u00b4\u00b6\5\u0084"+
		"C\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b9\5\u0082B\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00bc\5\u0080A\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2"+
		"\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5\u0086D\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c1\7\32\2\2\u00c1\u00c3\5"+
		"\30\r\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\7/\2\2\u00c5\r\3\2\2\2\u00c6\u00c8\5~@\2\u00c7\u00c9\5\u0084C\2"+
		"\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc"+
		"\5\u0082B\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2"+
		"\2\u00cd\u00cf\5\u0080A\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00d2\5\u0086D\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\5\2\2\u00d4\u00d5\5\24\13\2"+
		"\u00d5\u00d6\7\6\2\2\u00d6\u00d7\5\20\t\2\u00d7\17\3\2\2\2\u00d8\u00db"+
		"\5x=\2\u00d9\u00db\5\22\n\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\21\3\2\2\2\u00dc\u00dd\7\67\2\2\u00dd\u00de\5H%\2\u00de\u00df\78\2\2"+
		"\u00df\23\3\2\2\2\u00e0\u00e5\5\26\f\2\u00e1\u00e2\7\4\2\2\u00e2\u00e4"+
		"\5\26\f\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e0"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\25\3\2\2\2\u00ea\u00eb\5\u0080A\2\u00eb"+
		"\u00ec\5\u0086D\2\u00ec\27\3\2\2\2\u00ed\u00ee\5\32\16\2\u00ee\31\3\2"+
		"\2\2\u00ef\u00f0\5\u0086D\2\u00f0\u00f1\5\34\17\2\u00f1\u00f2\5\32\16"+
		"\2\u00f2\u00f5\3\2\2\2\u00f3\u00f5\5\36\20\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\33\3\2\2\2\u00f6\u00f7\t\2\2\2\u00f7\35\3\2\2\2\u00f8"+
		"\u00fe\5\"\22\2\u00f9\u00fa\5 \21\2\u00fa\u00fb\5\"\22\2\u00fb\u00fd\3"+
		"\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\37\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\t\3\2"+
		"\2\u0102!\3\2\2\2\u0103\u0109\5&\24\2\u0104\u0105\5$\23\2\u0105\u0106"+
		"\5&\24\2\u0106\u0108\3\2\2\2\u0107\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a#\3\2\2\2\u010b\u0109\3\2\2\2"+
		"\u010c\u010d\t\4\2\2\u010d%\3\2\2\2\u010e\u0114\5*\26\2\u010f\u0110\5"+
		"(\25\2\u0110\u0111\5*\26\2\u0111\u0113\3\2\2\2\u0112\u010f\3\2\2\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\'\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0117\u0118\t\5\2\2\u0118)\3\2\2\2\u0119\u011f\5"+
		".\30\2\u011a\u011b\5,\27\2\u011b\u011c\5.\30\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120+\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\t\6\2\2\u0123-\3\2"+
		"\2\2\u0124\u0125\5\60\31\2\u0125\u0126\5.\30\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0129\5\62\32\2\u0128\u0124\3\2\2\2\u0128\u0127\3\2\2\2\u0129/\3\2\2"+
		"\2\u012a\u012b\t\7\2\2\u012b\61\3\2\2\2\u012c\u012e\5\66\34\2\u012d\u012f"+
		"\5\64\33\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\63\3\2\2\2\u0130"+
		"\u0131\t\b\2\2\u0131\65\3\2\2\2\u0132\u013c\5> \2\u0133\u013c\5n8\2\u0134"+
		"\u013c\5B\"\2\u0135\u013c\5<\37\2\u0136\u013c\5N(\2\u0137\u013c\5P)\2"+
		"\u0138\u013c\5R*\2\u0139\u013c\5T+\2\u013a\u013c\58\35\2\u013b\u0132\3"+
		"\2\2\2\u013b\u0133\3\2\2\2\u013b\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b"+
		"\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\5:\36\2\u013e"+
		"\67\3\2\2\2\u013f\u0140\7\5\2\2\u0140\u0141\5\30\r\2\u0141\u0142\7\6\2"+
		"\2\u01429\3\2\2\2\u0143\u0146\7\61\2\2\u0144\u0147\5B\"\2\u0145\u0147"+
		"\5> \2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0143\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b;\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7 \2\2\u014e=\3\2"+
		"\2\2\u014f\u0150\5\u0086D\2\u0150\u0151\7\5\2\2\u0151\u0152\5@!\2\u0152"+
		"\u0153\7\6\2\2\u0153?\3\2\2\2\u0154\u0159\5\30\r\2\u0155\u0156\7\4\2\2"+
		"\u0156\u0158\5\30\r\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0154\3\2\2\2\u015c\u015d\3\2\2\2\u015dA\3\2\2\2\u015e\u0161\5D#\2\u015f"+
		"\u0161\5F$\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161C\3\2\2\2\u0162"+
		"\u0163\5\u0086D\2\u0163E\3\2\2\2\u0164\u0165\7\60\2\2\u0165\u0166\5\30"+
		"\r\2\u0166G\3\2\2\2\u0167\u0169\5J&\2\u0168\u0167\3\2\2\2\u0169\u016c"+
		"\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016bI\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u0173\5x=\2\u016e\u0173\5L\'\2\u016f\u0170\5f\64"+
		"\2\u0170\u0171\7/\2\2\u0171\u0173\3\2\2\2\u0172\u016d\3\2\2\2\u0172\u016e"+
		"\3\2\2\2\u0172\u016f\3\2\2\2\u0173K\3\2\2\2\u0174\u0179\5V,\2\u0175\u0179"+
		"\5^\60\2\u0176\u0179\5`\61\2\u0177\u0179\5b\62\2\u0178\u0174\3\2\2\2\u0178"+
		"\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179M\3\2\2\2"+
		"\u017a\u017b\7\3\2\2\u017bO\3\2\2\2\u017c\u0182\7\r\2\2\u017d\u0183\5"+
		"\30\r\2\u017e\u017f\7\67\2\2\u017f\u0180\5H%\2\u0180\u0181\78\2\2\u0181"+
		"\u0183\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0183Q\3\2\2\2"+
		"\u0184\u0189\7\16\2\2\u0185\u018a\5\30\r\2\u0186\u018a\5L\'\2\u0187\u018a"+
		"\5f\64\2\u0188\u018a\5\22\n\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aS\3\2\2\2\u018b\u018c\7"+
		"!\2\2\u018c\u018d\5\u0080A\2\u018d\u0196\7\5\2\2\u018e\u0193\5\30\r\2"+
		"\u018f\u0190\7\4\2\2\u0190\u0192\5\30\r\2\u0191\u018f\3\2\2\2\u0192\u0195"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\7\6\2\2\u0199U\3\2\2\2\u019a\u01a0\5X-\2\u019b\u019d"+
		"\5Z.\2\u019c\u019e\5\\/\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u01a1\5\\/\2\u01a0\u019b\3\2\2\2\u01a0\u019f\3\2"+
		"\2\2\u01a1W\3\2\2\2\u01a2\u01a3\7\"\2\2\u01a3\u01a4\7\67\2\2\u01a4\u01a5"+
		"\5H%\2\u01a5\u01a6\78\2\2\u01a6Y\3\2\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9"+
		"\7\5\2\2\u01a9\u01aa\5\26\f\2\u01aa\u01ab\7\6\2\2\u01ab\u01ac\7\67\2\2"+
		"\u01ac\u01ad\5H%\2\u01ad\u01ae\78\2\2\u01ae[\3\2\2\2\u01af\u01b0\7$\2"+
		"\2\u01b0\u01b1\7\67\2\2\u01b1\u01b2\5H%\2\u01b2\u01b3\78\2\2\u01b3]\3"+
		"\2\2\2\u01b4\u01b5\7%\2\2\u01b5\u01b6\7\5\2\2\u01b6\u01b7\5\30\r\2\u01b7"+
		"\u01b8\7\6\2\2\u01b8\u01bb\5z>\2\u01b9\u01ba\7&\2\2\u01ba\u01bc\5z>\2"+
		"\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc_\3\2\2\2\u01bd\u01be\7"+
		",\2\2\u01be\u01bf\7\5\2\2\u01bf\u01c0\5\30\r\2\u01c0\u01c1\7\6\2\2\u01c1"+
		"\u01c2\5z>\2\u01c2a\3\2\2\2\u01c3\u01c4\7-\2\2\u01c4\u01c6\7\5\2\2\u01c5"+
		"\u01c7\5d\63\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01ca\7/\2\2\u01c9\u01cb\5\30\r\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\7/\2\2\u01cd\u01cf\5d\63"+
		"\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1"+
		"\7\6\2\2\u01d1\u01d2\5z>\2\u01d2c\3\2\2\2\u01d3\u01d8\5f\64\2\u01d4\u01d5"+
		"\7\4\2\2\u01d5\u01d7\5f\64\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9e\3\2\2\2\u01da\u01d8\3\2\2\2"+
		"\u01db\u01e0\5j\66\2\u01dc\u01e0\5l\67\2\u01dd\u01e0\5h\65\2\u01de\u01e0"+
		"\5\30\r\2\u01df\u01db\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2"+
		"\u01df\u01de\3\2\2\2\u01e0g\3\2\2\2\u01e1\u01e2\5\u0080A\2\u01e2\u01e5"+
		"\5\u0086D\2\u01e3\u01e4\7\32\2\2\u01e4\u01e6\5\30\r\2\u01e5\u01e3\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6i\3\2\2\2\u01e7\u01e8\7\'\2\2\u01e8\u01e9"+
		"\5\30\r\2\u01e9k\3\2\2\2\u01ea\u01eb\7(\2\2\u01eb\u01ec\5\30\r\2\u01ec"+
		"m\3\2\2\2\u01ed\u01f2\5p9\2\u01ee\u01f2\5r:\2\u01ef\u01f2\5t;\2\u01f0"+
		"\u01f2\5v<\2\u01f1\u01ed\3\2\2\2\u01f1\u01ee\3\2\2\2\u01f1\u01ef\3\2\2"+
		"\2\u01f1\u01f0\3\2\2\2\u01f2o\3\2\2\2\u01f3\u01f4\7;\2\2\u01f4q\3\2\2"+
		"\2\u01f5\u01f6\79\2\2\u01f6s\3\2\2\2\u01f7\u01f8\7:\2\2\u01f8u\3\2\2\2"+
		"\u01f9\u01fa\t\t\2\2\u01faw\3\2\2\2\u01fb\u01fc\7\r\2\2\u01fc\u01fd\7"+
		"\67\2\2\u01fd\u01fe\5H%\2\u01fe\u01ff\78\2\2\u01ffy\3\2\2\2\u0200\u0201"+
		"\7\67\2\2\u0201\u0202\5H%\2\u0202\u0203\78\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0206\5J&\2\u0205\u0200\3\2\2\2\u0205\u0204\3\2\2\2\u0206{\3\2\2\2\u0207"+
		"\u0209\7\b\2\2\u0208\u020a\7\17\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3"+
		"\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\5\u0080A\2\u020c}\3\2\2\2\u020d"+
		"\u020f\5|?\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2"+
		"\2\u0210\u0211\3\2\2\2\u0211\177\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0218"+
		"\5\u0086D\2\u0214\u0215\7\61\2\2\u0215\u0217\5\u0086D\2\u0216\u0214\3"+
		"\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u0081\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\7\65\2\2\u021c\u0083\3"+
		"\2\2\2\u021d\u021e\t\n\2\2\u021e\u0085\3\2\2\2\u021f\u0220\7\66\2\2\u0220"+
		"\u0087\3\2\2\28\u008b\u0091\u0095\u0099\u009f\u00a4\u00ab\u00b1\u00b5"+
		"\u00b8\u00bb\u00be\u00c2\u00c8\u00cb\u00ce\u00d1\u00da\u00e5\u00e8\u00f4"+
		"\u00fe\u0109\u0114\u011f\u0128\u012e\u013b\u0146\u014a\u0159\u015c\u0160"+
		"\u016a\u0172\u0178\u0182\u0189\u0193\u0196\u019d\u01a0\u01bb\u01c6\u01ca"+
		"\u01ce\u01d8\u01df\u01e5\u01f1\u0205\u0209\u0210\u0218";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}