package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class ArrayAST extends AbstractAST implements ExpressionAST {
    public TypeAST type;
    public List<ExpressionAST> elements;

    public ArrayAST(ASMCompiler.Region region, TypeAST type, List<ExpressionAST> elements) {
        super(region);
        this.type = type;
        this.elements = elements;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        type.resolve(thisClass, expectedResultType, resolver, errorMessages);
        elements.forEach(e -> e.resolve(thisClass, expectedResultType, resolver, errorMessages));
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitArray(this);
    }
}
