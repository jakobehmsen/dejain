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

public class ModuleContext extends AbstractContext {
    public List<ClassContext> classes;

    public ModuleContext(Region region, List<ClassContext> classes) {
        super(region);
        this.classes = classes;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        classes.forEach(c -> c.resolve(resolver, errorMessages));
    }

    public Function<ClassNode, Runnable> toClassTransformer() {
        FirstByIndexTransformer<ClassNode, String> transformer = new FirstByIndexTransformer<>(c -> c.name);
        
        populate(transformer);
        
        return transformer;
    }
    
    public void populate(FirstByIndexTransformer<ClassNode, String> classesReformer) {
        classes.forEach(c -> {
            IfAllTransformer<ClassNode> classTransformer = new IfAllTransformer<>();
            c.populate(classTransformer);
            classesReformer.addTransformer(classTransformer);
        });
    }
}
