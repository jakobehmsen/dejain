package jasy.lang.ast;

public interface CodeVisitor<T> {
    T visitReturn(ReturnAST ctx);
    T visitStringLiteral(LiteralAST<String> ctx);
    T visitIntegerLiteral(LiteralAST<Integer> ctx);
    T visitBinaryExpression(BinaryExpressionAST ctx);
    T visitInvocation(InvocationAST ctx);
    T visitFieldSet(FieldSetAST ctx);
    T visitLongLiteral(LiteralAST<Long> ctx);
    T visitMeta(MetaExpressionAST ctx);
    T visitThis(ThisAST ctx);
    T visitFieldGet(FieldGetAST ctx);
    T visitVariableDeclaration(VariableDeclarationAST ctx);
    T visitLookup(LookupAST ctx);
    T visitVariableAssignment(VariableAssignmentAST ctx);
    T visitRootExpression(RootExpressionAST ctx);
}
