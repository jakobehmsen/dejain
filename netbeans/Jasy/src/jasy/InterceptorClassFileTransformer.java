package jasy;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.expr.ConstructorCall;
import javassist.expr.ExprEditor;
import javassist.expr.FieldAccess;
import javassist.expr.MethodCall;
import javassist.expr.NewExpr;

public class InterceptorClassFileTransformer implements ClassFileTransformer {
    private ClassFileTransformationFilter filter;
    private Interceptor interceptor;
    private ClassPool classPool;
    private SystemInterceptor systemInterceptor;

    public InterceptorClassFileTransformer(ClassFileTransformationFilter filter, Interceptor interceptor) {
        this.filter = filter;
        this.interceptor = interceptor;
        this.classPool = ClassPool.getDefault();
    }
    
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        if(filter.shouldTransform(loader, className, classBeingRedefined, protectionDomain, classfileBuffer)) {
            if(systemInterceptor == null) {
                systemInterceptor = interceptor.interceptSystem(classPool, loader, protectionDomain);
            }

            CtClass ctClass;
            try {
    //            ctClass = classPool.get(className);
                ctClass = classPool.makeClass(new ByteArrayInputStream(classfileBuffer));
                ClassInterceptor ci = systemInterceptor.interceptClass(ctClass);

                for(CtConstructor constructor: ctClass.getDeclaredConstructors()) {
                    BodyInterceptor bi = ci.constructor(constructor);
                    constructor.instrument(new BodyInterceptorToExprEditor(bi));
                    bi.close();
                }

                for(CtMethod method: ctClass.getDeclaredMethods()) {
                    BodyInterceptor bi = ci.method(method);
                    method.instrument(new BodyInterceptorToExprEditor( bi));
                    bi.close();
                }

                return ctClass.toBytecode();
            } catch (CannotCompileException | IOException | RuntimeException ex) {
                Logger.getLogger(InterceptorClassFileTransformer.class.getName()).log(Level.SEVERE, null, ex);

    //            return classfileBuffer;
            }
        }
        
        return classfileBuffer;
    }
    
    private static class BodyInterceptorToExprEditor extends ExprEditor {
        private BodyInterceptor interceptor;

        public BodyInterceptorToExprEditor(BodyInterceptor interceptor) {
            this.interceptor = interceptor;
        }

        @Override
        public void edit(FieldAccess f) throws CannotCompileException {
            interceptor.fieldAccess(f);
        }

        @Override
        public void edit(MethodCall m) throws CannotCompileException {
            interceptor.methodCall(m);
        }

        @Override
        public void edit(ConstructorCall c) throws CannotCompileException {
            interceptor.constructorCall(c);
        }

        @Override
        public void edit(NewExpr e) throws CannotCompileException {
            interceptor.newExpr(e);
        }
    }
}
