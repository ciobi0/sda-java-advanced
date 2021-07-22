package com.sdaJavaAdvanced.abstractclass.slidesexample;

public class Car extends Vehicle{
    private int numberOfWheels;
    public Car(int maxSpeed, int numberOfWheels) {
        super(maxSpeed);
        this.numberOfWheels=numberOfWheels;
    }

    @Override
    public void move() {
        System.out.println("car with "+numberOfWheels +" wheels is moving");
    }
}
