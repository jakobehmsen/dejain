package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class MetaCodeAST extends AbstractAST implements ExpressionAST /*Only pretend*/ {
    public CodeAST body;

    public MetaCodeAST(ASMCompiler.Region region, CodeAST body) {
        super(region);
        this.body = body;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        body.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages);
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitMetaCode(this);
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
