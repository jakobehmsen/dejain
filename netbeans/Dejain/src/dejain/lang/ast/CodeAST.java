package dejain.lang.ast;

public interface CodeAST extends AST {
    void accept(CodeVisitor visitor);
}
