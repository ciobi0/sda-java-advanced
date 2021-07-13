package com.sdaJavaAdvanced.generics.exercise2;
//Create a simple Generic class, that will give a possibility, to store any kind of value within. Add object of type String,
// Integer and Double to array of that Generic type. Print all values of the array within a loop.
public class Main {
    public static void main(String[] args) {
        Generic[] generics=new Generic[3];
        Generic<String> str=new Generic<>("abc");
        Generic<Integer> integer=new Generic<>(123);
        Generic<Double> dbl=new Generic<>(12.34);
        generics[0]=str;
        generics[1]=integer;
        generics[2]=dbl;
        for (int i=0; i<generics.length;i++){
            System.out.println(generics[i].getItem());
        }

    }
}
