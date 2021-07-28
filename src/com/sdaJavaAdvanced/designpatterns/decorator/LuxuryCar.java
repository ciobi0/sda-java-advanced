package com.sdaJavaAdvanced.designpatterns.decorator;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("adding future for luxury car");
    }
}
