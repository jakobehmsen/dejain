package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.ClassTransformer;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.CompositeTransformer;
import dejain.runtime.asm.FirstByIndexTransformer;
import dejain.runtime.asm.IfAllTransformer;
import java.util.ArrayList;
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
    public void resolve(ClassAST thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        classes.forEach(c -> c.resolve(thisClass, expectedResultType, resolver, errorMessages));
    }

    public Function<Transformation<ClassNode>, Runnable> toClassTransformer() {
        FirstByIndexTransformer<Transformation<ClassNode>, String> transformer = new FirstByIndexTransformer<>(c -> c.getTarget().name);
        
        populate(transformer);
        
        return transformer;
    }
    
    public void populate(FirstByIndexTransformer<Transformation<ClassNode>, String> classesTransformer) {
        classes.forEach(c -> {
            IfAllTransformer<Transformation<ClassNode>> classTransformer = new IfAllTransformer<>();
            c.populate(classTransformer);
            classesTransformer.addTransformer(classTransformer);
        });
    }
}
