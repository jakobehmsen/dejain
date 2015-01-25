package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.ClassTransformer;
import dejain.runtime.asm.CommonClassTransformer;
import java.util.ArrayList;
import java.util.List;

public class ModuleContext implements Context {
    public List<ClassContext> classes;

    public ModuleContext(List<ClassContext> classes) {
        this.classes = classes;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        classes.forEach(c -> c.resolve(resolver, errorMessages));
    }

    public ClassTransformer toClassTransformer() {
        CommonClassTransformer transformer = new CommonClassTransformer();
        
        classes.forEach(c -> c.populate(transformer));
        
        return transformer;
    }
}
