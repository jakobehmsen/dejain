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
		RULE_classTransformerMemberField = 5, RULE_classTransformerMemberFieldAdd = 6, 
		RULE_classTransformerMemberMethod = 7, RULE_classTransformerMemberMethodAdd = 8, 
		RULE_methodDefinition = 9, RULE_parameters = 10, RULE_parameter = 11, 
		RULE_expression = 12, RULE_variableAssignment = 13, RULE_binarySum = 14, 
		RULE_leafExpression = 15, RULE_leafExpressionChain = 16, RULE_binarySumOperator = 17, 
		RULE_thisResult = 18, RULE_invocation = 19, RULE_arguments = 20, RULE_lookup = 21, 
		RULE_statements = 22, RULE_statement = 23, RULE_nonDelimitedStatement = 24, 
		RULE_proceedStatement = 25, RULE_metaExpression = 26, RULE_quotedExpression = 27, 
		RULE_tryCatchStatement = 28, RULE_tryStatement = 29, RULE_catchStatement = 30, 
		RULE_finallyStatement = 31, RULE_ifElseStatement = 32, RULE_ifTrueBlock = 33, 
		RULE_ifFalseBlock = 34, RULE_delimitedStatement = 35, RULE_variableDeclaration = 36, 
		RULE_returnStatement = 37, RULE_throwStatement = 38, RULE_literal = 39, 
		RULE_stringLiteral = 40, RULE_integerLiteral = 41, RULE_longLiteral = 42, 
		RULE_booleanLiteral = 43, RULE_annotation = 44, RULE_annotations = 45, 
		RULE_typeQualifier = 46, RULE_modStatic = 47, RULE_accessModifier = 48, 
		RULE_identifier = 49;
	public static final String[] ruleNames = {
		"program", "classTransformer", "classTransformerMembers", "classTransformerMemberDefinition", 
		"classTransformerMember", "classTransformerMemberField", "classTransformerMemberFieldAdd", 
		"classTransformerMemberMethod", "classTransformerMemberMethodAdd", "methodDefinition", 
		"parameters", "parameter", "expression", "variableAssignment", "binarySum", 
		"leafExpression", "leafExpressionChain", "binarySumOperator", "thisResult", 
		"invocation", "arguments", "lookup", "statements", "statement", "nonDelimitedStatement", 
		"proceedStatement", "metaExpression", "quotedExpression", "tryCatchStatement", 
		"tryStatement", "catchStatement", "finallyStatement", "ifElseStatement", 
		"ifTrueBlock", "ifFalseBlock", "delimitedStatement", "variableDeclaration", 
		"returnStatement", "throwStatement", "literal", "stringLiteral", "integerLiteral", 
		"longLiteral", "booleanLiteral", "annotation", "annotations", "typeQualifier", 
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
			setState(132);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(131); match(PLUS);
				}
			}

			setState(134); ((ClassTransformerMemberDefinitionContext)_localctx).member = classTransformerMember();
			}
		}
		catch (RecognitionException re) {
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
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); classTransformerMemberField();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); classTransformerMemberMethod();
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
			setState(140); annotations();
			setState(142);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(141); accessModifier();
				}
			}

			setState(145);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(144); modStatic();
				}
			}

			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(147); typeQualifier();
				}
				break;
			}
			setState(151);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(150); identifier();
				}
			}

			setState(155);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(153); match(ASSIGN_OP);
				setState(154); ((ClassTransformerMemberFieldContext)_localctx).value = expression();
				}
			}

			setState(157); match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
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
			setState(159); match(PLUS);
			setState(160); annotations();
			setState(162);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(161); accessModifier();
				}
			}

			setState(165);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(164); modStatic();
				}
			}

			setState(167); typeQualifier();
			setState(168); identifier();
			setState(171);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(169); match(ASSIGN_OP);
				setState(170); expression();
				}
			}

			setState(173); match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
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
			setState(175); annotations();
			setState(177);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(176); accessModifier();
				}
			}

			setState(180);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(179); modStatic();
				}
			}

			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(182); typeQualifier();
				}
				break;
			}
			setState(186);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(185); identifier();
				}
			}

			setState(188); match(OPEN_PAR);
			setState(189); parameters();
			setState(190); match(CLOSE_PAR);
			setState(191); match(OPEN_BRA);
			setState(192); statements();
			setState(193); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
			setState(195); match(PLUS);
			setState(196); methodDefinition();
			}
		}
		catch (RecognitionException re) {
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
			setState(198); annotations();
			setState(200);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACC_MOD_PUBLIC) | (1L << ACC_MOD_PRIVATE) | (1L << ACC_MOD_PROTECTED))) != 0)) {
				{
				setState(199); accessModifier();
				}
			}

			setState(203);
			_la = _input.LA(1);
			if (_la==MOD_STATIC) {
				{
				setState(202); modStatic();
				}
			}

			setState(205); typeQualifier();
			setState(206); identifier();
			setState(207); match(OPEN_PAR);
			setState(208); parameters();
			setState(209); match(CLOSE_PAR);
			setState(210); match(OPEN_BRA);
			setState(211); statements();
			setState(212); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
			setState(222);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(214); parameter();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(215); match(COMMA);
					setState(216); parameter();
					}
					}
					setState(221);
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
			setState(224); typeQualifier();
			setState(225); identifier();
			}
		}
		catch (RecognitionException re) {
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
			setState(227); variableAssignment();
			}
		}
		catch (RecognitionException re) {
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
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); identifier();
				setState(230); match(ASSIGN_OP);
				setState(231); variableAssignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); binarySum();
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236); ((BinarySumContext)_localctx).first = leafExpression();
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(237); binarySumOperator();
					setState(238); ((BinarySumContext)_localctx).rest = leafExpression();
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 30, RULE_leafExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(245); invocation();
				}
				break;

			case 2:
				{
				setState(246); literal();
				}
				break;

			case 3:
				{
				setState(247); lookup();
				}
				break;

			case 4:
				{
				setState(248); thisResult();
				}
				break;

			case 5:
				{
				setState(249); proceedStatement();
				}
				break;

			case 6:
				{
				setState(250); metaExpression();
				}
				break;

			case 7:
				{
				setState(251); quotedExpression();
				}
				break;

			case 8:
				{
				setState(252); match(OPEN_PAR);
				setState(253); expression();
				setState(254); match(CLOSE_PAR);
				}
				break;
			}
			setState(258); leafExpressionChain();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_leafExpressionChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(260); match(DOT);
					setState(263);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(261); lookup();
						}
						break;

					case 2:
						{
						setState(262); invocation();
						}
						break;
					}
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 34, RULE_binarySumOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 36, RULE_thisResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(KW_THIS_RESULT);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 38, RULE_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); identifier();
			setState(275); match(OPEN_PAR);
			setState(276); arguments();
			setState(277); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				setState(279); expression();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(280); match(COMMA);
					setState(281); expression();
					}
					}
					setState(286);
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
		enterRule(_localctx, 42, RULE_lookup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); identifier();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 44, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
				{
				{
				setState(291); statement();
				}
				}
				setState(296);
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
		enterRule(_localctx, 46, RULE_statement);
		try {
			setState(301);
			switch (_input.LA(1)) {
			case KW_TRY:
			case KW_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(297); nonDelimitedStatement();
				}
				break;
			case ELLIPSES:
			case OPEN_PAR:
			case DOLLAR:
			case HASH:
			case KW_THIS_RESULT:
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
				setState(298); delimitedStatement();
				setState(299); match(SEMI_COLON);
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
		enterRule(_localctx, 48, RULE_nonDelimitedStatement);
		try {
			setState(305);
			switch (_input.LA(1)) {
			case KW_TRY:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); tryCatchStatement();
				}
				break;
			case KW_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(304); ifElseStatement();
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
		enterRule(_localctx, 50, RULE_proceedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307); match(ELLIPSES);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_metaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(DOLLAR);
			setState(315);
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
				setState(310); expression();
				}
				break;
			case OPEN_BRA:
				{
				setState(311); match(OPEN_BRA);
				setState(312); statements();
				setState(313); match(CLOSE_BRA);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_quotedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(HASH);
			setState(318); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); tryStatement();
			setState(326);
			switch (_input.LA(1)) {
			case KW_CATCH:
				{
				{
				setState(321); catchStatement();
				setState(323);
				_la = _input.LA(1);
				if (_la==KW_FINALLY) {
					{
					setState(322); finallyStatement();
					}
				}

				}
				}
				break;
			case KW_FINALLY:
				{
				setState(325); finallyStatement();
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
		enterRule(_localctx, 58, RULE_tryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); match(KW_TRY);
			setState(329); match(OPEN_BRA);
			setState(330); statements();
			setState(331); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); match(KW_CATCH);
			setState(334); match(OPEN_PAR);
			setState(335); parameter();
			setState(336); match(CLOSE_PAR);
			setState(337); match(OPEN_BRA);
			setState(338); statements();
			setState(339); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_finallyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(KW_FINALLY);
			setState(342); match(OPEN_BRA);
			setState(343); statements();
			setState(344); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(KW_IF);
			setState(347); match(OPEN_PAR);
			setState(348); ((IfElseStatementContext)_localctx).condition = expression();
			setState(349); match(CLOSE_PAR);
			setState(350); ifTrueBlock();
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(351); ifFalseBlock();
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
		enterRule(_localctx, 66, RULE_ifTrueBlock);
		int _la;
		try {
			setState(363);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				enterOuterAlt(_localctx, 1);
				{
				setState(354); match(OPEN_BRA);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(355); statement();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361); match(CLOSE_BRA);
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
				setState(362); statement();
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
		enterRule(_localctx, 68, RULE_ifFalseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); match(KW_ELSE);
			setState(375);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				{
				setState(366); match(OPEN_BRA);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ELLIPSES) | (1L << OPEN_PAR) | (1L << DOLLAR) | (1L << HASH) | (1L << KW_THIS_RESULT) | (1L << KW_TRY) | (1L << KW_IF) | (1L << KW_RETURN) | (1L << KW_THROW) | (1L << KW_TRUE) | (1L << KW_FALSE) | (1L << ID) | (1L << INTEGER) | (1L << LONG) | (1L << STRING))) != 0)) {
					{
					{
					setState(367); statement();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373); match(CLOSE_BRA);
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
				setState(374); statement();
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
		enterRule(_localctx, 70, RULE_delimitedStatement);
		try {
			setState(381);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377); returnStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378); throwStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379); variableDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(380); expression();
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
		enterRule(_localctx, 72, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); typeQualifier();
			setState(384); ((VariableDeclarationContext)_localctx).id = identifier();
			setState(387);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(385); match(ASSIGN_OP);
				setState(386); ((VariableDeclarationContext)_localctx).value = expression();
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
		enterRule(_localctx, 74, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(KW_RETURN);
			setState(390); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(KW_THROW);
			setState(393); expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 78, RULE_literal);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(395); stringLiteral();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); integerLiteral();
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 3);
				{
				setState(397); longLiteral();
				}
				break;
			case KW_TRUE:
			case KW_FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(398); booleanLiteral();
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
		enterRule(_localctx, 80, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403); match(INTEGER);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_longLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); match(LONG);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 88, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409); match(AT);
			setState(411);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(410); match(PLUS);
				}
			}

			setState(413); typeQualifier();
			}
		}
		catch (RecognitionException re) {
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
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(415); annotation();
				}
				}
				setState(420);
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
			setState(421); identifier();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(422); match(DOT);
				setState(423); identifier();
				}
				}
				setState(428);
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
			setState(429); match(MOD_STATIC);
			}
		}
		catch (RecognitionException re) {
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
			setState(431);
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
			setState(433); match(ID);
			}
		}
		catch (RecognitionException re) {
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3)\u01b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\7\2"+
		"h\n\2\f\2\16\2k\13\2\3\3\3\3\3\3\5\3p\n\3\3\3\3\3\5\3t\n\3\3\3\3\3\5\3"+
		"x\n\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\4\7\4\u0081\n\4\f\4\16\4\u0084\13\4\3"+
		"\5\5\5\u0087\n\5\3\5\3\5\3\6\3\6\5\6\u008d\n\6\3\7\3\7\5\7\u0091\n\7\3"+
		"\7\5\7\u0094\n\7\3\7\5\7\u0097\n\7\3\7\5\7\u009a\n\7\3\7\3\7\5\7\u009e"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\5\b\u00a5\n\b\3\b\5\b\u00a8\n\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00ae\n\b\3\b\3\b\3\t\3\t\5\t\u00b4\n\t\3\t\5\t\u00b7\n\t\3\t\5"+
		"\t\u00ba\n\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\5\13\u00cb\n\13\3\13\5\13\u00ce\n\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00dc\n\f\f\f\16\f\u00df\13\f"+
		"\5\f\u00e1\n\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00ed"+
		"\n\17\3\20\3\20\3\20\3\20\7\20\u00f3\n\20\f\20\16\20\u00f6\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0103\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u010a\n\22\7\22\u010c\n\22\f\22\16\22\u010f"+
		"\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26"+
		"\u011d\n\26\f\26\16\26\u0120\13\26\5\26\u0122\n\26\3\27\3\27\3\30\7\30"+
		"\u0127\n\30\f\30\16\30\u012a\13\30\3\31\3\31\3\31\3\31\5\31\u0130\n\31"+
		"\3\32\3\32\5\32\u0134\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u013e\n\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0146\n\36\3\36\5\36\u0149"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0163\n\"\3#\3#\7#\u0167\n#\f#\16#\u016a"+
		"\13#\3#\3#\5#\u016e\n#\3$\3$\3$\7$\u0173\n$\f$\16$\u0176\13$\3$\3$\5$"+
		"\u017a\n$\3%\3%\3%\3%\5%\u0180\n%\3&\3&\3&\3&\5&\u0186\n&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3)\3)\5)\u0192\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\5.\u019e"+
		"\n.\3.\3.\3/\7/\u01a3\n/\f/\16/\u01a6\13/\3\60\3\60\3\60\7\60\u01ab\n"+
		"\60\f\60\16\60\u01ae\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\2\64\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bd\2\5\3\2\n\13\3\2\27\30\3\2\35\37\u01bd\2i\3\2\2\2\4o\3\2\2"+
		"\2\6\u0082\3\2\2\2\b\u0086\3\2\2\2\n\u008c\3\2\2\2\f\u008e\3\2\2\2\16"+
		"\u00a1\3\2\2\2\20\u00b1\3\2\2\2\22\u00c5\3\2\2\2\24\u00c8\3\2\2\2\26\u00e0"+
		"\3\2\2\2\30\u00e2\3\2\2\2\32\u00e5\3\2\2\2\34\u00ec\3\2\2\2\36\u00ee\3"+
		"\2\2\2 \u0102\3\2\2\2\"\u010d\3\2\2\2$\u0110\3\2\2\2&\u0112\3\2\2\2(\u0114"+
		"\3\2\2\2*\u0121\3\2\2\2,\u0123\3\2\2\2.\u0128\3\2\2\2\60\u012f\3\2\2\2"+
		"\62\u0133\3\2\2\2\64\u0135\3\2\2\2\66\u0137\3\2\2\28\u013f\3\2\2\2:\u0142"+
		"\3\2\2\2<\u014a\3\2\2\2>\u014f\3\2\2\2@\u0157\3\2\2\2B\u015c\3\2\2\2D"+
		"\u016d\3\2\2\2F\u016f\3\2\2\2H\u017f\3\2\2\2J\u0181\3\2\2\2L\u0187\3\2"+
		"\2\2N\u018a\3\2\2\2P\u0191\3\2\2\2R\u0193\3\2\2\2T\u0195\3\2\2\2V\u0197"+
		"\3\2\2\2X\u0199\3\2\2\2Z\u019b\3\2\2\2\\\u01a4\3\2\2\2^\u01a7\3\2\2\2"+
		"`\u01af\3\2\2\2b\u01b1\3\2\2\2d\u01b3\3\2\2\2fh\5\4\3\2gf\3\2\2\2hk\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2j\3\3\2\2\2ki\3\2\2\2lm\5d\63\2mn\7\f\2\2np"+
		"\3\2\2\2ol\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\5\\/\2rt\5b\62\2sr\3\2\2\2st"+
		"\3\2\2\2tu\3\2\2\2uw\7\26\2\2vx\5^\60\2wv\3\2\2\2wx\3\2\2\2x}\3\2\2\2"+
		"yz\7\"\2\2z{\5\6\4\2{|\7#\2\2|~\3\2\2\2}y\3\2\2\2}~\3\2\2\2~\5\3\2\2\2"+
		"\177\u0081\5\b\5\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\7\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087"+
		"\7\n\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\5\n\6\2\u0089\t\3\2\2\2\u008a\u008d\5\f\7\2\u008b\u008d\5\20\t"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\13\3\2\2\2\u008e\u0090"+
		"\5\\/\2\u008f\u0091\5b\62\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0094\5`\61\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0097\5^\60\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a\5d\63\2\u0099\u0098\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c\7\f\2\2\u009c"+
		"\u009e\5\32\16\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\7\32\2\2\u00a0\r\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2"+
		"\u00a4\5\\/\2\u00a3\u00a5\5b\62\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\5`\61\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5^\60\2\u00aa\u00ad\5d"+
		"\63\2\u00ab\u00ac\7\f\2\2\u00ac\u00ae\5\32\16\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\32\2\2\u00b0\17\3\2\2"+
		"\2\u00b1\u00b3\5\\/\2\u00b2\u00b4\5b\62\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5`\61\2\u00b6\u00b5\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\5^\60\2\u00b9\u00b8\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\5d\63\2\u00bc"+
		"\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\5"+
		"\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7\"\2\2\u00c2"+
		"\u00c3\5.\30\2\u00c3\u00c4\7#\2\2\u00c4\21\3\2\2\2\u00c5\u00c6\7\n\2\2"+
		"\u00c6\u00c7\5\24\13\2\u00c7\23\3\2\2\2\u00c8\u00ca\5\\/\2\u00c9\u00cb"+
		"\5b\62\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ce\5`\61\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\5^\60\2\u00d0\u00d1\5d\63\2\u00d1\u00d2\7\5\2\2\u00d2"+
		"\u00d3\5\26\f\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\5"+
		".\30\2\u00d6\u00d7\7#\2\2\u00d7\25\3\2\2\2\u00d8\u00dd\5\30\r\2\u00d9"+
		"\u00da\7\4\2\2\u00da\u00dc\5\30\r\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\27\3\2\2"+
		"\2\u00e2\u00e3\5^\60\2\u00e3\u00e4\5d\63\2\u00e4\31\3\2\2\2\u00e5\u00e6"+
		"\5\34\17\2\u00e6\33\3\2\2\2\u00e7\u00e8\5d\63\2\u00e8\u00e9\7\f\2\2\u00e9"+
		"\u00ea\5\34\17\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed\5\36\20\2\u00ec\u00e7"+
		"\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00f4\5 \21\2\u00ef"+
		"\u00f0\5$\23\2\u00f0\u00f1\5 \21\2\u00f1\u00f3\3\2\2\2\u00f2\u00ef\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\37\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u0103\5(\25\2\u00f8\u0103\5P)\2"+
		"\u00f9\u0103\5,\27\2\u00fa\u0103\5&\24\2\u00fb\u0103\5\64\33\2\u00fc\u0103"+
		"\5\66\34\2\u00fd\u0103\58\35\2\u00fe\u00ff\7\5\2\2\u00ff\u0100\5\32\16"+
		"\2\u0100\u0101\7\6\2\2\u0101\u0103\3\2\2\2\u0102\u00f7\3\2\2\2\u0102\u00f8"+
		"\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0102"+
		"\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\5\"\22\2\u0105!\3\2\2\2\u0106\u0109\7\34\2\2\u0107\u010a"+
		"\5,\27\2\u0108\u010a\5(\25\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0106\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e#\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111"+
		"\t\2\2\2\u0111%\3\2\2\2\u0112\u0113\7\16\2\2\u0113\'\3\2\2\2\u0114\u0115"+
		"\5d\63\2\u0115\u0116\7\5\2\2\u0116\u0117\5*\26\2\u0117\u0118\7\6\2\2\u0118"+
		")\3\2\2\2\u0119\u011e\5\32\16\2\u011a\u011b\7\4\2\2\u011b\u011d\5\32\16"+
		"\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0119\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122+\3\2\2\2\u0123\u0124\5d\63\2\u0124-\3\2\2\2\u0125"+
		"\u0127\5\60\31\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129/\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0130"+
		"\5\62\32\2\u012c\u012d\5H%\2\u012d\u012e\7\32\2\2\u012e\u0130\3\2\2\2"+
		"\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u0130\61\3\2\2\2\u0131\u0134"+
		"\5:\36\2\u0132\u0134\5B\"\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\63\3\2\2\2\u0135\u0136\7\3\2\2\u0136\65\3\2\2\2\u0137\u013d\7\b\2\2\u0138"+
		"\u013e\5\32\16\2\u0139\u013a\7\"\2\2\u013a\u013b\5.\30\2\u013b\u013c\7"+
		"#\2\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013e"+
		"\67\3\2\2\2\u013f\u0140\7\t\2\2\u0140\u0141\5\32\16\2\u01419\3\2\2\2\u0142"+
		"\u0148\5<\37\2\u0143\u0145\5> \2\u0144\u0146\5@!\2\u0145\u0144\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0149\5@!\2\u0148\u0143"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0149;\3\2\2\2\u014a\u014b\7\17\2\2\u014b"+
		"\u014c\7\"\2\2\u014c\u014d\5.\30\2\u014d\u014e\7#\2\2\u014e=\3\2\2\2\u014f"+
		"\u0150\7\20\2\2\u0150\u0151\7\5\2\2\u0151\u0152\5\30\r\2\u0152\u0153\7"+
		"\6\2\2\u0153\u0154\7\"\2\2\u0154\u0155\5.\30\2\u0155\u0156\7#\2\2\u0156"+
		"?\3\2\2\2\u0157\u0158\7\21\2\2\u0158\u0159\7\"\2\2\u0159\u015a\5.\30\2"+
		"\u015a\u015b\7#\2\2\u015bA\3\2\2\2\u015c\u015d\7\22\2\2\u015d\u015e\7"+
		"\5\2\2\u015e\u015f\5\32\16\2\u015f\u0160\7\6\2\2\u0160\u0162\5D#\2\u0161"+
		"\u0163\5F$\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163C\3\2\2\2\u0164"+
		"\u0168\7\"\2\2\u0165\u0167\5\60\31\2\u0166\u0165\3\2\2\2\u0167\u016a\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016e\7#\2\2\u016c\u016e\5\60\31\2\u016d\u0164\3"+
		"\2\2\2\u016d\u016c\3\2\2\2\u016eE\3\2\2\2\u016f\u0179\7\23\2\2\u0170\u0174"+
		"\7\"\2\2\u0171\u0173\5\60\31\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2"+
		"\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0177\u017a\7#\2\2\u0178\u017a\5\60\31\2\u0179\u0170\3\2\2\2"+
		"\u0179\u0178\3\2\2\2\u017aG\3\2\2\2\u017b\u0180\5L\'\2\u017c\u0180\5N"+
		"(\2\u017d\u0180\5J&\2\u017e\u0180\5\32\16\2\u017f\u017b\3\2\2\2\u017f"+
		"\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180I\3\2\2\2"+
		"\u0181\u0182\5^\60\2\u0182\u0185\5d\63\2\u0183\u0184\7\f\2\2\u0184\u0186"+
		"\5\32\16\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186K\3\2\2\2\u0187"+
		"\u0188\7\24\2\2\u0188\u0189\5\32\16\2\u0189M\3\2\2\2\u018a\u018b\7\25"+
		"\2\2\u018b\u018c\5\32\16\2\u018cO\3\2\2\2\u018d\u0192\5R*\2\u018e\u0192"+
		"\5T+\2\u018f\u0192\5V,\2\u0190\u0192\5X-\2\u0191\u018d\3\2\2\2\u0191\u018e"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0190\3\2\2\2\u0192Q\3\2\2\2\u0193"+
		"\u0194\7&\2\2\u0194S\3\2\2\2\u0195\u0196\7$\2\2\u0196U\3\2\2\2\u0197\u0198"+
		"\7%\2\2\u0198W\3\2\2\2\u0199\u019a\t\3\2\2\u019aY\3\2\2\2\u019b\u019d"+
		"\7\7\2\2\u019c\u019e\7\n\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a0\5^\60\2\u01a0[\3\2\2\2\u01a1\u01a3\5Z.\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5]\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01ac\5d\63\2\u01a8\u01a9"+
		"\7\34\2\2\u01a9\u01ab\5d\63\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2"+
		"\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad_\3\2\2\2\u01ae\u01ac\3"+
		"\2\2\2\u01af\u01b0\7 \2\2\u01b0a\3\2\2\2\u01b1\u01b2\t\4\2\2\u01b2c\3"+
		"\2\2\2\u01b3\u01b4\7!\2\2\u01b4e\3\2\2\2\62iosw}\u0082\u0086\u008c\u0090"+
		"\u0093\u0096\u0099\u009d\u00a4\u00a7\u00ad\u00b3\u00b6\u00b9\u00bc\u00ca"+
		"\u00cd\u00dd\u00e0\u00ec\u00f4\u0102\u0109\u010d\u011e\u0121\u0128\u012f"+
		"\u0133\u013d\u0145\u0148\u0162\u0168\u016d\u0174\u0179\u017f\u0185\u0191"+
		"\u019d\u01a4\u01ac";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}