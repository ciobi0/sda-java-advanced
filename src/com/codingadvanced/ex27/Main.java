package com.codingadvanced.ex27;

/**
 * Design the Joiner<T> class, which in the constructor will take a separator (string) and have a join() method
 * that allows you to specify any number of T type objects. This method will return a string joining all passed
 * elements by calling their toString() method and separating them with a separator.
 * eg. for Integers and separator "-" it should return: 1-2-3-4 ...
 */
public class Main {
    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");
        System.out.println(joiner.join(1,2,3,4));
    }
}
