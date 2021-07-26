package com.sdaJavaAdvanced.interfaces.courseexample;

public class Main {
    public static void main(String[] args) {
        Shape myShape1 = new Rectangle(5,4);
        myShape1.print();
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
    }
}
