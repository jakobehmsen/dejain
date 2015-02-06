package jasy.lang.ast;

public interface CodeAST extends AST {
    <T> T accept(CodeVisitor<T> visitor);
}
