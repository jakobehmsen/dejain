package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.RuleContext;

public class FieldSetContext extends AbstractContext implements ExpressionContext {
    public ExpressionContext target;
    public TypeContext declaringClass;
    public String fieldName;
    public TypeContext resultType;
    public ExpressionContext value;
    
    public FieldSetContext(ASMCompiler.Region region, ExpressionContext target, TypeContext declaringClass, String fieldName, ExpressionContext value) {
        super(region);
        this.target = target;
        this.declaringClass = declaringClass;
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        target.resolve(thisClass, expectedResultType, resolver, errorMessages);
        declaringClass.resolve(thisClass, expectedResultType, resolver, errorMessages);
        value.resolve(thisClass, expectedResultType, resolver, errorMessages);
        
//        Class<?> c;
//        
//        if(target != null)
//            c = target.resultType();
//        else
//            c = declaringClass.getType();
//        
//        try {
//            Field field = c.getField(fieldName);
//            resultType = field.getType();
//            
//            if(resultType != value.resultType())
//                errorMessages.add(new ASMCompiler.Message(getRegion(), "Incompatible types: " + value.resultType().getSimpleName() + " cannot be converted to " + resultType.getSimpleName() + "."));
//        } catch (NoSuchFieldException | SecurityException ex) {
//            errorMessages.add(new ASMCompiler.Message(getRegion(), "No such field '" + fieldName + "'."));
//        }
    }

    @Override
    public TypeContext resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitFieldSet(this);
    }
}
