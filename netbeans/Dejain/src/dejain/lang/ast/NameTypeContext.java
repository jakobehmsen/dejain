package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.internal.org.objectweb.asm.Type;

public class NameTypeContext extends AbstractContext implements TypeContext {
    public String name;
    private Class<?> c;
    
//    public Class<?> getType() {
//        return c;
//    }

    public NameTypeContext(Region region, String name) {
        super(region);
        this.name = name;
    }

    public NameTypeContext(Region region, Class<?> c) {
        super(region);
        this.name = c.getName();
        this.c = c;
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        try {
//            name = resolver.resolveClassName(name);
            c = resolver.resolveType(name);
            name = c.getName().replace(".", "/");
        } catch (ClassNotFoundException ex) {
            errorMessages.add(new ASMCompiler.Message(getRegion(), "Could not resolve type " + name + "."));
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isCompatibleWith(TypeContext other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName(String thisClassName) {
        return name;
    }
    
    @Override
    public String getDescriptor(String thisClassName) {
        return Type.getDescriptor(c);
    }

    @Override
    public String getSimpleName(String thisClassName) {
        return c.getSimpleName();
    }

    @Override
    public TypeContext getFieldType(String fieldName) {
        try {
            Field field = c.getField(fieldName);
            return new NameTypeContext(getRegion(), field.getType());
        } catch (NoSuchFieldException | SecurityException ex) {
            Logger.getLogger(NameTypeContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
