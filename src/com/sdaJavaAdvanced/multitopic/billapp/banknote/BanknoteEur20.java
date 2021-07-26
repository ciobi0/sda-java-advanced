package com.sdaJavaAdvanced.multitopic.billapp.banknote;

import com.sdaJavaAdvanced.multitopic.billapp.CurrencyType;

public class BanknoteEur20 extends Banknote {
    public BanknoteEur20(int receivedLength, int receivedWidth) {
        super(10, 5, receivedLength, receivedWidth);
    }

    @Override
    public int getValue() {
        return 20;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
