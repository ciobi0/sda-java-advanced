package com.sdaJavaAdvanced.designpatterns.factory;

public class FordFiesta implements Car{
    @Override
    public String getModel() {
        return "Fiesta";
    }

    @Override
    public String getEngineCapacity() {
        return "1200 ccc";
    }
}
