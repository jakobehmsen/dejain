package dejain.lang.ast;

import java.util.List;

public class ASTBehavior implements ASTCode {
    public List<ASTCode> statements;

    public ASTBehavior(List<ASTCode> statements) {
        this.statements = statements;
    }
    
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitCode(this);
    }
}
