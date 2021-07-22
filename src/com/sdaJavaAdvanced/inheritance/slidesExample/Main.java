package com.sdaJavaAdvanced.inheritance.slidesExample;

public class Main {
    public static void main(String[] args) {
        //exampleAssigningToParentTypeVariable();
        //exampleOverridingMethods();
        //examplePolymorphism();
        examplePassingParameters();
    }

    public static void exampleAssigningToParentTypeVariable() {
        Car myCar = new Car(85, false);
        Vehicle myCarVehicle = new Car(95, true);
    }

    public static void exampleOverridingMethods() {
        Vehicle vehicle = new Car(60, false);
        //will print toString override method from Car class
        System.out.println(vehicle);
    }

    public static void examplePolymorphism() {
        Vehicle vehicle = new Vehicle(80);
        Vehicle carVehicle = new Car(50, true);
        System.out.println(vehicle);//uses override Vehicle#toString()
        System.out.println(carVehicle);//invokes Car#toString() because of Polymorphism
    }

    public static void examplePassingParameters(){
        Car myCar = new Car(70,true);
        //passing a Car as a parameter - it is a vehicle as well.
        printMaxSpeed(myCar);
        //passing a Car as an Object - a Car is also an Object
        printWithPrefix("my car: ", myCar);
    }
    public static void printMaxSpeed(Vehicle vehicle){
        System.out.println("vehicle maxSpeed: "+vehicle.getMaxSpeed());
    }
    public static void printWithPrefix(String prefix, Object object){
        System.out.println(prefix + object);
    }

}
