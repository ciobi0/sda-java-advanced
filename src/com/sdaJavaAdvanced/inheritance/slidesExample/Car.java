package com.sdaJavaAdvanced.inheritance.slidesExample;

public class Car extends Vehicle{
    private boolean convertible;

    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);
        this.convertible=convertible;
    }

    public boolean isConvertible(){
        return convertible;
    }

    @Override
    public String toString(){
        return super.toString()
                +", convertible="+convertible;
    }
}
