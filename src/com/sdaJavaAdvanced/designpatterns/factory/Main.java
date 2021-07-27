package com.sdaJavaAdvanced.designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("Ka");
        System.out.println(car.getModel());
    }
}
