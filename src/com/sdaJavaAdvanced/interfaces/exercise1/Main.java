package com.sdaJavaAdvanced.interfaces.exercise1;
//Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should
// return the string backwards. Select one of the sentences from this book to use as the data. Write a small
// main method to test your class; make sure to call all four methods.
public class Main {
    public static void main(String[] args) {
        BackwardString backwardString = new BackwardString("reverse this string");
        System.out.println(backwardString.reverseString());
    }
}
