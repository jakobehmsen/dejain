package dejain.lang.ast;

//import dejain.lang.ASMCompiler;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

//import dejain.lang.ASMCompiler.Message;
//import dejain.lang.ASMCompiler.Region;
//import dejain.lang.ClassResolver;
//import java.util.Hashtable;
//import java.util.List;
//import org.objectweb.asm.Opcodes;

public class ThisTypeAST extends AbstractAST implements TypeAST {
    private Scope classInfo;

    public ThisTypeAST(dejain.lang.ASMCompiler.Region region) {
        super(region);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        classInfo = thisClass;
    }

//    @Override
//    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
//        classInfo = thisClass;
//    }
    
//    @Override
//    public void resolve(dejain.lang.ast.Scope thisClass, dejain.lang.ast.TypeAST expectedResultType, dejain.lang.ClassResolver resolver, java.util.List<dejain.lang.ASMCompiler.Message> errorMessages) {
//        classInfo = thisClass;
//    }

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
}
