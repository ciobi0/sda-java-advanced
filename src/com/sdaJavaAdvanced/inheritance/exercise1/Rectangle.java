package com.sdaJavaAdvanced.inheritance.exercise1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("rectangle", 2 * (length + width), length * width);
        this.length = length;
        this.width = width;
    }

    @Override
    public void drawShape() {
        System.out.println("drawing a rectangle");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("length should be a positive value");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("width should be a positive value");
        }
    }
}
