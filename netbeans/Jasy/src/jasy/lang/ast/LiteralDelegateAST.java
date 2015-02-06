package jasy.lang.ast;

import jasy.lang.ASMCompiler.Region;

public interface LiteralDelegateAST<T> {
    public static LiteralDelegateAST<java.lang.String> String = new LiteralDelegateAST<java.lang.String>() {
        @Override
        public TypeAST resultType(Region region) {
            return new NameTypeAST(region, String.class);
        }

        @Override
        public <R> R accept(CodeVisitor<R> visitor, LiteralAST<java.lang.String> ctx) {
            return visitor.visitStringLiteral(ctx);
        }
    };
    
    public static LiteralDelegateAST<java.lang.Integer> Integer = new LiteralDelegateAST<java.lang.Integer>() {
        @Override
        public TypeAST resultType(Region region) {
            return new NameTypeAST(region, int.class);
        }

        @Override
        public <R> R accept(CodeVisitor<R> visitor, LiteralAST<java.lang.Integer> ctx) {
            return visitor.visitIntegerLiteral(ctx);
        }
    };
    
    public static LiteralDelegateAST<java.lang.Long> Long = new LiteralDelegateAST<java.lang.Long>() {
        @Override
        public TypeAST resultType(Region region) {
            return new NameTypeAST(region, long.class);
        }

        @Override
        public <R> R accept(CodeVisitor<R> visitor, LiteralAST<java.lang.Long> ctx) {
            return visitor.visitLongLiteral(ctx);
        }
    };
    
    TypeAST resultType(Region region);
    <R> R accept(CodeVisitor<R> visitor, LiteralAST<T> ctx);
}
