package com.codingadvanced.ex9;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public Point2D setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Point2D setY(double y) {
        this.y = y;
        return this;
    }
}
