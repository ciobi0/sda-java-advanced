package com.sdaJavaAdvanced.designpatterns.decorator;

public class OffRoadCarr implements Car {
    @Override
    public void assemble() {
        System.out.println("offroad car assembled");
    }
}
