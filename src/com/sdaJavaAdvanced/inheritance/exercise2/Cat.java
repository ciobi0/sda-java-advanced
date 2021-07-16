package com.sdaJavaAdvanced.inheritance.exercise2;

public class Cat extends Animal{
    public Cat(String race, int age, double weight, String gender) {
        super("cat", race, age, weight, gender);
    }
    @Override
    public void yieldVoice(){
        System.out.println("miau miau");
    }
}
