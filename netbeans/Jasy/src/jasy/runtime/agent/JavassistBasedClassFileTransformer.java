package jasy.runtime.agent;

import jasy.runtime.javassist.ClassAction;
import jasy.runtime.javassist.ClassTransformer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;

public class JavassistBasedClassFileTransformer implements java.lang.instrument.ClassFileTransformer {
    private ClassTransformer transformer;

    public JavassistBasedClassFileTransformer(ClassTransformer transformer) {
        this.transformer = transformer;
    }
    
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        try {
            System.out.println("ClassFileClassTransformer transforming...");
            CtClass ctClass = ClassPool.getDefault().makeClass(new ByteArrayInputStream(classfileBuffer));
            
            boolean wasChanged = false;
            while(true) {
                ClassAction action = transformer.resolve(ctClass);
                if(action == null)
                    break;
                wasChanged = true;
                action.perform(ctClass);
            }
            if(wasChanged) {
                ctClass.rebuildClassFile();
                return ctClass.toBytecode();
            }
        } catch (IOException | RuntimeException | CannotCompileException ex) {
            Logger.getLogger(JavassistBasedClassFileTransformer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return classfileBuffer;
    }
}
