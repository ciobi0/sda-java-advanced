package com.codingadvanced.ex5;

/**
 * Implement the
 * SDAHashSet<E> class that will implement the HashSet<E> logic. It should support methods:
 * • add
 * • remove
 * • size
 * • contains
 * • clear
 */
public class Main {
    public static void main(String[] args) {
        SDAHashSet<String> sdaHashSet = new SDAHashSetImpl<>();
        sdaHashSet.add("aaaa");
        sdaHashSet.add("aaaa");
        sdaHashSet.add("bbbb");
        sdaHashSet.add("cccc");
        System.out.println(sdaHashSet.contains("aaaa"));
        System.out.println(sdaHashSet.contains("aa"));
        System.out.println("size: " + sdaHashSet.size());
        sdaHashSet.remove("aaaa");
        System.out.println("size: " + sdaHashSet.size());
        sdaHashSet.clear();
        System.out.println("size: " + sdaHashSet.size());
    }
}
