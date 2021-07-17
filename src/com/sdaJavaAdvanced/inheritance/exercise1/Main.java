package com.sdaJavaAdvanced.inheritance.exercise1;

import java.util.ArrayList;
import java.util.List;
//Create a Shape class.
//
//Add fields, create constructor, getters and setters.
//Create classes Rectangle and Circle. Both of them should inherit class Shape.
//Which fields and methods are common?
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        Shape shape2 = new Rectangle(5,5);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);
        for (Shape shape : shapes){
            shape.drawShape();
            System.out.println(shape.getName());
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
