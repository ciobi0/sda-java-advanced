package com.sdaJavaAdvanced.inheritance.exercise2;

public class Dog extends Animal{
    public Dog(String race, int age, double weight, String gender) {
        super("dog", race, age, weight, gender);
    }
    @Override
    public void yieldVoice(){
        System.out.println("ham ham");
    }

}
