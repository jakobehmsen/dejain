// Generated from /home/jakob/github/jasy/netbeans/Jasy/src/jasy/lang/antlr4/Jasy.g4 by ANTLR 4.1
package jasy.lang.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JasyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JasyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JasyParser#qualifiedLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedLookup(@NotNull JasyParser.QualifiedLookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull JasyParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#nonDelimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDelimitedStatement(@NotNull JasyParser.NonDelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(@NotNull JasyParser.AssignmentOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(@NotNull JasyParser.AnnotationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull JasyParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(@NotNull JasyParser.RelationalOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(@NotNull JasyParser.MultiplicativeOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#classTransformerMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMember(@NotNull JasyParser.ClassTransformerMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(@NotNull JasyParser.AdditiveOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#embeddedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbeddedExpression(@NotNull JasyParser.EmbeddedExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull JasyParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull JasyParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull JasyParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#newExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(@NotNull JasyParser.NewExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(@NotNull JasyParser.CatchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#metaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaBlock(@NotNull JasyParser.MetaBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(@NotNull JasyParser.InvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull JasyParser.StringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(@NotNull JasyParser.EqualityExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#classTransformerMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMembers(@NotNull JasyParser.ClassTransformerMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull JasyParser.ParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#delimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimitedStatement(@NotNull JasyParser.DelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull JasyParser.TryStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#singleOrMultiStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleOrMultiStatement(@NotNull JasyParser.SingleOrMultiStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(@NotNull JasyParser.AdditiveExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(@NotNull JasyParser.RelationalExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull JasyParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull JasyParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(@NotNull JasyParser.TryCatchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#quotedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedExpression(@NotNull JasyParser.QuotedExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull JasyParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(@NotNull JasyParser.AccessModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#thisResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisResult(@NotNull JasyParser.ThisResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull JasyParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull JasyParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#classTransformerMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberDefinition(@NotNull JasyParser.ClassTransformerMemberDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull JasyParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup(@NotNull JasyParser.LookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull JasyParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#leafExpressionChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafExpressionChain(@NotNull JasyParser.LeafExpressionChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull JasyParser.ThrowStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#classTransformer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformer(@NotNull JasyParser.ClassTransformerContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#proceedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceedStatement(@NotNull JasyParser.ProceedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(@NotNull JasyParser.IfElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#leafExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafExpression(@NotNull JasyParser.LeafExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#metaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaExpression(@NotNull JasyParser.MetaExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(@NotNull JasyParser.MultiplicativeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#classTransformerMemberMethodBlody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberMethodBlody(@NotNull JasyParser.ClassTransformerMemberMethodBlodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull JasyParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#finallyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyStatement(@NotNull JasyParser.FinallyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull JasyParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#classTransformerMemberMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberMethod(@NotNull JasyParser.ClassTransformerMemberMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(@NotNull JasyParser.EqualityOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#modStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModStatic(@NotNull JasyParser.ModStaticContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull JasyParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull JasyParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#unqualifiedLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedLookup(@NotNull JasyParser.UnqualifiedLookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#classTransformerMemberField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberField(@NotNull JasyParser.ClassTransformerMemberFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(@NotNull JasyParser.TypeQualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link JasyParser#longLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLiteral(@NotNull JasyParser.LongLiteralContext ctx);
}