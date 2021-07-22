package com.sdaJavaAdvanced.inheritance.slidesExample;

public class Vehicle {
    //encapsulation
    private int maxSpeed;

    //constructor
    public Vehicle(int maxSpeed) {
        this.maxSpeed=maxSpeed;
    }
    //getter for maxSpeed;
    // final variable = constant (can not be changed);
    // final method can not be override
    // final class can not be extended
    public final int getMaxSpeed(){
        return this.maxSpeed;
    }

    @Override
    public String toString(){
        return "Fields value: maxSpeed= "+maxSpeed;
    }
}
