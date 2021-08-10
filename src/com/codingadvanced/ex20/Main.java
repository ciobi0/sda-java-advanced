package com.codingadvanced.ex20;

/**
 * Create an abstract Shape class with the abstract
 * methods calculatePerimeter() for calculating the perimeter and
 * calculateArea() for calculating the area.
 * Create Rectangle , Triangle , Hexagon classes, extending the Shape class, and implementing abstract
 * methods accordingly. Verify the solution correctness.
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,4);
        Shape triangle = new Triangle(10,4,5);

        System.out.println("rectangle perimeter "+rectangle.calculatePerimeter());
        System.out.println("rectangle area "+rectangle.calculateArea());

        System.out.println("triangle perimeter "+triangle.calculatePerimeter());
        System.out.println("triangle area "+triangle.calculateArea());
    }
}
