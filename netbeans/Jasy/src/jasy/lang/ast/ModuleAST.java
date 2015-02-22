package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import jasy.runtime.asm.FirstByIndexTransformer;
import jasy.runtime.asm.IfAllTransformer;
import java.util.List;
import java.util.function.Function;
import org.objectweb.asm.tree.ClassNode;

public class ModuleAST extends AbstractAST {
    public List<ClassAST> classes;

    public ModuleAST(Region region, List<ClassAST> classes) {
        super(region);
        this.classes = classes;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        classes.forEach(c -> c.resolve(thisClass, expectedResultType, resolver, errorMessages));
    }

    public Function<Transformation<ClassNode>, Runnable> toClassTransformer(ClassResolver classResolver) {
        FirstByIndexTransformer<Transformation<ClassNode>, String> transformer = new FirstByIndexTransformer<>(c -> c.getTarget().name);
        
        populate(classResolver, transformer);
        
        return transformer;
    }
    
    public void populate(ClassResolver classResolver, FirstByIndexTransformer<Transformation<ClassNode>, String> classesTransformer) {
        classes.forEach(c -> {
            IfAllTransformer<Transformation<ClassNode>> classTransformer = new IfAllTransformer<>();
            c.populate(classResolver, classTransformer);
            classesTransformer.addTransformer(classTransformer);
        });
    }
}
