package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ASMCompiler.Region;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.lang.antlr4.DejainLexer;
import dejain.lang.antlr4.DejainParser;
import dejain.runtime.asm.CommonClassTransformer;
import dejain.runtime.asm.CompositeTransformer;
import dejain.runtime.asm.FirstByIndexTransformer;
import dejain.runtime.asm.IfAllTransformer;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;

public class FieldContext extends AbstractContext implements MemberContext {
    public boolean isAdd;
    public FieldSelectorContext selector;
    public ExpressionContext value;

    public FieldContext(Region region, boolean isAdd, FieldSelectorContext selector, ExpressionContext value) {
        super(region);
        this.isAdd = isAdd;
        this.selector = selector;
        this.value = value;
    }
    
    @Override
    public void accept(MemberVisitor visitor) {
        visitor.visitField(this);
    }

    @Override
    public void resolve(ClassContext thisClass, TypeContext expectedResultType, ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        selector.resolve(thisClass, expectedResultType, resolver, errorMessages);
        if(value != null)
            value.resolve(thisClass, expectedResultType, resolver, errorMessages);
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
                    int fieldAccess = Context.Util.getAccessModifier(selector.accessModifier, selector.isStatic);
                    String fieldName = selector.name;
                    String fieldDescriptor = selector.fieldType.getDescriptor();
//                    String fieldDescriptor = Type.getDescriptor( selector.fieldType.getName());
                    if(this.value != null) {
                        String thisClassName = c.name;
                    
                        ((List<MethodNode>)c.methods).stream().filter(m -> m.name.equals("<init>")).forEach(cons -> {
                            InsnList originalInstructions = cons.instructions;
                            cons.instructions = new InsnList();
                            
                            originalInstructions.accept(new MethodVisitor(Opcodes.ASM5, cons) {
                                @Override
                                public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
                                    super.visitMethodInsn(opcode, owner, name, desc, itf);
                                    
                                    if(name.equals("<init>")) {
                                        GeneratorAdapter generatorAdapter = new GeneratorAdapter(cons, cons.access, cons.name, cons.desc);
                                        generatorAdapter.loadThis();
                                        MethodContext.toCode(thisClassName, FieldContext.this.value, new MethodContext.MethodCodeGenerator(generatorAdapter, null), true);
                                        generatorAdapter.putField(Type.getType(c.name), selector.name, Type.getType(selector.fieldType.getDescriptor(thisClassName)));
                                    }
                                }
                            });
                        });
                    }
                    c.fields.add(new FieldNode(fieldAccess, fieldName, fieldDescriptor, null, null));
                };
            });
        }
    }
}
