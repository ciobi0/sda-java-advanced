package com.codingadvanced.ex21;

public class Qube extends Shape3D {
    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return side * 12;
    }

    @Override
    double calculateArea() {
        return side * side * 6;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Qube{" +
                "side=" + side +
                '}'+super.toString();
    }
}
