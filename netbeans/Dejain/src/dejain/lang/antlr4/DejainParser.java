// Generated from C:\github\dejain\netbeans\Dejain\src\dejain\lang\antlr4\Dejain.g4 by ANTLR 4.1
package dejain.lang.antlr4;
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
		ELLIPSES=1, COMMA=2, OPEN_PAR=3, CLOSE_PAR=4, AT=5, PLUS=6, MINUS=7, ASSIGN_OP=8, 
		REPLACE_OP=9, KW_THIS_RESULT=10, KW_TRY=11, KW_CATCH=12, KW_FINALLY=13, 
		KW_IF=14, KW_ELSE=15, KW_RETURN=16, KW_THROW=17, KW_CLASS=18, KW_TRUE=19, 
		KW_FALSE=20, WILD_CARD=21, SEMI_COLON=22, COLON=23, DOT=24, ACC_MOD_PUBLIC=25, 
		ACC_MOD_PRIVATE=26, ACC_MOD_PROTECTED=27, MOD_STATIC=28, ID=29, OPEN_BRA=30, 
		CLOSE_BRA=31, INTEGER=32, STRING=33, WS=34, SINGLELINE_COMMENT=35, MULTI_LINE_COMMENT=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'...'", "','", "'('", "')'", "'@'", "'+'", "'-'", "'='", 
		"'=>'", "'thisResult'", "'try'", "'catch'", "'finally'", "'if'", "'else'", 
		"'return'", "'throw'", "'class'", "'true'", "'false'", "'*'", "';'", "':'", 
		"'.'", "'public'", "'private'", "'protected'", "'static'", "ID", "'{'", 
		"'}'", "INTEGER", "STRING", "WS", "SINGLELINE_COMMENT", "MULTI_LINE_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_classTransformer = 1, RULE_classTransformerMembers = 2, 
		RULE_classTransformerMemberDefinition = 3, RULE_classTransformerMember = 4, 
		RULE_classTransformerMemberField = 5, RULE_classTransformerMemberFieldAdd = 6, 
		RULE_classTransformerMemberMethod = 7, RULE_classTransformerMemberMethodAdd = 8, 
		RULE_methodDefinition = 9, RULE_parameters = 10, RULE_parameter = 11, 
		RULE_expression = 12, RULE_variableAssignment = 13, RULE_binarySum = 14, 
		RULE_leafExpression = 15, RULE_binarySumOperator = 16, RULE_thisResult = 17, 
		RULE_invocation = 18, RULE_arguments = 19, RULE_lookup = 20, RULE_statements = 21, 
		RULE_statement = 22, RULE_nonDelimitedStatement = 23, RULE_proceedStatement = 24, 
		RULE_tryCatchStatement = 25, RULE_tryStatement = 26, RULE_catchStatement = 27, 
		RULE_finallyStatement = 28, RULE_ifElseStatement = 29, RULE_ifTrueBlock = 30, 
		RULE_ifFalseBlock = 31, RULE_delimitedStatement = 32, RULE_variableDeclaration = 33, 
		RULE_returnStatement = 34, RULE_throwStatement = 35, RULE_literal = 36, 
		RULE_stringLiteral = 37, RULE_integerLiteral = 38, RULE_booleanLiteral = 39, 
		RULE_annotation = 40, RULE_annotations = 41, RULE_typeQualifier = 42, 
		RULE_modStatic = 43, RULE_accessModifier = 44, RULE_identifier = 45;
	public static final String[] ruleNames = {
		"program", "classTransformer", "classTransformerMembers", "classTransformerMemberDefinition", 
		"classTransformerMember", "classTransformerMemberField", "classTransformerMemberFieldAdd", 
		"classTransformerMemberMethod", "classTransformerMemberMethodAdd", "methodDefinition", 
		"parameters", "parameter", "expression", "variableAssignment", "binarySum", 
		"leafExpression", "binarySumOperator", "thisResult", "invocation", "arguments", 
		"lookup", "statements", "statement", "nonDelimitedStatement", "proceedStatement", 
		"tryCatchStatement", "tryStatement", "catchStatement", "finallyStatement", 
		"ifElseStatement", "ifTrueBlock", "ifFalseBlock", "delimitedStatement", 
		"variableDeclaration", "returnStatement", "throwStatement", "literal", 
		"stringLiteral", "integerLiteral", "booleanLiteral", "annotation", "annotations", 
		"typeQualifier", "modStatic", "accessModifier", "identifier"
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << KW_CLASS) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				{
				setState(92); classTransformer();
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

	public static class ClassTransformerContext extends ParserRuleContext {
		public ClassTransformerMembersContext members;
		public ClassTransformerMembersContext classTransformerMembers() {
			return getRuleContext(ClassTransformerMembersContext.class,0);
		}
		public TerminalNode KW_CLASS() { return getToken(DejainParser.KW_CLASS, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
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
			setState(98); annotations();
			setState(100);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(99); accessModifier();
				}
			}

			setState(102); match(KW_CLASS);
			setState(104);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(103); typeQualifier();
				}
			}

			setState(110);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(106); match(OPEN_BRA);
				setState(107); ((ClassTransformerContext)_localctx).members = classTransformerMembers();
				setState(108); match(CLOSE_BRA);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << AT) | (1L << PLUS) | (1L << SEMI_COLON) | (1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED) | (1L << MOD_STATIC) | (1L << ID))) != 0)) {
				{
				{
				setState(112); classTransformerMemberDefinition();
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

	public static class ClassTransformerMemberDefinitionContext extends ParserRuleContext {
		public ClassTransformerMemberContext member;
		public ClassTransformerMemberContext classTransformerMember() {
			return getRuleContext(ClassTransformerMemberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DejainParser.PLUS, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(118); match(PLUS);
				}
			}

			setState(121); ((ClassTransformerMemberDefinitionContext)_localctx).member = classTransformerMember();
			}
		}
		catch (RecognitionException re) {
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
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123); classTransformerMemberField();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); classTransformerMemberMethod();
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
		public TerminalNode SEMI_COLON() { return getToken(DejainParser.SEMI_COLON, 0); }
		public ModStaticContext modStatic() {
			return getRuleContext(ModStaticContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(127); annotations();
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(128); accessModifier();
				}
			}

			setState(132);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(131); modStatic();
				}
			}

			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(134); typeQualifier();
				}
				break;
			}
			setState(138);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(137); identifier();
				}
			}

			setState(140); match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTransformerMemberFieldAddContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(DejainParser.SEMI_COLON, 0); }
		public ModStaticContext modStatic() {
			return getRuleContext(ModStaticContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(DejainParser.ASSIGN_OP, 0); }
		public TerminalNode PLUS() { return getToken(DejainParser.PLUS, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public ClassTransformerMemberFieldAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberFieldAdd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMemberFieldAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberFieldAddContext classTransformerMemberFieldAdd() throws RecognitionException {
		ClassTransformerMemberFieldAddContext _localctx = new ClassTransformerMemberFieldAddContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classTransformerMemberFieldAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(PLUS);
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

			setState(150); typeQualifier();
			setState(151); identifier();
			setState(154);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(152); match(ASSIGN_OP);
				setState(153); expression();
				}
			}

			setState(156); match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
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
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
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
		enterRule(_localctx, 14, RULE_classTransformerMemberMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); annotations();
			setState(160);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(159); accessModifier();
				}
			}

			setState(163);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(162); modStatic();
				}
			}

			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(165); typeQualifier();
				}
				break;
			}
			setState(169);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(168); identifier();
				}
			}

			setState(171); match(OPEN_PAR);
			setState(172); parameters();
			setState(173); match(CLOSE_PAR);
			setState(174); match(OPEN_BRA);
			setState(175); statements();
			setState(176); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTransformerMemberMethodAddContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DejainParser.PLUS, 0); }
		public ClassTransformerMemberMethodAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classTransformerMemberMethodAdd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitClassTransformerMemberMethodAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTransformerMemberMethodAddContext classTransformerMemberMethodAdd() throws RecognitionException {
		ClassTransformerMemberMethodAddContext _localctx = new ClassTransformerMemberMethodAddContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classTransformerMemberMethodAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(PLUS);
			setState(179); methodDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDefinitionContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ModStaticContext modStatic() {
			return getRuleContext(ModStaticContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(DejainParser.OPEN_PAR, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(DejainParser.CLOSE_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(DejainParser.CLOSE_BRA, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TerminalNode OPEN_BRA() { return getToken(DejainParser.OPEN_BRA, 0); }
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitMethodDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); annotations();
			setState(183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(182); accessModifier();
				}
			}

			setState(186);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(185); modStatic();
				}
			}

			setState(188); typeQualifier();
			setState(189); identifier();
			setState(190); match(OPEN_PAR);
			setState(191); parameters();
			setState(192); match(CLOSE_PAR);
			setState(193); match(OPEN_BRA);
			setState(194); statements();
			setState(195); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(197); parameter();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198); match(COMMA);
					setState(199); parameter();
					}
					}
					setState(204);
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
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); typeQualifier();
			setState(208); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); variableAssignment();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_variableAssignment);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); identifier();
				setState(213); match(ASSIGN_OP);
				setState(214); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); binarySum();
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
		enterRule(_localctx, 28, RULE_binarySum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); ((BinarySumContext)_localctx).first = leafExpression();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(220); binarySumOperator();
				setState(221); ((BinarySumContext)_localctx).rest = leafExpression();
				}
				}
				setState(227);
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

	public static class LeafExpressionContext extends ParserRuleContext {
		public ProceedStatementContext proceedStatement() {
			return getRuleContext(ProceedStatementContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
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
			if ( visitor instanceof DejainVisitor ) return ((DejainVisitor<? extends T>)visitor).visitLeafExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeafExpressionContext leafExpression() throws RecognitionException {
		LeafExpressionContext _localctx = new LeafExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leafExpression);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); invocation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); lookup();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231); thisResult();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232); proceedStatement();
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
			setState(235);
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
			setState(237); match(KW_THIS_RESULT);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OPEN_PAR() { return getToken(DejainParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(DejainParser.CLOSE_PAR, 0); }
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
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
			setState(239); typeQualifier();
			setState(240); match(OPEN_PAR);
			setState(241); arguments();
			setState(242); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
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
			setState(252);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << KW_THIS_RESULT) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(244); expression();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(245); match(COMMA);
					setState(246); expression();
					}
					}
					setState(251);
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
			setState(254); identifier();
			}
		}
		catch (RecognitionException re) {
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
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				{
				setState(256); statement();
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(DejainParser.SEMI_COLON, 0); }
		public NonDelimitedStatementContext nonDelimitedStatement() {
			return getRuleContext(NonDelimitedStatementContext.class,0);
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
			setState(266);
			switch (_input.LA(1)) {
			case KW_TRY:
			case KW_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); nonDelimitedStatement();
				}
				break;
			case ELLIPSES:
			case KW_THIS_RESULT:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case ID:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); delimitedStatement();
				setState(264); match(SEMI_COLON);
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
			setState(270);
			switch (_input.LA(1)) {
			case KW_TRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); tryCatchStatement();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); ifElseStatement();
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
			setState(272); match(ELLIPSES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); tryStatement();
			setState(280);
			switch (_input.LA(1)) {
			case KW_CATCH:
				{
				{
				setState(275); catchStatement();
				setState(277);
				_la = _input.LA(1);
				if (_la==KW_FINALLY) {
					{
					setState(276); finallyStatement();
					}
				}

				}
				}
				break;
			case KW_FINALLY:
				{
				setState(279); finallyStatement();
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
		enterRule(_localctx, 52, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(KW_TRY);
			setState(283); match(OPEN_BRA);
			setState(284); statements();
			setState(285); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 54, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(KW_CATCH);
			setState(288); match(OPEN_PAR);
			setState(289); parameter();
			setState(290); match(CLOSE_PAR);
			setState(291); match(OPEN_BRA);
			setState(292); statements();
			setState(293); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(KW_FINALLY);
			setState(296); match(OPEN_BRA);
			setState(297); statements();
			setState(298); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(KW_IF);
			setState(301); match(OPEN_PAR);
			setState(302); ((IfElseStatementContext)_localctx).condition = expression();
			setState(303); match(CLOSE_PAR);
			setState(304); ifTrueBlock();
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(305); ifFalseBlock();
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
		enterRule(_localctx, 60, RULE_ifTrueBlock);
		int _la;
		try {
			setState(317);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(308); match(OPEN_BRA);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << STRING))) != 0)) {
					{
					{
					setState(309); statement();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case KW_THIS_RESULT:
			case KW_TRY:
			case KW_IF:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case ID:
			case INTEGER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(316); statement();
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
		enterRule(_localctx, 62, RULE_ifFalseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(KW_ELSE);
			setState(329);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				{
				setState(320); match(OPEN_BRA);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << STRING))) != 0)) {
					{
					{
					setState(321); statement();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327); match(CLOSE_BRA);
				}
				break;
			case ELLIPSES:
			case KW_THIS_RESULT:
			case KW_TRY:
			case KW_IF:
			case KW_RETURN:
			case KW_THROW:
			case KW_TRUE:
			case KW_FALSE:
			case ID:
			case INTEGER:
			case STRING:
				{
				setState(328); statement();
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
		enterRule(_localctx, 64, RULE_delimitedStatement);
		try {
			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); returnStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); throwStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333); variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334); expression();
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
		enterRule(_localctx, 66, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); typeQualifier();
			setState(338); ((VariableDeclarationContext)_localctx).id = identifier();
			setState(341);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(339); match(ASSIGN_OP);
				setState(340); ((VariableDeclarationContext)_localctx).value = expression();
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
		enterRule(_localctx, 68, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); match(KW_RETURN);
			setState(344); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(KW_THROW);
			setState(347); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 72, RULE_literal);
		try {
			setState(352);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(349); stringLiteral();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(350); integerLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(351); booleanLiteral();
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
		enterRule(_localctx, 74, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		enterRule(_localctx, 80, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(AT);
			setState(362);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(361); match(PLUS);
				}
			}

			setState(364); typeQualifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(366); annotation();
				}
				}
				setState(371);
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
		enterRule(_localctx, 84, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372); identifier();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(373); match(DOT);
				setState(374); identifier();
				}
				}
				setState(379);
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
		enterRule(_localctx, 86, RULE_modStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); match(MOD_STATIC);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 90, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3&\u0185\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\3\3\3\5\3g\n\3\3"+
		"\3\3\3\5\3k\n\3\3\3\3\3\3\3\3\3\5\3q\n\3\3\4\7\4t\n\4\f\4\16\4w\13\4\3"+
		"\5\5\5z\n\5\3\5\3\5\3\6\3\6\5\6\u0080\n\6\3\7\3\7\5\7\u0084\n\7\3\7\5"+
		"\7\u0087\n\7\3\7\5\7\u008a\n\7\3\7\5\7\u008d\n\7\3\7\3\7\3\b\3\b\3\b\5"+
		"\b\u0094\n\b\3\b\5\b\u0097\n\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3"+
		"\t\3\t\5\t\u00a3\n\t\3\t\5\t\u00a6\n\t\3\t\5\t\u00a9\n\t\3\t\5\t\u00ac"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13\u00ba\n\13"+
		"\3\13\5\13\u00bd\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\7\f\u00cb\n\f\f\f\16\f\u00ce\13\f\5\f\u00d0\n\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\20\3\20"+
		"\7\20\u00e2\n\20\f\20\16\20\u00e5\13\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00ec\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\7\25\u00fa\n\25\f\25\16\25\u00fd\13\25\5\25\u00ff\n\25\3\26\3\26\3\27"+
		"\7\27\u0104\n\27\f\27\16\27\u0107\13\27\3\30\3\30\3\30\3\30\5\30\u010d"+
		"\n\30\3\31\3\31\5\31\u0111\n\31\3\32\3\32\3\33\3\33\3\33\5\33\u0118\n"+
		"\33\3\33\5\33\u011b\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0135\n\37\3 \3 \7 \u0139\n \f \16 \u013c\13 \3 \3 \5 \u0140"+
		"\n \3!\3!\3!\7!\u0145\n!\f!\16!\u0148\13!\3!\3!\5!\u014c\n!\3\"\3\"\3"+
		"\"\3\"\5\"\u0152\n\"\3#\3#\3#\3#\5#\u0158\n#\3$\3$\3$\3%\3%\3%\3&\3&\3"+
		"&\5&\u0163\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u016d\n*\3*\3*\3+\7+\u0172"+
		"\n+\f+\16+\u0175\13+\3,\3,\3,\7,\u017a\n,\f,\16,\u017d\13,\3-\3-\3.\3"+
		".\3/\3/\3/\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\\2\5\3\2\b\t\3\2\25\26\3\2\33\35\u0187\2a\3"+
		"\2\2\2\4d\3\2\2\2\6u\3\2\2\2\by\3\2\2\2\n\177\3\2\2\2\f\u0081\3\2\2\2"+
		"\16\u0090\3\2\2\2\20\u00a0\3\2\2\2\22\u00b4\3\2\2\2\24\u00b7\3\2\2\2\26"+
		"\u00cf\3\2\2\2\30\u00d1\3\2\2\2\32\u00d4\3\2\2\2\34\u00db\3\2\2\2\36\u00dd"+
		"\3\2\2\2 \u00eb\3\2\2\2\"\u00ed\3\2\2\2$\u00ef\3\2\2\2&\u00f1\3\2\2\2"+
		"(\u00fe\3\2\2\2*\u0100\3\2\2\2,\u0105\3\2\2\2.\u010c\3\2\2\2\60\u0110"+
		"\3\2\2\2\62\u0112\3\2\2\2\64\u0114\3\2\2\2\66\u011c\3\2\2\28\u0121\3\2"+
		"\2\2:\u0129\3\2\2\2<\u012e\3\2\2\2>\u013f\3\2\2\2@\u0141\3\2\2\2B\u0151"+
		"\3\2\2\2D\u0153\3\2\2\2F\u0159\3\2\2\2H\u015c\3\2\2\2J\u0162\3\2\2\2L"+
		"\u0164\3\2\2\2N\u0166\3\2\2\2P\u0168\3\2\2\2R\u016a\3\2\2\2T\u0173\3\2"+
		"\2\2V\u0176\3\2\2\2X\u017e\3\2\2\2Z\u0180\3\2\2\2\\\u0182\3\2\2\2^`\5"+
		"\4\3\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\3\3\2\2\2ca\3\2\2\2df"+
		"\5T+\2eg\5Z.\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\7\24\2\2ik\5V,\2ji\3\2"+
		"\2\2jk\3\2\2\2kp\3\2\2\2lm\7 \2\2mn\5\6\4\2no\7!\2\2oq\3\2\2\2pl\3\2\2"+
		"\2pq\3\2\2\2q\5\3\2\2\2rt\5\b\5\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v\7\3\2\2\2wu\3\2\2\2xz\7\b\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\5"+
		"\n\6\2|\t\3\2\2\2}\u0080\5\f\7\2~\u0080\5\20\t\2\177}\3\2\2\2\177~\3\2"+
		"\2\2\u0080\13\3\2\2\2\u0081\u0083\5T+\2\u0082\u0084\5Z.\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\5X-\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u008a\5V"+
		",\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u008d\5\\/\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\7\30\2\2\u008f\r\3\2\2\2\u0090\u0091\7\b\2\2\u0091\u0093"+
		"\5T+\2\u0092\u0094\5Z.\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0097\5X-\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\u0099\5V,\2\u0099\u009c\5\\/\2\u009a\u009b"+
		"\7\n\2\2\u009b\u009d\5\32\16\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u009f\7\30\2\2\u009f\17\3\2\2\2\u00a0\u00a2"+
		"\5T+\2\u00a1\u00a3\5Z.\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a6\5X-\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2"+
		"\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5V,\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5\\/\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\5\26"+
		"\f\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\7 \2\2\u00b1\u00b2\5,\27\2\u00b2"+
		"\u00b3\7!\2\2\u00b3\21\3\2\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\5\24\13"+
		"\2\u00b6\23\3\2\2\2\u00b7\u00b9\5T+\2\u00b8\u00ba\5Z.\2\u00b9\u00b8\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\5X-\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\5V"+
		",\2\u00bf\u00c0\5\\/\2\u00c0\u00c1\7\5\2\2\u00c1\u00c2\5\26\f\2\u00c2"+
		"\u00c3\7\6\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c5\5,\27\2\u00c5\u00c6\7!\2"+
		"\2\u00c6\25\3\2\2\2\u00c7\u00cc\5\30\r\2\u00c8\u00c9\7\4\2\2\u00c9\u00cb"+
		"\5\30\r\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00c7"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00d2\5V,\2\u00d2"+
		"\u00d3\5\\/\2\u00d3\31\3\2\2\2\u00d4\u00d5\5\34\17\2\u00d5\33\3\2\2\2"+
		"\u00d6\u00d7\5\\/\2\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5\34\17\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00dc\5\36\20\2\u00db\u00d6\3\2\2\2\u00db\u00da\3\2\2\2"+
		"\u00dc\35\3\2\2\2\u00dd\u00e3\5 \21\2\u00de\u00df\5\"\22\2\u00df\u00e0"+
		"\5 \21\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\37\3\2\2\2\u00e5\u00e3\3\2\2"+
		"\2\u00e6\u00ec\5&\24\2\u00e7\u00ec\5J&\2\u00e8\u00ec\5*\26\2\u00e9\u00ec"+
		"\5$\23\2\u00ea\u00ec\5\62\32\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2"+
		"\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec!\3"+
		"\2\2\2\u00ed\u00ee\t\2\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\f\2\2\u00f0%\3"+
		"\2\2\2\u00f1\u00f2\5V,\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\5(\25\2\u00f4"+
		"\u00f5\7\6\2\2\u00f5\'\3\2\2\2\u00f6\u00fb\5\32\16\2\u00f7\u00f8\7\4\2"+
		"\2\u00f8\u00fa\5\32\16\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff)\3\2\2\2\u0100\u0101"+
		"\5\\/\2\u0101+\3\2\2\2\u0102\u0104\5.\30\2\u0103\u0102\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106-\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010d\5\60\31\2\u0109\u010a\5B\"\2\u010a\u010b\7"+
		"\30\2\2\u010b\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"/\3\2\2\2\u010e\u0111\5\64\33\2\u010f\u0111\5<\37\2\u0110\u010e\3\2\2"+
		"\2\u0110\u010f\3\2\2\2\u0111\61\3\2\2\2\u0112\u0113\7\3\2\2\u0113\63\3"+
		"\2\2\2\u0114\u011a\5\66\34\2\u0115\u0117\58\35\2\u0116\u0118\5:\36\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011b\5:"+
		"\36\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2\2\2\u011b\65\3\2\2\2\u011c\u011d"+
		"\7\r\2\2\u011d\u011e\7 \2\2\u011e\u011f\5,\27\2\u011f\u0120\7!\2\2\u0120"+
		"\67\3\2\2\2\u0121\u0122\7\16\2\2\u0122\u0123\7\5\2\2\u0123\u0124\5\30"+
		"\r\2\u0124\u0125\7\6\2\2\u0125\u0126\7 \2\2\u0126\u0127\5,\27\2\u0127"+
		"\u0128\7!\2\2\u01289\3\2\2\2\u0129\u012a\7\17\2\2\u012a\u012b\7 \2\2\u012b"+
		"\u012c\5,\27\2\u012c\u012d\7!\2\2\u012d;\3\2\2\2\u012e\u012f\7\20\2\2"+
		"\u012f\u0130\7\5\2\2\u0130\u0131\5\32\16\2\u0131\u0132\7\6\2\2\u0132\u0134"+
		"\5> \2\u0133\u0135\5@!\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"=\3\2\2\2\u0136\u013a\7 \2\2\u0137\u0139\5.\30\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u0140\7!\2\2\u013e\u0140\5.\30\2\u013f"+
		"\u0136\3\2\2\2\u013f\u013e\3\2\2\2\u0140?\3\2\2\2\u0141\u014b\7\21\2\2"+
		"\u0142\u0146\7 \2\2\u0143\u0145\5.\30\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014c\7!\2\2\u014a\u014c\5.\30\2\u014b\u0142\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014cA\3\2\2\2\u014d\u0152\5F$\2\u014e\u0152"+
		"\5H%\2\u014f\u0152\5D#\2\u0150\u0152\5\32\16\2\u0151\u014d\3\2\2\2\u0151"+
		"\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152C\3\2\2\2"+
		"\u0153\u0154\5V,\2\u0154\u0157\5\\/\2\u0155\u0156\7\n\2\2\u0156\u0158"+
		"\5\32\16\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158E\3\2\2\2\u0159"+
		"\u015a\7\22\2\2\u015a\u015b\5\32\16\2\u015bG\3\2\2\2\u015c\u015d\7\23"+
		"\2\2\u015d\u015e\5\32\16\2\u015eI\3\2\2\2\u015f\u0163\5L\'\2\u0160\u0163"+
		"\5N(\2\u0161\u0163\5P)\2\u0162\u015f\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163K\3\2\2\2\u0164\u0165\7#\2\2\u0165M\3\2\2\2\u0166"+
		"\u0167\7\"\2\2\u0167O\3\2\2\2\u0168\u0169\t\3\2\2\u0169Q\3\2\2\2\u016a"+
		"\u016c\7\7\2\2\u016b\u016d\7\b\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\5V,\2\u016fS\3\2\2\2\u0170\u0172"+
		"\5R*\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174U\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017b\5\\/\2\u0177"+
		"\u0178\7\32\2\2\u0178\u017a\5\\/\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cW\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017e\u017f\7\36\2\2\u017fY\3\2\2\2\u0180\u0181\t\4\2\2\u0181"+
		"[\3\2\2\2\u0182\u0183\7\37\2\2\u0183]\3\2\2\2-afjpuy\177\u0083\u0086\u0089"+
		"\u008c\u0093\u0096\u009c\u00a2\u00a5\u00a8\u00ab\u00b9\u00bc\u00cc\u00cf"+
		"\u00db\u00e3\u00eb\u00fb\u00fe\u0105\u010c\u0110\u0117\u011a\u0134\u013a"+
		"\u013f\u0146\u014b\u0151\u0157\u0162\u016c\u0173\u017b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}