package jasy;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TemplateSource {
    public static class SourceCode {
        public final Map<String, String> argumentMap;
        public final Map<String, Object> customMap;
        public final String src;

        public SourceCode(Map<String, String> argumentMap, Map<String, Object> customMap, String src) {
            this.argumentMap = argumentMap;
            this.customMap = customMap;
            this.src = src;
        }
    }
    
    public static class Configuration {
        public Map<String, String> argumentMap;
        public Map<String, Object> customMap;

        public Configuration(Map<String, String> argumentMap, Map<String, Object> customMap) {
            this.argumentMap = argumentMap;
            this.customMap = customMap;
        }
    }
    
    public static List<SourceCode> expand(String templaceSrc, Map<String, String>... argumentMaps) {
        Configuration[] configs = Arrays.asList(argumentMaps).stream()
            .map(a -> new Configuration(a, Collections.emptyMap()))
            .toArray(size -> new Configuration[size]);
        
        return expand(templaceSrc, configs);
    }
    
    public static List<SourceCode> expand(String templaceSrc, Configuration... configs) {
        ArrayList<SourceCode> srcs = new ArrayList<>();
        
        for(Configuration config: configs) {
            String src = templaceSrc;
            
            for(Map.Entry<String, String> entry: config.argumentMap.entrySet()) {
                String name = entry.getKey();
                String value = entry.getValue();

                src = src.replace("<<" + name + ">>", value);
            }
            
            srcs.add(new SourceCode(config.argumentMap, config.customMap, src));
        }
        
        return srcs;
    }
    
    public static <K, V, E extends Map.Entry<K, V>> E entry(K key, V value) {
        return (E)new AbstractMap.SimpleImmutableEntry<>(key, value);
    }
    
    public static <K, V, E extends Map.Entry<K, V>> Map<K, V> map(E... entries) {
        Hashtable<K, V> map = new Hashtable<>();
        
        for(E entry: entries)
            map.put(entry.getKey(), entry.getValue());
        
        return map;
    }
}
