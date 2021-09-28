package com.inheritance.interfaceMethods;

//Instance methods are preferred over interface default methods.
public class Pegasus extends Horse implements Flyer, Mythical{
    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus();
        System.out.println(pegasus.identifyMyself());
    }
}
