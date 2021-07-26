package com.sdaJavaAdvanced.multitopic.billapp.ticket;

import com.sdaJavaAdvanced.multitopic.billapp.CurrencyType;

public class SodexoTicket extends Ticket {
    public SodexoTicket(String receivedSerialNumber) {
        super("123456", receivedSerialNumber);
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
