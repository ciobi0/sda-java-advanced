package com.sdaJavaAdvanced.inheritance.exercise1;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        super("circle",2*Math.PI*radius,Math.PI*radius*radius);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public void drawShape(){
        System.out.println("drawing a circle");
    }
}
