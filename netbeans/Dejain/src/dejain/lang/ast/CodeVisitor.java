package dejain.lang.ast;

public interface CodeVisitor {
    void visitReturn(ReturnContext ctx);
    void visitStringLiteral(LiteralContext<String> ctx);
    void visitIntegerLiteral(LiteralContext<Integer> ctx);
    void visitBinaryExpression(BinaryExpressionContext ctx);
    void visitInvocation(InvocationContext ctx);
    void visitFieldSet(FieldSetContext ctx);

    public void visitLongLiteral(LiteralContext<Long> ctx);
}
