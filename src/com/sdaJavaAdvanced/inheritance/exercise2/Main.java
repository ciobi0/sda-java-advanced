package com.sdaJavaAdvanced.inheritance.exercise2;
//Create classes Dog and Cat.
//
//Move common methods and fields to the class Animal.
//Create method „yieldVoice”.
//Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
//Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
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
