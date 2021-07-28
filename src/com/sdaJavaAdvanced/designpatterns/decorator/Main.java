package com.sdaJavaAdvanced.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car offRoadCar = new OffRoadCarr();
        Car carDecorator = new LuxuryCar(offRoadCar);
        carDecorator.assemble();
        offRoadCar.assemble();
        basicCar.assemble();

    }
}
