package com.sdaJavaAdvanced.billapp.banknote;

import com.sdaJavaAdvanced.billapp.CurrencyType;
import com.sdaJavaAdvanced.billapp.banknote.Banknote;

public class BanknoteEur100 extends Banknote {

    public BanknoteEur100(int receivedLength, int receivedWidth) {
        super(10, 5, receivedLength, receivedWidth);
    }

    @Override
    public int getValue() {
        return 100;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
