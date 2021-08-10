package com.sdaJavaAdvancedIndividualWorkSession.ex5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings , write a method that returns a list of all strings that start with the
 * letter 'a' (lower case ) and have exactly 3 letters, using streams.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("adf","Add","agog","aaa");
        System.out.println(filterList(stringList));
    }
    static List<String> filterList(List<String> list){
        return list.stream()
                .filter(elem -> elem.startsWith("a") && elem.length()==3)
                .collect(Collectors.toList());

    }
}
