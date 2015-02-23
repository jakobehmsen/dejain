package jasy.lang.ast;

public interface Scope {
    TypeAST getFieldType(ClassLoader classLoader, String fieldName);
}
