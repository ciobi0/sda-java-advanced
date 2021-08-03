package com.codingadvanced.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StorageImpl implements Storage {

    private Map<String, List<String>> map;

    public StorageImpl(Map<String, List<String>> map) {
        this.map = map;
    }

    @Override
    public void addToStorage(String key, String value) {
        if (map.containsKey(key)) {
            List<String> existingValues = map.get(key);
            existingValues.add(value);
            map.put(key, existingValues);
        } else {
            List<String> values = new ArrayList<>();
            values.add(value);
            map.put(key, values);
        }
    }

    @Override
    public void printValues(String key) {
        if (map.containsKey(key)) {
            System.out.println("Values for key " + key + " : " + map.get(key));
        } else {
            System.out.println("Nothing found!");
        }
    }

    @Override
    public void findValues(String value) {
//        map.entrySet().forEach(entry ->{
//            if (entry.getValue().contains(value)){
//                System.out.println("key: "+entry.getKey());
//            }
//        });
//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//            if (entry.getValue().contains(value)) {
//                System.out.println("key: " + entry.getKey());
//            }

        List<String> keys = map.entrySet().stream()
                .map(entry -> {
                    if (entry.getValue().contains(value)) {
                        return entry.getKey();
                    }
                    return null;
                })
                .filter(key -> key != null)
                .collect(Collectors.toList());
        System.out.println("keys found for value " + value + " : " + keys);
    }

}
