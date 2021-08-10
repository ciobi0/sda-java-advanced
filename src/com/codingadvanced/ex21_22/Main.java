package com.codingadvanced.ex21_22;

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task.
 * Add an additional method calculateVolume()
 * Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness.
 *
 * Create a
 * Fillable interface with the fill() method. Implement the method in the 3DShape class from the
 * previous task or separately in the Cone and Qube classes.
 * The
 * fill() method should take a parameter, e.g. int, and check whether after the action of filling the figure:
 * •
 * will pour too much water into the figure and overflow,
 * •
 * fill the figure with water to the brim,
 * •
 * not pouring enough water.
 * For each situation, it should write the status information in the console. Use the
 * calculateVolume() method.
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
        qube.fill(512);

    }
}
