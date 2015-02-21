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

            @Override
            public Class<?> visitFloat() {
                return float.class;
            }

            @Override
            public Class<?> visitDouble() {
                return double.class;
            }
        });
    }
    
    public static <T> T typeOf(
        String lhsType, String rhsType, 
        PrimitiveVisitor<T> typeVisitor) {
        
        float l = 5L + 1.0f;
        switch(lhsType) {
            case "byte":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitByte();
                    case "short": return typeVisitor.visitShort();
                    case "int": return typeVisitor.visitInt();
                    case "long": return typeVisitor.visitLong();
                    case "float": return typeVisitor.visitFloat();
                    case "double": return typeVisitor.visitDouble();
                }
                break;
            case "short":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitShort();
                    case "short": return typeVisitor.visitShort();
                    case "int": return typeVisitor.visitInt();
                    case "long": return typeVisitor.visitLong();
                    case "float": return typeVisitor.visitFloat();
                    case "double": return typeVisitor.visitDouble();
                }
                break;
            case "int":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitInt();
                    case "short": return typeVisitor.visitInt();
                    case "int": return typeVisitor.visitInt();
                    case "long": return typeVisitor.visitLong();
                    case "float": return typeVisitor.visitFloat();
                    case "double": return typeVisitor.visitDouble();
                }
                break;
            case "long":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitLong();
                    case "short": return typeVisitor.visitLong();
                    case "int": return typeVisitor.visitLong();
                    case "long": return typeVisitor.visitLong();
                    case "float": return typeVisitor.visitFloat();
                    case "double": return typeVisitor.visitDouble();
                }
                break;
            case "float":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitFloat();
                    case "short": return typeVisitor.visitFloat();
                    case "int": return typeVisitor.visitFloat();
                    case "long": return typeVisitor.visitFloat();
                    case "float": return typeVisitor.visitFloat();
                    case "double": return typeVisitor.visitDouble();
                }
                break;
            case "double":
                switch(rhsType) {
                    case "byte": return typeVisitor.visitDouble();
                    case "short": return typeVisitor.visitDouble();
                    case "int": return typeVisitor.visitDouble();
                    case "long": return typeVisitor.visitDouble();
                    case "float": return typeVisitor.visitDouble();
                    case "double": return typeVisitor.visitDouble();
                }
                break;
        }
        
        throw new IllegalArgumentException("Cannot derive resultType where lhsType is '" + lhsType + "' and rhsType is '" + rhsType + "'.");
    }
}
