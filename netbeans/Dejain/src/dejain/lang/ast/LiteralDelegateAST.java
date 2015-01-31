package dejain.lang.ast;

import dejain.lang.ASMCompiler.Region;

public interface LiteralDelegateAST<T> {
    public static LiteralDelegateAST<java.lang.String> String = new LiteralDelegateAST<java.lang.String>() {
        @Override
        public TypeAST resultType(Region region) {
            return new NameTypeAST(region, String.class);
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralAST<java.lang.String> ctx) {
            visitor.visitStringLiteral(ctx);
        }
    };
    
    public static LiteralDelegateAST<java.lang.Integer> Integer = new LiteralDelegateAST<java.lang.Integer>() {
        @Override
        public TypeAST resultType(Region region) {
            return new NameTypeAST(region, int.class);
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralAST<java.lang.Integer> ctx) {
            visitor.visitIntegerLiteral(ctx);
        }
    };
    
    public static LiteralDelegateAST<java.lang.Long> Long = new LiteralDelegateAST<java.lang.Long>() {
        @Override
        public TypeAST resultType(Region region) {
            return new NameTypeAST(region, long.class);
        }

        @Override
        public void accept(CodeVisitor visitor, LiteralAST<java.lang.Long> ctx) {
            visitor.visitLongLiteral(ctx);
        }
    };
    
    TypeAST resultType(Region region);
    void accept(CodeVisitor visitor, LiteralAST<T> ctx);
}
