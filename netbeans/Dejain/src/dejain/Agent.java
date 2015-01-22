package dejain;

import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

public class Agent {
    public static void premain(String args, Instrumentation inst) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String interceptorClassName = args;
        System.out.println(args);
        Class<Interceptor> interceptorClass = (Class<Interceptor>)Class.forName(interceptorClassName);
        Interceptor interceptor = interceptorClass.newInstance();

        String persistentAnnotationDesc = "L" + Intercept.class.getCanonicalName().replace(".", "/") + ";";
        ClassFileTransformationFilter filter = (ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) -> {
            ClassReader classReader = new ClassReader(classfileBuffer);
				
            ClassNode classNode = new ClassNode();
            classReader.accept(classNode, ClassReader.SKIP_DEBUG);
            
            return classNode.visibleAnnotations.stream().anyMatch(x -> {
                return ((AnnotationNode)x).desc.equals(persistentAnnotationDesc);
            });
        };
        interceptor.forInstrumentation(filter, inst);
    }
}
