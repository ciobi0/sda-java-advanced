package com.sdaJavaAdvanced.collections.map.oracledocexp.exp1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //unsorted map using HashMap implementation
//        Map<String,Integer> map = new HashMap<>();

        //sorted alphabetical map using TreeMap implementation
        Map<String, Integer> map = new TreeMap<String, Integer>();

        //print in the order the words first appear
//        Map<String, Integer> map = new LinkedHashMap<>();
        //initialize frequency table
        String[] arg = {"java", "freq", "if", "it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate"};

        for (String a : arg) {
            Integer freq = map.get(a);
            map.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(map.size() + "distinct words:");
        System.out.println(map);
    }
}
