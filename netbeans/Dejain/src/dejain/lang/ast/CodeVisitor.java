package dejain.lang.ast;

public interface CodeVisitor {
    void visitReturn(ReturnContext ctx);
    void visitStringLiteral(LiteralContext<String> ctx);
    void visitIntegerLiteral(LiteralContext<Integer> ctx);
}
