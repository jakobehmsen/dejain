package jasy.lang.ast;

public class Parameter {
    public String name;
    public TypeAST type;

    public Parameter(String name, TypeAST type) {
        this.name = name;
        this.type = type;
    }
}
