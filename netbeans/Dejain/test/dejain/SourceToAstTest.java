/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dejain;

import dejain.lang.ASMCompiler;
import dejain.lang.ast.ClassAST;
import dejain.lang.ast.FieldAST;
import dejain.lang.ast.ModuleAST;
import dejain.lang.ast.TypeAST;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

/**
 *
 * @author Jakob
 */
public class SourceToAstTest {
    private void testSourceToAST(String source, Predicate<ModuleAST> assertion) throws IOException {
        ASMCompiler compiler = new ASMCompiler(className -> className);
        ModuleAST module = compiler.compile(new ByteArrayInputStream(source.getBytes("UTF-8")));
        assertTrue(assertion.test(module));
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
    
    private static Predicate<ModuleAST> classCountIs(int classCount) {
        return m -> 
            m.classes.size() == classCount;
    }
    
    private static Predicate<ModuleAST> firstClass(Predicate<ClassAST> assertion) {
        return m -> assertion.test(m.classes.get(0));
    }
    
    private static Predicate<ClassAST> hasNoMembers() {
        return c -> c.members.isEmpty();
    }
    
    private static Predicate<ClassAST> ctype(Predicate<TypeAST> assertion) {
        return c -> assertion.test(c.type);
    }
    
    private static Predicate<ClassAST> memberCountIs(int memberCount) {
        return c -> c.members.size() == memberCount;
    }

    private Predicate<? super ClassAST> allMembersAreFields() {
        return c -> c.members.stream().allMatch(f -> f instanceof FieldAST);
    }
    
    private static Predicate<ClassAST> firstAsField(Predicate<FieldAST> assertion) {
        return c -> assertion.test((FieldAST)c.members.get(0));
    }
    
    private static Predicate<FieldAST> fIsPrivate() {
        return f -> f.selector.accessModifier == Opcodes.ACC_PRIVATE;
    }
    
    private static Predicate<FieldAST> fIsPublic() {
        return f -> f.selector.accessModifier == Opcodes.ACC_PUBLIC;
    }
    
    private static Predicate<FieldAST> fIsProtected() {
        return f -> 
            f.selector.accessModifier == Opcodes.ACC_PROTECTED;
    }
    
    private static Predicate<FieldAST> fIsStatic() {
        return f -> 
            f.selector.isStatic;
    }
    
    private static Predicate<FieldAST> fIsAdd() {
        return f -> 
            f.isAdd;
    }
    
    private static Predicate<FieldAST> ftype(Predicate<TypeAST> assertion) {
        return f -> assertion.test(f.selector.fieldType);
    }
    
    private static Predicate<FieldAST> fname(Predicate<String> assertion) {
        return f -> assertion.test(f.selector.name);
    }
    
    private static Predicate<TypeAST> tname(Predicate<String> assertion) {
        return x -> 
            assertion.test(x.getName());
    }
    
    private static <T> Predicate<T> is(T other) {
        return x -> x.equals(other);
    }
    
    private static <T> Predicate<T> isNull() {
        return x -> x == null;
    }
}
