package com.codingadvanced;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ccC", "Bbb", "Aaa");

        System.out.println(list);
        list.sort(null);
        System.out.println(list);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        });

        System.out.println(list);

        list.forEach(System.out::println);
    }
}
