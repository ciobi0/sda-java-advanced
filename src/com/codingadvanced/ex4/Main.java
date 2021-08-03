package com.codingadvanced.ex4;

import java.util.HashMap;
import java.util.List;

/**
 * Create a
 * Storage class that will have a private Map field, a public constructor,
 * and methods:
 * addToStorage(String key, String value)  * adding elements to the storage
 * printValues(String key)  * displaying all elements under a given key
 * findValues(String value)  * displaying all keys that have a given value
 * The   Storage class should allow you to store multiple values under one key.
 */
public class Main {
    public static void main(String[] args) {
        Storage zooStorage = new StorageImpl(new HashMap<>());

        zooStorage.addToStorage("bear", "tedy");
        zooStorage.addToStorage("bear", "arthur");
        zooStorage.addToStorage("bear", "polar");
        zooStorage.addToStorage("bear", "panda");
        zooStorage.addToStorage("cat", "pisica");
        zooStorage.addToStorage("cat", "pisi");
        zooStorage.addToStorage("cat", "tedy");
        zooStorage.printValues("bear");
        zooStorage.printValues("cat");
        zooStorage.printValues("be");
        zooStorage.findValues("tedy");
        zooStorage.findValues("te");


    }

}
