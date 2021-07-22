package com.sdaJavaAdvanced.streams.courseexercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

//1. Using streams, for a given lists:
//- [„John", „Sarah", „Mark", „Tyla", „Ellisha", „Eamonn"]
//- [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
//- Sort the list.
//- Print only those names, that start with „E" letter.
//- Print values greater than 30 and lower than 200.
//- Print names uppercase.
//- Remove first and last letter, sort and print names.
//- *Sort backwards by implementing reverse Comparator and using lambda expression.
public class Main {
    private static List<String> names = Arrays.asList("John","Sarah","Mark","Eliza","Talya");
    private static List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);
    public static void main(String[] args) {
        List<String> namesSorted = names.stream().sorted()
                .collect(Collectors.toList());
        namesSorted.forEach(name -> System.out.println(name));

        List<Integer> integersSorted = numbers.stream().sorted()
                .collect(Collectors.toList());
        integersSorted.forEach(number -> System.out.println(number));
        System.out.println("-----------------------------------------");
        names.stream().filter(name->name.startsWith("E"))
                .forEach(name -> System.out.println(name));
        numbers.stream().filter(number -> number>30)
                .filter(number -> number<200)
                .forEach(number -> System.out.println(number));
        System.out.println("-----------------------------------------");
        names.stream().map(name -> name.toUpperCase(Locale.ROOT))
                .forEach(name -> System.out.println(name));
        System.out.println("-----------------------------------------");
        names.stream().map(name -> name.substring(1,name.length()-1))
                .sorted()
                .forEach(name-> System.out.println(name));
        numbers.stream().sorted((element1,element2) -> Integer.compare(element2,element1))
                .forEach(number -> System.out.println(number));
    }
}
