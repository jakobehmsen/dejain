package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.lang.reflect.Field;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.RuleContext;

public class FieldSetAST extends AbstractAST implements ExpressionAST {
    public ExpressionAST target;
    public TypeAST declaringClass;
    public String fieldName;
    public TypeAST resultType;
    public ExpressionAST value;
    
    public FieldSetAST(ASMCompiler.Region region, ExpressionAST target, TypeAST declaringClass, String fieldName, ExpressionAST value) {
        super(region);
        this.target = target;
        this.declaringClass = declaringClass;
        this.fieldName = fieldName;
        this.value = value;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
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
    public TypeAST resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitFieldSet(this);
    }
}
