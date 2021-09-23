package com.nestedClasses.innerClasses;

import java.util.Iterator;

public class DataStructure {
    // create an array
    private static final int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        // print out values of even indices of the array
        DataStructureIterator evenIterator = this.new EvenIterator();
        while (evenIterator.hasNext()) {
            System.out.print(evenIterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {

            // Record a value of an even index of tha array
            Integer retValue = arrayOfInts[nextIndex];

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
