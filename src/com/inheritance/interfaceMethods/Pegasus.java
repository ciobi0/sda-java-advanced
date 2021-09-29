package com.inheritance.interfaceMethods;

/**
 * Instance methods are preferred over interface default methods.
 * Methods that are already overridden by other candidates are ignored.
 * If two or more independently defined default methods conflict you must explicitly override the supertype methods.
 * Inherited instance methods from classes can override abstract interface methods.
 * Static methods in interfaces are never inherited.
 * The access specifier for an overriding method can allow more, but not less, access than the overridden method.
 * In a subclass, you can overload the methods inherited from the superclass, they are new methods, unique to the subclass.
 */
public class Pegasus extends Horse implements Flyer, Mythical{
    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus();
        System.out.println(pegasus.identifyMyself());
    }
}
