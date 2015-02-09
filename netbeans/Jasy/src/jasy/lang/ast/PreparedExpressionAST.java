package jasy.lang.ast;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;

public interface PreparedExpressionAST extends PreparedAST {
    TypeAST resultType();

    default boolean canBeArgumentFor(Class<?> parameterType) {
        TypeAST resultType = resultType();
        Class<?> argumentType = ((NameTypeAST)resultType).getType();
        
        return parameterType.isAssignableFrom(argumentType);
    }
}
