/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dejain.lang;

/**
 *
 * @author Jakob
 */
public interface ClassResolver {
    default Class<?> resolveType(String typeName) throws ClassNotFoundException {
        switch(typeName) {
            case "boolean": return boolean.class;
            case "byte": return byte.class;
            case "short": return short.class;
            case "int": return int.class;
            case "long": return long.class;
            case "float": return float.class;
            case "double": return double.class;
        }
        
        String className = resolveClassName(typeName);
        
        try {
            return Class.forName(className);
        } catch(ClassNotFoundException e) {
            throw e;
        }
    }

    String resolveClassName(String className);
}
