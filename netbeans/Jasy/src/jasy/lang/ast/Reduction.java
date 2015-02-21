package jasy.lang.ast;

public class Reduction {
    public static Class<?> typeOf(String lhsType, String rhsType) {
        return typeOf(lhsType, rhsType, new PrimitiveVisitor<Class<?>>() {
            @Override
            public Class<?> visitByte() {
                return byte.class;
            }

            @Override
            public Class<?> visitShort() {
                return short.class;
            }

            @Override
            public Class<?> visitInt() {
                return int.class;
            }

            @Override
            public Class<?> visitLong() {
                return long.class;
            }
        });
    }
    
    public static <T> T typeOf(
        String lhsType, String rhsType, 
        PrimitiveVisitor<T> typeVisitor) {
        switch(lhsType) {
            case "byte":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitByte();
                    case "short": return typeVisitor.visitShort();
                    case "int": return typeVisitor.visitInt();
                    case "long": return typeVisitor.visitLong();
                }
                break;
            case "short":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitShort();
                    case "short": return typeVisitor.visitShort();
                    case "int": return typeVisitor.visitInt();
                    case "long": return typeVisitor.visitLong();
                }
                break;
            case "int":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitInt();
                    case "short": return typeVisitor.visitInt();
                    case "int": return typeVisitor.visitInt();
                    case "long": return typeVisitor.visitLong();
                }
                break;
            case "long":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitLong();
                    case "short": return typeVisitor.visitLong();
                    case "int": return typeVisitor.visitLong();
                    case "long": return typeVisitor.visitLong();
                }
                break;
        }
        
        throw new IllegalArgumentException("Cannot derive resultType where lhsType is '" + lhsType + "' and rhsType is '" + rhsType + "'.");
    }
}
