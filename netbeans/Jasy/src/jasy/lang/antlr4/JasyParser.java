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
		PLUS=9, MINUS=10, ASSIGN_OP=11, REPLACE_OP=12, KW_THIS_RESULT=13, KW_TRY=14, 
		KW_CATCH=15, KW_FINALLY=16, KW_IF=17, KW_ELSE=18, KW_RETURN=19, KW_THROW=20, 
		KW_CLASS=21, KW_TRUE=22, KW_FALSE=23, WILD_CARD=24, SEMI_COLON=25, COLON=26, 
		DOT=27, ACC_MOD_PUBLIC=28, ACC_MOD_PRIVATE=29, ACC_MOD_PROTECTED=30, MOD_STATIC=31, 
		ID=32, OPEN_BRA=33, CLOSE_BRA=34, INTEGER=35, LONG=36, STRING=37, WS=38, 
		SINGLELINE_COMMENT=39, MULTI_LINE_COMMENT=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'...'", "','", "'('", "')'", "'^'", "'@'", "'$'", "'#'", 
		"'+'", "'-'", "'='", "'=>'", "'thisResult'", "'try'", "'catch'", "'finally'", 
		"'if'", "'else'", "'return'", "'throw'", "'class'", "'true'", "'false'", 
		"'*'", "';'", "':'", "'.'", "'public'", "'private'", "'protected'", "'static'", 
		"ID", "'{'", "'}'", "INTEGER", "LONG", "STRING", "WS", "SINGLELINE_COMMENT", 
		"MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_classTransformer = 1, RULE_classTransformerMembers = 2, 
		RULE_classTransformerMemberDefinition = 3, RULE_classTransformerMember = 4, 
		RULE_classTransformerMemberField = 5, RULE_classTransformerMemberMethod = 6, 
		RULE_classTransformerMemberMethodBlody = 7, RULE_block = 8, RULE_parameters = 9, 
		RULE_parameter = 10, RULE_expression = 11, RULE_variableAssignment = 12, 
		RULE_binarySum = 13, RULE_leafExpression = 14, RULE_leafExpressionChain = 15, 
		RULE_binarySumOperator = 16, RULE_thisResult = 17, RULE_invocation = 18, 
		RULE_arguments = 19, RULE_lookup = 20, RULE_statements = 21, RULE_statement = 22, 
		RULE_nonDelimitedStatement = 23, RULE_proceedStatement = 24, RULE_metaExpression = 25, 
		RULE_quotedExpression = 26, RULE_tryCatchStatement = 27, RULE_tryStatement = 28, 
		RULE_catchStatement = 29, RULE_finallyStatement = 30, RULE_ifElseStatement = 31, 
		RULE_ifTrueBlock = 32, RULE_ifFalseBlock = 33, RULE_delimitedStatement = 34, 
		RULE_variableDeclaration = 35, RULE_returnStatement = 36, RULE_throwStatement = 37, 
		RULE_injectStatement = 38, RULE_literal = 39, RULE_stringLiteral = 40, 
		RULE_integerLiteral = 41, RULE_longLiteral = 42, RULE_booleanLiteral = 43, 
		RULE_metaBlock = 44, RULE_annotation = 45, RULE_annotations = 46, RULE_typeQualifier = 47, 
		RULE_modStatic = 48, RULE_accessModifier = 49, RULE_identifier = 50;
	public static final String[] ruleNames = {
		"program", "classTransformer", "classTransformerMembers", "classTransformerMemberDefinition", 
		"classTransformerMember", "classTransformerMemberField", "classTransformerMemberMethod", 
		"classTransformerMemberMethodBlody", "block", "parameters", "parameter", 
		"expression", "variableAssignment", "binarySum", "leafExpression", "leafExpressionChain", 
		"binarySumOperator", "thisResult", "invocation", "arguments", "lookup", 
		"statements", "statement", "nonDelimitedStatement", "proceedStatement", 
		"metaExpression", "quotedExpression", "tryCatchStatement", "tryStatement", 
		"catchStatement", "finallyStatement", "ifElseStatement", "ifTrueBlock", 
		"ifFalseBlock", "delimitedStatement", "variableDeclaration", "returnStatement", 
		"throwStatement", "injectStatement", "literal", "stringLiteral", "integerLiteral", 
		"longLiteral", "booleanLiteral", "metaBlock", "annotation", "annotations", 
		"typeQualifier", "modStatic", "accessModifier", "identifier"
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
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_CLASS) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << ID))) != 0)) {
				{
				{
				setState(102); classTransformer();
				}
				}
				setState(107);
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
			setState(111);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108); ((ClassTransformerContext)_localctx).variableId = identifier();
				setState(109); match(ASSIGN_OP);
				}
			}

			setState(113); annotations();
			setState(115);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(114); accessModifier();
				}
			}

			setState(117); match(KW_CLASS);
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(118); typeQualifier();
				}
				break;
			}
			setState(125);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(121); match(OPEN_BRA);
				setState(122); ((ClassTransformerContext)_localctx).members = classTransformerMembers();
				setState(123); match(CLOSE_BRA);
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
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << AT) | (1L << PLUS) | (1L << ASSIGN_OP) | (1L << SEMI_COLON) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << MOD_STATIC) | (1L << ID))) != 0)) {
				{
				{
				setState(127); classTransformerMemberDefinition();
				}
				}
				setState(132);
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
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(133); match(PLUS);
				}
				break;

			case 2:
				{
				{
				setState(134); ((ClassTransformerMemberDefinitionContext)_localctx).variableId = identifier();
				setState(135); match(ASSIGN_OP);
				}
				}
				break;
			}
			setState(139); ((ClassTransformerMemberDefinitionContext)_localctx).member = classTransformerMember();
			}
		}
		catch (RecognitionException re) {
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
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); classTransformerMemberField();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); classTransformerMemberMethod();
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
			setState(145); annotations();
			setState(147);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(146); accessModifier();
				}
			}

			setState(150);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(149); modStatic();
				}
			}

			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(152); typeQualifier();
				}
				break;
			}
			setState(156);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(155); identifier();
				}
			}

			setState(160);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(158); match(ASSIGN_OP);
				setState(159); ((ClassTransformerMemberFieldContext)_localctx).value = expression();
				}
			}

			setState(162); match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
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
			setState(164); annotations();
			setState(166);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(165); accessModifier();
				}
			}

			setState(169);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(168); modStatic();
				}
			}

			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(171); typeQualifier();
				}
				break;
			}
			setState(175);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(174); identifier();
				}
			}

			setState(177); match(OPEN_PAR);
			setState(178); parameters();
			setState(179); match(CLOSE_PAR);
			setState(180); ((ClassTransformerMemberMethodContext)_localctx).body = classTransformerMemberMethodBlody();
			}
		}
		catch (RecognitionException re) {
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
			setState(184);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); metaBlock();
				}
				break;
			case OPEN_BRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); block();
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
			setState(186); match(OPEN_BRA);
			setState(187); statements();
			setState(188); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
			setState(198);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(190); parameter();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191); match(COMMA);
					setState(192); parameter();
					}
					}
					setState(197);
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
			setState(200); typeQualifier();
			setState(201); identifier();
			}
		}
		catch (RecognitionException re) {
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
			setState(203); variableAssignment();
			}
		}
		catch (RecognitionException re) {
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
		public BinarySumContext binarySum() {
			return getRuleContext(BinarySumContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(JasyParser.ASSIGN_OP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); identifier();
				setState(206); match(ASSIGN_OP);
				setState(207); ((VariableAssignmentContext)_localctx).value = variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); binarySum();
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

	public static class BinarySumContext extends ParserRuleContext {
		public LeafExpressionContext first;
		public LeafExpressionContext rest;
		public List<LeafExpressionContext> leafExpression() {
			return getRuleContexts(LeafExpressionContext.class);
		}
		public LeafExpressionContext leafExpression(int i) {
			return getRuleContext(LeafExpressionContext.class,i);
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
		enterRule(_localctx, 26, RULE_binarySum);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212); ((BinarySumContext)_localctx).first = leafExpression();
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(213); binarySumOperator();
					setState(214); ((BinarySumContext)_localctx).rest = leafExpression();
					}
					} 
				}
				setState(220);
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
		enterRule(_localctx, 28, RULE_leafExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(221); invocation();
				}
				break;

			case 2:
				{
				setState(222); literal();
				}
				break;

			case 3:
				{
				setState(223); lookup();
				}
				break;

			case 4:
				{
				setState(224); thisResult();
				}
				break;

			case 5:
				{
				setState(225); proceedStatement();
				}
				break;

			case 6:
				{
				setState(226); metaExpression();
				}
				break;

			case 7:
				{
				setState(227); quotedExpression();
				}
				break;

			case 8:
				{
				setState(228); match(OPEN_PAR);
				setState(229); expression();
				setState(230); match(CLOSE_PAR);
				}
				break;
			}
			setState(234); leafExpressionChain();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_leafExpressionChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(236); match(DOT);
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(237); lookup();
						}
						break;

					case 2:
						{
						setState(238); invocation();
						}
						break;
					}
					}
					} 
				}
				setState(245);
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
		enterRule(_localctx, 32, RULE_binarySumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		enterRule(_localctx, 34, RULE_thisResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(KW_THIS_RESULT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 36, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); identifier();
			setState(251); match(OPEN_PAR);
			setState(252); arguments();
			setState(253); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(255); expression();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(256); match(COMMA);
					setState(257); expression();
					}
					}
					setState(262);
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
		enterRule(_localctx, 40, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 42, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << HAT) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				{
				setState(267); statement();
				}
				}
				setState(272);
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
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273); metaBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274); nonDelimitedStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275); delimitedStatement();
				setState(276); match(SEMI_COLON);
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
		enterRule(_localctx, 46, RULE_nonDelimitedStatement);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case KW_TRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); tryCatchStatement();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(281); ifElseStatement();
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
		enterRule(_localctx, 48, RULE_proceedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(ELLIPSES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_metaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(DOLLAR);
			setState(292);
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
				setState(287); expression();
				}
				break;
			case OPEN_BRA:
				{
				setState(288); match(OPEN_BRA);
				setState(289); statements();
				setState(290); match(CLOSE_BRA);
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
		enterRule(_localctx, 52, RULE_quotedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(HASH);
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(295); expression();
				}
				break;

			case 2:
				{
				setState(296); nonDelimitedStatement();
				}
				break;

			case 3:
				{
				setState(297); delimitedStatement();
				}
				break;

			case 4:
				{
				setState(298); block();
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
		enterRule(_localctx, 54, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); tryStatement();
			setState(307);
			switch (_input.LA(1)) {
			case KW_CATCH:
				{
				{
				setState(302); catchStatement();
				setState(304);
				_la = _input.LA(1);
				if (_la==KW_FINALLY) {
					{
					setState(303); finallyStatement();
					}
				}

				}
				}
				break;
			case KW_FINALLY:
				{
				setState(306); finallyStatement();
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
		enterRule(_localctx, 56, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(KW_TRY);
			setState(310); match(OPEN_BRA);
			setState(311); statements();
			setState(312); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(KW_CATCH);
			setState(315); match(OPEN_PAR);
			setState(316); parameter();
			setState(317); match(CLOSE_PAR);
			setState(318); match(OPEN_BRA);
			setState(319); statements();
			setState(320); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(KW_FINALLY);
			setState(323); match(OPEN_BRA);
			setState(324); statements();
			setState(325); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(KW_IF);
			setState(328); match(OPEN_PAR);
			setState(329); ((IfElseStatementContext)_localctx).condition = expression();
			setState(330); match(CLOSE_PAR);
			setState(331); ifTrueBlock();
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(332); ifFalseBlock();
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
		enterRule(_localctx, 64, RULE_ifTrueBlock);
		int _la;
		try {
			setState(344);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(335); match(OPEN_BRA);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << HAT) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(336); statement();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342); match(CLOSE_BRA);
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
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); statement();
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
		enterRule(_localctx, 66, RULE_ifFalseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(KW_ELSE);
			setState(356);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				{
				setState(347); match(OPEN_BRA);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << HAT) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(348); statement();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354); match(CLOSE_BRA);
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
			case ID:
			case INTEGER:
			case LONG:
			case STRING:
				{
				setState(355); statement();
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
		enterRule(_localctx, 68, RULE_delimitedStatement);
		try {
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358); returnStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359); throwStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360); variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361); injectStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(362); expression();
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
		enterRule(_localctx, 70, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); typeQualifier();
			setState(366); ((VariableDeclarationContext)_localctx).id = identifier();
			setState(369);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(367); match(ASSIGN_OP);
				setState(368); ((VariableDeclarationContext)_localctx).value = expression();
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
		enterRule(_localctx, 72, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(KW_RETURN);
			setState(372); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(KW_THROW);
			setState(375); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_injectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(HAT);
			setState(378); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_literal);
		try {
			setState(384);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(380); stringLiteral();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); integerLiteral();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 3);
				{
				setState(382); longLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(383); booleanLiteral();
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
		enterRule(_localctx, 80, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); match(LONG);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		enterRule(_localctx, 88, RULE_metaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(DOLLAR);
			setState(395); match(OPEN_BRA);
			setState(396); statements();
			setState(397); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 90, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(AT);
			setState(401);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(400); match(PLUS);
				}
			}

			setState(403); typeQualifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 92, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(405); annotation();
				}
				}
				setState(410);
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
		enterRule(_localctx, 94, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); identifier();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(412); match(DOT);
				setState(413); identifier();
				}
				}
				setState(418);
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
		enterRule(_localctx, 96, RULE_modStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(MOD_STATIC);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		enterRule(_localctx, 100, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3*\u01ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\7\2j\n\2\f\2\16\2m\13\2\3\3\3\3\3\3\5\3r\n\3\3\3\3\3\5\3v\n\3"+
		"\3\3\3\3\5\3z\n\3\3\3\3\3\3\3\3\3\5\3\u0080\n\3\3\4\7\4\u0083\n\4\f\4"+
		"\16\4\u0086\13\4\3\5\3\5\3\5\3\5\5\5\u008c\n\5\3\5\3\5\3\6\3\6\5\6\u0092"+
		"\n\6\3\7\3\7\5\7\u0096\n\7\3\7\5\7\u0099\n\7\3\7\5\7\u009c\n\7\3\7\5\7"+
		"\u009f\n\7\3\7\3\7\5\7\u00a3\n\7\3\7\3\7\3\b\3\b\5\b\u00a9\n\b\3\b\5\b"+
		"\u00ac\n\b\3\b\5\b\u00af\n\b\3\b\5\b\u00b2\n\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\5\t\u00bb\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00c4\n\13\f\13"+
		"\16\13\u00c7\13\13\5\13\u00c9\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00d5\n\16\3\17\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16"+
		"\17\u00de\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00eb\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u00f2\n\21\7\21\u00f4\n"+
		"\21\f\21\16\21\u00f7\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\7\25\u0105\n\25\f\25\16\25\u0108\13\25\5\25\u010a\n\25"+
		"\3\26\3\26\3\27\7\27\u010f\n\27\f\27\16\27\u0112\13\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0119\n\30\3\31\3\31\5\31\u011d\n\31\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0127\n\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u012e\n\34\3\35\3\35\3\35\5\35\u0133\n\35\3\35\5\35\u0136\n\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\5!\u0150\n!\3\"\3\"\7\"\u0154\n\"\f\"\16\"\u0157"+
		"\13\"\3\"\3\"\5\"\u015b\n\"\3#\3#\3#\7#\u0160\n#\f#\16#\u0163\13#\3#\3"+
		"#\5#\u0167\n#\3$\3$\3$\3$\3$\5$\u016e\n$\3%\3%\3%\3%\5%\u0174\n%\3&\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\5)\u0183\n)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\5/\u0194\n/\3/\3/\3\60\7\60\u0199\n\60\f\60"+
		"\16\60\u019c\13\60\3\61\3\61\3\61\7\61\u01a1\n\61\f\61\16\61\u01a4\13"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\2\65\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\5\3\2\13"+
		"\f\3\2\30\31\3\2\36 \u01b4\2k\3\2\2\2\4q\3\2\2\2\6\u0084\3\2\2\2\b\u008b"+
		"\3\2\2\2\n\u0091\3\2\2\2\f\u0093\3\2\2\2\16\u00a6\3\2\2\2\20\u00ba\3\2"+
		"\2\2\22\u00bc\3\2\2\2\24\u00c8\3\2\2\2\26\u00ca\3\2\2\2\30\u00cd\3\2\2"+
		"\2\32\u00d4\3\2\2\2\34\u00d6\3\2\2\2\36\u00ea\3\2\2\2 \u00f5\3\2\2\2\""+
		"\u00f8\3\2\2\2$\u00fa\3\2\2\2&\u00fc\3\2\2\2(\u0109\3\2\2\2*\u010b\3\2"+
		"\2\2,\u0110\3\2\2\2.\u0118\3\2\2\2\60\u011c\3\2\2\2\62\u011e\3\2\2\2\64"+
		"\u0120\3\2\2\2\66\u0128\3\2\2\28\u012f\3\2\2\2:\u0137\3\2\2\2<\u013c\3"+
		"\2\2\2>\u0144\3\2\2\2@\u0149\3\2\2\2B\u015a\3\2\2\2D\u015c\3\2\2\2F\u016d"+
		"\3\2\2\2H\u016f\3\2\2\2J\u0175\3\2\2\2L\u0178\3\2\2\2N\u017b\3\2\2\2P"+
		"\u0182\3\2\2\2R\u0184\3\2\2\2T\u0186\3\2\2\2V\u0188\3\2\2\2X\u018a\3\2"+
		"\2\2Z\u018c\3\2\2\2\\\u0191\3\2\2\2^\u019a\3\2\2\2`\u019d\3\2\2\2b\u01a5"+
		"\3\2\2\2d\u01a7\3\2\2\2f\u01a9\3\2\2\2hj\5\4\3\2ih\3\2\2\2jm\3\2\2\2k"+
		"i\3\2\2\2kl\3\2\2\2l\3\3\2\2\2mk\3\2\2\2no\5f\64\2op\7\r\2\2pr\3\2\2\2"+
		"qn\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5^\60\2tv\5d\63\2ut\3\2\2\2uv\3\2\2\2"+
		"vw\3\2\2\2wy\7\27\2\2xz\5`\61\2yx\3\2\2\2yz\3\2\2\2z\177\3\2\2\2{|\7#"+
		"\2\2|}\5\6\4\2}~\7$\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177\u0080\3\2\2\2"+
		"\u0080\5\3\2\2\2\u0081\u0083\5\b\5\2\u0082\u0081\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\7\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u008c\7\13\2\2\u0088\u0089\5f\64\2\u0089\u008a\7\r\2\2"+
		"\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\n\6\2\u008e\t\3\2\2\2\u008f"+
		"\u0092\5\f\7\2\u0090\u0092\5\16\b\2\u0091\u008f\3\2\2\2\u0091\u0090\3"+
		"\2\2\2\u0092\13\3\2\2\2\u0093\u0095\5^\60\2\u0094\u0096\5d\63\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5b"+
		"\62\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\5`\61\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009f\5f\64\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a3\5\30\r\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\33\2\2\u00a5"+
		"\r\3\2\2\2\u00a6\u00a8\5^\60\2\u00a7\u00a9\5d\63\2\u00a8\u00a7\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5b\62\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\5`\61\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\5f"+
		"\64\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\7\5\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\5"+
		"\20\t\2\u00b7\17\3\2\2\2\u00b8\u00bb\5Z.\2\u00b9\u00bb\5\22\n\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\21\3\2\2\2\u00bc\u00bd\7#\2\2"+
		"\u00bd\u00be\5,\27\2\u00be\u00bf\7$\2\2\u00bf\23\3\2\2\2\u00c0\u00c5\5"+
		"\26\f\2\u00c1\u00c2\7\4\2\2\u00c2\u00c4\5\26\f\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\25\3\2\2\2\u00ca\u00cb\5`\61\2\u00cb\u00cc\5f\64\2\u00cc\27\3\2\2\2\u00cd"+
		"\u00ce\5\32\16\2\u00ce\31\3\2\2\2\u00cf\u00d0\5f\64\2\u00d0\u00d1\7\r"+
		"\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5\34\17\2\u00d4"+
		"\u00cf\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00dc\5\36\20"+
		"\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9\5\36\20\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\35\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00eb\5&\24\2\u00e0\u00eb"+
		"\5P)\2\u00e1\u00eb\5*\26\2\u00e2\u00eb\5$\23\2\u00e3\u00eb\5\62\32\2\u00e4"+
		"\u00eb\5\64\33\2\u00e5\u00eb\5\66\34\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8"+
		"\5\30\r\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00df\3\2\2\2"+
		"\u00ea\u00e0\3\2\2\2\u00ea\u00e1\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e3"+
		"\3\2\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\5 \21\2\u00ed\37\3\2\2\2\u00ee\u00f1\7\35\2"+
		"\2\u00ef\u00f2\5*\26\2\u00f0\u00f2\5&\24\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f8\u00f9\t\2\2\2\u00f9#\3\2\2\2\u00fa\u00fb\7\17\2\2\u00fb%\3\2\2"+
		"\2\u00fc\u00fd\5f\64\2\u00fd\u00fe\7\5\2\2\u00fe\u00ff\5(\25\2\u00ff\u0100"+
		"\7\6\2\2\u0100\'\3\2\2\2\u0101\u0106\5\30\r\2\u0102\u0103\7\4\2\2\u0103"+
		"\u0105\5\30\r\2\u0104\u0102\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u010a\3\2\2\2\u010a)\3\2\2\2\u010b\u010c\5f\64\2"+
		"\u010c+\3\2\2\2\u010d\u010f\5.\30\2\u010e\u010d\3\2\2\2\u010f\u0112\3"+
		"\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111-\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0113\u0119\5Z.\2\u0114\u0119\5\60\31\2\u0115\u0116\5F$\2\u0116"+
		"\u0117\7\33\2\2\u0117\u0119\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3"+
		"\2\2\2\u0118\u0115\3\2\2\2\u0119/\3\2\2\2\u011a\u011d\58\35\2\u011b\u011d"+
		"\5@!\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\61\3\2\2\2\u011e"+
		"\u011f\7\3\2\2\u011f\63\3\2\2\2\u0120\u0126\7\t\2\2\u0121\u0127\5\30\r"+
		"\2\u0122\u0123\7#\2\2\u0123\u0124\5,\27\2\u0124\u0125\7$\2\2\u0125\u0127"+
		"\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0127\65\3\2\2\2\u0128"+
		"\u012d\7\n\2\2\u0129\u012e\5\30\r\2\u012a\u012e\5\60\31\2\u012b\u012e"+
		"\5F$\2\u012c\u012e\5\22\n\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\67\3\2\2\2\u012f\u0135\5:\36"+
		"\2\u0130\u0132\5<\37\2\u0131\u0133\5> \2\u0132\u0131\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0136\5> \2\u0135\u0130\3\2\2\2\u0135"+
		"\u0134\3\2\2\2\u01369\3\2\2\2\u0137\u0138\7\20\2\2\u0138\u0139\7#\2\2"+
		"\u0139\u013a\5,\27\2\u013a\u013b\7$\2\2\u013b;\3\2\2\2\u013c\u013d\7\21"+
		"\2\2\u013d\u013e\7\5\2\2\u013e\u013f\5\26\f\2\u013f\u0140\7\6\2\2\u0140"+
		"\u0141\7#\2\2\u0141\u0142\5,\27\2\u0142\u0143\7$\2\2\u0143=\3\2\2\2\u0144"+
		"\u0145\7\22\2\2\u0145\u0146\7#\2\2\u0146\u0147\5,\27\2\u0147\u0148\7$"+
		"\2\2\u0148?\3\2\2\2\u0149\u014a\7\23\2\2\u014a\u014b\7\5\2\2\u014b\u014c"+
		"\5\30\r\2\u014c\u014d\7\6\2\2\u014d\u014f\5B\"\2\u014e\u0150\5D#\2\u014f"+
		"\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150A\3\2\2\2\u0151\u0155\7#\2\2\u0152"+
		"\u0154\5.\30\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015b\7$\2\2\u0159\u015b\5.\30\2\u015a\u0151\3\2\2\2\u015a\u0159\3\2"+
		"\2\2\u015bC\3\2\2\2\u015c\u0166\7\24\2\2\u015d\u0161\7#\2\2\u015e\u0160"+
		"\5.\30\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0167\7$"+
		"\2\2\u0165\u0167\5.\30\2\u0166\u015d\3\2\2\2\u0166\u0165\3\2\2\2\u0167"+
		"E\3\2\2\2\u0168\u016e\5J&\2\u0169\u016e\5L\'\2\u016a\u016e\5H%\2\u016b"+
		"\u016e\5N(\2\u016c\u016e\5\30\r\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2"+
		"\2\2\u016d\u016a\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016c\3\2\2\2\u016e"+
		"G\3\2\2\2\u016f\u0170\5`\61\2\u0170\u0173\5f\64\2\u0171\u0172\7\r\2\2"+
		"\u0172\u0174\5\30\r\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174I\3"+
		"\2\2\2\u0175\u0176\7\25\2\2\u0176\u0177\5\30\r\2\u0177K\3\2\2\2\u0178"+
		"\u0179\7\26\2\2\u0179\u017a\5\30\r\2\u017aM\3\2\2\2\u017b\u017c\7\7\2"+
		"\2\u017c\u017d\5\30\r\2\u017dO\3\2\2\2\u017e\u0183\5R*\2\u017f\u0183\5"+
		"T+\2\u0180\u0183\5V,\2\u0181\u0183\5X-\2\u0182\u017e\3\2\2\2\u0182\u017f"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183Q\3\2\2\2\u0184"+
		"\u0185\7\'\2\2\u0185S\3\2\2\2\u0186\u0187\7%\2\2\u0187U\3\2\2\2\u0188"+
		"\u0189\7&\2\2\u0189W\3\2\2\2\u018a\u018b\t\3\2\2\u018bY\3\2\2\2\u018c"+
		"\u018d\7\t\2\2\u018d\u018e\7#\2\2\u018e\u018f\5,\27\2\u018f\u0190\7$\2"+
		"\2\u0190[\3\2\2\2\u0191\u0193\7\b\2\2\u0192\u0194\7\13\2\2\u0193\u0192"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5`\61\2\u0196"+
		"]\3\2\2\2\u0197\u0199\5\\/\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b_\3\2\2\2\u019c\u019a\3\2\2\2"+
		"\u019d\u01a2\5f\64\2\u019e\u019f\7\35\2\2\u019f\u01a1\5f\64\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"a\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7!\2\2\u01a6c\3\2\2\2\u01a7"+
		"\u01a8\t\4\2\2\u01a8e\3\2\2\2\u01a9\u01aa\7\"\2\2\u01aag\3\2\2\2/kquy"+
		"\177\u0084\u008b\u0091\u0095\u0098\u009b\u009e\u00a2\u00a8\u00ab\u00ae"+
		"\u00b1\u00ba\u00c5\u00c8\u00d4\u00dc\u00ea\u00f1\u00f5\u0106\u0109\u0110"+
		"\u0118\u011c\u0126\u012d\u0132\u0135\u014f\u0155\u015a\u0161\u0166\u016d"+
		"\u0173\u0182\u0193\u019a\u01a2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}