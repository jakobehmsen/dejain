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
import dejain.lang.ast.ModuleContext;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

/**
 *
 * @author Jakob
 */
public class NewEmptyJUnitTest1 {
    @Test
    public void testSourceToClasses() throws IOException {
        testSourceToClasses(
            new String[]{"dejain.TestClass1"}, 
            "class {+public int someField;}", 
            forClass("dejain.TestClass1", chasFieldWhere(fname(is("someField"))))
        );
    }
    
    private Function<byte[], byte[]> transformClass(String source) {
        ClassResolver resolver = className -> className;
        ASMCompiler compiler = new ASMCompiler(resolver);
        return bytes -> {
            try {
                ModuleContext module = compiler.compile(new ByteArrayInputStream(source.getBytes("UTF-8")));
                ArrayList<Message> errorMessages = new ArrayList<>();
                module.resolve(resolver, errorMessages);
                if(errorMessages.size() > 0) {
                    String msg = errorMessages.stream().map(m -> m.toString()).collect(Collectors.joining("\n"));
                    throw new RuntimeException(msg);
                }
            } catch (IOException ex) {
                Logger.getLogger(NewEmptyJUnitTest1.class.getName()).log(Level.SEVERE, null, ex);
            }
            return bytes;
        };
    }
    
    private void testSourceToClasses(String[] classNames, String source, Predicate<Class<?>[]> assertion) throws IOException {
        ClassLoader cl = new ProxyClassLoader(classBytesFromNames(classNames).andThen(transformClass(source)));
        
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
    
    private Predicate<Class<?>[]> forClass(String name, Predicate<Class<?>> predicate) {
        return classes -> {
            Class<?> c = Arrays.asList(classes).stream().filter(x -> x.getName().equals(name)).findFirst().get();
            return predicate.test(c);
        };
    }
    
    private Predicate<Class<?>> chasFieldWhere(Predicate<Field> predicate) {
        return c -> Arrays.asList(c.getDeclaredFields()).stream().anyMatch(predicate);
    }
    
    private Predicate<Field> fname(Predicate<String> predicate) {
        return f -> predicate.test(f.getName());
    }
    
    private Function<String, byte[]> classBytesFromNames(String[] names) {
        return name -> {
            if(Arrays.asList(names).contains(name)) {
//                URL classUrl = ClassLoader.getSystemClassLoader().getResource(name + ".java");
                try {
                    String s = new java.io.File("build\\test\\classes\\" + name.replace(".", "\\") + ".class").getCanonicalFile().toString();
                    InputStream classStream = new FileInputStream("build\\test\\classes\\" + name.replace(".", "\\") + ".class"); //classUrl.openStream();
                    ClassReader classReader = new ClassReader(classStream);
                    ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                    classReader.accept(classWriter, 0);
                    return classWriter.toByteArray();
                } catch (IOException ex) {
                    Logger.getLogger(NewEmptyJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
                }/* catch (Exception ex) {
                    Logger.getLogger(NewEmptyJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            }
            
            return null;
        };
    }
    
}
