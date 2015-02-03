package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.asm.Type;

public class NameTypeAST extends AbstractAST implements TypeAST {
    public String name;
    public String descriptor;
    private Class<?> c;

    public static NameTypeAST fromDescriptor(String descriptor /*Assumed to be fully qualified*/) {
        NameTypeAST i = new NameTypeAST(null, "");
        i.name = Type.getType(descriptor).getClassName();
        i.descriptor = descriptor;
        try {
            i.c = Class.forName(i.name);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NameTypeAST.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }

    public NameTypeAST(Region region, String name) {
        super(region);
        this.name = name;
    }

    public NameTypeAST(Region region, Class<?> c) {
        super(region);
        this.name = c.getName();
        this.c = c;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        try {
//            name = resolver.resolveClassName(name);
            c = resolver.resolveType(name);
            name = c.getName().replace(".", "/");
        } catch (ClassNotFoundException ex) {
            errorMessages.add(new ASMCompiler.Message(getRegion(), "Could not resolve type " + name + "."));
        }
    }

    public Class<?> getType() {
        return c;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isCompatibleWith(TypeAST other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName(String thisClassName) {
        return name;
    }
    
    @Override
    public String getDescriptor(String thisClassName) {
//        return Type.getDescriptor(c);
        return descriptor != null ? descriptor : Type.getDescriptor(c);
    }

    @Override
    public String getSimpleName(String thisClassName) {
        return c.getSimpleName();
    }

    @Override
    public TypeAST getFieldType(String fieldName) {
        try {
            Field field = c.getField(fieldName);
//            return new NameTypeAST(getRegion(), field.getType());
            return NameTypeAST.fromDescriptor(Type.getType(field.getType()).getDescriptor());
        } catch (NoSuchFieldException | SecurityException ex) {
            Logger.getLogger(NameTypeAST.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
