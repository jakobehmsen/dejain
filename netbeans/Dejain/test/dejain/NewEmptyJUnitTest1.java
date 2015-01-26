/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dejain;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import static dejain.Assertion.*;
import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Message;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassMap;
import dejain.lang.CommonClassResolver;
import dejain.lang.ExhaustiveClassTransformer;
import dejain.lang.ast.ModuleContext;
import dejain.lang.ast.TypeContext;
import dejain.runtime.asm.ClassTransformer;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

/**
 *
 * @author Jakob
 */
public class NewEmptyJUnitTest1 {
    @Test
    public void testAllClassesAdd1PublicPrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+public float someField2;}", 
            forClass("dejain.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isPublic()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1ProtectedPrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+protected float someField2;}", 
            forClass("dejain.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isProtected()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PrivatePrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+private float someField2;}", 
            forClass("dejain.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isPrivate()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicStaticPrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+public static float someField2;}", 
            forClass("dejain.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isPublic()))
                .and(fmodifiers(isStatic()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicObjectField() throws IOException {
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+public String someField2;}", 
            forClass("dejain.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(String.class)))
                .and(fmodifiers(isPublic()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethod1() throws IOException {
        String expectedResult = "Hi";
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+public String toString() {return \"" + expectedResult + "\";}}", 
            forClass("dejain.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethod2() throws IOException {
        String str1 = "H";
        String str2 = "i";
        String expectedResult = str1 + str2;
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+public String toString() {return \"" + str1 + "\" + \"" + str2 + "\";}}", 
            forClass("dejain.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    private static Function<byte[], byte[]> transformClass(ClassResolver resolver, String source) {
        ASMCompiler compiler = new ASMCompiler(resolver);
        return bytes -> {
            try {
                ModuleContext module = compiler.compile(new ByteArrayInputStream(source.getBytes("UTF-8")));
                ArrayList<Message> errorMessages = new ArrayList<>();
                module.resolve(resolver, errorMessages);
                
                if(errorMessages.size() > 0) {
                    String msg = errorMessages.stream().map(m -> m.toString()).collect(Collectors.joining("\n"));
                    throw new RuntimeException(msg);
                } else {
                    Function<ClassNode, Runnable> classTransformer = module.toClassTransformer();
                    ExhaustiveClassTransformer eTransformer = new ExhaustiveClassTransformer(classTransformer);
                    return eTransformer.transform(bytes);
                }
            } catch (IOException ex) {
                Logger.getLogger(NewEmptyJUnitTest1.class.getName()).log(Level.SEVERE, null, ex);
            }
            return bytes;
        };
    }
    
    private static void testSourceToClasses(String[] classNames, String source, Predicate<Class<?>[]> assertion) throws IOException {
        CommonClassMap classMap = new CommonClassMap();
        
        for(String className: classNames)
            classMap.addClassName(className);
        
        classMap.addClassName("java.lang.String");
        classMap.addClassName("java.lang.Object");
        CommonClassResolver resolver = new CommonClassResolver(classMap);
        resolver.importPackage("java.lang");
        
        ClassLoader cl = new ProxyClassLoader(ifIn(classNames), classBytesFromName().andThen(transformClass(resolver, source)));
        
        Class<?>[] classes = Arrays.asList(classNames).stream()
            .map(className -> {
                try {
                    return cl.loadClass(className);
//                    return Class.forName(source, true, cl);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(NewEmptyJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            })
            .toArray(size -> new Class<?>[size]);
        
        assertTrue(assertion.test(classes));
        
        // Read all classes
        // Replace interusages with derived classes
        // Derived classes using module
        // Assert derived classes
//        assertTrue(modulePredicate.test(module));
    }
    
    private static Predicate<Class<?>[]> forClass(String name, Predicate<Class<?>> predicate) {
        return classes -> {
            Class<?> c = Arrays.asList(classes).stream().filter(x -> x.getName().equals(name)).findFirst().get();
            return predicate.test(c);
        };
    }
    
    private static Predicate<Class<?>> chasFieldWhere(Predicate<Field> predicate) {
        return c -> Arrays.asList(c.getDeclaredFields()).stream().anyMatch(predicate);
    }
    
    private static Predicate<Field> fname(Predicate<String> predicate) {
        return f -> predicate.test(f.getName());
    }
    
    private static Predicate<Field> ftype(Predicate<Class<?>> predicate) {
        return f -> predicate.test(f.getType());
    }
    
    private static Predicate<Field> fmodifiers(Predicate<Integer> predicate) {
        return f -> predicate.test(f.getModifiers());
    }
    
    private static Predicate<Class<?>> chasMethodWhere(Predicate<Method> predicate) {
        return c -> Arrays.asList(c.getDeclaredMethods()).stream().anyMatch(predicate);
    }
    
    private static Predicate<Class<?>> forInstance(Predicate<Object> predicate) {
        return c -> {
            try {
                Object instance = c.newInstance();
                return predicate.test(instance);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(NewEmptyJUnitTest1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static Predicate<Object> imethod(String name, BiPredicate<Object, Method> predicate) {
        return i -> {
            try {
                Method m = i.getClass().getMethod(name);
                return predicate.test(i, m);
            } catch (NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(NewEmptyJUnitTest1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static BiPredicate<Object, Method> invocationResult(Predicate<Object> predicate) {
        return (i, m) -> {
            try {
                Object result = m.invoke(i);
                return predicate.test(result);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(NewEmptyJUnitTest1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static Predicate<Integer> isPublic() {
        return m -> Modifier.isPublic(m);
    }
    
    private static Predicate<Integer> isProtected() {
        return m -> Modifier.isProtected(m);
    }
    
    private static Predicate<Integer> isPrivate() {
        return m -> Modifier.isPrivate(m);
    }
    
    private static Predicate<Integer> isStatic() {
        return m -> Modifier.isStatic(m);
    }
    
    private static Predicate<String> ifIn(String[] names) {
        return name -> Arrays.asList(names).contains(name);
    }
    
    private static Function<String, byte[]> classBytesFromName() {
        return name -> {
            try {
                String s = new java.io.File("build\\test\\classes\\" + name.replace(".", "\\") + ".class").getCanonicalFile().toString();
                InputStream classStream = new FileInputStream("build\\test\\classes\\" + name.replace(".", "\\") + ".class"); //classUrl.openStream();
                ClassReader classReader = new ClassReader(classStream);
                ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                classReader.accept(classWriter, 0);
                return classWriter.toByteArray();
            } catch (IOException ex) {
                Logger.getLogger(NewEmptyJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        };
    }

    private static Predicate<Method> mname(Predicate<String> predicate) {
        return m -> predicate.test(m.getName());
    }

    private static Predicate<? super Method> rreturnType(Predicate<Class<?>> predicate) {
        return m -> predicate.test(m.getReturnType());
    }

    private static Predicate<? super Method> rmodifiers(Predicate<Integer> predicate) {
        return m -> predicate.test(m.getModifiers());
    }
}
