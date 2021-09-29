package com.polymorphism.virtualMethodInvocation;

public class MountainBike extends Bicycle {
    private String suspension;

    public MountainBike(int cadence, int gear, int speed, String suspension) {
        super(cadence, gear, speed);
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }

    public MountainBike setSuspension(String suspension) {
        this.suspension = suspension;
        return this;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The MountainBike has a " + getSuspension() + " suspension.");
    }
}
