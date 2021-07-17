package com.sdaJavaAdvanced.inheritance.exercise3;

public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean checkEquals(Person obj) {
        return (this.getName().equals(obj.getName()) &&
                this.getGender().equals(obj.getGender()));
    }
}
