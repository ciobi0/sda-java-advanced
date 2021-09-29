package com.polymorphism.virtualMethodInvocation;

public class RoadBike extends Bicycle {
    private int tireWidth;

    public RoadBike(int cadence, int gear, int speed, int tireWidth) {
        super(cadence, gear, speed);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public RoadBike setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
        return this;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The RoadBike has " + getTireWidth() + " mm tires.");
    }
}
