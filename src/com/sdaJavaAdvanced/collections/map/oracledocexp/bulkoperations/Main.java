package com.sdaJavaAdvanced.collections.map.oracledocexp.bulkoperations;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> defaults = new HashMap<>();
        Map<String, Integer> overrides = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();

        defaults.put("Str1", 1);
        defaults.put("Str2", 1);
        defaults.put("Str3",1);
        overrides.put("Str1",2);
        overrides.put("Str2",2);
        overrides.put("Str4",2);

        result = newAttributeMap(defaults,overrides);
        System.out.println(result);

        Set<String> strings = result.keySet();
        System.out.println(strings);

        Collection<Integer> values = result.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entries = result.entrySet();
        System.out.println(entries);


    }

    //factory method to implement attribute map creation with default values
    static <K, V> Map<K, V> newAttributeMap(Map<K, V> defaults, Map<K, V> overrides) {
        Map<K, V> result = new HashMap<>(defaults);
        result.putAll(overrides);
        return result;
    }
}
