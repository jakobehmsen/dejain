package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class AmbiguousNameAST extends AbstractAST implements ExpressionAST {
    // Instances cannot garantee to be a valid expressions.
    // - rather, they are potential expressions
    
    public List<LookupAST> nameParts;
    
//    public ExpressionAST expression; // Possibly null after resolve

    public AmbiguousNameAST(ASMCompiler.Region region, List<LookupAST> nameParts) {
        super(region);
        this.nameParts = nameParts;
    }
    
    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        // Resolves to either a Class reference, which means it is not an expression
        // or to a get field expression.
        
        nameParts.forEach(p -> p.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages));
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitAmbiguousName(this);
    }
}
