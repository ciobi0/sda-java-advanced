package com.sdaJavaAdvancedIndividualWorkSession.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Write a method that converts all strings in a list to their upper case using streams
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("srt", "der", "DffR");
        System.out.println(convertToUpperCase(stringList));
    }

    static List<String> convertToUpperCase(List<String> list) {
        return list.stream()
                .map(element -> element.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
    }
}
