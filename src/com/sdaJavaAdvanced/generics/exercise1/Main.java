package com.sdaJavaAdvanced.generics.exercise1;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person(1.17);
        Person person2=new Person(1.16);
        System.out.println(person1.compareTo(person2));
    }
}
