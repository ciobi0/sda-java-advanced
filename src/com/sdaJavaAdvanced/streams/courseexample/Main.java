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
        System.out.println("------------------al courses individually------------------");
//- Print All Courses individually
        courses.stream().forEach(course -> System.out.println(course));
        System.out.println("----------------courses that contain \"Spring\"--------------------");
        //- Print Courses Containing the word "Spring"
        courses.stream().filter(course -> course.contains("Spring"))
                .forEach(course -> System.out.println(course));
        System.out.println("----------------courses whose name has at least 4 letters--------------------");
        courses.stream().filter(word -> word.length() >= 4)
                .forEach(word -> System.out.println(word));
        System.out.println("--------------number of characters in each course name----------------------");
        courses.stream().forEach(word -> System.out.println(word.length()));
        System.out.println("--------------course with the highest number of characters in his name----------------------");
        courses.stream().sorted((word1, word2) -> Integer.compare(word2.length(), word1.length()))
                .findFirst().ifPresent(word -> System.out.println(word));
    }
}
