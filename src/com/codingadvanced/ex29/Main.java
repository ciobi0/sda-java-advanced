package com.codingadvanced.ex29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Implement the generic partOf method, which will return % of items satisfying the condition based on any
 * type of array and the function indicated as parameters.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 1, 4, 6, 1, 4);
        System.out.println(partOf(integerList, element -> element%2==0 ));
    }

    static <T> double partOf(List<T> list, Predicate<T> predicate) {
        long validElements = list.stream()
                .filter(predicate)
                .count();
        if (!list.isEmpty()) {
            return ((double) validElements / list.size()) * 100;
        } else {
            return 0;
        }
    }
}
