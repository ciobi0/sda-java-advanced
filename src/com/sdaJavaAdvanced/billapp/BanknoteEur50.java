package com.sdaJavaAdvanced.billapp;

public class BanknoteEur50 extends Banknote {

    public BanknoteEur50(int receivedLength, int receivedWidth) {
        super(10, 5, receivedLength, receivedWidth);
    }

    @Override
    public int getValue() {
        return 50;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
