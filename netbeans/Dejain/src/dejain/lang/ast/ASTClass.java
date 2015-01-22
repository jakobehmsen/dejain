package dejain.lang.ast;

import java.util.List;

public class ASTClass implements AST {
    public List<AST> annotations;
    public String name;
    public List<AST> members;

    public ASTClass(List<AST> members) {
        this.members = members;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visitClass(this);
    }
}
