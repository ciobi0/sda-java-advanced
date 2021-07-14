package com.sdaJavaAdvanced.collections.map.ex2;

import java.util.*;

//Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
//Read the string from the command line.
//Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert a string");
        String input = scanner.nextLine();
        Map<Character, List<Integer>> mapOcc = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
//            if (!mapOcc.containsKey(character)) {
//                mapOcc.put(character, new ArrayList<>());
//           }
            mapOcc.putIfAbsent(character, new ArrayList<>());
            mapOcc.get(character).add(i);
        }
        System.out.println(mapOcc);
    }
}
