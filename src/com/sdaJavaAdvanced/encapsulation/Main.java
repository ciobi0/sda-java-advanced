package com.sdaJavaAdvanced.encapsulation;

public class Main {
    public static void main(String[] args){
        Dog dog1=new Dog("bobby",3,"male","husky",5.4);
        Dog dog2=new Dog("female","bichon maltez");
        System.out.println(dog1);
        System.out.println(dog2);
        dog1.setAge(4);
        dog2.setWeight(1.72);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("dog1 age: "+dog1.getAge());
        System.out.println("dog2 weight: "+dog2.getWeight());
        dog1.setAge(-5);
        dog2.setWeight(-1.72);
        System.out.println("dog1 age: "+dog1.getAge());
        System.out.println("dog2 weight: "+dog2.getWeight());
    }
}
