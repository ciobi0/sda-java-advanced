package com.sdaJavaAdvanced.billapp;

public class CoinEur2 extends Coin{
    public CoinEur2(double receivedWeight, double receivedRadius) {
        super(10, 5, receivedWeight, receivedRadius);
    }

    @Override
    public int getValue() {
        return 2;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
