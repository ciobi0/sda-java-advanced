package com.sdaJavaAdvanced.inheritance.exercise2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog("bichon",1,2.5,"female");
        Animal animal2 = new Cat("birman",1,0.5,"male");
        Animal[] animals = {animal1, animal2};
        for (Animal animal : animals){
            System.out.println(animal.getName());
            animal.yieldVoice();
        }
    }
}
