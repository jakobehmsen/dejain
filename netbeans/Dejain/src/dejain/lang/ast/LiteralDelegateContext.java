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
            return int.class;
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralContext<java.lang.Integer> ctx) {
            visitor.visitIntegerLiteral(ctx);
        }
    };
    
    public static LiteralDelegateContext<java.lang.Long> Long = new LiteralDelegateContext<java.lang.Long>() {
        @Override
        public Class<?> resultType() {
            return long.class;
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralContext<java.lang.Long> ctx) {
            visitor.visitLongLiteral(ctx);
        }
    };
    
    Class<?> resultType();
    void accept(CodeVisitor visitor, LiteralContext<T> ctx);
}
