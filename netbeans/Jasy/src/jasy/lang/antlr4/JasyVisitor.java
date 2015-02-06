// Generated from C:\github\dejain\netbeans\Dejain\src\dejain\lang\antlr4\Dejain.g4 by ANTLR 4.1
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
	 * Visit a parse tree produced by {@link DejainParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull JasyParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#nonDelimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDelimitedStatement(@NotNull JasyParser.NonDelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(@NotNull JasyParser.AnnotationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#binarySum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinarySum(@NotNull JasyParser.BinarySumContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull JasyParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#binarySumOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinarySumOperator(@NotNull JasyParser.BinarySumOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMember(@NotNull JasyParser.ClassTransformerMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull JasyParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull JasyParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull JasyParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(@NotNull JasyParser.CatchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#metaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaBlock(@NotNull JasyParser.MetaBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#ifTrueBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTrueBlock(@NotNull JasyParser.IfTrueBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(@NotNull JasyParser.InvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull JasyParser.StringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMembers(@NotNull JasyParser.ClassTransformerMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull JasyParser.ParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#delimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimitedStatement(@NotNull JasyParser.DelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#ifFalseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFalseBlock(@NotNull JasyParser.IfFalseBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull JasyParser.TryStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull JasyParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull JasyParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(@NotNull JasyParser.TryCatchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#quotedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedExpression(@NotNull JasyParser.QuotedExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull JasyParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(@NotNull JasyParser.AccessModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#thisResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisResult(@NotNull JasyParser.ThisResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull JasyParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull JasyParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberDefinition(@NotNull JasyParser.ClassTransformerMemberDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull JasyParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup(@NotNull JasyParser.LookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull JasyParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#leafExpressionChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafExpressionChain(@NotNull JasyParser.LeafExpressionChainContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull JasyParser.ThrowStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformer(@NotNull JasyParser.ClassTransformerContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#proceedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceedStatement(@NotNull JasyParser.ProceedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(@NotNull JasyParser.IfElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#leafExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafExpression(@NotNull JasyParser.LeafExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#metaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetaExpression(@NotNull JasyParser.MetaExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberMethodBlody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberMethodBlody(@NotNull JasyParser.ClassTransformerMemberMethodBlodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull JasyParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#finallyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyStatement(@NotNull JasyParser.FinallyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberMethod(@NotNull JasyParser.ClassTransformerMemberMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#modStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModStatic(@NotNull JasyParser.ModStaticContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull JasyParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull JasyParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberField(@NotNull JasyParser.ClassTransformerMemberFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(@NotNull JasyParser.TypeQualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#longLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLiteral(@NotNull JasyParser.LongLiteralContext ctx);
}