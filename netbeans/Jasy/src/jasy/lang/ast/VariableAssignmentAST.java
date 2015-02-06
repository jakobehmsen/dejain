package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class VariableAssignmentAST extends AbstractAST implements ExpressionAST {
    public String name;
    public ExpressionAST value;

    public VariableAssignmentAST(ASMCompiler.Region region, String name, ExpressionAST value) {
        super(region);
        this.name = name;
        this.value = value;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        value.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitVariableAssignment(this);
    }
}
