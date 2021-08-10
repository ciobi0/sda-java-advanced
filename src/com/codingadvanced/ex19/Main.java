package com.codingadvanced.ex19;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a Laptop class extending the Computer class from the previous task. The Laptop class should
 * additionally contain the battery parameter.
 * Implement additional getters, setters, constructor and overwrite the toString(), equals() and hashcode()
 * methods accordingly.
 * Use a reference to parent class methods.
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

        Computer laptop = new Laptop(
                "i5",
                "8GB",
                "Radeon",
                "HP",
                "HP12300",
                "1500mA");

        System.out.println(computer1.getCompany());
        System.out.println(computer2);
        System.out.println(computer1.hashCode());
        System.out.println(laptop);

        Map<Computer,Integer> map = new HashMap<>();
        map.put(computer1,10);
        map.put(computer2,15);
        map.put(laptop,20);
        System.out.println(map);



    }
}
