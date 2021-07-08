package com.company.billapp;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private int amountCollected;
    private Bill bill;
    private List<PayableType> payableTypes = new ArrayList<>();


    public Payment(int amountCollected, Bill bill) {
        this.amountCollected = amountCollected;
        this.bill = bill;
    }

    public int getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(int amountCollected) {
        this.amountCollected = amountCollected;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public boolean isBillPayed() {
        return amountCollected >= bill.getAmount();
    }

    public void addNewPayableType(PayableType paymentType)throws FakePayableException {
        if (!paymentType.isFake()) {
            payableTypes.add(paymentType);
            amountCollected += paymentType.getValue();
        } else {
            throw new FakePayableException(paymentType);
        }
    }
}
