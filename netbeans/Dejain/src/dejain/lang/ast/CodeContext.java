package dejain.lang.ast;

public interface CodeContext extends Context {
    void accept(CodeVisitor visitor);
}
