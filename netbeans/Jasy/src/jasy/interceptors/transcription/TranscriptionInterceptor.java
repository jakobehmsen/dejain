package jasy.interceptors.transcription;

import jasy.BodyInterceptor;
import jasy.ClassInterceptor;
import jasy.DefaultBodyInterceptor;
import jasy.DefaultClassInterceptor;
import jasy.Interceptor;
import jasy.SystemInterceptor;
import java.lang.reflect.Constructor;
import java.security.ProtectionDomain;
import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;
import javassist.NotFoundException;

public class TranscriptionInterceptor implements Interceptor {
    @Override
    public SystemInterceptor interceptSystem(ClassPool classPool, ClassLoader loader, ProtectionDomain protectionDomain) {
        return new SystemInterceptor() {
            @Override
            public ClassInterceptor interceptClass(CtClass klass) {
                try {
                    klass.addInterface(classPool.get(Arguable.class.getName()));
                    klass.addField(CtField.make("private static Object id;", klass));
                    klass.addMethod(CtMethod.make("public " + Argument.class.getCanonicalName() + " toArgument() {return new " + LookupArgument.class.getCanonicalName() + "(id);}", klass));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                return new DefaultClassInterceptor() {
                    int i = 0;
                    
                    @Override
                    public BodyInterceptor constructor(CtConstructor constructor) {
                        try {
                            CtClass constructorClass = klass.makeNestedClass("ConstructorTask" + i, true);
                            constructorClass.addField(CtField.make("private " + klass.getName() + " owner;", constructorClass));
                            constructorClass.addConstructor(new CtConstructor(new CtClass[]{klass}, constructorClass));
                            constructorClass.getConstructors()[0].setBody("owner = $1;");
                            constructorClass.addInterface(classPool.get(Session.SessionedTask.class.getName()));
                            
                            String constructorParameterTypesSrc = 
                                constructor.getParameterTypes().length > 0 ? (
                                    "new Class[]{" +
                                    Arrays.asList(constructor.getParameterTypes()).stream()
                                    .map(pt -> pt.getName() + ".class")
                                    .collect(Collectors.joining(",")) +
                                    "}"
                                    ) : "new Class[0]";
                            String constructorFieldSrc = "private static " + Constructor.class.getCanonicalName() + " constructor" + i + " = " + klass.getName() + ".class.getDeclaredConstructor(" + constructorParameterTypesSrc + ");";
                            System.out.println("constructorFieldSrc=" + constructorFieldSrc);
                            constructorClass.addField(CtField.make(constructorFieldSrc, constructorClass));
                            
                            String callSrc = 
                                "public Object call() throws Exception {\n" +
                                "        " + Session.class.getCanonicalName() + " session = " + Session.class.getCanonicalName() + ".getCurrentSession();\n" + 
                                "        owner.id = session.getStore().allocateId(this);\n" +
                                "        session.getStore().put(" + ConstructorInvocation.class.getCanonicalName() + ".fromTransientCreation(constructor" + i + ", new Object[]{$$}));\n" +
                                "        return null;\n" +
                                "}";
                            System.out.println("callSrc=" + callSrc);
                            constructorClass.addMethod(CtMethod.make(callSrc, constructorClass));
                            constructorClass.toClass(loader, protectionDomain);
                            
                            
                            String src = 
                                Session.class.getCanonicalName() + " session = " + Session.class.getCanonicalName() + ".getCurrentSession();\n" +
                                "if(session == null) {\n" +
                                "    " + Future.class.getCanonicalName() + " futureResult = " + Session.class.getCanonicalName() + ".Executor.submit(new " + constructorClass.getName() + ");\n" +
                                "} else\n" +
                                "    id = session.getStore().allocateId(this);" + 
                                "\n";
                            
                            System.out.println("constructorSrc=" + constructor);
                            constructor.insertBeforeBody(src);
                        } catch (CannotCompileException | NotFoundException ex) {
                            ex.printStackTrace();
                        }
                        
                        i++;

                        return super.constructor(constructor);
                    }

                    @Override
                    public BodyInterceptor method(CtMethod method) {
                        try {
                            String src = 
                                "" +
                                "" +
                                "" +
                                "" +
                                "" +
                                "" +
                                "" +
                                "";
                            
                            method.setBody(src);
                        } catch (CannotCompileException ex) {
                            ex.printStackTrace();
                        }
                        
                        return super.method(method);
                    }
                };
            }
        };
    }
}
