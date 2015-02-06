package jasy;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import javassist.ClassPool;

public interface Interceptor {
    SystemInterceptor interceptSystem(ClassPool classPool, ClassLoader loader, ProtectionDomain protectionDomain);
    default ClassFileTransformer toClassFileTransformer(ClassFileTransformationFilter filter) {
        return new InterceptorClassFileTransformer(filter, this);
    }
    default void forInstrumentation(ClassFileTransformationFilter filter, Instrumentation instrumentation) {
        instrumentation.addTransformer(toClassFileTransformer(filter));
    }
}
