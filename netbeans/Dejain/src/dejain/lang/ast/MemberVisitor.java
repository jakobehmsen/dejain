package dejain.lang.ast;

public interface MemberVisitor {

    public void visitMethod(MethodContext aThis);

    public void visitField(FieldContext aThis);
    
}
