package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class FieldGetAST extends AbstractAST implements ExpressionAST {
//    public ExpressionAST target;
//    public String fieldName;
//    public TypeAST fieldType;
//
//    public FieldGetAST(ASMCompiler.Region region, ExpressionAST target, String fieldName) {
//        super(region);
//        this.target = target;
//        this.fieldName = fieldName;
//    }
    
//    public ExpressionAST target;
    public AST target; // Either ExpressionAST or TypeAST
    public ExpressionAST fieldName;
    public TypeAST fieldType;

    public FieldGetAST(ASMCompiler.Region region, AST target, ExpressionAST fieldName) {
        super(region);
        this.target = target;
        this.fieldName = fieldName;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        // At this point, a lookup may implicate either a field get or a "match-captured-variable".
        
        target.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages);
//        fieldType = target.resultType().getFieldType(fieldName);
    }

    @Override
    public TypeAST resultType() {
        return fieldType;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitFieldGet(this);
    }
}
