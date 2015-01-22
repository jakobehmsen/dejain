package dejain.lang.ast;

public interface StatementContext extends Context {
    void accept(StatementVisitor visitor);
}
