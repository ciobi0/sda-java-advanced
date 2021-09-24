package com.codewars.dna;

import java.util.Arrays;

/**
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with
 * one side of the DNA (string, except for Haskell); you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    chars[i] = 'T';
                    break;
                case 'T':
                    chars[i] = 'A';
                    break;
                case 'C':
                    chars[i] = 'G';
                    break;
                case 'G':
                    chars[i] = 'C';
                    break;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = makeComplement("ATTGC");
        System.out.println(s);
    }
}
