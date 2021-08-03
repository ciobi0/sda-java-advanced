package com.codingadvanced.ex6;

import java.util.Map;
import java.util.TreeMap;

/**
 * Create a method that accepts TreeMap and prints the first and last EntrySet in the console.
 */
public class Main {
    public static void main(String[] args) {

        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("a",11);
        map.put("b",12);
        map.put("c",13);
        map.put("f",14);

        extracted(map);
    }

    private static void extracted(TreeMap<String, Integer> map) {
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }

    //static void printFirstLast(TreeMap<K,V>){}
}
