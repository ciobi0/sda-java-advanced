package com.sdaJavaAdvanced.collections.list.practice.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        linkedListSpecificOperations();
    }

    private static void linkedListSpecificOperations() {
        LinkedList<String> visitedCountries = new LinkedList<>();
        //Linked list specific methods for adding elements

        //adding a new element at the front of the list
        visitedCountries.addFirst("Spain");
        visitedCountries.push("USA");
        //add a new element at the end of the list
        visitedCountries.addLast("Romania");
        visitedCountries.offer("Bulgaria");
        //specific methods for getting the firs element
        visitedCountries.getFirst();
        visitedCountries.peekFirst();
        visitedCountries.peek();
        //specific methods for getting the last element
        visitedCountries.getLast();
        visitedCountries.peekLast();
        //specific methods for removing and getting the first element
//        visitedCountries.removeFirst();
//        visitedCountries.pollFirst();
//        visitedCountries.poll();
//        visitedCountries.pop();
        //specific methods for removing and getting last element
//        visitedCountries.removeLast();
//        visitedCountries.pollLast();
        System.out.println(visitedCountries);
        System.out.println(visitedCountries.indexOf("Romania"));


    }

}

