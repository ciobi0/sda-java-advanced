package com.inheritance.bicycle;

public class MountainBike extends Bicycle{
    private int seatHeight;

    public MountainBike(int seatHeight, int cadence, int gear, int speed) {
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                super.toString() +
                "seatHeight=" + seatHeight +
                '}';
    }
}
