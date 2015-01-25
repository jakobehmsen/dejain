package dejain.lang;

import dejain.runtime.asm.ClassAction;
import dejain.runtime.asm.ClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class ExhaustiveClassTransformer {
    private ClassTransformer transformer;

    public ExhaustiveClassTransformer(ClassTransformer transformer) {
        this.transformer = transformer;
    }

    public byte[] tranform(byte[] classfileBuffer) {
        while(true) {
            ClassReader classReader = new ClassReader(classfileBuffer);
            ClassNode classNode = new ClassNode();
            classReader.accept(classNode, 0);
            ClassAction action = transformer.resolve(classNode);

            if(action == null)
                break;

            action.perform(classNode);
            
            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
            classNode.accept(classWriter);

            classfileBuffer = classWriter.toByteArray();
        }
        
        return classfileBuffer;
    }
}
