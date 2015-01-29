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
    /**
     * 
     * @param thisClassName Separated by '/'.
     * @return 
     */
    String getDescriptor(String thisClassName);
    /**
     * 
     * @param thisClassName Separated by '/'.
     * @return 
     */
    String getName(String thisClassName);
    /**
     * 
     * @param thisClassName Separated by '/'.
     * @return 
     */
    String getSimpleName(String thisClassName);
    boolean isCompatibleWith(TypeContext other);
    
    default String getDescriptor() {
        return getDescriptor(null);
    }
    
    default String getName() {
        return getName(null);
    }
    
    default String getSimpleName() {
        return getSimpleName(null);
    }
    
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
