package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class InjectionBlockAST extends AbstractAST implements ExpressionAST {
    public List<InjectAST> injections;

    public InjectionBlockAST(ASMCompiler.Region region, List<InjectAST> injections) {
        super(region);
        this.injections = injections;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        injections.forEach(i -> i.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages));
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitInjectionBlock(this);
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
