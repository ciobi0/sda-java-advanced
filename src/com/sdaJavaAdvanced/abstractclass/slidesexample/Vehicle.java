package com.sdaJavaAdvanced.abstractclass.slidesexample;

public abstract class Vehicle {
    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
public int getMaxSpeed(){return maxSpeed;}
    public abstract void move();
}
