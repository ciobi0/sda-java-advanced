package com.codingadvanced.ex33;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Write a program that will display all photos (.png, .jpg) in a given directory and subdirectories.
 */
public class Main {
    public static void main(String[] args) {
        Path startPath = Paths.get("D:/");
        listImageNames(startPath);

    }

    static void listImageNames(Path path) {
        if (path.toFile().isDirectory()) {
            File[] files = path.toFile().listFiles();
            if (files != null) {
                for (File file : files){
                    listImageNames(file.toPath());
                }
            } else {
                System.out.println("directory " + path + " is empty");
            }
        } else {
            if (path.toFile().getName().endsWith(".png") || path.toFile().getName().endsWith(".jpg")) {
                System.out.println(path);
            }
        }
    }

}
