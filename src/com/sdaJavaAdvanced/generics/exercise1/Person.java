package com.sdaJavaAdvanced.generics.exercise1;

public class Person implements Comparable {
    private double height;

    public Person(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean compareTo(Person person) {
        return this.height > person.getHeight();
    }

}
