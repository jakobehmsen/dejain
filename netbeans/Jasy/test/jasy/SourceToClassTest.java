/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import static jasy.Assertion.*;
import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Message;
import jasy.lang.ClassResolver;
import jasy.lang.CommonClassMap;
import jasy.lang.CommonClassResolver;
import jasy.lang.ExhaustiveClassTransformer;
import jasy.lang.ast.ModuleAST;
import jasy.lang.ast.Transformation;
import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.util.CheckClassAdapter;
import org.objectweb.asm.util.TraceClassVisitor;

/**
 *
 * @author Jakob
 */
public class SourceToClassTest {
    @Test
    public void testAllClassesAdd1PublicPrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public float someField2;}", 
            forClass("jasy.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isPublic()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1ProtectedPrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+protected float someField2;}", 
            forClass("jasy.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isProtected()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PrivatePrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+private float someField2;}", 
            forClass("jasy.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isPrivate()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicStaticPrimitiveField() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public static float someField2;}", 
            forClass("jasy.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(float.class)))
                .and(fmodifiers(isPublic()))
                .and(fmodifiers(isStatic()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicObjectField() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String someField2;}", 
            forClass("jasy.TestClass1", chasFieldWhere(
                fname(is("someField2"))
                .and(ftype(is(String.class)))
                .and(fmodifiers(isPublic()))
                .and(fmodifiers(isStatic().negate()))
            ))
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningStringLiteral() throws IOException {
        String expectedResult = "Hi";
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String toString() {return \"" + expectedResult + "\";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningGeneratedStringLiteral() throws IOException {
        String expectedResult = "Hi";
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String toString() {return $\"" + expectedResult + "\";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningXLessThanY() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public boolean compare(int x, int y) {return x < y;}}", 
            forClass("jasy.TestClass1", 
                forInstance(imethod("compare", new Class<?>[]{int.class, int.class}, 
                    invocationResult(new Object[]{8, 9}, is(true))
                    .and(
                        invocationResult(new Object[]{9, 9}, is(false))
                    ).and(
                        invocationResult(new Object[]{9, 8}, is(false))
                    )
                ))
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningXLessThanOrEqualsY() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public boolean compare(int x, int y) {return x <= y;}}", 
            forClass("jasy.TestClass1", 
                forInstance(imethod("compare", new Class<?>[]{int.class, int.class}, 
                    invocationResult(new Object[]{8, 9}, is(true))
                    .and(
                        invocationResult(new Object[]{9, 9}, is(true))
                    ).and(
                        invocationResult(new Object[]{9, 8}, is(false))
                    )
                ))
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningXGreaterThanY() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public boolean compare(int x, int y) {return x > y;}}", 
            forClass("jasy.TestClass1", 
                forInstance(imethod("compare", new Class<?>[]{int.class, int.class}, 
                    invocationResult(new Object[]{8, 9}, is(false))
                    .and(
                        invocationResult(new Object[]{9, 9}, is(false))
                    ).and(
                        invocationResult(new Object[]{9, 8}, is(true))
                    )
                ))
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningXGreaterThanOrEqualsY() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public boolean compare(int x, int y) {return x >= y;}}", 
            forClass("jasy.TestClass1", 
                forInstance(imethod("compare", new Class<?>[]{int.class, int.class}, 
                    invocationResult(new Object[]{8, 9}, is(false))
                    .and(
                        invocationResult(new Object[]{9, 9}, is(true))
                    ).and(
                        invocationResult(new Object[]{9, 8}, is(true))
                    )
                ))
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningXEqualsY() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public boolean compare(int x, int y) {return x == y;}}", 
            forClass("jasy.TestClass1", 
                forInstance(imethod("compare", new Class<?>[]{int.class, int.class}, 
                    invocationResult(new Object[]{8, 9}, is(false))
                    .and(
                        invocationResult(new Object[]{9, 9}, is(true))
                    ).and(
                        invocationResult(new Object[]{9, 8}, is(false))
                    )
                ))
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningXNotEqualsY() throws IOException {
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public boolean compare(int x, int y) {return x != y;}}", 
            forClass("jasy.TestClass1", 
                forInstance(imethod("compare", new Class<?>[]{int.class, int.class}, 
                    invocationResult(new Object[]{8, 9}, is(true))
                    .and(
                        invocationResult(new Object[]{9, 9}, is(false))
                    ).and(
                        invocationResult(new Object[]{9, 8}, is(true))
                    )
                ))
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningGeneratedStringConcatenation() throws IOException {
        String str1 = "H";
        String str2 = "i";
        String expectedResult = str1 + str2;
        
        String strConcSrc = "\"" + str1 + "\" + \"" + str2 + "\"";
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String toString() {return $" + strConcSrc + ";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningIntPlusInterpolatedInt() throws IOException {
        int i1 = 5;
        int i2 = 7;
        int expectedResult = i1 + i2;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public int toInt() {return " + i1 + " + $" + i2 + ";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toInt"))
                    .and(rreturnType(is(int.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toInt", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningStringConcatenation() throws IOException {
        String str1 = "H";
        String str2 = "i";
        String expectedResult = str1 + str2;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String toString() {return \"" + str1 + "\" + \"" + str2 + "\";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningIntPlusString() throws IOException {
        int i1 = 5;
        String str2 = "i";
        String expectedResult = i1 + str2;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String toString() {return " + i1 + " + \"" + str2 + "\";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningClassName() throws IOException {
        String expectedResult = jasy.TestClass1.class.getName().replace(".", "/");
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "c=class {+public String getClassName() {return $c.name;}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("getClassName"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("getClassName", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningIntPlusIntPlusString() throws IOException {
        int i1 = 1;
        int i2 = 5;
        String str3 = "i";
        String expectedResult = i1 + i2 + str3;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String toString() {return " + i1 + " + " + i2 + " + \"" + str3 + "\";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningIntPlusIntPlusStringPlusIntPlusInt() throws IOException {
        int i1 = 1;
        int i2 = 4;
        String str3 = "i";
        int i4 = 5;
        int i5 = 7;
        String expectedResult = i1 + i2 + str3 + i4 + i5;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public String toString() {return " + i1 + " + " + i2 + " + \"" + str3 + "\" + " + i4 + " + " + i5 + ";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toString"))
                    .and(rreturnType(is(String.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1PublicMethodReturningIntPlusInt() throws IOException {
        int i1 = 1;
        int i2 = 4;
        int expectedResult = i1 + i2;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+public int toInt() {return " + i1 + " + " + i2 + ";}}", 
            forClass("jasy.TestClass1", 
                chasMethodWhere(
                    mname(is("toInt"))
                    .and(rreturnType(is(int.class)))
                    .and(rmodifiers(isPublic()))
                    .and(rmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toInt", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1StringFieldWithValue() throws IOException {
        String str = "myValue";
        int i = 7;
        String expectedResult = str + i;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+private String myField = \"" + str + "\" + " + i + ";}", 
            forClass("jasy.TestClass1", 
                chasFieldWhere(
                    fname(is("myField"))
                    .and(ftype(is(String.class)))
                    .and(fmodifiers(isPrivate()))
                    .and(fmodifiers(isStatic().negate()))
                ).and(
                    forInstance(ifield("myField", ifget(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1IntFieldWithValue() throws IOException {
        int expectedResult = 7;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+private int myField = " + expectedResult + ";}", 
            forClass("jasy.TestClass1", 
                chasFieldWhere(
                    fname(is("myField"))
                    .and(ftype(is(int.class)))
                    .and(fmodifiers(isPrivate()))
                    .and(fmodifiers(isStatic().negate()))
                ).and(
                    forInstance(ifield("myField", ifget(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1ShortFieldWithValue() throws IOException {
        short expectedResult = 7;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+private short myField = " + expectedResult + ";}", 
            forClass("jasy.TestClass1", 
                chasFieldWhere(
                    fname(is("myField"))
                    .and(ftype(is(short.class)))
                    .and(fmodifiers(isPrivate()))
                    .and(fmodifiers(isStatic().negate()))
                ).and(
                    forInstance(ifield("myField", ifget(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAdd1LongFieldWithValue() throws IOException {
        long expectedResult = 3000000000L;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+private long myField = " + expectedResult + "L;}", 
            forClass("jasy.TestClass1", 
                chasFieldWhere(
                    fname(is("myField"))
                    .and(ftype(is(long.class)))
                    .and(fmodifiers(isPrivate()))
                    .and(fmodifiers(isStatic().negate()))
                ).and(
                    forInstance(ifield("myField", ifget(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAddFieldReturnFieldIntMethod() throws IOException {
        String myFieldName = "myField";
        String myFieldValue = "Hi";
        String expectedResult = myFieldName + "=" + myFieldValue;
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            "class {+private String " + myFieldName + " = \"" + myFieldValue + "\"; +public String toString() {return \"" + myFieldName+ "=\" + " + myFieldName + ";} }", 
            forClass("jasy.TestClass1", 
                chasFieldWhere(
                    fname(is("myField"))
                    .and(ftype(is(String.class)))
                    .and(fmodifiers(isPrivate()))
                    .and(fmodifiers(isStatic().negate()))
                ).and(
                    forInstance(imethod("toString", invocationResult(is(expectedResult))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodReturnNameOfSingleField() throws IOException {
        Field singleField = TestClass1.class.getDeclaredFields()[0];
        String expectedResult = singleField.getName();
        
        String src =
            "class {\n" +
            "    fields=;\n" +
            "    \n" +
            "    +public String getDescription() {\n" +
            "        return $fields.get(0).name;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getDescription", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithNew() throws IOException {
        String src =
            "class {\n" +
            "    +public StringBuilder createStringBuilder() {\n" +
            "        return new StringBuilder();\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("createStringBuilder", invocationResult(instanceOf(StringBuilder.class))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithVariableAssignAddInt() throws IOException {
        String src =
            "class {\n" +
            "    +public int getInt() {\n" +
            "        int i = 0;\n" +
            "        i += 1;\n" +
            "        return 1;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getInt", invocationResult(is(1))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithVariableAssignAddString() throws IOException {
        String src =
            "class {\n" +
            "    +public String getString() {\n" +
            "        String str = \"\";\n" +
            "        str += \"Hi\";\n" +
            "        return str;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getString", invocationResult(is("Hi"))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPrefixIntInc() throws IOException {
        int i = 0;
        int j = ++i;
        int expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public int getInt() {\n" +
            "        int i = 0;\n" +
            "        int j = ++i;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getInt", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPrefixDecInc() throws IOException {
        int i = 0;
        int j = --i;
        int expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public int getInt() {\n" +
            "        int i = 0;\n" +
            "        int j = --i;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getInt", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPostfixIntInc() throws IOException {
        int i = 0;
        int j = i++;
        int expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public int getInt() {\n" +
            "        int i = 0;\n" +
            "        int j = i++;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getInt", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPostfixIntDec() throws IOException {
        int i = 0;
        int j = i--;
        int expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public int getInt() {\n" +
            "        int i = 0;\n" +
            "        int j = i--;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getInt", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPrefixLongInc() throws IOException {
        long i = 0;
        long j = ++i;
        long expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public long getLong() {\n" +
            "        long i = 0L;\n" +
            "        long j = ++i;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getLong", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPrefixLongDec() throws IOException {
        long i = 0;
        long j = --i;
        long expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public long getLong() {\n" +
            "        long i = 0L;\n" +
            "        long j = --i;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getLong", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPostfixLongInc() throws IOException {
        long i = 0;
        long j = i++;
        long expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public long getLong() {\n" +
            "        long i = 0L;\n" +
            "        long j = i++;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getLong", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithPostfixLongDec() throws IOException {
        long i = 0;
        long j = i--;
        long expectedResult = i + j;
        
        String src =
            "class {\n" +
            "    +public long getLong() {\n" +
            "        long i = 0L;\n" +
            "        long j = i--;\n" +
            "        return i + j;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getLong", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithNewWithArguments() throws IOException {
        String expectedResult = "Some text";
        
        String src =
            "class {\n" +
            "    +public String createStringBuilder() {\n" +
            "        return new StringBuilder(\"" + expectedResult + "\").toString();\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("createStringBuilder", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodReturnNamesOfAllFields() throws IOException, InstantiationException, IllegalAccessException {
        Object instance = TestClass2.class.newInstance();
        Field[] fields = TestClass2.class.getDeclaredFields();
        String expectedResult = "";
        for(int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);
            if(i > 0)
                expectedResult += ", ";
            expectedResult += f.getName() + " = " + f.get(instance);
        }
        
        String src =
            "class {\n" +
            "    fields=;\n" +
            "    \n" +
            "    +public String getDescription() ${\n" +
            "        CodeAST statements = #{};\n" +
            "        for(int i = 0; i < fields.size(); i += 1) {\n" +
            "            FieldNode f = fields.get(i);\n" +
            "            if(i > 0)\n" +
            "                statements += #sb.append(\", \");\n" +
            "            statements += #sb.append(($f.name) + \" = \" + (:$f.name));\n" +
            "        }\n" +
            "        return #{\n" +
            "            StringBuilder sb = new StringBuilder();\n" +
            "            $statements;\n" +
            "            return sb.toString();\n" +
            "        };\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass2"}, 
            src, 
            forClass("jasy.TestClass2", 
                forInstance(imethod("getDescription", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodReturnNameAndValueOfFirstField() throws IOException {
        Field singleField = TestClass1.class.getDeclaredFields()[0];
        int expectedValue = 0;
        String expectedResult = singleField.getName() + " = " + expectedValue;
        
        String src =
            "class {\n" +
            "    fields=;\n" +
            "    +public Object getDescription() {\n" +
            "        return ($fields.get(0).name) + \" = \" + (:$fields.get(0).name);\n" +
            "    }\n" +
            "}\n";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getDescription", invocationResult(is(expectedResult))))
            )
        );
    }
    
//    @Test
//    public void testAllClassesAddMethodReturnValueOfMetaVariable() throws IOException {
//        int expectedResult = 5;
//        
//        String src =
//            "class {\n" +
//            "    +public int getValue() {\n" +
//            "        ${int i = " + expectedResult + ";}\n" + 
//            "        return $i;\n" +
//            "    }\n" +
//            "}\n";
//        
//        testSourceToClasses(
//            new String[]{"jasy.TestClass1"}, 
//            src, 
//            forClass("jasy.TestClass1", 
//                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
//            )
//        );
//    }
    
    @Test
    public void testAllClassesAddMethodReturnValueOfVariable() throws IOException {
        int expectedResult = 5;
        
        String src =
            "class {\n" +
            "    +public int getValue() {\n" +
            "        int i = " + expectedResult + ";\n" +
            "        return i;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodReturnValueOfVariableWithSeparateDeclaration() throws IOException {
        int expectedResult = 5;
        
        String src =
            "class {\n" +
            "    +public int getValue() {\n" +
            "        int i;\n" +
            "        i = " + expectedResult + ";\n" +
            "        return i;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodReturnValueOfSharedMetaVariable() throws IOException {
        int expectedResult = 5;
        
        String src =
            "class {\n" +
            "    +public int getValue() ${\n" +
            "        int i = " + expectedResult + ";\n" +
            "        return #return $i;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodGenerateFromRootQuote() throws IOException {
        int expectedResult = 5;
        
        String src =
            "class {\n" +
            "    +public int getValue() {\n" +
            "        int i = " + expectedResult + ";\n" +
            "        $#return i;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWhichGenerateQuotedBlock() throws IOException {
        int expectedResult = 5;
        
        String src =
            "class {\n" +
            "    +public int getValue() ${\n" +
            "        return #{\n" +
            "            int i = " + expectedResult + ";\n" +
            "            return i;\n" +
            "        };\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWhichGenerateQuotedBlockWithInjection() throws IOException {
        int expectedResult = 5;
        
        String src =
            "class {\n" +
            "    +public int getValue() ${\n" +
            "        return #{\n" +
            "            int i;\n" +
            "            $#i = " + expectedResult + ";\n" +
            "            return i;\n" +
            "        };\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWhichGeneratesAndInterpolateQuotedBlock() throws IOException {
        int i1 = 5;
        int i2 = 7;
        int expectedResult = i1 + i2;
        
//        String src =
//            "class {\n" +
//            "    +public int getValue() ${\n" +
//            "        ArrayList<CodeAST> statements = new ArrayList<CodeAST>();\n" +
//            "        statements.add(#i1 = " + i1 + ");\n" +
//            "        statements.add(#i2 = " + i2 + ");\n" +
//            "        return #{\n" +
//            "            int i1;\n" +
//            "            int i2;\n" +
//            "            $statements\n" +
//            "            return i1 + i2;\n" +
//            "        };\n" +
//            "    }\n" +
//            "}\n";
        
        String src =
            "class {\n" +
            "    +public int getValue() ${\n" +
            "        jasy.lang.ast.CodeAST statements = \n" +
            "            (#i1 = " + i1 + ") +\n" +
            "            (#i2 = " + i2 + ");\n" +
            "        return #{\n" +
            "            int i1;\n" +
            "            int i2;\n" +
            "            $statements;\n" +
            "            return i1 + i2;\n" +
            "        };\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodReturnValueOfSumOfSharedMetaVariables() throws IOException {
        int i1 = 5;
        int i2 = 7;
        int expectedResult = i1 + i2;
        
        String src =
            "class {\n" +
            "    +public int getValue() ${\n" +
            "        int i1 = " + i1 + ";\n" +
            "        int i2 = " + i2 + ";\n" +
            "        return #return $i1 + i2;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodReturnSumOfVariable() throws IOException {
        int i1 = 5;
        int i2 = 7;
        int expectedResult = i1 + i2;
        
        String src =
            "class {\n" +
            "    +public int getValue() {\n" +
            "        int i1 = " + i1 + ";\n" +
            "        int i2 = " + i2 + ";\n" +
            "        return i1 + i2;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithInjection() throws IOException {
        int expectedResult = 5;
        
        String src =
            "class {\n" +
            "    +public int getValue() {\n" +
            "        int i;\n" +
            "        $#i = " + expectedResult + ";\n" +
            "        return i;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithWhileCountingToX() throws IOException {
        int counterStart = 0;
        int counterEnd = 10;
        int valueStart = 0;
        int valueIncrement = 6;
        int expectedResult = valueStart + (counterEnd - counterStart) * valueIncrement;
        
        String src =
            "class {\n" +
            "    +public int getValue() {\n" +
            "        int i = " + counterStart + ";\n" +
            "        int value = " + valueStart + ";\n" +
            "        while(i < " + counterEnd + ") {\n" +
            "           value = value + " + valueIncrement + ";\n" +
            "           i = i + 1;\n" +
            "        }\n" +
            "        return value;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithForCountingToX() throws IOException {
        int counterStart = 0;
        int counterEnd = 10;
        int valueStart = 0;
        int valueIncrement = 6;
        int expectedResult = valueStart + (counterEnd - counterStart) * valueIncrement;
        
        String src =
            "class {\n" +
            "    +public int getValue() {\n" +
            "        int value = " + valueStart + ";\n" +
            "        for(int i = " + counterStart + "; i < " + counterEnd + "; i += 1) {\n" +
            "           value += " + valueIncrement + ";\n" +
            "        }\n" +
            "        return value;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(
            new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("getValue", invocationResult(is(expectedResult))))
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithReturnInIfElse() throws IOException {
        int trueIfGT = 10;
        
        String src =
            "class {\n" +
            "    +public boolean gt(int x) {\n" +
            "        if(x > " + trueIfGT + ")\n" +
            "            return true;\n" +
            "        else\n" +
            "            return false;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("gt", new Class<?>[]{int.class}, invocationResult(new Object[]{trueIfGT + 1}, is(true))))
                .and(
                    forInstance(imethod("gt", new Class<?>[]{int.class}, invocationResult(new Object[]{trueIfGT}, is(false))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithReturnInIf() throws IOException {
        int trueIfGT = 10;
        
        String src =
            "class {\n" +
            "    +public boolean gt(int x) {\n" +
            "        if(x > " + trueIfGT + ")\n" +
            "            return true;\n" +
            "        \n" +
            "        return false;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("gt", new Class<?>[]{int.class}, invocationResult(new Object[]{trueIfGT + 1}, is(true))))
                .and(
                    forInstance(imethod("gt", new Class<?>[]{int.class}, invocationResult(new Object[]{trueIfGT}, is(false))))
                )
            )
        );
    }
    
    @Test
    public void testAllClassesAddMethodWithParametersAndVariables() throws IOException {
        int x = 10;
        int a = 15;
        int y = 5;
        int b = 56;
        int expectedValue = x + a + y + b;
        
        String src =
            "class {\n" +
            "    +public int gt(int x, int a) {\n" +
            "        int y = " + y + ";\n" +
            "        int b = " + b + ";\n" +
            "        return x + a + y + b;\n" +
            "    }\n" +
            "}\n";
        
        testSourceToClasses(new String[]{"jasy.TestClass1"}, 
            src, 
            forClass("jasy.TestClass1", 
                forInstance(imethod("gt", new Class<?>[]{int.class, int.class}, invocationResult(new Object[]{x, a}, is(expectedValue))))
            )
        );
    }
    
    private static Function<byte[], byte[]> transformClass(ClassResolver resolver, String source) {
        ASMCompiler compiler = new ASMCompiler(resolver);
        return bytes -> {
            try {
                ModuleAST module = compiler.compile(new ByteArrayInputStream(source.getBytes("UTF-8")));
                ArrayList<Message> errorMessages = new ArrayList<>();
                module.resolve(null, null, resolver, errorMessages);
                
                if(errorMessages.size() > 0) {
                    String msg = errorMessages.stream().map(m -> m.toString()).collect(Collectors.joining("\n"));
                    throw new RuntimeException(msg);
                } else {
                    Function<Transformation<ClassNode>, Runnable> classTransformer = module.toClassTransformer();
                    ExhaustiveClassTransformer eTransformer = new ExhaustiveClassTransformer(classTransformer);
                    byte[] newBytes = eTransformer.transform(bytes);
                    
                    InputStream classStream = new ByteArrayInputStream(newBytes);
                    ClassReader classReader = new ClassReader(classStream);
//                    classReader.accept(new TraceClassVisitor(new PrintWriter(System.out)), 0);
                    CheckClassAdapter.verify(classReader, false, new PrintWriter(System.out));
//                    ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
//                    classReader.accept(classWriter, 0);
//                    Textifier asmifier = new Textifier();
//                    classWriter.
                    
                    return newBytes;
                }
            } catch (IOException ex) {
                Logger.getLogger(SourceToClassTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            return bytes;
        };
    }
    
    private static void testSourceToClasses(String[] classNames, String source, Predicate<Class<?>[]> assertion) throws IOException {
        CommonClassMap classMap = new CommonClassMap();
        
        for(String className: classNames)
            classMap.addClassName(className);
        
        classMap.addClassName("java.lang.String");
        classMap.addClassName("java.lang.Object");
        classMap.addClassName("java.lang.StringBuilder");
        classMap.addClassName("jasy.lang.ast.CodeAST");
        classMap.addClassName("org.objectweb.asm.tree.FieldNode");
        
        CommonClassResolver resolver = new CommonClassResolver(classMap);
        
        resolver.importPackage("java.lang");
        resolver.importPackage("jasy.lang.ast");
        resolver.importPackage("org.objectweb.asm.tree");
        
        ClassLoader cl = new ProxyClassLoader(ifIn(classNames), classBytesFromName().andThen(transformClass(resolver, source)));
        
        Class<?>[] classes = Arrays.asList(classNames).stream()
            .map(className -> {
                try {
                    return cl.loadClass(className);
//                    return Class.forName(source, true, cl);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SourceToAstTest.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            })
            .toArray(size -> new Class<?>[size]);
        
        try {
            assertTrue(assertion.test(classes));
        } catch(Error e) {
            throw e;
        }
        
        // Read all classes
        // Replace interusages with derived classes
        // Derived classes using module
        // Assert derived classes
//        assertTrue(modulePredicate.test(module));
    }
    
    private static Predicate<Class<?>[]> forClass(String name, Predicate<Class<?>> predicate) {
        return classes -> {
            Class<?> c = Arrays.asList(classes).stream().filter(x -> x.getName().equals(name)).findFirst().get();
            return predicate.test(c);
        };
    }
    
    private static Predicate<Class<?>> chasFieldWhere(Predicate<Field> predicate) {
        return c -> Arrays.asList(c.getDeclaredFields()).stream().anyMatch(predicate);
    }
    
    private static Predicate<Field> fname(Predicate<String> predicate) {
        return f -> predicate.test(f.getName());
    }
    
    private static Predicate<Field> ftype(Predicate<Class<?>> predicate) {
        return f -> predicate.test(f.getType());
    }
    
    private static Predicate<Field> fmodifiers(Predicate<Integer> predicate) {
        return f -> predicate.test(f.getModifiers());
    }
    
    private static Predicate<Class<?>> chasMethodWhere(Predicate<Method> predicate) {
        return c -> Arrays.asList(c.getDeclaredMethods()).stream().anyMatch(predicate);
    }
    
    private static Predicate<Class<?>> forInstance(Predicate<Object> predicate) {
        return c -> {
            try {
                Object instance = c.newInstance();
                return predicate.test(instance);
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(SourceToClassTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static Predicate<Object> imethod(String name, BiPredicate<Object, Method> predicate) {
        return imethod(name, new Class<?>[0], predicate);
    }
    
    private static Predicate<Object> imethod(String name, Class<?>[] parameterTypes, BiPredicate<Object, Method> predicate) {
        return i -> {
            try {
                Method m = i.getClass().getDeclaredMethod(name, parameterTypes);
                return predicate.test(i, m);
            } catch (NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(SourceToClassTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static Predicate<Object> ifield(String name, BiPredicate<Object, Field> predicate) {
        return i -> {
            try {
                Field m = i.getClass().getDeclaredField(name);
                m.setAccessible(true);
                return predicate.test(i, m);
            } catch (NoSuchFieldException | SecurityException ex) {
                Logger.getLogger(SourceToClassTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static BiPredicate<Object, Method> invocationResult(Predicate<Object> predicate) {
        return invocationResult(new Object[0], predicate);
    }
    
    private static BiPredicate<Object, Method> invocationResult(Object[] args, Predicate<Object> predicate) {
        return (i, m) -> {
            try {
                Object result = m.invoke(i, args);
                System.out.println("Invocation result:\n" + result);
                return predicate.test(result);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(SourceToClassTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static BiPredicate<Object, Field> ifget(Predicate<Object> predicate) {
        return (i, f) -> {
            try {
                Object value = f.get(i);
                return predicate.test(value);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(SourceToClassTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return false;
        };
    }
    
    private static Predicate<Integer> isPublic() {
        return m -> Modifier.isPublic(m);
    }
    
    private static Predicate<Integer> isProtected() {
        return m -> Modifier.isProtected(m);
    }
    
    private static Predicate<Integer> isPrivate() {
        return m -> Modifier.isPrivate(m);
    }
    
    private static Predicate<Integer> isStatic() {
        return m -> Modifier.isStatic(m);
    }
    
    private static Predicate<String> ifIn(String[] names) {
        return name -> Arrays.asList(names).contains(name);
    }
    
    private static ThreadLocal<Hashtable<String, byte[]>> classBytesCacheMap = new ThreadLocal<Hashtable<String, byte[]>>() {
        @Override
        protected Hashtable<String, byte[]> initialValue() {
            return new Hashtable<String, byte[]>();
        }   
    };
    
    private static Function<String, byte[]> classBytesFromName() {
        return name -> {
            try {
                byte[] cacheBytesCache = classBytesCacheMap.get().get(name);
                
                if(cacheBytesCache == null) {
                    String s = new java.io.File("build/test/classes/" + name.replace(".", "/") + ".class").getCanonicalFile().toString();
                    InputStream classStream = new FileInputStream("build/test/classes/" + name.replace(".", "/") + ".class"); //classUrl.openStream();
                    ClassReader classReader = new ClassReader(classStream);
                    ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
                    classReader.accept(classWriter, 0);
                    cacheBytesCache = classWriter.toByteArray();
                    
                    classBytesCacheMap.get().put(name, cacheBytesCache);
                }
                
                return cacheBytesCache;
            } catch (IOException ex) {
                Logger.getLogger(SourceToAstTest.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        };
    }

    private static Predicate<Method> mname(Predicate<String> predicate) {
        return m -> predicate.test(m.getName());
    }

    private static Predicate<? super Method> rreturnType(Predicate<Class<?>> predicate) {
        return m -> predicate.test(m.getReturnType());
    }

    private static Predicate<? super Method> rmodifiers(Predicate<Integer> predicate) {
        return m -> predicate.test(m.getModifiers());
    }
}
