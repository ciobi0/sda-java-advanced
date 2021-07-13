package com.sdaJavaAdvanced.generics.exercise3.model;

public class MobilePhone implements Identifiable {
    private String IMEI;
    private String brand;
    @Override
    public String getId() {
        return IMEI;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
