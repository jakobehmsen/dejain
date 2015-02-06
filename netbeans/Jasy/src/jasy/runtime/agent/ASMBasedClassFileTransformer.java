package jasy.runtime.agent;

import jasy.lang.ExhaustiveClassTransformer;
import jasy.runtime.asm.ClassAction;
import jasy.runtime.asm.ClassTransformer;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public class ASMBasedClassFileTransformer implements ClassFileTransformer {
    private ExhaustiveClassTransformer eTransformer;

    public ASMBasedClassFileTransformer(ClassTransformer transformer) {
        this.eTransformer = new ExhaustiveClassTransformer(transformer);
    }
    
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
//        while(true) {
//            ClassReader classReader = new ClassReader(classfileBuffer);
//            ClassNode classNode = new ClassNode();
//            classReader.accept(classNode, 0);
//            ClassAction action = transformer.resolve(classNode);
//
//            if(action == null)
//                break;
//
//            action.perform(classNode);
//            
//            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
//            classNode.accept(classWriter);
//
//            classfileBuffer = classWriter.toByteArray();
//        }
//        
//        return classfileBuffer;
        
        return eTransformer.transform(classfileBuffer);
    }
}
