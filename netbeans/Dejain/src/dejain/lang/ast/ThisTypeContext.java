package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class ThisTypeContext extends AbstractContext implements TypeContext {
    private ClassContext classInfo;

    public ThisTypeContext(ASMCompiler.Region region) {
        super(region);
    }

    @Override
    public void resolve(ClassContext thisClass, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        classInfo = thisClass;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSimpleName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCompatibleWith(TypeContext other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TypeContext getFieldType(String fieldName) {
        return classInfo.getFieldType(fieldName);
    }
}
