package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class FieldSetContext extends AbstractContext implements ExpressionContext {
    private ExpressionContext target;
    private TypeContext declaringClass;
    public String fieldName;
    
    public FieldSetContext(ASMCompiler.Region region, ExpressionContext target, TypeContext declaringClass, String fieldName) {
        super(region);
        this.target = target;
        this.declaringClass = declaringClass;
        this.fieldName = fieldName;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        target.resolve(resolver, errorMessages);
        declaringClass.resolve(resolver, errorMessages);
    }

    @Override
    public Class<?> resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accept(CodeVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
