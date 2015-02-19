package jasy.lang.ast;

import org.objectweb.asm.Label;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;

public interface PreparedAST {
    void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl, Label ifFalseLabel);
    default void generate(Transformation<ClassNode> c, MethodCodeGenerator generator, InsnList originalIl) {
        generate(c, generator, originalIl, null);
    }
    default void returns(java.util.List<jasy.lang.ast.TypeAST> returnTypes) {
        
    }
}
