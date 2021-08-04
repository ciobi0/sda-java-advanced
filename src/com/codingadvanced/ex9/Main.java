package com.codingadvanced.ex9;

/**
 * Create a
 * Point2D class with fields double x , double y , getters, setters and constructor. Then create a Circle
 * class that will have a constructor:
 * Circle(Point2D center, Point2D point)
 * The first parameter specifies the center of the circle, the second is any point on the circle. Based on these
 * points, the Circle class is to determine:
 * • circle radius when calling double getRadius() method
 * • circle circumference when calling double getPerimeter() method
 * • circle area when calling double getArea() method
 * •* (challenging) three points on the circle every 90 degrees from the point given when calling the
 * List<Point2D> getSlicePoints() method
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(5, 5);
        Point2D point = new Point2D(8, 8);
        Circle circle = new Circle(center, point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }

}
