package jasy.lang;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import jasy.lang.ExhaustiveClassTransformer;
import jasy.lang.ast.ModuleAST;
import jasy.lang.ast.Transformation;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.util.CheckClassAdapter;

public class ModuleClassBytesTransformer implements ClassBytesTransformer {
    private String source;
    private ClassResolver resolver;
    private ModuleAST module;

    public ModuleClassBytesTransformer(String source, ClassResolver resolver) {
        this.source = source;
        this.resolver = resolver;
    }

    @Override
    public void initialize(ClassLoader classLoader) {
        ASMCompiler compiler = new ASMCompiler(resolver);
        try {
            module = compiler.compile(new ByteArrayInputStream(source.getBytes("UTF-8")));
            ArrayList<ASMCompiler.Message> errorMessages = new ArrayList<>();
            module.resolve(null, null, resolver, classLoader, errorMessages);

            if(errorMessages.size() > 0) {
                String msg = errorMessages.stream().map(m -> m.toString()).collect(Collectors.joining("\n"));
                throw new RuntimeException(msg);
            }
        } catch (IOException ex) {
            Logger.getLogger(ModuleClassBytesTransformer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public byte[] transform(ClassLoader classLoader, byte[] bytes) {
        try {
            Function<Transformation<ClassNode>, Runnable> classTransformer = module.toClassTransformer(resolver, classLoader);
            ExhaustiveClassTransformer eTransformer = new ExhaustiveClassTransformer(classTransformer);
            byte[] newBytes = eTransformer.transform(bytes);
            
            InputStream classStream = new ByteArrayInputStream(newBytes);
            ClassReader classReader = new ClassReader(classStream);
//                    classReader.accept(new TraceClassVisitor(new PrintWriter(System.out)), 0);
            CheckClassAdapter.verify(classReader, false, new PrintWriter(System.out));
//                    ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
//                    classReader.accept(classWriter, 0);
//                    Textifier asmifier = new Textifier();
//                    classWriter.
            
            return newBytes;
        } catch (IOException ex) {
            Logger.getLogger(ModuleClassBytesTransformer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
