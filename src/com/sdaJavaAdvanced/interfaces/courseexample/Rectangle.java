package com.sdaJavaAdvanced.interfaces.courseexample;

public class Rectangle implements Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width){
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
    public void print(){
        System.out.println("Rectangle: "+this);
    }
}
