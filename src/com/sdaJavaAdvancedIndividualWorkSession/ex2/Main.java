package com.sdaJavaAdvancedIndividualWorkSession.ex2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that receives array size (n) from user (System.in).
 * Next , receive n numbers from user and put them in the array .
 * Implement bubble sort algorithm to sort this array in ascending order.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give the numbers of elements you want to bubbleSort: ");
        int arraySize = scanner.nextInt();
        int [] arrayToSort = new int [arraySize];
        System.out.println("give "+arraySize+" elements:");
        for (int i = 0; i<arraySize;i++){
            System.out.println("element "+(i+1)+": ");
            arrayToSort[i]=scanner.nextInt();
        }
        //bubble sort algorithm
        for (int i=0;i<arraySize-1;i++)
            for (int j=0; j<arraySize-i-1;j++)
                if (arrayToSort[j]>arrayToSort[j+1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j]=arrayToSort[j+1];
                    arrayToSort[j+1]=temp;
                }

        System.out.println(Arrays.toString(arrayToSort));

    }
}
