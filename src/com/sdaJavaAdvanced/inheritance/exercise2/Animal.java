package com.sdaJavaAdvanced.inheritance.exercise2;

public class Animal {
    private String name;
    private String race;
    private int age;
    private double weight;
    private String gender;

    public Animal(String name, String race, int age, double weight, String gender){
        this.name=name;
        this.race=race;
        this.age=age;
        this.weight=weight;
        this.gender=gender;
    }
    public void yieldVoice(){
        System.out.println("animal yieldVoice");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}
