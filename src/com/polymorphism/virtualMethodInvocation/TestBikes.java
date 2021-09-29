package com.polymorphism.virtualMethodInvocation;

/**
 * The Java virtual machine (JVM) calls the appropriate method for the object that is referred to in each variable.
 * This behavior is referred to as VIRTUAL METHOD INVOCATION and demonstrates an aspect of the
 * important polymorphism features in the Java language.
 * Within a class, a field that has the same name as a field in the superclass hides the superclass's field,
 * even if their types are different.
 * Invocation of a superclass constructor must be the first line in the subclass constructor.
 */
public class TestBikes {
    public static void main(String[] args) {
        Bicycle bike1, bike2, bike3;

        bike1 = new Bicycle(20, 10, 1);
        bike2 = new MountainBike(20, 10, 5, "dual");
        bike3 = new RoadBike(40, 20, 8, 23);

        bike1.printDescription();
        bike2.printDescription();
        bike3.printDescription();
    }
}
