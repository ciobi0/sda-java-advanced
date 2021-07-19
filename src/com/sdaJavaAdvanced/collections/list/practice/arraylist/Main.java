package com.sdaJavaAdvanced.collections.list.practice.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //listExample();
        //listIteratorExample();
        listSortExample();
    }

    private static void listExample() {
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");

        visitedCountries.remove("France");

        for (String country : visitedCountries) {
            System.out.println(country + " ");
        }
    }
    private static void listIteratorExample(){
        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");

        visitedCountries.remove("France");

        Iterator<String> iterator = visitedCountries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
    private static void listSortExample(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);
        numbers.add(5);

        System.out.println("list before sort: "+numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        System.out.println("list after sort: "+numbers);

    }
}
