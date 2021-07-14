package com.sdaJavaAdvanced.collections.map.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write a program which count the number of each character occurring in a string.
//Read the string from the command line.
//Ex: {d=9, o=6, r=7, W=5}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("insert a string:");
        String input = scanner.nextLine();
        Map<Character, Integer> numberOfOcc = new HashMap<>();
        for (int i=0; i<input.length(); i++){
            char character = input.charAt(i);
            if(numberOfOcc.containsKey(character)){
                int value = numberOfOcc.get(character);
                numberOfOcc.put(character,value+1);
            }
            else{
                numberOfOcc.put(character,1);
            }
        }
        System.out.println(numberOfOcc);
    }
}
