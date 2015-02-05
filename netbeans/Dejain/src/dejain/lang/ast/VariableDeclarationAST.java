package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import java.util.List;

public class VariableDeclarationAST extends AbstractAST implements ExpressionAST {
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
        
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitVariableDeclaration(this);
    }
}
