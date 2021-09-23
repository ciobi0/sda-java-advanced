package com.methodReference;

import java.time.LocalDate;

public class Person {

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        int age = LocalDate.now().getYear() - birthday.getYear();
        if (LocalDate.now().getMonthValue() == birthday.getMonthValue()) {
            if (LocalDate.now().getDayOfMonth() == birthday.getDayOfMonth()) {
                System.out.println("Happy birthday!");
                return age;
            } else {
                return LocalDate.now().getDayOfMonth() > birthday.getDayOfMonth() ? age : age - 1;
            }
        } else {
            return LocalDate.now().getMonthValue() > birthday.getMonthValue() ? age : age - 1;
        }
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public Sex getGender() {
        return gender;
    }

    public Person setGender(Sex gender) {
        this.gender = gender;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Person setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public void printPerson() {
        System.out.println("Name: " + name +
                ", Gender: " + gender.name() +
                ", Age" + getAge() +
                ", email: " + emailAddress);
    }

    public enum Sex {
        MALE,
        FEMALE
    }
}
