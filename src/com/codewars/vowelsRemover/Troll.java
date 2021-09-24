package com.codewars.vowelsRemover;

public class Troll {
    public static String disemvowel(String str){
        String str1="";
        str1 = str.replaceAll("[aeiou]", "");
        return str1;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("Remove all vowels."));
    }

}
