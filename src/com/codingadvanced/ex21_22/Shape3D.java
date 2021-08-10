package com.codingadvanced.ex21_22;

public abstract class Shape3D extends Shape implements Fillable{
    abstract double calculateVolume();

    @Override
    public void  fill(double water){
        if (calculateVolume()>water){
            System.out.println("not enough water");
        }
        if (calculateVolume()<water){
            System.out.println("too much water");
        } else {
            System.out.println("the shape is to the brim");
        }
    }
}
