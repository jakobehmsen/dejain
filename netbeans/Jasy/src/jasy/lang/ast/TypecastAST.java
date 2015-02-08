package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class TypecastAST extends AbstractAST implements ExpressionAST {
    public ExpressionAST expression;
    public TypeAST type;

    public TypecastAST(ASMCompiler.Region region, ExpressionAST expression, TypeAST type) {
        super(region);
        this.expression = expression;
        this.type = type;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        type.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitTypecast(this);
    }
}
