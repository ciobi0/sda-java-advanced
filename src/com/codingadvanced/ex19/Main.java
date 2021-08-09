package com.codingadvanced.ex18;

/**
 * Create a Computer class with fields defining computer features:
 * processor, ram, graphics card, company and model. Implement setters, getters,
 * constructor with all fields, toString()toString(), equals() and hashcode()
 * methods.
 * Instantiate several objects and check how the methods work.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(
                "i3",
                "4GB",
                "Intel Graphics",
                "Dell",
                "Dell123");

        Computer computer2 = new Computer(
                "i5",
                "8GB",
                "Radeon",
                "HP",
                "HP12300");

        System.out.println(computer1.getCompany());
        System.out.println(computer2);
        System.out.println(computer1.hashCode());


    }
}
