package com.sdaJavaAdvanced.multitopic.billapp;

public interface PayableType {

    int getValue();

    CurrencyType getCurrency();

    boolean isFake();
}
