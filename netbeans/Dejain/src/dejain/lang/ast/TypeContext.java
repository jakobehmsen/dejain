package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.RuleContext;

public class TypeContext extends AbstractContext {
    public String name;
    private Class<?> c;
    
    public Class<?> getType() {
        return c;
    }

    public TypeContext(Region region, String name) {
        super(region);
        this.name = name;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        try {
            c = resolver.resolveType(name);
        } catch (ClassNotFoundException ex) {
            errorMessages.add(new ASMCompiler.Message(getRegion(), "Could not resolve type " + name + "."));
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
