package com.codingadvanced.ex28;

import java.util.Arrays;

/**
 * Extend the ArrayList<E> class by implementing the getEveryNthElement() method. This method returns a list
 * of elements and takes two parameters: the element index from which it starts and a number specifying which
 * element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 */
public class Main {
    public static void main(String[] args) {
        SdaArrayList<Integer> sdaArrayList = new SdaArrayList<>();
        sdaArrayList.add(1);
        sdaArrayList.add(2);
        sdaArrayList.add(3);
        sdaArrayList.add(4);
        sdaArrayList.add(5);
        sdaArrayList.add(6);
        sdaArrayList.add(7);
        sdaArrayList.add(8);

        System.out.println(sdaArrayList.getEveryNthElement(1,2));

    }
}
