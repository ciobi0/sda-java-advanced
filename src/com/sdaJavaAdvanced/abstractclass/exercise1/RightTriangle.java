package com.sdaJavaAdvanced.abstractclass.exercise1;

public class RightTriangle extends Shape{
    private int base;
    private int height;

    public RightTriangle(int base, int height) {
        super(3);
        this.base=base;
        this.height=height;
    }

    @Override
    public double getArea() {
        return (base*height)/2;
    }

    @Override
    public double getPerimeter() {
        return base+height+Math.sqrt(base*base + height*height);
    }

    @Override
    public String toString() {
        return super.toString()+
                "RightTriangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
