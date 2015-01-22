package dejain.lang.ast;

public interface AST {
    void accept(ASTVisitor visitor);
}
