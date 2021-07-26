package com.sdaJavaAdvanced.multitopic.billapp.ticket;

import com.sdaJavaAdvanced.multitopic.billapp.PayableType;

public abstract class Ticket implements PayableType {
    private String serialNumber;
    private String receivedSerialNumber;
    public Ticket(String serialNumber, String receivedSerialNumber){
        this.serialNumber=serialNumber;
        this.receivedSerialNumber=receivedSerialNumber;
    }
    @Override
    public boolean isFake(){
        return !(serialNumber.equals(receivedSerialNumber));
    }

    public String getReceivedSerialNumber() {
        return receivedSerialNumber;
    }
}
