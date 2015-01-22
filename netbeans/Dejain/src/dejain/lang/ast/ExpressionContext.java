package dejain.lang.ast;

public interface ExpressionContext extends Context {
    Class<?> resultType();
    void accept(ExpressionVisitor visitor);
}
