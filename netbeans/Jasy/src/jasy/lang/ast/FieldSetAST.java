package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

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
    }

    @Override
    public TypeAST resultType() {
        return resultType;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitFieldSet(this);
    }
}
