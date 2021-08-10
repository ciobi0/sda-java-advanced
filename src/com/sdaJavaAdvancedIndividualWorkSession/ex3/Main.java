package com.sdaJavaAdvancedIndividualWorkSession.ex3;

import java.util.Arrays;
import java.util.List;

/**
 * Write a method that returns the average of a list of integers using streams
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 8, 9);
        System.out.println(averageOfAnIntegerList(integerList));
        System.out.println(average(integerList));

    }

    static double averageOfAnIntegerList(List<Integer> list) {
        Integer sum = list.stream().reduce(0,(subtotal, element) -> subtotal+element);
        int count = list.size();
        return (double) sum/count;
    }

    static Double average(List<Integer> list){
        return list.stream().mapToDouble(i->i)
                .average()
                .orElse(0.0);
    }
}
