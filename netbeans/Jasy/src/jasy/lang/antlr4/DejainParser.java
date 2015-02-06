// Generated from C:\github\dejain\netbeans\Dejain\src\dejain\lang\antlr4\Dejain.g4 by ANTLR 4.1
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
public class DejainParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, AT=5, DOLLAR=6, HASH=7, 
		PLUS=8, MINUS=9, ASSIGN_OP=10, REPLACE_OP=11, KW_THIS_RESULT=12, KW_TRY=13, 
		KW_CATCH=14, KW_FINALLY=15, KW_IF=16, KW_ELSE=17, KW_RETURN=18, KW_THROW=19, 
		KW_CLASS=20, KW_TRUE=21, KW_FALSE=22, WILD_CARD=23, SEMI_COLON=24, COLON=25, 
		DOT=26, ACC_MOD_PUBLIC=27, ACC_MOD_PRIVATE=28, ACC_MOD_PROTECTED=29, MOD_STATIC=30, 
		ID=31, OPEN_BRA=32, CLOSE_BRA=33, INTEGER=34, LONG=35, STRING=36, WS=37, 
		SINGLELINE_COMMENT=38, MULTI_LINE_COMMENT=39;
	public static final String[] tokenNames = {
		"<INVALID>", "'...'", "','", "'('", "')'", "'@'", "'$'", "'#'", "'+'", 
		"'-'", "'='", "'=>'", "'thisResult'", "'try'", "'catch'", "'finally'", 
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
		RULE_literal = 38, RULE_stringLiteral = 39, RULE_integerLiteral = 40, 
		RULE_longLiteral = 41, RULE_booleanLiteral = 42, RULE_metaBlock = 43, 
		RULE_annotation = 44, RULE_annotations = 45, RULE_typeQualifier = 46, 
		RULE_modStatic = 47, RULE_accessModifier = 48, RULE_identifier = 49;
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
		"throwStatement", "literal", "stringLiteral", "integerLiteral", "longLiteral", 
		"booleanLiteral", "metaBlock", "annotation", "annotations", "typeQualifier", 
		"modStatic", "accessModifier", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "Dejain.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DejainParser(TokenStream input) {
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_CLASS) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << ID))) != 0)) {
				{
				{
				setState(100); classTransformer();
				}
				}
				setState(105);
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
		public TerminalNode KW_CLASS() { return getToken(DejainParser.KW_CLASS, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(DejainParser.ASSIGN_OP, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public ClassTransformerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformer(this);
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
			setState(109);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106); ((ClassTransformerContext)_localctx).variableId = identifier();
				setState(107); match(ASSIGN_OP);
				}
			}

			setState(111); annotations();
			setState(113);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(112); accessModifier();
				}
			}

			setState(115); match(KW_CLASS);
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(116); typeQualifier();
				}
				break;
			}
			setState(123);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(119); match(OPEN_BRA);
				setState(120); ((ClassTransformerContext)_localctx).members = classTransformerMembers();
				setState(121); match(CLOSE_BRA);
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMembers(this);
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
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << AT) | (1L << PLUS) | (1L << ASSIGN_OP) | (1L << SEMI_COLON) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << MOD_STATIC) | (1L << ID))) != 0)) {
				{
				{
				setState(125); classTransformerMemberDefinition();
				}
				}
				setState(130);
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
		public TerminalNode ASSIGN_OP() { return getToken(DejainParser.ASSIGN_OP, 0); }
		public ClassTransformerMemberContext classTransformerMember() {
			return getRuleContext(ClassTransformerMemberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DejainParser.PLUS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassTransformerMemberDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMemberDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberDefinitionContext classTransformerMemberDefinition() throws RecognitionException {
		ClassTransformerMemberDefinitionContext _localctx = new ClassTransformerMemberDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classTransformerMemberDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(131); match(PLUS);
				}
				break;

			case 2:
				{
				{
				setState(132); ((ClassTransformerMemberDefinitionContext)_localctx).variableId = identifier();
				setState(133); match(ASSIGN_OP);
				}
				}
				break;
			}
			setState(137); ((ClassTransformerMemberDefinitionContext)_localctx).member = classTransformerMember();
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberContext classTransformerMember() throws RecognitionException {
		ClassTransformerMemberContext _localctx = new ClassTransformerMemberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classTransformerMember);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); classTransformerMemberField();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); classTransformerMemberMethod();
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
		public TerminalNode SEMI_COLON() { return getToken(DejainParser.SEMI_COLON, 0); }
		public ModStaticContext modStatic() {
			return getRuleContext(ModStaticContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(DejainParser.ASSIGN_OP, 0); }
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMemberField(this);
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
			setState(143); annotations();
			setState(145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(144); accessModifier();
				}
			}

			setState(148);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(147); modStatic();
				}
			}

			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(150); typeQualifier();
				}
				break;
			}
			setState(154);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(153); identifier();
				}
			}

			setState(158);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(156); match(ASSIGN_OP);
				setState(157); ((ClassTransformerMemberFieldContext)_localctx).value = expression();
				}
			}

			setState(160); match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN_PAR() { return getToken(DejainParser.OPEN_PAR, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DejainParser.CLOSE_PAR, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public ClassTransformerMemberMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMemberMethod(this);
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
			setState(162); annotations();
			setState(164);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(163); accessModifier();
				}
			}

			setState(167);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(166); modStatic();
				}
			}

			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(169); typeQualifier();
				}
				break;
			}
			setState(173);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(172); identifier();
				}
			}

			setState(175); match(OPEN_PAR);
			setState(176); parameters();
			setState(177); match(CLOSE_PAR);
			setState(178); ((ClassTransformerMemberMethodContext)_localctx).body = classTransformerMemberMethodBlody();
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMemberMethodBlody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberMethodBlodyContext classTransformerMemberMethodBlody() throws RecognitionException {
		ClassTransformerMemberMethodBlodyContext _localctx = new ClassTransformerMemberMethodBlodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classTransformerMemberMethodBlody);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); metaBlock();
				}
				break;
			case OPEN_BRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(181); block();
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
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(OPEN_BRA);
			setState(185); statements();
			setState(186); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(DejainParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DejainParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitParameters(this);
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
			setState(196);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(188); parameter();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(189); match(COMMA);
					setState(190); parameter();
					}
					}
					setState(195);
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); typeQualifier();
			setState(199); identifier();
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); variableAssignment();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ASSIGN_OP() { return getToken(DejainParser.ASSIGN_OP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableAssignment);
		try {
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); identifier();
				setState(204); match(ASSIGN_OP);
				setState(205); ((VariableAssignmentContext)_localctx).value = variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); binarySum();
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitBinarySum(this);
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
			setState(210); ((BinarySumContext)_localctx).first = leafExpression();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(211); binarySumOperator();
					setState(212); ((BinarySumContext)_localctx).rest = leafExpression();
					}
					} 
				}
				setState(218);
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
		public TerminalNode OPEN_PAR() { return getToken(DejainParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThisResultContext thisResult() {
			return getRuleContext(ThisResultContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DejainParser.CLOSE_PAR, 0); }
		public LeafExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leafExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitLeafExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeafExpressionContext leafExpression() throws RecognitionException {
		LeafExpressionContext _localctx = new LeafExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_leafExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(219); invocation();
				}
				break;

			case 2:
				{
				setState(220); literal();
				}
				break;

			case 3:
				{
				setState(221); lookup();
				}
				break;

			case 4:
				{
				setState(222); thisResult();
				}
				break;

			case 5:
				{
				setState(223); proceedStatement();
				}
				break;

			case 6:
				{
				setState(224); metaExpression();
				}
				break;

			case 7:
				{
				setState(225); quotedExpression();
				}
				break;

			case 8:
				{
				setState(226); match(OPEN_PAR);
				setState(227); expression();
				setState(228); match(CLOSE_PAR);
				}
				break;
			}
			setState(232); leafExpressionChain();
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> DOT() { return getTokens(DejainParser.DOT); }
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
			return getToken(DejainParser.DOT, i);
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitLeafExpressionChain(this);
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
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(234); match(DOT);
					setState(237);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(235); lookup();
						}
						break;

					case 2:
						{
						setState(236); invocation();
						}
						break;
					}
					}
					} 
				}
				setState(243);
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
		public TerminalNode PLUS() { return getToken(DejainParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DejainParser.MINUS, 0); }
		public BinarySumOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarySumOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitBinarySumOperator(this);
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
			setState(244);
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
		public TerminalNode KW_THIS_RESULT() { return getToken(DejainParser.KW_THIS_RESULT, 0); }
		public ThisResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisResult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitThisResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisResultContext thisResult() throws RecognitionException {
		ThisResultContext _localctx = new ThisResultContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_thisResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(KW_THIS_RESULT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN_PAR() { return getToken(DejainParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DejainParser.CLOSE_PAR, 0); }
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); identifier();
			setState(249); match(OPEN_PAR);
			setState(250); arguments();
			setState(251); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
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
		public List<TerminalNode> COMMA() { return getTokens(DejainParser.COMMA); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DejainParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitArguments(this);
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
			setState(261);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(253); expression();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(254); match(COMMA);
					setState(255); expression();
					}
					}
					setState(260);
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); identifier();
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitStatements(this);
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
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				{
				setState(265); statement();
				}
				}
				setState(270);
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
		public TerminalNode SEMI_COLON() { return getToken(DejainParser.SEMI_COLON, 0); }
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		try {
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); metaBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272); nonDelimitedStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273); delimitedStatement();
				setState(274); match(SEMI_COLON);
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitNonDelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonDelimitedStatementContext nonDelimitedStatement() throws RecognitionException {
		NonDelimitedStatementContext _localctx = new NonDelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nonDelimitedStatement);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case KW_TRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); tryCatchStatement();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); ifElseStatement();
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
		public TerminalNode ELLIPSES() { return getToken(DejainParser.ELLIPSES, 0); }
		public ProceedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proceedStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitProceedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProceedStatementContext proceedStatement() throws RecognitionException {
		ProceedStatementContext _localctx = new ProceedStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_proceedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(ELLIPSES);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DOLLAR() { return getToken(DejainParser.DOLLAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public MetaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitMetaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaExpressionContext metaExpression() throws RecognitionException {
		MetaExpressionContext _localctx = new MetaExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_metaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(DOLLAR);
			setState(290);
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
				setState(285); expression();
				}
				break;
			case OPEN_BRA:
				{
				setState(286); match(OPEN_BRA);
				setState(287); statements();
				setState(288); match(CLOSE_BRA);
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
		public DelimitedStatementContext delimitedStatement() {
			return getRuleContext(DelimitedStatementContext.class,0);
		}
		public TerminalNode HASH() { return getToken(DejainParser.HASH, 0); }
		public QuotedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitQuotedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedExpressionContext quotedExpression() throws RecognitionException {
		QuotedExpressionContext _localctx = new QuotedExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_quotedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(HASH);
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(293); expression();
				}
				break;

			case 2:
				{
				setState(294); nonDelimitedStatement();
				}
				break;

			case 3:
				{
				setState(295); delimitedStatement();
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitTryCatchStatement(this);
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
			setState(298); tryStatement();
			setState(304);
			switch (_input.LA(1)) {
			case KW_CATCH:
				{
				{
				setState(299); catchStatement();
				setState(301);
				_la = _input.LA(1);
				if (_la==KW_FINALLY) {
					{
					setState(300); finallyStatement();
					}
				}

				}
				}
				break;
			case KW_FINALLY:
				{
				setState(303); finallyStatement();
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
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode KW_TRY() { return getToken(DejainParser.KW_TRY, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(KW_TRY);
			setState(307); match(OPEN_BRA);
			setState(308); statements();
			setState(309); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode KW_CATCH() { return getToken(DejainParser.KW_CATCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(DejainParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DejainParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public CatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchStatementContext catchStatement() throws RecognitionException {
		CatchStatementContext _localctx = new CatchStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(KW_CATCH);
			setState(312); match(OPEN_PAR);
			setState(313); parameter();
			setState(314); match(CLOSE_PAR);
			setState(315); match(OPEN_BRA);
			setState(316); statements();
			setState(317); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode KW_FINALLY() { return getToken(DejainParser.KW_FINALLY, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public FinallyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitFinallyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyStatementContext finallyStatement() throws RecognitionException {
		FinallyStatementContext _localctx = new FinallyStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(KW_FINALLY);
			setState(320); match(OPEN_BRA);
			setState(321); statements();
			setState(322); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN_PAR() { return getToken(DejainParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfFalseBlockContext ifFalseBlock() {
			return getRuleContext(IfFalseBlockContext.class,0);
		}
		public TerminalNode KW_IF() { return getToken(DejainParser.KW_IF, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DejainParser.CLOSE_PAR, 0); }
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(KW_IF);
			setState(325); match(OPEN_PAR);
			setState(326); ((IfElseStatementContext)_localctx).condition = expression();
			setState(327); match(CLOSE_PAR);
			setState(328); ifTrueBlock();
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(329); ifFalseBlock();
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
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public IfTrueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTrueBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitIfTrueBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfTrueBlockContext ifTrueBlock() throws RecognitionException {
		IfTrueBlockContext _localctx = new IfTrueBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifTrueBlock);
		int _la;
		try {
			setState(341);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(332); match(OPEN_BRA);
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(333); statement();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
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
				setState(340); statement();
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
		public TerminalNode KW_ELSE() { return getToken(DejainParser.KW_ELSE, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public IfFalseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifFalseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitIfFalseBlock(this);
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
			setState(343); match(KW_ELSE);
			setState(353);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				{
				setState(344); match(OPEN_BRA);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(345); statement();
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
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
				setState(352); statement();
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitDelimitedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimitedStatementContext delimitedStatement() throws RecognitionException {
		DelimitedStatementContext _localctx = new DelimitedStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_delimitedStatement);
		try {
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355); returnStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); throwStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357); variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358); expression();
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
		public TerminalNode ASSIGN_OP() { return getToken(DejainParser.ASSIGN_OP, 0); }
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitVariableDeclaration(this);
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
			setState(361); typeQualifier();
			setState(362); ((VariableDeclarationContext)_localctx).id = identifier();
			setState(365);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(363); match(ASSIGN_OP);
				setState(364); ((VariableDeclarationContext)_localctx).value = expression();
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
		public TerminalNode KW_RETURN() { return getToken(DejainParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(KW_RETURN);
			setState(368); expression();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode KW_THROW() { return getToken(DejainParser.KW_THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(KW_THROW);
			setState(371); expression();
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literal);
		try {
			setState(377);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(373); stringLiteral();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(374); integerLiteral();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 3);
				{
				setState(375); longLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(376); booleanLiteral();
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
		public TerminalNode STRING() { return getToken(DejainParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode INTEGER() { return getToken(DejainParser.INTEGER, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LONG() { return getToken(DejainParser.LONG, 0); }
		public LongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitLongLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongLiteralContext longLiteral() throws RecognitionException {
		LongLiteralContext _localctx = new LongLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); match(LONG);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode KW_TRUE() { return getToken(DejainParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(DejainParser.KW_FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		public TerminalNode DOLLAR() { return getToken(DejainParser.DOLLAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public MetaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitMetaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaBlockContext metaBlock() throws RecognitionException {
		MetaBlockContext _localctx = new MetaBlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_metaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(DOLLAR);
			setState(388); match(OPEN_BRA);
			setState(389); statements();
			setState(390); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AT() { return getToken(DejainParser.AT, 0); }
		public TerminalNode PLUS() { return getToken(DejainParser.PLUS, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(AT);
			setState(394);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(393); match(PLUS);
				}
			}

			setState(396); typeQualifier();
			}
		}
		catch (RecognitionException re) {
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(398); annotation();
				}
				}
				setState(403);
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
		public List<TerminalNode> DOT() { return getTokens(DejainParser.DOT); }
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(DejainParser.DOT, i);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); identifier();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(405); match(DOT);
				setState(406); identifier();
				}
				}
				setState(411);
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
		public TerminalNode MOD_STATIC() { return getToken(DejainParser.MOD_STATIC, 0); }
		public ModStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modStatic; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitModStatic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModStaticContext modStatic() throws RecognitionException {
		ModStaticContext _localctx = new ModStaticContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_modStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); match(MOD_STATIC);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ACC_MOD_PROTECTED() { return getToken(DejainParser.ACC_MOD_PROTECTED, 0); }
		public TerminalNode ACC_MOD_PRIVATE() { return getToken(DejainParser.ACC_MOD_PRIVATE, 0); }
		public TerminalNode ACC_MOD_PUBLIC() { return getToken(DejainParser.ACC_MOD_PUBLIC, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
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
		public TerminalNode ID() { return getToken(DejainParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3)\u01a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\7\2"+
		"h\n\2\f\2\16\2k\13\2\3\3\3\3\3\3\5\3p\n\3\3\3\3\3\5\3t\n\3\3\3\3\3\5\3"+
		"x\n\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4\3"+
		"\5\3\5\3\5\3\5\5\5\u008a\n\5\3\5\3\5\3\6\3\6\5\6\u0090\n\6\3\7\3\7\5\7"+
		"\u0094\n\7\3\7\5\7\u0097\n\7\3\7\5\7\u009a\n\7\3\7\5\7\u009d\n\7\3\7\3"+
		"\7\5\7\u00a1\n\7\3\7\3\7\3\b\3\b\5\b\u00a7\n\b\3\b\5\b\u00aa\n\b\3\b\5"+
		"\b\u00ad\n\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00b9\n"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00c2\n\13\f\13\16\13\u00c5\13"+
		"\13\5\13\u00c7\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00d3\n\16\3\17\3\17\3\17\3\17\7\17\u00d9\n\17\f\17\16\17\u00dc\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e9\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\5\21\u00f0\n\21\7\21\u00f2\n\21\f\21\16\21\u00f5"+
		"\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25"+
		"\u0103\n\25\f\25\16\25\u0106\13\25\5\25\u0108\n\25\3\26\3\26\3\27\7\27"+
		"\u010d\n\27\f\27\16\27\u0110\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u0117"+
		"\n\30\3\31\3\31\5\31\u011b\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0125\n\33\3\34\3\34\3\34\3\34\5\34\u012b\n\34\3\35\3\35\3\35\5"+
		"\35\u0130\n\35\3\35\5\35\u0133\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u014d"+
		"\n!\3\"\3\"\7\"\u0151\n\"\f\"\16\"\u0154\13\"\3\"\3\"\5\"\u0158\n\"\3"+
		"#\3#\3#\7#\u015d\n#\f#\16#\u0160\13#\3#\3#\5#\u0164\n#\3$\3$\3$\3$\5$"+
		"\u016a\n$\3%\3%\3%\3%\5%\u0170\n%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\5("+
		"\u017c\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\3.\3.\5.\u018d\n.\3."+
		"\3.\3/\7/\u0192\n/\f/\16/\u0195\13/\3\60\3\60\3\60\7\60\u019a\n\60\f\60"+
		"\16\60\u019d\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\2\64\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bd\2\5\3\2\n\13\3\2\27\30\3\2\35\37\u01ac\2i\3\2\2\2\4o\3\2\2\2\6\u0082"+
		"\3\2\2\2\b\u0089\3\2\2\2\n\u008f\3\2\2\2\f\u0091\3\2\2\2\16\u00a4\3\2"+
		"\2\2\20\u00b8\3\2\2\2\22\u00ba\3\2\2\2\24\u00c6\3\2\2\2\26\u00c8\3\2\2"+
		"\2\30\u00cb\3\2\2\2\32\u00d2\3\2\2\2\34\u00d4\3\2\2\2\36\u00e8\3\2\2\2"+
		" \u00f3\3\2\2\2\"\u00f6\3\2\2\2$\u00f8\3\2\2\2&\u00fa\3\2\2\2(\u0107\3"+
		"\2\2\2*\u0109\3\2\2\2,\u010e\3\2\2\2.\u0116\3\2\2\2\60\u011a\3\2\2\2\62"+
		"\u011c\3\2\2\2\64\u011e\3\2\2\2\66\u0126\3\2\2\28\u012c\3\2\2\2:\u0134"+
		"\3\2\2\2<\u0139\3\2\2\2>\u0141\3\2\2\2@\u0146\3\2\2\2B\u0157\3\2\2\2D"+
		"\u0159\3\2\2\2F\u0169\3\2\2\2H\u016b\3\2\2\2J\u0171\3\2\2\2L\u0174\3\2"+
		"\2\2N\u017b\3\2\2\2P\u017d\3\2\2\2R\u017f\3\2\2\2T\u0181\3\2\2\2V\u0183"+
		"\3\2\2\2X\u0185\3\2\2\2Z\u018a\3\2\2\2\\\u0193\3\2\2\2^\u0196\3\2\2\2"+
		"`\u019e\3\2\2\2b\u01a0\3\2\2\2d\u01a2\3\2\2\2fh\5\4\3\2gf\3\2\2\2hk\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2j\3\3\2\2\2ki\3\2\2\2lm\5d\63\2mn\7\f\2\2np"+
		"\3\2\2\2ol\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\5\\/\2rt\5b\62\2sr\3\2\2\2st"+
		"\3\2\2\2tu\3\2\2\2uw\7\26\2\2vx\5^\60\2wv\3\2\2\2wx\3\2\2\2x}\3\2\2\2"+
		"yz\7\"\2\2z{\5\6\4\2{|\7#\2\2|~\3\2\2\2}y\3\2\2\2}~\3\2\2\2~\5\3\2\2\2"+
		"\177\u0081\5\b\5\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\7\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008a"+
		"\7\n\2\2\u0086\u0087\5d\63\2\u0087\u0088\7\f\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\5\n\6\2\u008c\t\3\2\2\2\u008d\u0090\5\f\7\2\u008e\u0090"+
		"\5\16\b\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\13\3\2\2\2\u0091"+
		"\u0093\5\\/\2\u0092\u0094\5b\62\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5`\61\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5^\60\2\u0099\u0098\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\5d\63\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\7\f"+
		"\2\2\u009f\u00a1\5\30\r\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\7\32\2\2\u00a3\r\3\2\2\2\u00a4\u00a6\5\\/\2"+
		"\u00a5\u00a7\5b\62\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00aa\5`\61\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00ad\5^\60\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0\5d\63\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\5\24"+
		"\13\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\5\20\t\2\u00b5\17\3\2\2\2\u00b6"+
		"\u00b9\5X-\2\u00b7\u00b9\5\22\n\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\21\3\2\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\5,\27\2\u00bc\u00bd"+
		"\7#\2\2\u00bd\23\3\2\2\2\u00be\u00c3\5\26\f\2\u00bf\u00c0\7\4\2\2\u00c0"+
		"\u00c2\5\26\f\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\25\3\2\2\2\u00c8\u00c9\5^\60"+
		"\2\u00c9\u00ca\5d\63\2\u00ca\27\3\2\2\2\u00cb\u00cc\5\32\16\2\u00cc\31"+
		"\3\2\2\2\u00cd\u00ce\5d\63\2\u00ce\u00cf\7\f\2\2\u00cf\u00d0\5\32\16\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00d3\5\34\17\2\u00d2\u00cd\3\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00da\5\36\20\2\u00d5\u00d6\5\"\22\2\u00d6"+
		"\u00d7\5\36\20\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\35\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00e9\5&\24\2\u00de\u00e9\5N(\2\u00df\u00e9\5*\26"+
		"\2\u00e0\u00e9\5$\23\2\u00e1\u00e9\5\62\32\2\u00e2\u00e9\5\64\33\2\u00e3"+
		"\u00e9\5\66\34\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7"+
		"\7\6\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8"+
		"\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2"+
		"\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\5 \21\2\u00eb\37\3\2\2\2\u00ec\u00ef\7\34\2\2\u00ed\u00f0\5*\26"+
		"\2\u00ee\u00f0\5&\24\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f2"+
		"\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4!\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\t\2\2\2"+
		"\u00f7#\3\2\2\2\u00f8\u00f9\7\16\2\2\u00f9%\3\2\2\2\u00fa\u00fb\5d\63"+
		"\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd\5(\25\2\u00fd\u00fe\7\6\2\2\u00fe\'"+
		"\3\2\2\2\u00ff\u0104\5\30\r\2\u0100\u0101\7\4\2\2\u0101\u0103\5\30\r\2"+
		"\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108)\3\2\2\2\u0109\u010a\5d\63\2\u010a+\3\2\2\2\u010b"+
		"\u010d\5.\30\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f-\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0117"+
		"\5X-\2\u0112\u0117\5\60\31\2\u0113\u0114\5F$\2\u0114\u0115\7\32\2\2\u0115"+
		"\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0117/\3\2\2\2\u0118\u011b\58\35\2\u0119\u011b\5@!\2\u011a\u0118"+
		"\3\2\2\2\u011a\u0119\3\2\2\2\u011b\61\3\2\2\2\u011c\u011d\7\3\2\2\u011d"+
		"\63\3\2\2\2\u011e\u0124\7\b\2\2\u011f\u0125\5\30\r\2\u0120\u0121\7\"\2"+
		"\2\u0121\u0122\5,\27\2\u0122\u0123\7#\2\2\u0123\u0125\3\2\2\2\u0124\u011f"+
		"\3\2\2\2\u0124\u0120\3\2\2\2\u0125\65\3\2\2\2\u0126\u012a\7\t\2\2\u0127"+
		"\u012b\5\30\r\2\u0128\u012b\5\60\31\2\u0129\u012b\5F$\2\u012a\u0127\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\67\3\2\2\2\u012c"+
		"\u0132\5:\36\2\u012d\u012f\5<\37\2\u012e\u0130\5> \2\u012f\u012e\3\2\2"+
		"\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u0133\5> \2\u0132\u012d"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u01339\3\2\2\2\u0134\u0135\7\17\2\2\u0135"+
		"\u0136\7\"\2\2\u0136\u0137\5,\27\2\u0137\u0138\7#\2\2\u0138;\3\2\2\2\u0139"+
		"\u013a\7\20\2\2\u013a\u013b\7\5\2\2\u013b\u013c\5\26\f\2\u013c\u013d\7"+
		"\6\2\2\u013d\u013e\7\"\2\2\u013e\u013f\5,\27\2\u013f\u0140\7#\2\2\u0140"+
		"=\3\2\2\2\u0141\u0142\7\21\2\2\u0142\u0143\7\"\2\2\u0143\u0144\5,\27\2"+
		"\u0144\u0145\7#\2\2\u0145?\3\2\2\2\u0146\u0147\7\22\2\2\u0147\u0148\7"+
		"\5\2\2\u0148\u0149\5\30\r\2\u0149\u014a\7\6\2\2\u014a\u014c\5B\"\2\u014b"+
		"\u014d\5D#\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014dA\3\2\2\2\u014e"+
		"\u0152\7\"\2\2\u014f\u0151\5.\30\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u0158\7#\2\2\u0156\u0158\5.\30\2\u0157\u014e\3\2"+
		"\2\2\u0157\u0156\3\2\2\2\u0158C\3\2\2\2\u0159\u0163\7\23\2\2\u015a\u015e"+
		"\7\"\2\2\u015b\u015d\5.\30\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0161\u0164\7#\2\2\u0162\u0164\5.\30\2\u0163\u015a\3\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164E\3\2\2\2\u0165\u016a\5J&\2\u0166\u016a\5L\'\2\u0167"+
		"\u016a\5H%\2\u0168\u016a\5\30\r\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016aG\3\2\2\2\u016b\u016c"+
		"\5^\60\2\u016c\u016f\5d\63\2\u016d\u016e\7\f\2\2\u016e\u0170\5\30\r\2"+
		"\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170I\3\2\2\2\u0171\u0172\7"+
		"\24\2\2\u0172\u0173\5\30\r\2\u0173K\3\2\2\2\u0174\u0175\7\25\2\2\u0175"+
		"\u0176\5\30\r\2\u0176M\3\2\2\2\u0177\u017c\5P)\2\u0178\u017c\5R*\2\u0179"+
		"\u017c\5T+\2\u017a\u017c\5V,\2\u017b\u0177\3\2\2\2\u017b\u0178\3\2\2\2"+
		"\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017cO\3\2\2\2\u017d\u017e\7"+
		"&\2\2\u017eQ\3\2\2\2\u017f\u0180\7$\2\2\u0180S\3\2\2\2\u0181\u0182\7%"+
		"\2\2\u0182U\3\2\2\2\u0183\u0184\t\3\2\2\u0184W\3\2\2\2\u0185\u0186\7\b"+
		"\2\2\u0186\u0187\7\"\2\2\u0187\u0188\5,\27\2\u0188\u0189\7#\2\2\u0189"+
		"Y\3\2\2\2\u018a\u018c\7\7\2\2\u018b\u018d\7\n\2\2\u018c\u018b\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5^\60\2\u018f[\3"+
		"\2\2\2\u0190\u0192\5Z.\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194]\3\2\2\2\u0195\u0193\3\2\2\2"+
		"\u0196\u019b\5d\63\2\u0197\u0198\7\34\2\2\u0198\u019a\5d\63\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"_\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7 \2\2\u019fa\3\2\2\2\u01a0"+
		"\u01a1\t\4\2\2\u01a1c\3\2\2\2\u01a2\u01a3\7!\2\2\u01a3e\3\2\2\2/iosw}"+
		"\u0082\u0089\u008f\u0093\u0096\u0099\u009c\u00a0\u00a6\u00a9\u00ac\u00af"+
		"\u00b8\u00c3\u00c6\u00d2\u00da\u00e8\u00ef\u00f3\u0104\u0107\u010e\u0116"+
		"\u011a\u0124\u012a\u012f\u0132\u014c\u0152\u0157\u015e\u0163\u0169\u016f"+
		"\u017b\u018c\u0193\u019b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}