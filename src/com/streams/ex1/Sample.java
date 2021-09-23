package com.streams.ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {
    private final List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "TR"),
            new User(2, "Mary", "Patricia", 11, "EN"),
            new User(3, "John", "Michael", 7, "FR"),
            new User(4, "Jennifer", "Linda", 77, "TR"),
            new User(5, "William", "Elizabeth", 23, "US"),
            new User(6, "Sue", "Jackson", 11, "IT"),
            new User(7, "Michael", "Tommy", 37, "EN")
    );

    public static void main(String[] args) {
        Sample sample = new Sample();

        // Loop over each element of userList by using the forEach() operator
        // and then write to console
        sample.test1();
        // Loop over each element afterward manipulate the object and write to console
        sample.test2();
        // sort the list according to age property
        sample.test3();
        // sort the list according to age, firstName and lastName property
        sample.test4();
        // find out age average and maximum length of firstName
        sample.test5();
        // check if all ages are greater than 6
        sample.test6();
        // check if any of firstName property's first character is S
        sample.test7();
        // repackage the returned Collection object to another (list, set, linkedList, map)
        sample.test8();
        // count different nationalities on the list
        sample.test9();
        // drop out User whose firstName's first character is M letter and is older than 10
        sample.test10();
    }

    private void test1() {
        System.out.println("Test 1");
        userList.stream()
                .forEach(System.out::println);
    }

    private void test2() {
        System.out.println("Test 2");
        userList.stream()
                .map(u -> {
                    return new User(u.getId(),
                            "X " + u.getFirstName(),
                            "Y " + u.getLastName(),
                            u.getAge() + 10,
                            u.getNationality());
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private void test3() {
        System.out.println("Test 3");
        userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private void test4() {
        System.out.println("Test 4");
        userList.stream()
                .sorted(Comparator.comparing(User::getAge)
                        .thenComparing(User::getFirstName)
                        .thenComparing(User::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private void test5() {
        System.out.println("Test 5");
        double average = userList.stream()
                .mapToInt(User::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.println("average age is: " + average);
        int maxFirstNameLength = userList.stream()
                .mapToInt((value) -> {
                    return value.getFirstName().length();
                })
                .summaryStatistics()
                .getMax();
        System.out.println("max firstName is " + maxFirstNameLength);
    }

    private void test6() {
        System.out.println("Test 6");
        boolean isAllAgesGreaterThan6 = userList.stream()
                .allMatch(user -> user.getAge() > 6);
        System.out.println("is all ages greater than 6? " + isAllAgesGreaterThan6);
    }

    private void test7() {
        System.out.println("Test 7");
        boolean isAnyFirstNameStartWithS = userList.stream()
                .anyMatch(user -> user.getFirstName().charAt(0) == 'S');
        System.out.println("any firstName starts with S " + isAnyFirstNameStartWithS);
    }

    private void test8() {
        System.out.println("Test 8");
        List<User> list = userList.stream()
                .collect(Collectors.toList());
        Set<User> userSet = userList.stream()
                .collect(Collectors.toSet());
        List<User> linkedList = userList.stream()
                .collect(Collectors.toCollection(LinkedList::new));
        Map<Long, User> map = userList.stream()
                .collect(Collectors.toMap(user -> user.getId(), user -> user));
    }

    private void test9() {
        System.out.println("Test 9");
        long countNationalities = userList.stream()
                .map(User::getNationality)
                .distinct()
                .count();
        System.out.println("count different nationalities: " + countNationalities);
    }

    private void test10() {
        System.out.println("Test 10");
        userList.stream()
                .filter(user -> user.getFirstName().charAt(0) != 'M')
                .filter(user -> user.getAge() > 10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
