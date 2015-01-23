/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dejain;

import dejain.lang.ASMCompiler;
import dejain.lang.ast.ClassContext;
import dejain.lang.ast.FieldContext;
import dejain.lang.ast.ModuleContext;
import dejain.lang.ast.TypeContext;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.function.Predicate;
import jdk.internal.org.objectweb.asm.Opcodes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jakob
 */
public class NewEmptyJUnitTest {   
    private void testSourceToAST(String source, Predicate<ModuleContext> assertion) throws IOException {
        ASMCompiler compiler = new ASMCompiler(className -> className);
        ModuleContext module = compiler.compile(new ByteArrayInputStream(source.getBytes("UTF-8")));
        assertTrue(assertion.test(module));
    }
    
    private void testSourceToClasses(String source, Class<?>[] classes, Predicate<ModuleContext> assertion) throws IOException {
        ASMCompiler compiler = new ASMCompiler(className -> className);
        ModuleContext module = compiler.compile(new ByteArrayInputStream(source.getBytes("UTF-8")));
        
        // Read all classes
        // Replace interusages with derived classes
        // Derived classes using module
        // Assert derived classes
//        assertTrue(modulePredicate.test(module));
    }
    
    @Test
    public void testEmptySourceYieldsEmptyModule() throws IOException {
        testSourceToAST("", classCountIs(0));
    }
    
    @Test
    public void test1ClassInSourceYieldsModuleWith1Class() throws IOException {
        testSourceToAST("class { }", classCountIs(1).and(firstClass(hasNoMembers())));
    }
    
    @Test
    public void test2ClassesInSourceYieldsModuleWith2Classes() throws IOException {
        testSourceToAST("class { } class { }", classCountIs(2).and(firstClass(hasNoMembers())));
    }
    
    @Test
    public void test1ClassWithTypeInSourceYieldsModuleWith1ClassWithType() throws IOException {
        testSourceToAST("class Type { }", classCountIs(1).and(firstClass(ctype(tname(is("Type"))))));
    }
    
    @Test
    public void testClassWith1ClassWith1FieldInSourceYieldsModuleWith1ClassWith1FieldPrivate() throws IOException {
        testSourceToAST("class { private int field; }", 
            classCountIs(1).and(firstClass(memberCountIs(1).and(firstAsField(
                fname(is("field"))
                .and(fIsAdd().negate())
                .and(ftype(tname(is("int"))))
                .and(fIsPrivate())
                .and(fIsStatic().negate())
            ))))
        );
    }
    
    @Test
    public void testClassWith1ClassWith1FieldInSourceYieldsModuleWith1ClassWith1FieldProtected() throws IOException {
        testSourceToAST("class { protected int field; }", 
            classCountIs(1).and(firstClass(memberCountIs(1).and(firstAsField(
                fname(is("field"))
                .and(fIsAdd().negate())
                .and(ftype(tname(is("int"))))
                .and(fIsProtected())
                .and(fIsStatic().negate())
            ))))
        );
    }
    
    @Test
    public void testClassWith1ClassWith1FieldInSourceYieldsModuleWith1ClassWith1FieldPublic() throws IOException {
        testSourceToAST("class { public int field; }", 
            classCountIs(1).and(firstClass(memberCountIs(1).and(firstAsField(
                fname(is("field"))
                .and(fIsAdd().negate())
                .and(ftype(tname(is("int"))))
                .and(fIsPublic())
                .and(fIsStatic().negate())
            ))))
        );
    }
    
    @Test
    public void testClassWith1ClassWith2FieldsInSourceYieldsModuleWith1ClassWith2Fields() throws IOException {
        testSourceToAST("class { private int field1; private int field2; }", 
            classCountIs(1).and(firstClass(memberCountIs(2).and(allMembersAreFields())))
        );
    }
    
    private static Predicate<ModuleContext> classCountIs(int classCount) {
        return m -> m.classes.size() == classCount;
    }
    
    private static Predicate<ModuleContext> firstClass(Predicate<ClassContext> assertion) {
        return m -> assertion.test(m.classes.get(0));
    }
    
    private static Predicate<ClassContext> hasNoMembers() {
        return c -> c.members.isEmpty();
    }
    
    private static Predicate<ClassContext> ctype(Predicate<TypeContext> assertion) {
        return c -> assertion.test(c.type);
    }
    
    private static Predicate<ClassContext> memberCountIs(int memberCount) {
        return c -> c.members.size() == memberCount;
    }

    private Predicate<? super ClassContext> allMembersAreFields() {
        return c -> c.members.stream().allMatch(f -> f instanceof FieldContext);
    }
    
    private static Predicate<ClassContext> firstAsField(Predicate<FieldContext> assertion) {
        return c -> assertion.test((FieldContext)c.members.get(0));
    }
    
    private static Predicate<FieldContext> fIsPrivate() {
        return f -> f.selector.accessModifer == Opcodes.ACC_PRIVATE;
    }
    
    private static Predicate<FieldContext> fIsPublic() {
        return f -> f.selector.accessModifer == Opcodes.ACC_PUBLIC;
    }
    
    private static Predicate<FieldContext> fIsProtected() {
        return f -> 
            f.selector.accessModifer == Opcodes.ACC_PROTECTED;
    }
    
    private static Predicate<FieldContext> fIsStatic() {
        return f -> 
            f.selector.isStatic;
    }
    
    private static Predicate<FieldContext> fIsAdd() {
        return f -> 
            f.isAdd;
    }
    
    private static Predicate<FieldContext> ftype(Predicate<TypeContext> assertion) {
        return f -> assertion.test(f.selector.fieldType);
    }
    
    private static Predicate<FieldContext> fname(Predicate<String> assertion) {
        return f -> assertion.test(f.selector.name);
    }
    
    private static Predicate<TypeContext> tname(Predicate<String> assertion) {
        return x -> assertion.test(x.name);
    }
    
    private static <T> Predicate<T> is(T other) {
        return x -> x.equals(other);
    }
    
    private static <T> Predicate<T> isNull() {
        return x -> x == null;
    }
}
