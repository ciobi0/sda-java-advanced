package com.codingadvanced.ex3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Create a method that takes the map as a parameter, where the key is string and the value number, and then
 * prints each map element to the console in the format: Key: <k>, Value: <v>. There should be a comma at the
 * end of every line except the last, and a period at the last.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("PHP", 0);

        printMapContent(map);
    }

    public static void printMapContent(Map<String, Integer> map) {
        //map.entrySet().forEach(entry -> System.out.println("Key: "+ entry.getKey()+", Value: "+ entry.getValue()+","));
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String endString;
            if (!iterator.hasNext()) {
                endString = ".";
            } else {
                endString = ",";
            }
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue() + endString);
        }
    }
}
