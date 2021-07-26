package com.sdaJavaAdvanced.multitopic.billapp.coin;

import com.sdaJavaAdvanced.multitopic.billapp.CurrencyType;

public class CoinEur1 extends Coin {
    public CoinEur1(double receivedWeight, double receivedRadius) {
        super(10, 5, receivedWeight, receivedRadius);
    }

    @Override
    public int getValue() {
        return 1;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
