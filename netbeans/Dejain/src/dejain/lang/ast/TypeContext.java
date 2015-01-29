package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.RuleContext;

public interface TypeContext extends Context {
    String getName();
    String getSimpleName();
    boolean isCompatibleWith(TypeContext other);
    
//    public String name;
//    private Class<?> c;
    
//    public Class<?> getType() {
//        return c;
//    }

//    public TypeContext(Region region, String name) {
//        super(region);
//        this.name = name;
//    }

//    public TypeContext(Region region, Class<?> c) {
//        super(region);
//        this.name = c.getName();
//        this.c = c;
//    }

//    @Override
//    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
//        try {
//            c = resolver.resolveType(name);
//        } catch (ClassNotFoundException ex) {
//            errorMessages.add(new ASMCompiler.Message(getRegion(), "Could not resolve type " + name + "."));
//        }
//    }

//    @Override
//    public String toString() {
//        return name;
//    }

    public TypeContext getFieldType(String fieldName);
}
