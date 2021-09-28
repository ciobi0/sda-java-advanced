package com.interfaces.charSequence;

/**
 * Write a class that implements the CharSequence interface,
 * implementation should return the string backwards
 */
public class BackwardString implements CharSequence {
    private String data;

    public BackwardString(String data) {
        this.data = data;
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public char charAt(int index) {
        return data.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return data.subSequence(start, end);
    }

    @Override
    public String toString() {
        return "BackwardString = " + data;
    }

    public String reverseCharSequence(){
        String result="";
        for (int i = length() - 1; i>=0; i--){
            result = result.concat(String.valueOf(charAt(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        BackwardString backwardString = new BackwardString("Methods are not required.");
        System.out.println(backwardString.reverseCharSequence());
    }
}
