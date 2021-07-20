package com.sdaJavaAdvanced.streams.courseexample;

import java.util.List;

//List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
//- Print All Courses individually
//- Print Courses Containing the word "Spring"
//- Print Courses Whose Name has at least 4 letters
//- Print the number of characters in each course name
public class Main {
    public static void main(String[] args) {
        List<String> courses = List.of(
                "Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"
        );

        //courses.stream().forEach(course -> System.out.println(course));
        courses.stream().filter(course -> course.contains("Spring"))
                        .forEach(course -> System.out.println(course));
        System.out.println("------------------------------------");
        courses.stream().forEach(course -> System.out.println(course));
        System.out.println("------------------------------------");
        courses.stream().filter(word -> word.length()>4)
                .forEach(word -> System.out.println(word));
        System.out.println("------------------------------------");
        courses.stream().forEach(word -> System.out.println(word.length()));
        System.out.println("------------------------------------");
        courses.stream().sorted((word1,word2) -> Integer.compare(word2.length(),word1.length()))
                        .findFirst().ifPresent(word -> System.out.println(word));
    }
}
