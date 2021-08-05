package com.codingadvanced.ex14justme;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Implement the following functionalities based on 100,000 element arrays with randomly selected values:
 * 1.return a list of unique items,
 * 2.return a list of elements that have been repeated at least once in the generated array,
 * 3.return a list of the 25 most frequently recurring items.
 * Implement a method that deduplicates items in the list. If a duplicate is found, it replaces it with a new
 * random value that did not occur before. Check if the method worked correctly by calling method number 2.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> randomArray = new ArrayList<>(100000);
        for (int i = 0; i < 1000; i++) {
            randomArray.add((int) (Math.random() * 30));
        }
        System.out.println("random list: " + randomArray);
        System.out.println("no duplicates: " + arrayListToHashSet(randomArray));
        System.out.println("no duplicates: " + arrayListWithStreamDistinct(randomArray));
        System.out.println("duplicate elements: " + findDuplicateBySetAdd(randomArray));
        System.out.println("25 most frequently items: " + findDuplicateBySetAdd(randomArray));



    }


    static <T>List<T> arrayListToHashSet(List<T> randomArray) {
       Set<T> newSet = new HashSet<>(randomArray);
        return new ArrayList<>(newSet);
    }

    static <T>List<T> arrayListWithStreamDistinct(List<T> randomArray) {
        return randomArray.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    static <T> Set<T> findDuplicateBySetAdd(List<T> list){
        Set<T> setItems = new HashSet<>();
        return list.stream().filter(element -> !setItems.add(element))
                .collect(Collectors.toSet());
    }

    static <T> Set<T> findFirst25FrequentDuplicates(List<T> list){
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        ,Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .limit(25)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }




}
