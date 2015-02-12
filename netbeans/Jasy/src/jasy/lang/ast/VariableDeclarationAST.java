package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;
import jasy.lang.ClassResolver;
import java.util.List;

public class VariableDeclarationAST extends AbstractAST implements CodeAST {
    public String name;
    public TypeAST type;
    public ExpressionAST value;

    public VariableDeclarationAST(Region region, String name, TypeAST type, ExpressionAST value) {
        super(region);
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        type.resolve(thisClass, expectedResultType, resolver, errorMessages);
        if(value != null)
            value.resolve(thisClass, expectedResultType, resolver, errorMessages);
    }

//    @Override
//    public TypeAST resultType() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitVariableDeclaration(this);
    }
}
