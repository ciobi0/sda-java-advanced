package com.codingadvanced.ex21_22;



public class Triangle extends Shape {
    private double hypotenuse;
    private double base;
    private double height;

    public Triangle(double hypotenuse, double base, double height) {
        this.hypotenuse = hypotenuse;
        this.base = base;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        return height + hypotenuse + base;
    }

    @Override
    double calculateArea() {
        return base * height / 2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "hypotenuse=" + hypotenuse +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
