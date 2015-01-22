package dejain.lang.ast;

public class ASTStringLiteral implements ASTCode {
    public String str;

    public ASTStringLiteral(String str) {
        this.str = str;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitStringLiteral(this);
    }

    @Override
    public Class<?> resultType() {
        return String.class;
    }
}
