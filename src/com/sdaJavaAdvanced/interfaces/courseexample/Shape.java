package com.sdaJavaAdvanced.interfaces.courseexample;

public interface Shape {

    //public and abstract by default
    double getArea();

    double getPerimeter();

    default void print(){
        System.out.println("Shape: "+ this);
    }
}
