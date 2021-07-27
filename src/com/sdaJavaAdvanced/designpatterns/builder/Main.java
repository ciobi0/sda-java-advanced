package com.sdaJavaAdvanced.designpatterns.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person.Builder personBuilder = new Person.Builder("24446", "last name", "first name", new Date(), "male")
                .setAddress("Str. National")
                .setPhoneNumber("025788745")
                .setReligion("catholic");


        if (args.length == 0) {
            personBuilder.setEmailAddress("ggg@gmail.com");
        }

        System.out.println(personBuilder.build());

        Person person = new Person.Builder("24446", "last name", "first name", new Date(), "male")
                .setAddress("Str. National")
                .setPhoneNumber("025788745")
                .setReligion("catholic")
                .build();

        System.out.println(person);
    }


}
