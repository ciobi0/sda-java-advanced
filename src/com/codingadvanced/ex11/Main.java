package com.codingadvanced.ex11;

/**
 *
 * exercice 11
 *
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task ( Circle ). When calling the
 * resize(double resizeFactor) method, the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */
public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(5, 5);
        Point2D point = new Point2D(8, 8);
        Circle circle = new Circle(center, point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println("--------------------");
        MoveDirection moveDirection = new MoveDirection(5,2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println("--------------------");
        MoveDirection moveDirection1 = new MoveDirection(8,16);
        point.move(moveDirection1);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println("--------after resize------------");
        circle.resize(2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());


    }

}
