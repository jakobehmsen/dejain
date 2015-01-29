package dejain.lang.ast;

public interface CodeVisitor {
    void visitReturn(ReturnContext ctx);
    void visitStringLiteral(LiteralContext<String> ctx);
    void visitIntegerLiteral(LiteralContext<Integer> ctx);
    void visitBinaryExpression(BinaryExpressionContext ctx);
    void visitInvocation(InvocationContext ctx);
    void visitFieldSet(FieldSetContext ctx);
    void visitLongLiteral(LiteralContext<Long> ctx);
    void visitMeta(MetaContext ctx);
    void visitThis(ThisContext ctx);
    void visitFieldGet(FieldGetContext ctx);
}
