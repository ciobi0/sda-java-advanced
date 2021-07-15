package com.sdaJavaAdvanced.collections.set.ex2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> elements = new HashSet<>();
        elements.add("element1");
        elements.add("element2");
        elements.add("element2");
        elements.add("element3");

        //iterate through all elements in a hash set
        for (String element : elements) {
            System.out.println(element);
        }
        //test if a hash set is empty or not
        boolean isEmpty = elements.isEmpty();
        System.out.println("is hash set empty? - " + isEmpty);
        //clone a hash set to another hash set
        Set<String> clonedElements = new HashSet<>();
        boolean isCloned = clonedElements.addAll(elements);
        System.out.println("is addAll() successful? - " + isCloned);
        if (isCloned) {
            for (String item : clonedElements) {
                System.out.println("item in clonedElements: " + item);
            }
        }
        //empty a hash set
        elements.clear();
        System.out.println("after clear() command\nis elements empty? - " +
                elements.isEmpty());
        System.out.println("is clonedElements empty? - " +
                clonedElements.isEmpty());
        //convert a hash set to an array
        String[] arrayFromHashset = clonedElements.toArray(new String[0]);
        for (int i = 0; i < arrayFromHashset.length; i++){
            System.out.println("array["+i+"] = "+arrayFromHashset[i]);
        }
        //convert a hash set to a tree set
        Set<String> treeSet = new TreeSet<>();
        boolean isTreeSetPopulated = treeSet.addAll(clonedElements);
        System.out.println("has tree set data in? - "+isTreeSetPopulated);
        //iterate through all elements of a tree set
        treeSet.add("element4");
        for (String item : treeSet){
            System.out.println("tree set item: "+item);
        }
        //compare two sets and retain elements which are same on both sets
        boolean isTreeSetChanged = treeSet.retainAll(clonedElements);
        System.out.println("is tree set changed with common elements from hash set? - "+
                isTreeSetChanged);
        for (String string : treeSet){
            System.out.println("tree set: "+string);
        }
    }
}
