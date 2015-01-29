package dejain.lang.ast;

import dejain.lang.ASMCompiler.Region;

public interface LiteralDelegateContext<T> {
    public static LiteralDelegateContext<java.lang.String> String = new LiteralDelegateContext<java.lang.String>() {
        @Override
        public TypeContext resultType(Region region) {
            return new NameTypeContext(region, String.class);
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralContext<java.lang.String> ctx) {
            visitor.visitStringLiteral(ctx);
        }
    };
    
    public static LiteralDelegateContext<java.lang.Integer> Integer = new LiteralDelegateContext<java.lang.Integer>() {
        @Override
        public TypeContext resultType(Region region) {
            return new NameTypeContext(region, int.class);
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralContext<java.lang.Integer> ctx) {
            visitor.visitIntegerLiteral(ctx);
        }
    };
    
    public static LiteralDelegateContext<java.lang.Long> Long = new LiteralDelegateContext<java.lang.Long>() {
        @Override
        public TypeContext resultType(Region region) {
            return new NameTypeContext(region, long.class);
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralContext<java.lang.Long> ctx) {
            visitor.visitLongLiteral(ctx);
        }
    };
    
    TypeContext resultType(Region region);
    void accept(CodeVisitor visitor, LiteralContext<T> ctx);
}
