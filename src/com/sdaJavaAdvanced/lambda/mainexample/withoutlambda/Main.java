package com.sdaJavaAdvanced.lambda.mainexample.withoutlambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static List<Person> personList = new ArrayList<>();
    static {
        personList.add(new Person("Andy","Limer",15));
        personList.add(new Person("Andy1","Limer",18));
        personList.add(new Person("Andy2","Limer",25));
        personList.add(new Person("Andy3","Limer",35));
    }

    public static void main(String[] args) {
        System.out.println("child persons:");
        printValidPersons(new ChildPersonValidation());
        System.out.println("adult persons");
        printValidPersons(new AdultPersonValidation());
    }
    private static void printValidPersons(Predicate<Person> validationPredicate){
        for (Person person : personList){
            if (validationPredicate.test(person)){
                System.out.println(person);
            }
        }
    }
}
