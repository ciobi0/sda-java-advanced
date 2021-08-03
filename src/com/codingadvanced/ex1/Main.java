package com.codingadvanced.ex1;
//Create a method that takes a string list as a parameter ,
// then returns the list sorted alphabetically from Z to A.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> listOfLetters = Arrays.asList("d","e","a","f","r","i");

       // System.out.println(sortdList(listOfLetters));
        List<String> sortedList = sortList(listOfLetters);
        sortedList.stream().forEach(letter -> System.out.print(letter));
    }

    public static List<String> sortList(List<String> listToSort){
        return listToSort.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
