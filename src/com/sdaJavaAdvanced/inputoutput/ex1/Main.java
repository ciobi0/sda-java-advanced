package com.sdaJavaAdvanced.inputoutput.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//Write a Java program to find the longest word in a text file.
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/cosmin/Documents/sda-java-advanced/src/com/sdaJavaAdvanced/inputoutput/ex1/file");
        if (!path.toFile().exists()) {
            System.out.println("file not found");
            return;
        }
        List<String> lines = Files.readAllLines(path);
        String max = "";
        int numberOfWords=0;
        int numberOfComas=0;
        for (String line : lines) {
            for (String word : line.split(" ")) {
                if (word.length() > max.length()) {
                    max = word;
                }
                numberOfWords++;
                if(word.contains(",")){
                    numberOfComas++;
                }
            }
        }
        System.out.println("max word found is:" + max);
        System.out.println("number of words= "+numberOfWords);
        System.out.println("number of commas= "+numberOfComas);
    }
}
