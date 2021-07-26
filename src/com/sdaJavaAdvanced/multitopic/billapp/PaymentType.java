package com.sdaJavaAdvanced.multitopic.billapp;

public enum PaymentType {
    B("banknote"),
    C("coin"),
    T("ticket");
    private String name;
    PaymentType(String name){
        this.name=name;
    }
    }

