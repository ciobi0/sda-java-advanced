package com.sdaJavaAdvanced.inheritance.exercise1;

import java.util.ArrayList;
import java.util.List;

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
