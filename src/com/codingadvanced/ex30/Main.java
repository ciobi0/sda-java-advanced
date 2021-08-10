package com.codingadvanced.ex30;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that will read any file and save it in the same folder. The content and title of the new file should
 * be reversed (from the back).
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:/Users/cosmin/Documents/sda-java-advanced/abcd.txt");
        List<String> fileLines = Files.readAllLines(filePath);
        System.out.println(fileLines);
        String originalFileName = filePath.toFile().getName();
        String reversedFileName = new StringBuilder(originalFileName).reverse().toString();
        System.out.println(reversedFileName);
        Path newFilePath = filePath.getParent().resolve(reversedFileName);
        if (!newFilePath.toFile().exists()) {
            Files.createFile(newFilePath);
        }
        List<String> reversedFIleLines = fileLines.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList());
        Files.write(newFilePath,reversedFIleLines);

    }
}

