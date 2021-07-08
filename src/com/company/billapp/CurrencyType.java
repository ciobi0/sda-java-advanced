package com.company.billapp;

public enum CurrencyType {
    EUR("euro"),
    USD("dollar"),
    RON("leu");

    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
