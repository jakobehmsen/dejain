package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.Collections;
import java.util.List;

public class NewAST extends AbstractAST implements ExpressionAST {
    public TypeAST c;
    public List<ExpressionAST> arguments;

    public NewAST(ASMCompiler.Region region, TypeAST c) {
        this(region, c, Collections.emptyList());
    }

    public NewAST(ASMCompiler.Region region, TypeAST c, List<ExpressionAST> arguments) {
        super(region);
        this.c = c;
        this.arguments = arguments;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        c.resolve(thisClass, expectedResultType, resolver, errorMessages);
        arguments.forEach(a -> a.resolve(thisClass, expectedResultType, resolver, errorMessages));
    }

    @Override
    public TypeAST resultType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitNew(this);
    }
}
