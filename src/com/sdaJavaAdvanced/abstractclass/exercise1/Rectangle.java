package com.sdaJavaAdvanced.abstractclass.exercise1;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        super(4);
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
