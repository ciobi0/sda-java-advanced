package com.sdaJavaAdvanced.abstractclass.slidesexample;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(120, 4);
        System.out.println("vehicle max speed: "+vehicle.getMaxSpeed());
        vehicle.move();
    }
}
