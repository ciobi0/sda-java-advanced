package com.codingadvanced.ex10;

/**
 *
 * exercice 10
 *
 * Create a MoveDirection class with fields double x , double y as well as getters, setters and constructor.
 * Create a Movable interface with the move(MoveDirection moveDirection) method.
 * Implement the interface in the classes from the previous task ( Point2D and Circle ).
 * When the move(MoveDirection moveDirection) method is called,
 * the objects are to change their position based on the provided direction
 * ( MoveDirection Validate the offset by calling the other
 * Circle methods.
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


    }

}
