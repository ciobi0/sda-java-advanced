package com.sdaJavaAdvanced.billapp;

public class Bill {
    private String serialNumber;
    private int amount;
    CurrencyType currency;

    public Bill(String serialNumber, int amount, CurrencyType currency) {
        this.serialNumber = serialNumber;
        this.amount = amount;
        this.currency=currency;
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

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }
}
