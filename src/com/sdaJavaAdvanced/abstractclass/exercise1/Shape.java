package com.sdaJavaAdvanced.abstractclass.exercise1;

public abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return this.numSides;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "numSides=" + numSides +
                '}';
    }
}
