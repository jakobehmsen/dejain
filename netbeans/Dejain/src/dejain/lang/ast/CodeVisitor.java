package dejain.lang.ast;

public interface CodeVisitor {
    void visitReturn(ReturnAST ctx);
    void visitStringLiteral(LiteralAST<String> ctx);
    void visitIntegerLiteral(LiteralAST<Integer> ctx);
    void visitBinaryExpression(BinaryExpressionAST ctx);
    void visitInvocation(InvocationAST ctx);
    void visitFieldSet(FieldSetAST ctx);
    void visitLongLiteral(LiteralAST<Long> ctx);
    void visitMeta(MetaExpressionAST ctx);
    void visitThis(ThisAST ctx);
    void visitFieldGet(FieldGetAST ctx);
}
