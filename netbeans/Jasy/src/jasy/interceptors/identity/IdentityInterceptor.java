package jasy.interceptors.identity;

import jasy.BodyInterceptor;
import jasy.ClassInterceptor;
import jasy.DefaultBodyInterceptor;
import jasy.DefaultClassInterceptor;
import jasy.Interceptor;
import jasy.SystemInterceptor;
import java.security.ProtectionDomain;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;
import javassist.expr.ConstructorCall;
import javassist.expr.FieldAccess;
import javassist.expr.MethodCall;
import javassist.expr.NewExpr;

public class IdentityInterceptor implements Interceptor {
    @Override
    public SystemInterceptor interceptSystem(ClassPool classPool, ClassLoader loader, ProtectionDomain protectionDomain) {
        CtClass identityCtClass = classPool.makeClass("Identity");

        try {
            identityCtClass.addField(CtField.make("private static long id = 0L;", identityCtClass));
            identityCtClass.addMethod(CtMethod.make("public static long nextId() {return id++;}", identityCtClass));
            identityCtClass.toClass(loader, protectionDomain);
        } catch (CannotCompileException ex) {
            ex.printStackTrace();
        }

        return new SystemInterceptor() {
            @Override
            public ClassInterceptor interceptClass(CtClass klass) {
                try {
                    klass.addInterface(classPool.get(IdHolder.class.getName()));
                    klass.addField(CtField.make("private long id;", klass));
                    klass.addMethod(CtMethod.make("public Object getId() {return new Long(id);}", klass));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                return new DefaultClassInterceptor() {
                    @Override
                    public BodyInterceptor constructor(CtConstructor c) {
                        try {
                            c.insertBeforeBody("id = " + identityCtClass.getName() + ".nextId();");
                        } catch (CannotCompileException ex) {
                            ex.printStackTrace();
                        }

                        return new DefaultBodyInterceptor();
                    }
                };
            }
        };
    }
}
