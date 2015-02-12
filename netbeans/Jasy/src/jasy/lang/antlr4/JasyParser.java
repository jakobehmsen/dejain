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
		PLUS=9, MINUS=10, MULT=11, DIV=12, LT=13, LTE=14, GT=15, GTE=16, ASSIGN_OP=17, 
		REPLACE_OP=18, KW_THIS_RESULT=19, KW_TRY=20, KW_CATCH=21, KW_FINALLY=22, 
		KW_IF=23, KW_ELSE=24, KW_RETURN=25, KW_THROW=26, KW_CLASS=27, KW_TRUE=28, 
		KW_FALSE=29, KW_WHILE=30, WILD_CARD=31, SEMI_COLON=32, COLON=33, DOT=34, 
		ACC_MOD_PUBLIC=35, ACC_MOD_PRIVATE=36, ACC_MOD_PROTECTED=37, MOD_STATIC=38, 
		ID=39, OPEN_BRA=40, CLOSE_BRA=41, INTEGER=42, LONG=43, STRING=44, WS=45, 
		SINGLELINE_COMMENT=46, MULTI_LINE_COMMENT=47;
	public static final String[] tokenNames = {
		"<INVALID>", "'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", 
		"'+'", "'-'", "MULT", "'/'", "'<'", "'<='", "'>'", "'>='", "'='", "'=>'", 
		"'thisResult'", "'try'", "'catch'", "'finally'", "'if'", "'else'", "'return'", 
		"'throw'", "'class'", "'true'", "'false'", "'while'", "WILD_CARD", "';'", 
		"':'", "'.'", "'public'", "'private'", "'protected'", "'static'", "ID", 
		"'{'", "'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_classTransformer = 1, RULE_classTransformerMembers = 2, 
		RULE_classTransformerMemberDefinition = 3, RULE_classTransformerMember = 4, 
		RULE_classTransformerMemberField = 5, RULE_classTransformerMemberMethod = 6, 
		RULE_classTransformerMemberMethodBlody = 7, RULE_block = 8, RULE_parameters = 9, 
		RULE_parameter = 10, RULE_expression = 11, RULE_variableAssignment = 12, 
		RULE_binaryRelational = 13, RULE_binarySum = 14, RULE_binaryMult = 15, 
		RULE_leafExpression = 16, RULE_leafExpressionChain = 17, RULE_binarySumOperator = 18, 
		RULE_binaryMultOperator = 19, RULE_thisResult = 20, RULE_invocation = 21, 
		RULE_arguments = 22, RULE_lookup = 23, RULE_statements = 24, RULE_statement = 25, 
		RULE_nonDelimitedStatement = 26, RULE_proceedStatement = 27, RULE_metaExpression = 28, 
		RULE_quotedExpression = 29, RULE_tryCatchStatement = 30, RULE_tryStatement = 31, 
		RULE_catchStatement = 32, RULE_finallyStatement = 33, RULE_ifElseStatement = 34, 
		RULE_whileStatement = 35, RULE_whileBody = 36, RULE_ifTrueBlock = 37, 
		RULE_ifFalseBlock = 38, RULE_delimitedStatement = 39, RULE_variableDeclaration = 40, 
		RULE_returnStatement = 41, RULE_throwStatement = 42, RULE_injectStatement = 43, 
		RULE_literal = 44, RULE_stringLiteral = 45, RULE_integerLiteral = 46, 
		RULE_longLiteral = 47, RULE_booleanLiteral = 48, RULE_metaBlock = 49, 
		RULE_annotation = 50, RULE_annotations = 51, RULE_typeQualifier = 52, 
		RULE_modStatic = 53, RULE_accessModifier = 54, RULE_identifier = 55;
	public static final String[] ruleNames = {
		"program", "classTransformer", "classTransformerMembers", "classTransformerMemberDefinition", 
		"classTransformerMember", "classTransformerMemberField", "classTransformerMemberMethod", 
		"classTransformerMemberMethodBlody", "block", "parameters", "parameter", 
		"expression", "variableAssignment", "binaryRelational", "binarySum", "binaryMult", 
		"leafExpression", "leafExpressionChain", "binarySumOperator", "binaryMultOperator", 
		"thisResult", "invocation", "arguments", "lookup", "statements", "statement", 
		"nonDelimitedStatement", "proceedStatement", "metaExpression", "quotedExpression", 
		"tryCatchStatement", "tryStatement", "catchStatement", "finallyStatement", 
		"ifElseStatement", "whileStatement", "whileBody", "ifTrueBlock", "ifFalseBlock", 
		"delimitedStatement", "variableDeclaration", "returnStatement", "throwStatement", 
		"injectStatement", "literal", "stringLiteral", "integerLiteral", "longLiteral", 
		"booleanLiteral", "metaBlock", "annotation", "annotations", "typeQualifier", 
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_CLASS) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << ID))) != 0)) {
				{
				{
				setState(112); classTransformer();
				}
				}
				setState(117);
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
			setState(121);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(118); ((ClassTransformerContext)_localctx).variableId = identifier();
				setState(119); match(ASSIGN_OP);
				}
			}

			setState(123); annotations();
			setState(125);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(124); accessModifier();
				}
			}

			setState(127); match(KW_CLASS);
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(128); typeQualifier();
				}
				break;
			}
			setState(135);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(131); match(OPEN_BRA);
				setState(132); ((ClassTransformerContext)_localctx).members = classTransformerMembers();
				setState(133); match(CLOSE_BRA);
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
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << AT) | (1L << PLUS) | (1L << ASSIGN_OP) | (1L << SEMI_COLON) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << MOD_STATIC) | (1L << ID))) != 0)) {
				{
				{
				setState(137); classTransformerMemberDefinition();
				}
				}
				setState(142);
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
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(143); match(PLUS);
				}
				break;

			case 2:
				{
				{
				setState(144); ((ClassTransformerMemberDefinitionContext)_localctx).variableId = identifier();
				setState(145); match(ASSIGN_OP);
				}
				}
				break;
			}
			setState(149); ((ClassTransformerMemberDefinitionContext)_localctx).member = classTransformerMember();
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
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); classTransformerMemberField();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152); classTransformerMemberMethod();
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
			setState(155); annotations();
			setState(157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(156); accessModifier();
				}
			}

			setState(160);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(159); modStatic();
				}
			}

			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(162); typeQualifier();
				}
				break;
			}
			setState(166);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(165); identifier();
				}
			}

			setState(170);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(168); match(ASSIGN_OP);
				setState(169); ((ClassTransformerMemberFieldContext)_localctx).value = expression();
				}
			}

			setState(172); match(SEMI_COLON);
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
			setState(174); annotations();
			setState(176);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(175); accessModifier();
				}
			}

			setState(179);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(178); modStatic();
				}
			}

			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(181); typeQualifier();
				}
				break;
			}
			setState(185);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(184); identifier();
				}
			}

			setState(187); match(OPEN_PAR);
			setState(188); parameters();
			setState(189); match(CLOSE_PAR);
			setState(190); ((ClassTransformerMemberMethodContext)_localctx).body = classTransformerMemberMethodBlody();
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
			setState(194);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); metaBlock();
				}
				break;
			case OPEN_BRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); block();
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
			setState(196); match(OPEN_BRA);
			setState(197); statements();
			setState(198); match(CLOSE_BRA);
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
			setState(208);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(200); parameter();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(201); match(COMMA);
					setState(202); parameter();
					}
					}
					setState(207);
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
			setState(210); typeQualifier();
			setState(211); identifier();
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
			setState(213); variableAssignment();
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
		public TerminalNode ASSIGN_OP() { return getToken(JasyParser.ASSIGN_OP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BinaryRelationalContext binaryRelational() {
			return getRuleContext(BinaryRelationalContext.class,0);
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
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); identifier();
				setState(216); match(ASSIGN_OP);
				setState(217); ((VariableAssignmentContext)_localctx).value = variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); binaryRelational();
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

	public static class BinaryRelationalContext extends ParserRuleContext {
		public BinarySumContext first;
		public Token operator;
		public BinarySumContext rest;
		public TerminalNode LTE(int i) {
			return getToken(JasyParser.LTE, i);
		}
		public List<BinarySumContext> binarySum() {
			return getRuleContexts(BinarySumContext.class);
		}
		public List<TerminalNode> LT() { return getTokens(JasyParser.LT); }
		public List<TerminalNode> GTE() { return getTokens(JasyParser.GTE); }
		public List<TerminalNode> GT() { return getTokens(JasyParser.GT); }
		public BinarySumContext binarySum(int i) {
			return getRuleContext(BinarySumContext.class,i);
		}
		public TerminalNode GT(int i) {
			return getToken(JasyParser.GT, i);
		}
		public List<TerminalNode> LTE() { return getTokens(JasyParser.LTE); }
		public TerminalNode GTE(int i) {
			return getToken(JasyParser.GTE, i);
		}
		public TerminalNode LT(int i) {
			return getToken(JasyParser.LT, i);
		}
		public BinaryRelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryRelational; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitBinaryRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryRelationalContext binaryRelational() throws RecognitionException {
		BinaryRelationalContext _localctx = new BinaryRelationalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binaryRelational);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222); ((BinaryRelationalContext)_localctx).first = binarySum();
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					((BinaryRelationalContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
						((BinaryRelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(224); ((BinaryRelationalContext)_localctx).rest = binarySum();
					}
					} 
				}
				setState(229);
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

	public static class BinarySumContext extends ParserRuleContext {
		public BinaryMultContext first;
		public BinaryMultContext rest;
		public List<BinaryMultContext> binaryMult() {
			return getRuleContexts(BinaryMultContext.class);
		}
		public BinaryMultContext binaryMult(int i) {
			return getRuleContext(BinaryMultContext.class,i);
		}
		public BinarySumOperatorContext binarySumOperator(int i) {
			return getRuleContext(BinarySumOperatorContext.class,i);
		}
		public List<BinarySumOperatorContext> binarySumOperator() {
			return getRuleContexts(BinarySumOperatorContext.class);
		}
		public BinarySumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarySum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitBinarySum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinarySumContext binarySum() throws RecognitionException {
		BinarySumContext _localctx = new BinarySumContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binarySum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230); ((BinarySumContext)_localctx).first = binaryMult();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(231); binarySumOperator();
					setState(232); ((BinarySumContext)_localctx).rest = binaryMult();
					}
					} 
				}
				setState(238);
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

	public static class BinaryMultContext extends ParserRuleContext {
		public LeafExpressionContext first;
		public LeafExpressionContext rest;
		public List<BinaryMultOperatorContext> binaryMultOperator() {
			return getRuleContexts(BinaryMultOperatorContext.class);
		}
		public List<LeafExpressionContext> leafExpression() {
			return getRuleContexts(LeafExpressionContext.class);
		}
		public BinaryMultOperatorContext binaryMultOperator(int i) {
			return getRuleContext(BinaryMultOperatorContext.class,i);
		}
		public LeafExpressionContext leafExpression(int i) {
			return getRuleContext(LeafExpressionContext.class,i);
		}
		public BinaryMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitBinaryMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMultContext binaryMult() throws RecognitionException {
		BinaryMultContext _localctx = new BinaryMultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryMult);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239); ((BinaryMultContext)_localctx).first = leafExpression();
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(240); binaryMultOperator();
					setState(241); ((BinaryMultContext)_localctx).rest = leafExpression();
					}
					} 
				}
				setState(247);
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
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public MetaExpressionContext metaExpression() {
			return getRuleContext(MetaExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public QuotedExpressionContext quotedExpression() {
			return getRuleContext(QuotedExpressionContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThisResultContext thisResult() {
			return getRuleContext(ThisResultContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JasyParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 32, RULE_leafExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(248); invocation();
				}
				break;

			case 2:
				{
				setState(249); literal();
				}
				break;

			case 3:
				{
				setState(250); lookup();
				}
				break;

			case 4:
				{
				setState(251); thisResult();
				}
				break;

			case 5:
				{
				setState(252); proceedStatement();
				}
				break;

			case 6:
				{
				setState(253); metaExpression();
				}
				break;

			case 7:
				{
				setState(254); quotedExpression();
				}
				break;

			case 8:
				{
				setState(255); match(OPEN_PAR);
				setState(256); expression();
				setState(257); match(CLOSE_PAR);
				}
				break;
			}
			setState(261); leafExpressionChain();
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
		enterRule(_localctx, 34, RULE_leafExpressionChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(263); match(DOT);
					setState(266);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(264); lookup();
						}
						break;

					case 2:
						{
						setState(265); invocation();
						}
						break;
					}
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class BinarySumOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode PLUS() { return getToken(JasyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JasyParser.MINUS, 0); }
		public BinarySumOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarySumOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitBinarySumOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinarySumOperatorContext binarySumOperator() throws RecognitionException {
		BinarySumOperatorContext _localctx = new BinarySumOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binarySumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((BinarySumOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
				((BinarySumOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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

	public static class BinaryMultOperatorContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode MULT() { return getToken(JasyParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(JasyParser.DIV, 0); }
		public BinaryMultOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMultOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitBinaryMultOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryMultOperatorContext binaryMultOperator() throws RecognitionException {
		BinaryMultOperatorContext _localctx = new BinaryMultOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_binaryMultOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((BinaryMultOperatorContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
				((BinaryMultOperatorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 40, RULE_thisResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(KW_THIS_RESULT);
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
		enterRule(_localctx, 42, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); identifier();
			setState(280); match(OPEN_PAR);
			setState(281); arguments();
			setState(282); match(CLOSE_PAR);
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
		enterRule(_localctx, 44, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(284); expression();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(285); match(COMMA);
					setState(286); expression();
					}
					}
					setState(291);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 46, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); identifier();
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
		enterRule(_localctx, 48, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << HAT) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_WHILE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				{
				setState(296); statement();
				}
				}
				setState(301);
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
		enterRule(_localctx, 50, RULE_statement);
		try {
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); metaBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303); nonDelimitedStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304); delimitedStatement();
				setState(305); match(SEMI_COLON);
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
		enterRule(_localctx, 52, RULE_nonDelimitedStatement);
		try {
			setState(312);
			switch (_input.LA(1)) {
			case KW_TRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); tryCatchStatement();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); ifElseStatement();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(311); whileStatement();
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
		enterRule(_localctx, 54, RULE_proceedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(ELLIPSES);
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
		enterRule(_localctx, 56, RULE_metaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); match(DOLLAR);
			setState(322);
			switch (_input.LA(1)) {
			case ELLIPSES:
			case OPEN_PAR:
			case DOLLAR:
			case HASH:
			case KW_THIS_RESULT:
			case KW_TRUE:
			case KW_FALSE:
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				{
				setState(317); expression();
				}
				break;
			case OPEN_BRA:
				{
				setState(318); match(OPEN_BRA);
				setState(319); statements();
				setState(320); match(CLOSE_BRA);
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
		enterRule(_localctx, 58, RULE_quotedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(HASH);
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(325); expression();
				}
				break;

			case 2:
				{
				setState(326); nonDelimitedStatement();
				}
				break;

			case 3:
				{
				setState(327); delimitedStatement();
				}
				break;

			case 4:
				{
				setState(328); block();
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
		enterRule(_localctx, 60, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); tryStatement();
			setState(337);
			switch (_input.LA(1)) {
			case KW_CATCH:
				{
				{
				setState(332); catchStatement();
				setState(334);
				_la = _input.LA(1);
				if (_la==KW_FINALLY) {
					{
					setState(333); finallyStatement();
					}
				}

				}
				}
				break;
			case KW_FINALLY:
				{
				setState(336); finallyStatement();
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
		enterRule(_localctx, 62, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(KW_TRY);
			setState(340); match(OPEN_BRA);
			setState(341); statements();
			setState(342); match(CLOSE_BRA);
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
		enterRule(_localctx, 64, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344); match(KW_CATCH);
			setState(345); match(OPEN_PAR);
			setState(346); parameter();
			setState(347); match(CLOSE_PAR);
			setState(348); match(OPEN_BRA);
			setState(349); statements();
			setState(350); match(CLOSE_BRA);
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
		enterRule(_localctx, 66, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(KW_FINALLY);
			setState(353); match(OPEN_BRA);
			setState(354); statements();
			setState(355); match(CLOSE_BRA);
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
		public IfTrueBlockContext ifTrueBlock() {
			return getRuleContext(IfTrueBlockContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(JasyParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfFalseBlockContext ifFalseBlock() {
			return getRuleContext(IfFalseBlockContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(KW_IF);
			setState(358); match(OPEN_PAR);
			setState(359); ((IfElseStatementContext)_localctx).condition = expression();
			setState(360); match(CLOSE_PAR);
			setState(361); ifTrueBlock();
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(362); ifFalseBlock();
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
		public TerminalNode KW_WHILE() { return getToken(JasyParser.KW_WHILE, 0); }
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
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
		enterRule(_localctx, 70, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(KW_WHILE);
			setState(366); match(OPEN_PAR);
			setState(367); ((WhileStatementContext)_localctx).condition = expression();
			setState(368); match(CLOSE_PAR);
			setState(369); whileBody();
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

	public static class WhileBodyContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public WhileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitWhileBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBodyContext whileBody() throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_whileBody);
		int _la;
		try {
			setState(380);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(371); match(OPEN_BRA);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << HAT) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_WHILE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(372); statement();
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
			case HAT:
			case DOLLAR:
			case HASH:
			case KW_THIS_RESULT:
			case KW_TRY:
			case KW_IF:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case KW_WHILE:
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); statement();
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

	public static class IfTrueBlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public IfTrueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTrueBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitIfTrueBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfTrueBlockContext ifTrueBlock() throws RecognitionException {
		IfTrueBlockContext _localctx = new IfTrueBlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifTrueBlock);
		int _la;
		try {
			setState(391);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(382); match(OPEN_BRA);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << HAT) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_WHILE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(383); statement();
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(389); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
			case HAT:
			case DOLLAR:
			case HASH:
			case KW_THIS_RESULT:
			case KW_TRY:
			case KW_IF:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case KW_WHILE:
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); statement();
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

	public static class IfFalseBlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode KW_ELSE() { return getToken(JasyParser.KW_ELSE, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(JasyParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(JasyParser.OPEN_BRA, 0); }
		public IfFalseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifFalseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitIfFalseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfFalseBlockContext ifFalseBlock() throws RecognitionException {
		IfFalseBlockContext _localctx = new IfFalseBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ifFalseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(KW_ELSE);
			setState(403);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				{
				setState(394); match(OPEN_BRA);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << HAT) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << KW_WHILE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(395); statement();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
			case HAT:
			case DOLLAR:
			case HASH:
			case KW_THIS_RESULT:
			case KW_TRY:
			case KW_IF:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case KW_WHILE:
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				{
				setState(402); statement();
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

	public static class DelimitedStatementContext extends ParserRuleContext {
		public InjectStatementContext injectStatement() {
			return getRuleContext(InjectStatementContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_delimitedStatement);
		try {
			setState(410);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); returnStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406); throwStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407); variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408); injectStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(409); expression();
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
		enterRule(_localctx, 80, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); typeQualifier();
			setState(413); ((VariableDeclarationContext)_localctx).id = identifier();
			setState(416);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(414); match(ASSIGN_OP);
				setState(415); ((VariableDeclarationContext)_localctx).value = expression();
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
		enterRule(_localctx, 82, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(KW_RETURN);
			setState(419); expression();
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
		enterRule(_localctx, 84, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(KW_THROW);
			setState(422); expression();
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

	public static class InjectStatementContext extends ParserRuleContext {
		public TerminalNode HAT() { return getToken(JasyParser.HAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InjectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasyVisitor ) return ((JasyVisitor<? extends T>)visitor).visitInjectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectStatementContext injectStatement() throws RecognitionException {
		InjectStatementContext _localctx = new InjectStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_injectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(HAT);
			setState(425); expression();
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
		enterRule(_localctx, 88, RULE_literal);
		try {
			setState(431);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(427); stringLiteral();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(428); integerLiteral();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 3);
				{
				setState(429); longLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(430); booleanLiteral();
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
		enterRule(_localctx, 90, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); match(STRING);
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
		enterRule(_localctx, 92, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); match(INTEGER);
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
		enterRule(_localctx, 94, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(LONG);
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
		enterRule(_localctx, 96, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 98, RULE_metaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(DOLLAR);
			setState(442); match(OPEN_BRA);
			setState(443); statements();
			setState(444); match(CLOSE_BRA);
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
		enterRule(_localctx, 100, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); match(AT);
			setState(448);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(447); match(PLUS);
				}
			}

			setState(450); typeQualifier();
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
		enterRule(_localctx, 102, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(452); annotation();
				}
				}
				setState(457);
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
		enterRule(_localctx, 104, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); identifier();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(459); match(DOT);
				setState(460); identifier();
				}
				}
				setState(465);
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
		enterRule(_localctx, 106, RULE_modStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); match(MOD_STATIC);
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
		enterRule(_localctx, 108, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
		enterRule(_localctx, 110, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(ID);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\61\u01db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\7\2t\n\2\f\2\16\2w\13"+
		"\2\3\3\3\3\3\3\5\3|\n\3\3\3\3\3\5\3\u0080\n\3\3\3\3\3\5\3\u0084\n\3\3"+
		"\3\3\3\3\3\3\3\5\3\u008a\n\3\3\4\7\4\u008d\n\4\f\4\16\4\u0090\13\4\3\5"+
		"\3\5\3\5\3\5\5\5\u0096\n\5\3\5\3\5\3\6\3\6\5\6\u009c\n\6\3\7\3\7\5\7\u00a0"+
		"\n\7\3\7\5\7\u00a3\n\7\3\7\5\7\u00a6\n\7\3\7\5\7\u00a9\n\7\3\7\3\7\5\7"+
		"\u00ad\n\7\3\7\3\7\3\b\3\b\5\b\u00b3\n\b\3\b\5\b\u00b6\n\b\3\b\5\b\u00b9"+
		"\n\b\3\b\5\b\u00bc\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00c5\n\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13\5\13"+
		"\u00d3\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00df\n"+
		"\16\3\17\3\17\3\17\7\17\u00e4\n\17\f\17\16\17\u00e7\13\17\3\20\3\20\3"+
		"\20\3\20\7\20\u00ed\n\20\f\20\16\20\u00f0\13\20\3\21\3\21\3\21\3\21\7"+
		"\21\u00f6\n\21\f\21\16\21\u00f9\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0106\n\22\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u010d\n\23\7\23\u010f\n\23\f\23\16\23\u0112\13\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0122\n\30\f\30"+
		"\16\30\u0125\13\30\5\30\u0127\n\30\3\31\3\31\3\32\7\32\u012c\n\32\f\32"+
		"\16\32\u012f\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u0136\n\33\3\34\3\34"+
		"\3\34\5\34\u013b\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0145"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u014c\n\37\3 \3 \3 \5 \u0151\n \3"+
		" \5 \u0154\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\5$\u016e\n$\3%\3%\3%\3%\3%\3%\3&\3&\7&\u0178"+
		"\n&\f&\16&\u017b\13&\3&\3&\5&\u017f\n&\3\'\3\'\7\'\u0183\n\'\f\'\16\'"+
		"\u0186\13\'\3\'\3\'\5\'\u018a\n\'\3(\3(\3(\7(\u018f\n(\f(\16(\u0192\13"+
		"(\3(\3(\5(\u0196\n(\3)\3)\3)\3)\3)\5)\u019d\n)\3*\3*\3*\3*\5*\u01a3\n"+
		"*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\5.\u01b2\n.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u01c3\n\64"+
		"\3\64\3\64\3\65\7\65\u01c8\n\65\f\65\16\65\u01cb\13\65\3\66\3\66\3\66"+
		"\7\66\u01d0\n\66\f\66\16\66\u01d3\13\66\3\67\3\67\38\38\39\39\39\2:\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnp\2\7\3\2\17\22\3\2\13\f\3\2\r\16\3\2\36\37\3\2%\'\u01e3"+
		"\2u\3\2\2\2\4{\3\2\2\2\6\u008e\3\2\2\2\b\u0095\3\2\2\2\n\u009b\3\2\2\2"+
		"\f\u009d\3\2\2\2\16\u00b0\3\2\2\2\20\u00c4\3\2\2\2\22\u00c6\3\2\2\2\24"+
		"\u00d2\3\2\2\2\26\u00d4\3\2\2\2\30\u00d7\3\2\2\2\32\u00de\3\2\2\2\34\u00e0"+
		"\3\2\2\2\36\u00e8\3\2\2\2 \u00f1\3\2\2\2\"\u0105\3\2\2\2$\u0110\3\2\2"+
		"\2&\u0113\3\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u0119\3\2\2\2.\u0126"+
		"\3\2\2\2\60\u0128\3\2\2\2\62\u012d\3\2\2\2\64\u0135\3\2\2\2\66\u013a\3"+
		"\2\2\28\u013c\3\2\2\2:\u013e\3\2\2\2<\u0146\3\2\2\2>\u014d\3\2\2\2@\u0155"+
		"\3\2\2\2B\u015a\3\2\2\2D\u0162\3\2\2\2F\u0167\3\2\2\2H\u016f\3\2\2\2J"+
		"\u017e\3\2\2\2L\u0189\3\2\2\2N\u018b\3\2\2\2P\u019c\3\2\2\2R\u019e\3\2"+
		"\2\2T\u01a4\3\2\2\2V\u01a7\3\2\2\2X\u01aa\3\2\2\2Z\u01b1\3\2\2\2\\\u01b3"+
		"\3\2\2\2^\u01b5\3\2\2\2`\u01b7\3\2\2\2b\u01b9\3\2\2\2d\u01bb\3\2\2\2f"+
		"\u01c0\3\2\2\2h\u01c9\3\2\2\2j\u01cc\3\2\2\2l\u01d4\3\2\2\2n\u01d6\3\2"+
		"\2\2p\u01d8\3\2\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"v\3\3\2\2\2wu\3\2\2\2xy\5p9\2yz\7\23\2\2z|\3\2\2\2{x\3\2\2\2{|\3\2\2\2"+
		"|}\3\2\2\2}\177\5h\65\2~\u0080\5n8\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\7\35\2\2\u0082\u0084\5j\66\2\u0083\u0082\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0089\3\2\2\2\u0085\u0086\7*\2\2\u0086"+
		"\u0087\5\6\4\2\u0087\u0088\7+\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\5\3\2\2\2\u008b\u008d\5\b\5\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\7\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\7\13\2\2\u0092\u0093\5p9\2"+
		"\u0093\u0094\7\23\2\2\u0094\u0096\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0092"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5\n\6\2\u0098"+
		"\t\3\2\2\2\u0099\u009c\5\f\7\2\u009a\u009c\5\16\b\2\u009b\u0099\3\2\2"+
		"\2\u009b\u009a\3\2\2\2\u009c\13\3\2\2\2\u009d\u009f\5h\65\2\u009e\u00a0"+
		"\5n8\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u00a3\5l\67\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a6\5j\66\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a9\5p9\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2"+
		"\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ad\5\30\r\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\""+
		"\2\2\u00af\r\3\2\2\2\u00b0\u00b2\5h\65\2\u00b1\u00b3\5n8\2\u00b2\u00b1"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\5l\67\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\5j"+
		"\66\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00bc\5p9\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2"+
		"\2\u00bd\u00be\7\5\2\2\u00be\u00bf\5\24\13\2\u00bf\u00c0\7\6\2\2\u00c0"+
		"\u00c1\5\20\t\2\u00c1\17\3\2\2\2\u00c2\u00c5\5d\63\2\u00c3\u00c5\5\22"+
		"\n\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\21\3\2\2\2\u00c6\u00c7"+
		"\7*\2\2\u00c7\u00c8\5\62\32\2\u00c8\u00c9\7+\2\2\u00c9\23\3\2\2\2\u00ca"+
		"\u00cf\5\26\f\2\u00cb\u00cc\7\4\2\2\u00cc\u00ce\5\26\f\2\u00cd\u00cb\3"+
		"\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\5j\66\2\u00d5\u00d6\5p9\2\u00d6\27\3"+
		"\2\2\2\u00d7\u00d8\5\32\16\2\u00d8\31\3\2\2\2\u00d9\u00da\5p9\2\u00da"+
		"\u00db\7\23\2\2\u00db\u00dc\5\32\16\2\u00dc\u00df\3\2\2\2\u00dd\u00df"+
		"\5\34\17\2\u00de\u00d9\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\33\3\2\2\2\u00e0"+
		"\u00e5\5\36\20\2\u00e1\u00e2\t\2\2\2\u00e2\u00e4\5\36\20\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\35\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ee\5 \21\2\u00e9\u00ea\5&\24"+
		"\2\u00ea\u00eb\5 \21\2\u00eb\u00ed\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\37\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f7\5\"\22\2\u00f2\u00f3\5(\25\2\u00f3\u00f4\5"+
		"\"\22\2\u00f4\u00f6\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8!\3\2\2\2\u00f9\u00f7\3\2\2\2"+
		"\u00fa\u0106\5,\27\2\u00fb\u0106\5Z.\2\u00fc\u0106\5\60\31\2\u00fd\u0106"+
		"\5*\26\2\u00fe\u0106\58\35\2\u00ff\u0106\5:\36\2\u0100\u0106\5<\37\2\u0101"+
		"\u0102\7\5\2\2\u0102\u0103\5\30\r\2\u0103\u0104\7\6\2\2\u0104\u0106\3"+
		"\2\2\2\u0105\u00fa\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fc\3\2\2\2\u0105"+
		"\u00fd\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2"+
		"\2\2\u0105\u0101\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5$\23\2\u0108"+
		"#\3\2\2\2\u0109\u010c\7$\2\2\u010a\u010d\5\60\31\2\u010b\u010d\5,\27\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0109"+
		"\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"%\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\t\3\2\2\u0114\'\3\2\2\2\u0115"+
		"\u0116\t\4\2\2\u0116)\3\2\2\2\u0117\u0118\7\25\2\2\u0118+\3\2\2\2\u0119"+
		"\u011a\5p9\2\u011a\u011b\7\5\2\2\u011b\u011c\5.\30\2\u011c\u011d\7\6\2"+
		"\2\u011d-\3\2\2\2\u011e\u0123\5\30\r\2\u011f\u0120\7\4\2\2\u0120\u0122"+
		"\5\30\r\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u011e"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127/\3\2\2\2\u0128\u0129\5p9\2\u0129\61"+
		"\3\2\2\2\u012a\u012c\5\64\33\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2"+
		"\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\63\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0136\5d\63\2\u0131\u0136\5\66\34\2\u0132\u0133\5P)\2\u0133"+
		"\u0134\7\"\2\2\u0134\u0136\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2"+
		"\2\2\u0135\u0132\3\2\2\2\u0136\65\3\2\2\2\u0137\u013b\5> \2\u0138\u013b"+
		"\5F$\2\u0139\u013b\5H%\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\67\3\2\2\2\u013c\u013d\7\3\2\2\u013d9\3\2\2\2\u013e"+
		"\u0144\7\t\2\2\u013f\u0145\5\30\r\2\u0140\u0141\7*\2\2\u0141\u0142\5\62"+
		"\32\2\u0142\u0143\7+\2\2\u0143\u0145\3\2\2\2\u0144\u013f\3\2\2\2\u0144"+
		"\u0140\3\2\2\2\u0145;\3\2\2\2\u0146\u014b\7\n\2\2\u0147\u014c\5\30\r\2"+
		"\u0148\u014c\5\66\34\2\u0149\u014c\5P)\2\u014a\u014c\5\22\n\2\u014b\u0147"+
		"\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c"+
		"=\3\2\2\2\u014d\u0153\5@!\2\u014e\u0150\5B\"\2\u014f\u0151\5D#\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0154\5D"+
		"#\2\u0153\u014e\3\2\2\2\u0153\u0152\3\2\2\2\u0154?\3\2\2\2\u0155\u0156"+
		"\7\26\2\2\u0156\u0157\7*\2\2\u0157\u0158\5\62\32\2\u0158\u0159\7+\2\2"+
		"\u0159A\3\2\2\2\u015a\u015b\7\27\2\2\u015b\u015c\7\5\2\2\u015c\u015d\5"+
		"\26\f\2\u015d\u015e\7\6\2\2\u015e\u015f\7*\2\2\u015f\u0160\5\62\32\2\u0160"+
		"\u0161\7+\2\2\u0161C\3\2\2\2\u0162\u0163\7\30\2\2\u0163\u0164\7*\2\2\u0164"+
		"\u0165\5\62\32\2\u0165\u0166\7+\2\2\u0166E\3\2\2\2\u0167\u0168\7\31\2"+
		"\2\u0168\u0169\7\5\2\2\u0169\u016a\5\30\r\2\u016a\u016b\7\6\2\2\u016b"+
		"\u016d\5L\'\2\u016c\u016e\5N(\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2"+
		"\2\u016eG\3\2\2\2\u016f\u0170\7 \2\2\u0170\u0171\7\5\2\2\u0171\u0172\5"+
		"\30\r\2\u0172\u0173\7\6\2\2\u0173\u0174\5J&\2\u0174I\3\2\2\2\u0175\u0179"+
		"\7*\2\2\u0176\u0178\5\64\33\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2"+
		"\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017c\u017f\7+\2\2\u017d\u017f\5\64\33\2\u017e\u0175\3\2\2\2"+
		"\u017e\u017d\3\2\2\2\u017fK\3\2\2\2\u0180\u0184\7*\2\2\u0181\u0183\5\64"+
		"\33\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018a\7+"+
		"\2\2\u0188\u018a\5\64\33\2\u0189\u0180\3\2\2\2\u0189\u0188\3\2\2\2\u018a"+
		"M\3\2\2\2\u018b\u0195\7\32\2\2\u018c\u0190\7*\2\2\u018d\u018f\5\64\33"+
		"\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0196\7+\2\2\u0194"+
		"\u0196\5\64\33\2\u0195\u018c\3\2\2\2\u0195\u0194\3\2\2\2\u0196O\3\2\2"+
		"\2\u0197\u019d\5T+\2\u0198\u019d\5V,\2\u0199\u019d\5R*\2\u019a\u019d\5"+
		"X-\2\u019b\u019d\5\30\r\2\u019c\u0197\3\2\2\2\u019c\u0198\3\2\2\2\u019c"+
		"\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019dQ\3\2\2\2"+
		"\u019e\u019f\5j\66\2\u019f\u01a2\5p9\2\u01a0\u01a1\7\23\2\2\u01a1\u01a3"+
		"\5\30\r\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3S\3\2\2\2\u01a4"+
		"\u01a5\7\33\2\2\u01a5\u01a6\5\30\r\2\u01a6U\3\2\2\2\u01a7\u01a8\7\34\2"+
		"\2\u01a8\u01a9\5\30\r\2\u01a9W\3\2\2\2\u01aa\u01ab\7\7\2\2\u01ab\u01ac"+
		"\5\30\r\2\u01acY\3\2\2\2\u01ad\u01b2\5\\/\2\u01ae\u01b2\5^\60\2\u01af"+
		"\u01b2\5`\61\2\u01b0\u01b2\5b\62\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2[\3\2\2\2\u01b3\u01b4"+
		"\7.\2\2\u01b4]\3\2\2\2\u01b5\u01b6\7,\2\2\u01b6_\3\2\2\2\u01b7\u01b8\7"+
		"-\2\2\u01b8a\3\2\2\2\u01b9\u01ba\t\5\2\2\u01bac\3\2\2\2\u01bb\u01bc\7"+
		"\t\2\2\u01bc\u01bd\7*\2\2\u01bd\u01be\5\62\32\2\u01be\u01bf\7+\2\2\u01bf"+
		"e\3\2\2\2\u01c0\u01c2\7\b\2\2\u01c1\u01c3\7\13\2\2\u01c2\u01c1\3\2\2\2"+
		"\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\5j\66\2\u01c5g\3"+
		"\2\2\2\u01c6\u01c8\5f\64\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01cai\3\2\2\2\u01cb\u01c9\3\2\2\2"+
		"\u01cc\u01d1\5p9\2\u01cd\u01ce\7$\2\2\u01ce\u01d0\5p9\2\u01cf\u01cd\3"+
		"\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"k\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7(\2\2\u01d5m\3\2\2\2\u01d6"+
		"\u01d7\t\6\2\2\u01d7o\3\2\2\2\u01d8\u01d9\7)\2\2\u01d9q\3\2\2\2\63u{\177"+
		"\u0083\u0089\u008e\u0095\u009b\u009f\u00a2\u00a5\u00a8\u00ac\u00b2\u00b5"+
		"\u00b8\u00bb\u00c4\u00cf\u00d2\u00de\u00e5\u00ee\u00f7\u0105\u010c\u0110"+
		"\u0123\u0126\u012d\u0135\u013a\u0144\u014b\u0150\u0153\u016d\u0179\u017e"+
		"\u0184\u0189\u0190\u0195\u019c\u01a2\u01b1\u01c2\u01c9\u01d1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}