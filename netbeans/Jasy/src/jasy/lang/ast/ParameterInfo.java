package jasy.lang.ast;

public class ParameterInfo {
    public TypeAST type;
    public int index;

    public ParameterInfo(TypeAST type, int index) {
        this.type = type;
        this.index = index;
    }
}
