package com.inheritance.bicycle;

public class TestBicycle {
    public static void main(String[] args) {

        // implicit casting
        Bicycle bicycle = new MountainBike(10, 5, 4, 10);

        bicycle.applyBrake(2);
        bicycle.setCadence(6);
        bicycle.setGear(6);

        MountainBike myBicycle=null;
        // explicit casting
        if (bicycle instanceof MountainBike) {
            myBicycle = (MountainBike) bicycle;
        }
        myBicycle.setSeatHeight(15);
        System.out.println(myBicycle);
    }
}
