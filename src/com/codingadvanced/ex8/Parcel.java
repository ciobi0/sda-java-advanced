package com.codingadvanced.ex8;

public class Parcel {
    float weight;
    boolean isExpress;
    private final int xLength;
    private final int yLength;
    private final int zLength;

    public Parcel(int xLength, int yLength, int zLength,float weight,boolean isExpress) {
        this.weight = weight;
        this.isExpress = isExpress;
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }
}
