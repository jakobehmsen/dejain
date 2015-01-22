package dejain.runtime.asm;

import org.objectweb.asm.tree.ClassNode;

public interface ClassAction {
    void perform(ClassNode classNode);
}
