// Generated from C:\github\dejain\netbeans\Dejain\src\dejain\lang\antlr4\Dejain.g4 by ANTLR 4.1
package dejain.lang.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DejainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DejainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DejainParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(@NotNull DejainParser.TryStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull DejainParser.VariableAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#nonDelimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonDelimitedStatement(@NotNull DejainParser.NonDelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(@NotNull DejainParser.MethodDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(@NotNull DejainParser.AnnotationsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberFieldAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberFieldAdd(@NotNull DejainParser.ClassTransformerMemberFieldAddContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#binarySum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinarySum(@NotNull DejainParser.BinarySumContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull DejainParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DejainParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberMethodAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberMethodAdd(@NotNull DejainParser.ClassTransformerMemberMethodAddContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull DejainParser.ReturnStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#tryCatchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatchStatement(@NotNull DejainParser.TryCatchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DejainParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(@NotNull DejainParser.AccessModifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#binarySumOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinarySumOperator(@NotNull DejainParser.BinarySumOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#thisResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisResult(@NotNull DejainParser.ThisResultContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMember(@NotNull DejainParser.ClassTransformerMemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull DejainParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull DejainParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull DejainParser.BooleanLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberDefinition(@NotNull DejainParser.ClassTransformerMemberDefinitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(@NotNull DejainParser.AnnotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookup(@NotNull DejainParser.LookupContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull DejainParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DejainParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(@NotNull DejainParser.ThrowStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformer(@NotNull DejainParser.ClassTransformerContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#proceedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProceedStatement(@NotNull DejainParser.ProceedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(@NotNull DejainParser.IfElseStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#leafExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafExpression(@NotNull DejainParser.LeafExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(@NotNull DejainParser.CatchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull DejainParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#finallyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyStatement(@NotNull DejainParser.FinallyStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#ifTrueBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTrueBlock(@NotNull DejainParser.IfTrueBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberMethod(@NotNull DejainParser.ClassTransformerMemberMethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(@NotNull DejainParser.InvocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull DejainParser.StringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#modStatic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModStatic(@NotNull DejainParser.ModStaticContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMembers(@NotNull DejainParser.ClassTransformerMembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull DejainParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull DejainParser.ArgumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#classTransformerMemberField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassTransformerMemberField(@NotNull DejainParser.ClassTransformerMemberFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(@NotNull DejainParser.ParametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#delimitedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimitedStatement(@NotNull DejainParser.DelimitedStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(@NotNull DejainParser.TypeQualifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link DejainParser#ifFalseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFalseBlock(@NotNull DejainParser.IfFalseBlockContext ctx);
}