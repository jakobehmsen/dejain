package dejain.lang.ast;

import dejain.lang.ASMCompiler;
import dejain.lang.ClassResolver;
import dejain.lang.CommonClassResolver;
import dejain.runtime.asm.ClassTransformer;
import java.util.List;

public class ClassContext implements Context {
    public List<AnnotationContext> annotations;
    public Integer accessModifier;
    public TypeContext type;
    public List<MemberContext> members;

    public ClassContext(List<AnnotationContext> annotations, Integer accessModifier, TypeContext type, List<MemberContext> members) {
        this.annotations = annotations;
        this.accessModifier = accessModifier;
        this.type = type;
        this.members = members;
    }

    @Override
    public void resolve(ClassResolver resolver, List<ASMCompiler.Message> errorMessages) {
        annotations.forEach(a -> a.resolve(resolver, errorMessages));
        if(type != null)
            type.resolve(resolver, errorMessages);
        members.forEach(m -> m.resolve(resolver, errorMessages));
    }
}
