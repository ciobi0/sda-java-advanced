package com.codingadvanced.ex21;

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task.
 * Add an additional method calculateVolume()
 * Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness.
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,4);
        Shape triangle = new Triangle(10,4,5);

        System.out.println("rectangle perimeter "+rectangle.calculatePerimeter());
        System.out.println("rectangle area "+rectangle.calculateArea());

        System.out.println("triangle perimeter "+triangle.calculatePerimeter());
        System.out.println("triangle area "+triangle.calculateArea());

        Shape3D qube = new Qube(8);
        System.out.println("qube perimeter "+qube.calculatePerimeter());
        System.out.println("qube area "+qube.calculateArea());
        System.out.println("qube volume "+qube.calculateVolume());

    }
}
