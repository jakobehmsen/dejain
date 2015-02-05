package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import java.util.List;

public class LookupAST extends AbstractAST implements ExpressionAST {
    public String name;

    public LookupAST(ASMCompiler.Region region, String name) {
        super(region);
        this.name = name;
    }
    
    @Override
    public TypeAST resultType() {
        return null;
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitLookup(this);
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        
    }
}
