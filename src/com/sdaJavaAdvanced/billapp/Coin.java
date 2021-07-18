package com.sdaJavaAdvanced.billapp;

public abstract class Coin implements PayableType{
    private double weight;
    private double radius;
    private double receivedWeight;
    private double receivedRadius;
    public Coin(double weight, double radius, double receivedWeight, double receivedRadius){
        this.weight=weight;
        this.radius=radius;
        this.receivedWeight=receivedWeight;
        this.receivedRadius=receivedRadius;
    }
    @Override
    public boolean isFake(){
        return !(weight==receivedWeight && radius==receivedRadius);
    }

    public double getReceivedWeight() {
        return receivedWeight;
    }

    public double getReceivedRadius() {
        return receivedRadius;
    }
}
