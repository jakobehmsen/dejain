package dejain.lang.ast;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;

public interface PreparedExpressionAST extends PreparedAST {
    TypeAST resultType();
}
