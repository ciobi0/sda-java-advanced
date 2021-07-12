package com.sdaJavaAdvanced.billapp;

public class FakePayableException extends Exception {

    private PayableType payableType;

    public FakePayableException(PayableType payableType) {
        super("payable is fake");
        this.payableType = payableType;
    }

    public PayableType getPayableType() {
        return payableType;
    }
}
