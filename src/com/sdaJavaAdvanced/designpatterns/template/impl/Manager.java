package com.sdaJavaAdvanced.designpatterns.template.impl;

public class Manager extends Worker {
    @Override
    protected void work() {
        System.out.println("working in office");
    }

    @Override
    protected void relax() {
        System.out.println("go to gym");
    }
}
