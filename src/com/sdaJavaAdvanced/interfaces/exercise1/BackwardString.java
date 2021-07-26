package com.sdaJavaAdvanced.interfaces.exercise1;

public class BackwardString implements CharSequence{

    private String myString;

    public BackwardString(String myString){
        this.myString=myString;
    }

    @Override
    public int length() {
        return myString.length();
    }

    @Override
    public char charAt(int index) {
        return myString.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return myString.subSequence(start,end);
    }

    public String reverseString(){
        String reversed="";
        for (int i=myString.length()-1;i>=0;i--){
            reversed+=myString.toCharArray()[i];
        }
        return reversed;
    }
}
