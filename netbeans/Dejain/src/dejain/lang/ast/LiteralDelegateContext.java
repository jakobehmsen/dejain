package dejain.lang.ast;

public interface LiteralDelegateContext<T> {
    public static LiteralDelegateContext<java.lang.String> String = new LiteralDelegateContext<java.lang.String>() {
        @Override
        public Class<?> resultType() {
            return String.class;
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralContext<java.lang.String> ctx) {
            visitor.visitStringLiteral(ctx);
        }
    };
    
    public static LiteralDelegateContext<java.lang.Integer> Integer = new LiteralDelegateContext<java.lang.Integer>() {
        @Override
        public Class<?> resultType() {
            return Integer.class;
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralContext<java.lang.Integer> ctx) {
            visitor.visitIntegerLiteral(ctx);
        }
    };
    
    Class<?> resultType();
    void accept(CodeVisitor visitor, LiteralContext<T> ctx);
}
