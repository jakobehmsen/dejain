package jasy.lang.ast;

public interface PrimitiveVisitor<T> {
    T visitByte();
    T visitShort();
    T visitInt();
    T visitLong();
    T visitFloat();
    T visitDouble();
}
