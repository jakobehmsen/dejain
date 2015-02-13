package jasy.lang.ast;

import java.util.HashMap;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;

public class MethodCodeGenerator {
    private static class VariableInfo {
        public int index;
        public TypeAST type;

        public VariableInfo(int index, TypeAST type) {
            this.index = index;
            this.type = type;
        }
    }
    
    public GeneratorAdapter methodNode;
    private TypeAST returnType;
    private HashMap<String, VariableInfo> localNameToIndexMap = new HashMap<>();

    public MethodCodeGenerator(GeneratorAdapter methodNode, TypeAST returnType) {
        this.methodNode = methodNode;
        this.returnType = returnType;
    }

    public void start() {
    }

    public void end() {
    }

    public int declareVariable(String name, String desc, TypeAST type) {
        int index = methodNode.newLocal(Type.getType(type.getDescriptor()));
        localNameToIndexMap.put(name, new VariableInfo(index, type));
        return index;
    }

    public int getVariableIndex(String name) {
        return localNameToIndexMap.get(name).index;
    }

    private boolean isVariable(String name) {
        return localNameToIndexMap.containsKey(name);
    }

    public TypeAST getVariableType(String name) {
        return localNameToIndexMap.get(name).type;
    }

    private TypeAST getReturnType() {
        return returnType;
    }
}
