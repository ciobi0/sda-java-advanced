package com.sdaJavaAdvanced.designpatterns.template.impl;

public class Postman extends Worker {
    @Override
    protected void work() {
        System.out.println("deliver mails");
    }
}
