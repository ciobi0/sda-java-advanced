package com.sdaJavaAdvanced.billapp;

public interface PayableType {

    int getValue();

    CurrencyType getCurrency();

    boolean isFake();
}
