package dejain.lang.ast;

public class ASTIntLiteral implements ASTCode {
    public int i;

    public ASTIntLiteral(int i) {
        this.i = i;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitIntLiteral(this);
    }

    @Override
    public Class<?> resultType() {
        return int.class;
    }
}
