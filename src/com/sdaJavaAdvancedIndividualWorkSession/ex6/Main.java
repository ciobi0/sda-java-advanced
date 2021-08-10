package com.sdaJavaAdvancedIndividualWorkSession.ex6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a method that returns a comma-separated string based on a given list of integers.
 * Each element should be preceded by the letter 'e' if the number is even ,
 * or preceded by the letter 'o' if the number is odd .
 * For example , if the input list is (3,44), the output should be 'o3,e44'.
 * Use streams.
 */
public class Main {
    public static void main(String[] args) {
List<Integer> integerList = Arrays.asList(22,55,22,55);
        System.out.println(convertIntListToStr(integerList));
    }

    static String convertIntListToStr(List<Integer> list) {
       return list.stream().map(integer -> integer%2==0?"o"+integer : "e"+integer)
               .collect(Collectors.joining(","));
    }
}
