package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class InjectAST extends AbstractAST implements CodeAST {
    public ExpressionAST expression;

    public InjectAST(ASMCompiler.Region region, ExpressionAST expression) {
        super(region);
        this.expression = expression;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        expression.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

//    @Override
//    public TypeAST resultType() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitInject(this);
    }
}
