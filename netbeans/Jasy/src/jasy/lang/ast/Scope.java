package jasy.lang.ast;

public interface Scope {
    TypeAST getFieldType(String fieldName);
}
