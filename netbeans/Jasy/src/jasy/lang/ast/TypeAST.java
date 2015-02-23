package jasy.lang.ast;

public interface TypeAST extends AST {
    /**
     * 
     * @param thisClassName Separated by '/'.
     * @return 
     */
    String getDescriptor(String thisClassName);
    /**
     * 
     * @param thisClassName Separated by '/'.
     * @return 
     */
    String getName(String thisClassName);
    /**
     * 
     * @param thisClassName Separated by '/'.
     * @return 
     */
    String getSimpleName(String thisClassName);
    boolean isCompatibleWith(TypeAST other);
    
    default String getDescriptor() {
        return getDescriptor(null);
    }
    
    default String getName() {
        return getName(null);
    }
    
    default String getSimpleName() {
        return getSimpleName(null);
    }

    TypeAST getFieldType(ClassLoader classLoader, String fieldName);

    TypeAST getTypeArgument(String name);

    boolean derivesFrom(TypeAST type);
}
