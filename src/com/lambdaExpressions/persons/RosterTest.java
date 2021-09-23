package com.lambdaExpressions.persons;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterTest {


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

        //printPersonsWithinAgeRange(roster, 30, 40);

        // using anonymous class that implements CheckPerson interface
//        printPerson(roster, new CheckPerson() {
//            @Override
//            public boolean test(Person person) {
//                return person.gender == Person.Sex.MALE &&
//                        person.getAge() >= 18 &&
//                        person.getAge() <= 25;
//            }
//        });

        // using lambda expression for CheckPerson functional interface
        printPerson(roster, person -> person.gender == Person.Sex.MALE &&
                person.getAge() >= 18 &&
                person.getAge() <= 25);

        System.out.println("========same thing with Predicate interface===============");

        // using java.util.function Predicate functional interface
        printPersonWithPredicate(roster, p -> p.gender == Person.Sex.MALE &&
                p.getAge() >= 18 &&
                p.getAge() <= 25);

        System.out.println("========using Predicate and Consumer functional interfaces===============");

        processPerson(roster, p -> p.gender == Person.Sex.MALE &&
                        p.getAge() >= 18 &&
                        p.getAge() <= 25,
                Person::printPerson);

        System.out.println("========using Predicate, Function and Consumer functional interfaces===============");

        processPersonsWithFunction(roster,
                person -> person.gender == Person.Sex.MALE &&
                        person.getAge() >= 18 &&
                        person.getAge() <= 25,
                Person::getEmailAddress,
                System.out::println);

        System.out.println("========using aggregate operations on stream===============");

        // using aggregate operations that accepts lambda expressions as parameters
        // aggregate operations process elements of a stream: filter, map, forEach ...
        roster.stream()
                .filter(p -> p.gender == Person.Sex.MALE && p.getAge() <= 25 && p.getAge() >= 18)
                .map(Person::getEmailAddress)
                .forEach(System.out::println);

    }

    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person person : roster) {
            if (person.getAge() > low &&
                    person.getAge() < high) {
                person.printPerson();
            }
        }
    }

    public static void printPerson(List<Person> roster, CheckPerson test) {
        for (Person person : roster) {
            if (test.test(person)) {
                person.printPerson();
            }
        }
    }

    public static void printPersonWithPredicate(List<Person> roster, Predicate<Person> predicate) {
        for (Person person : roster) {
            if (predicate.test(person)) {
                person.printPerson();
            }
        }
    }

    public static void processPerson(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    public static void processPersonsWithFunction(List<Person> roster,
                                                  Predicate<Person> tester,
                                                  Function<Person, String> mapper,
                                                  Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    @FunctionalInterface
    interface CheckPerson {
        boolean test(Person person);
    }
}
