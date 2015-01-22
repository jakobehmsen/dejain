package dejain.lang.ast;

public class ASTReturn implements ASTCode {
    public ASTCode expression;

    public ASTReturn(ASTCode expression) {
        this.expression = expression;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitReturn(this);
    }
}
