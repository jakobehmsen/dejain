package dejain.lang;

import java.util.HashMap;
import java.util.Map;

public class ClassResolver {
    private ClassMap classMap;
    private Map<String, String> imports = new HashMap<>();

    public ClassResolver(ClassMap classMap) {
        this.classMap = classMap;
    }
    
    public void importPackage(String packageName) {
        for(String className: classMap.getClassNames(packageName))
            imports.put(className, packageName + "." + className);
    }
    
    public String resolveClassName(String className) {
        String importedName = imports.get(className);
        
        if(importedName != null)
            return importedName;
        
        return className;
    }
    
    public Class<?> resolveType(String typeName) throws ClassNotFoundException {
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
        
        if(className == null)
            System.out.println("className=" + className + ",imports=" + imports);
        
        try {
            return Class.forName(className);
        } catch(ClassNotFoundException e) {
            System.out.println("error: className=" + className + ",imports=" + imports);
            throw e;
        }
    }
}
