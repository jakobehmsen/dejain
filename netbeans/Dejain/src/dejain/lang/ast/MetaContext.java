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

public class MetaContext extends AbstractContext implements ExpressionContext {
    public ASMCompiler compiler;
    public List<CodeContext> body;
    public Method bodyAsMethod;
    public TypeContext resultType;
    public ExpressionContext generatedExpression;

    // Region and compiler could probably be merged into a single CompilationContext|CompilationUnit thingy
    public MetaContext(ASMCompiler.Region region, ASMCompiler compiler, List<CodeContext> body, Method bodyAsMethod) {
        super(region);
        
        this.compiler = compiler;
        this.body = body;
        this.bodyAsMethod = bodyAsMethod;
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        body.forEach(s -> s.resolve(thisClass, expectedResultType, resolver, errorMessages));
        resultType = expectedResultType;
        
        try {
            String source = (String)bodyAsMethod.invoke(null, null);
            generatedExpression = compiler.compileExpression(new ByteArrayInputStream(source.getBytes("UTF-8")));
            ArrayList<ASMCompiler.Message> metaErrorMessages = new ArrayList<>();
            generatedExpression.resolve(null, null, resolver, metaErrorMessages);
            errorMessages.addAll(
                metaErrorMessages.stream().map(m -> new Message(m.getRegion(), "Meta error: " + m.getText())).collect(Collectors.toList())
            );
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | UnsupportedEncodingException ex) {
            Logger.getLogger(MetaContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MetaContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public TypeContext resultType() {
        return resultType;
    }

    @Override
    public void accept(CodeVisitor visitor) {
        visitor.visitMeta(this);
    }
}
