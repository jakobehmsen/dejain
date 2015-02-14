package jasy.lang;

import jasy.lang.ast.Transformation;
import jasy.runtime.asm.ClassAction;
import jasy.runtime.asm.ClassTransformer;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.function.Function;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;

public class ExhaustiveClassTransformer {
    private ClassTransformer transformer;

    public ExhaustiveClassTransformer(Function<Transformation<ClassNode>, Runnable> transformer) {
        this((ClassTransformer)(c -> {
            Transformation<ClassNode> transformation = new Transformation<>(c);
            Runnable t = transformer.apply(transformation);
            return t != null ? c1 -> t.run() : null;
        }));
    }

    public ExhaustiveClassTransformer(ClassTransformer transformer) {
        this.transformer = transformer;
    }

    public byte[] transform(byte[] classfileBuffer) {
        while(true) {
            ClassReader classReader = new ClassReader(classfileBuffer);
            ClassNode classNode = new ClassNode();
            classReader.accept(classNode, ClassReader.EXPAND_FRAMES);
            ClassAction action = transformer.resolve(classNode);

            if(action == null)
                break;

            action.perform(classNode);
            
            classNode.accept(new TraceClassVisitor(new PrintWriter(System.out)));
            
            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS|ClassWriter.COMPUTE_FRAMES);
            classNode.accept(classWriter);

            classfileBuffer = classWriter.toByteArray();
            
//            new ClassReader(classfileBuffer).accept(new TraceClassVisitor(new PrintWriter(System.out)), 0);
            CheckClassAdapter.verify(new ClassReader(classfileBuffer), false, new PrintWriter(System.out));
        }
        
        return classfileBuffer;
    }
}
