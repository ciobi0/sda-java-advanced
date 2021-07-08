package com.company.billapp;

public class Bill {
    private String serialNumber;
    private int amount;

    public Bill(String serialNumber, int amount) {
        this.serialNumber = serialNumber;
        this.amount = amount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
