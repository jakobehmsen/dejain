package dejain.lang.ast;

public interface ASTCode extends AST {
    default Class<?> resultType() {
        return void.class;
    }
    default boolean isExpression() {
        return resultType() != void.class;
    }
}
