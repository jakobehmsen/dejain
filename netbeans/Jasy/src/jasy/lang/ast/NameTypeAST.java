package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javassist.bytecode.SignatureAttribute.TypeParameter;
import org.objectweb.asm.Type;

public class NameTypeAST extends AbstractAST implements TypeAST {
    public String name;
    public String descriptor;
    private Class<?> c;
    private TypeAST[] typeParameters;
    private Hashtable<String, TypeAST> typeVariableNameToTypeMap = new Hashtable<>();

    public static NameTypeAST fromDescriptor(String descriptor /*Assumed to be fully qualified*/) {
        return fromDescriptor(descriptor, new TypeAST[]{});
    }

    public static NameTypeAST fromDescriptor(String descriptor /*Assumed to be fully qualified*/, TypeAST[] typeParameters) {
        NameTypeAST i = new NameTypeAST(null, "");
        i.name = Type.getType(descriptor).getClassName();
        i.descriptor = descriptor;
        try {
            i.c = Class.forName(i.name);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NameTypeAST.class.getName()).log(Level.SEVERE, null, ex);
        }
        i.typeParameters = typeParameters;
        if(typeParameters.length > 0) {
            TypeVariable[] tvs = i.c.getTypeParameters();
            for(int j = 0; j < tvs.length; j++) {
                String name = tvs[j].getName();
                String tname = tvs[j].getTypeName();
                TypeAST arg = typeParameters[j];
                
                i.typeVariableNameToTypeMap.put(name, arg);
            }
        }
        return i;
    }

    public NameTypeAST(Region region, String name) {
        super(region);
        this.name = name;
//        descriptor = getDescriptorFromName(name);
//        try {
//            c = getClassFromName(name);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NameTypeAST.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    private static String getDescriptorFromName(String name) {
        switch(name) {
            case "boolean":
                return "Z";
            case "byte":
                return "B";
            case "short":
                return "S";
            case "int":
                return "I";
            case "long":
                return "J";
            case "float":
                return "F";
            case "double":
                return "D";
            case "char":
                return "C";
            default:
                return "L" + name + ";";
        }
    }
    
    private static Class<?> getClassFromName(String name) throws ClassNotFoundException {
        switch(name) {
            case "int":
                return int.class;
            default:
                return Class.forName(name);
        }
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
            descriptor = getDescriptorFromName(name);
        } catch (ClassNotFoundException ex) {
            errorMessages.add(new ASMCompiler.Message(getRegion(), "Could not resolve type " + name + "."));
        }
    }

    public Class<?> getType() {
        return c;
    }

    @Override
    public String toString() {
        String typeParametersStr = "";
        if(typeParameters.length > 0) {
            typeParametersStr = IntStream.range(0, typeParameters.length).mapToObj(i -> {
                String name = c.getTypeParameters()[i].getName();
                return typeVariableNameToTypeMap.get(name).toString();
            }).collect(Collectors.joining(",", "<", ">"));
        }
        return name + typeParametersStr;
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
            String fieldTypeDescriptor;
            if(field.getGenericType() instanceof TypeVariable) {
                // Must be typecast
                TypeVariable tv = (TypeVariable)field.getGenericType();
                fieldTypeDescriptor = typeVariableNameToTypeMap.get(tv.getName()).getDescriptor();
            } else
                fieldTypeDescriptor = Type.getType(field.getType()).getDescriptor();
//            return new NameTypeAST(getRegion(), field.getType());
            return NameTypeAST.fromDescriptor(Type.getType(field.getType()).getDescriptor());
        } catch (NoSuchFieldException | SecurityException ex) {
            Logger.getLogger(NameTypeAST.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public TypeAST getTypeArgument(String name) {
        return typeVariableNameToTypeMap.get(name);
    }
}