package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.lang.antlr4.DejainLexer;
import dejain.lang.antlr4.DejainParser;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.CompositeTransformer;
import dejain.runtime.asm.FirstByIndexTransformer;
import dejain.runtime.asm.IfAllTransformer;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public class FieldContext implements MemberContext {
    public boolean isAdd;
    public FieldSelectorContext selector;
    public ExpressionContext value;

    public FieldContext(boolean isAdd, FieldSelectorContext selector, ExpressionContext value) {
        this.isAdd = isAdd;
        this.selector = selector;
        this.value = value;
    }
    
    @Override
    public void accept(MemberVisitor visitor) {
        visitor.visitField(this);
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        selector.resolve(resolver, errorMessages);
        if(value != null)
            value.resolve(resolver, errorMessages);
    }

    @Override
    public void populate(CommonClassTransformer transformer) {
        if(!isAdd) {
            selector.populate(transformer);
        }
    }

    public void populate(CompositeTransformer<ClassNode> classTransformer, IfAllTransformer<FieldNode> transformer) {
        if(!isAdd)
            selector.populate(transformer);
        else {
            classTransformer.addTransformer(c -> {
                return () -> {
                    int fieldAccess = getAccessModifier(selector.accessModifier, selector.isStatic);
                    String fieldName = selector.name;
                    String fieldDescriptor = Type.getDescriptor(selector.fieldType.getType());
                    c.fields.add(new FieldNode(fieldAccess, fieldName, fieldDescriptor, null, null));
                };
            });
        }
    }
    
    private static int getAccessModifier(int accessModifier, boolean isStatic) {
        if(isStatic)
            return accessModifier | Opcodes.ACC_STATIC;
        
        return accessModifier;
    }
}
