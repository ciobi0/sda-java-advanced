package com.sdaJavaAdvanced.lambda.mainexample;

import com.sdaJavaAdvanced.lambda.mainexample.withoutlambda.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    private static List<com.sdaJavaAdvanced.lambda.mainexample.withoutlambda.Person> personList = new ArrayList<>();
    static {
        personList.add(new com.sdaJavaAdvanced.lambda.mainexample.withoutlambda.Person("Andy","Limer",15));
        personList.add(new com.sdaJavaAdvanced.lambda.mainexample.withoutlambda.Person("Andy1","Limer",18));
        personList.add(new com.sdaJavaAdvanced.lambda.mainexample.withoutlambda.Person("Andy2","Limer",25));
        personList.add(new Person("Andy3","Limer",35));
    }
//EXAMPLE WITH LAMBDA
    public static void main(String[] args) {
        System.out.println("persons adult:");
        printValidPersons(person -> person.getAge()>=18);
        System.out.println("persons child:");
        printValidPersons(person -> person.getAge()<18);
    }
    private static void printValidPersons(Predicate<Person> validationPredicate){
        for (Person person : personList){
            if (validationPredicate.test(person)){
                System.out.println(person);
            }
        }
    }
}
