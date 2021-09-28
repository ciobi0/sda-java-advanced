package com.interfaces.charSequenceV2;

public class CharSequenceDemo implements CharSequence {
    private String s;

    public CharSequenceDemo(String s) {
        this.s = s;
    }

    private static int random(int max) {
        return (int) Math.round(Math.random() * (max + 1));
    }

    public static void main(String[] args) {
        CharSequenceDemo s =
                new CharSequenceDemo("Write a class that implements the CharSequence interface found in the java.lang package.");

        System.out.println("-----------------charAt() and length()------------------");
        // exercise charAt() and length()
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println("---------subSequence() and length()-------------");
        // exercise subSequence() and length()
        int start = random(s.length() - 1);
        int end = random(s.length() - 1 - start) + start;
        System.out.println(s.subSequence(start, end));
        System.out.println("-------------toString()------------");
        // exercise toString()
        System.out.println(s);
    }

    // If the string is backwards, the end is the beginning
    private int fromEnd(int i) {
        return s.length() - 1 - i;
    }

    @Override
    public int length() {
        return s.length();
    }

    @Override
    public char charAt(int i) {
        if ((i < 0) || (i > s.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return s.charAt(fromEnd(i));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > s.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }
        StringBuilder sub =
                new StringBuilder(s.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.s);
        return s.reverse().toString();
    }
}
