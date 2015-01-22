package dejain.lang.ast;

public class ASTMethodAdd implements AST {
    public Selector selector;
    public ASTCode body;

    public ASTMethodAdd(Selector selector, ASTCode body) {
        this.selector = selector;
        this.body = body;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitMethodAdd(this);
    }
}
