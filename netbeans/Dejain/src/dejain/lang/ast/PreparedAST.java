package dejain.lang.ast;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;

public interface PreparedAST {
    void generate(Transformation<ClassNode> c, MethodAST.MethodCodeGenerator generator, InsnList originalIl);
    default TypeAST returns() {
        return null;
    }
}
