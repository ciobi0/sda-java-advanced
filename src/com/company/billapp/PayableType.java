package com.company.billapp;

public interface PayableType {

    int getValue();

    CurrencyType getCurrency();

    boolean isFake();
}
