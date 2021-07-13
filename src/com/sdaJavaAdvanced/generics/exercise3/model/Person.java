package com.sdaJavaAdvanced.generics.exercise3.model;

public class Person implements Identifiable {
    private String CNP;
    private String name;

    @Override
    public String getId() {
        return CNP;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "CNP='" + CNP + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
