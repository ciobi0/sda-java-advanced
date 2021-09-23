package com.methodReference;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;


public class ConstructorReference {

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
            SOURCE sourceCollection, Supplier<DEST> collectionFactory) {
        DEST result = collectionFactory.get();
        for (T t : sourceCollection){
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Michael Smith", LocalDate.of(2003, 1, 20), Person.Sex.MALE, "michael@mail.com");
        Person person2 = new Person("Anna Grub", LocalDate.of(1981, 10, 5), Person.Sex.FEMALE, "anna@mail.com");
        Person person3 = new Person("John Abbe", LocalDate.of(1988, 10, 20), Person.Sex.MALE, "john@mail.com");
        Person person4 = new Person("Niels Sanders", LocalDate.of(1999, 12, 2), Person.Sex.MALE, "ns@mail.com");
        Person person5 = new Person("Diana Cris", LocalDate.of(1992, 7, 21), Person.Sex.FEMALE, "didi@mail.com");
        List<Person> roster = new ArrayList<>();
        roster.add(person1);
        roster.add(person2);
        roster.add(person3);
        roster.add(person4);
        roster.add(person5);

        // invoke transferElements method using lambda expression
        Set<Person> rosterSetLambda = transferElements(roster, () -> {return new HashSet<>();});
        for (Person p : rosterSetLambda){
            p.printPerson();
        }

        System.out.println("=========== same thing with constructor reference=============");
        // invoke transferElements with a constructor reference
        Set<Person> roasterSet = transferElements(roster, HashSet::new);
        for (Person p : roasterSet){
            p.printPerson();
        }

    }
}
