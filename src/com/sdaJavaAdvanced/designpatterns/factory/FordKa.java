package com.sdaJavaAdvanced.designpatterns.factory;

public class FordKa implements Car{
    @Override
    public String getModel() {
        return "Ka";
    }

    @Override
    public String getEngineCapacity() {
        return "900 ccc";
    }
}
