package com.sdaJavaAdvanced.lambda.courseexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

//Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then prints
//them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
//- Input: Pesho Gosho Adasha
//- Output:
//  - Pesho
//  - Gosho
//  - Adasha
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert a phrase");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        List<String> newWords = new ArrayList<>();
        for (String word : words) {
            String newWord = word.trim();
            if (!newWord.isEmpty()) {
                newWords.add(newWord);
            }
        }

        processWords(
                newWords,
                word -> System.out.println(word),
                word -> word.toUpperCase(Locale.ROOT)
        );
    }
    public static void processWords(List<String> newWords,
                                    Consumer<String> wordConsumer,
                                    Function<String,String> wordTransformer)
    {
        for (String word : newWords){
            wordConsumer.accept(wordTransformer.apply(word));
        }
    }
}
