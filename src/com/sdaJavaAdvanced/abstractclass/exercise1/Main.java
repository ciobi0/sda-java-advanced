package com.sdaJavaAdvanced.abstractclass.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Shape[] shapeArray = {
            new RightTriangle(4, 3),
            new RightTriangle(6, 5),
            new RightTriangle(5, 4),
            new Rectangle(5, 8),
            new Rectangle(4, 4),
            new Rectangle(6, 8)
    };


    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(shapeArray);
        //shapes.forEach(System.out::println);
        for (Shape shape : shapes){
            System.out.println(shape);
            System.out.println("perimeter= "+shape.getPerimeter());
            System.out.println("area= "+shape.getArea());
            System.out.println("--------------");
        }


    }
}
