package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Message;
import dejain.lang.ClassResolver;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MetaExpressionAST extends AbstractAST implements ExpressionAST {
    public ASMCompiler compiler;
    public List<CodeAST> body;
    public Method bodyAsMethod;
    public TypeAST resultType;
    public ExpressionAST generatedExpression;

    // Region and compiler could probably be merged into a single CompilationContext|CompilationUnit thingy
    public MetaExpressionAST(ASMCompiler.Region region, ASMCompiler compiler, List<CodeAST> body, Method bodyAsMethod) {
        super(region);
        
        this.compiler = compiler;
        this.body = body;
        this.bodyAsMethod = bodyAsMethod;
    }

    @Override
    public void resolve(ClassAST thisClass, TypeAST expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        body.forEach(s -> s.resolve(thisClass, expectedResultType, resolver, errorMessages));
        resultType = expectedResultType;
        
        try {
            generatedExpression = (ExpressionAST)bodyAsMethod.invoke(null, null);
//            generatedExpression = compiler.compileExpression(new ByteArrayInputStream(source.getBytes("UTF-8")));
//            ArrayList<ASMCompiler.Message> metaErrorMessages = new ArrayList<>();
//            generatedExpression.resolve(null, null, resolver, metaErrorMessages);
//            errorMessages.addAll(
//                metaErrorMessages.stream().map(m -> new Message(m.getRegion(), "Meta error: " + m.getText())).collect(Collectors.toList())
//            );
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(MetaExpressionAST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TypeAST resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitMeta(this);
    }
}
