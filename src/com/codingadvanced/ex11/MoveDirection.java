package com.codingadvanced.ex11;

public class MoveDirection {
    private double x;
    private double y;

    public MoveDirection(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public MoveDirection setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public MoveDirection setY(double y) {
        this.y = y;
        return this;
    }
}
