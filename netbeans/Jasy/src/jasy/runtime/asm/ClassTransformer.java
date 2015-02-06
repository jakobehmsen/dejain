package jasy.runtime.asm;

import org.objectweb.asm.tree.ClassNode;

public interface ClassTransformer {
    ClassAction resolve(ClassNode classNode);
}
