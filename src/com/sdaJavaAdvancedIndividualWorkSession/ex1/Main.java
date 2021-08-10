package com.sdaJavaAdvancedIndividualWorkSession.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Reverse a number using while Loop . The program will prompt user to input the number
 * and then it will reverse the same number using while loop
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert a number to be inverted:");
        int number=0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException exception){
            System.out.println(exception.getMessage());
        }
        char[] reversedNumber = Integer.toString(number).toCharArray();
        for (int i=reversedNumber.length-1;i>=0;i--){
            System.out.print(reversedNumber[i]);
        }

    }
}
