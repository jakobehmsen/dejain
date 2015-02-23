package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ClassResolver;
import java.util.List;

public class BlockAST extends AbstractAST implements CodeAST {
    public List<CodeAST> statements;

    public BlockAST(ASMCompiler.Region region, List<CodeAST> statements) {
        super(region);
        this.statements = statements;
    }

    @Override
    public void resolve(Scope thisClass, TypeAST expectedResultType, ClassResolver resolver, ClassLoader classLoader, List<ASMCompiler.Message> errorMessages) {
        statements.forEach(s -> 
            s.resolve(thisClass, expectedResultType, resolver, classLoader, errorMessages));
    }

    @Override
    public <T> T accept(CodeVisitor<T> visitor) {
        return visitor.visitBlock(this);
    }
}
