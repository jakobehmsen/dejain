package jasy.lang;

import java.util.HashMap;
import java.util.Map;

public class CommonClassResolver implements ClassResolver {
    private ClassMap classMap;
    private Map<String, String> imports = new HashMap<>();

    public CommonClassResolver(ClassMap classMap) {
        this.classMap = classMap;
    }
    
    public void importPackage(String packageName) {
        for(String className: classMap.getClassNames(packageName))
            imports.put(className, packageName + "." + className);
    }
    
    @Override
    public String resolveClassName(String className) {
        String importedName = imports.get(className);
        
        if(importedName != null)
            return importedName;
        
        return className;
    }
}
