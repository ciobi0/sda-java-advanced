package com.sdaJavaAdvanced.billapp;

public class SodexoTicket extends Ticket{
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
