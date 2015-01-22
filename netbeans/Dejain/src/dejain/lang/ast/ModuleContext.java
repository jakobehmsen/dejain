package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
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
}
