package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class ThisTypeAST extends AbstractAST implements TypeAST {
    private Scope classInfo;

    public ThisTypeAST(jasy.lang.ASMCompiler.Region region) {
        super(region);
    }

    public ThisTypeAST(jasy.lang.ASMCompiler.Region region, Scope classInfo) {
        super(region);
        this.classInfo = classInfo;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        classInfo = thisClass;
    }

    @Override
    public String getDescriptor(String thisClassName) {
        return thisClassName != null ? "L" + thisClassName + ";" : "this";
    }

    @Override
    public String getName(String thisClassName) {
        return thisClassName.replace("/", ".");
    }

    @Override
    public String getSimpleName(String thisClassName) {
        String name = getName(thisClassName);
        return name.substring(name.lastIndexOf("."));
    }

    @Override
    public boolean isCompatibleWith(TypeAST other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TypeAST getFieldType(String fieldName) {
        return classInfo.getFieldType(fieldName);
    }

    @Override
    public TypeAST getTypeArgument(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
