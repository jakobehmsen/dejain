package dejain.lang;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class SingleClassLoader extends ClassLoader {
    private ClassNode classNode;
    
    public SingleClassLoader(ClassNode classNode) {
        this.classNode = classNode;
    }
    
    public Class<?> loadClass() {
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        classNode.accept(classWriter);
        
        byte[] bytes = classWriter.toByteArray();
        String name = classNode.name.replace("/", ".");
        return defineClass(name, bytes, 0, bytes.length);
    }
}
