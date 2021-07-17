package com.sdaJavaAdvanced.inheritance.exercise3;

//Create a class called Employee whose objects are records for an employee.
//
//This class will be a derived class of the class Person.
//An employee record has an employee's name (inherited from the class Person), an annual salary represented as a single
// value of type double, a year the employee started work as a single value of type int and a national insurance number,
// which is a value of type String.
//Your class should have a reasonable number of constructors and accessor methods, as well as an equals method.
// Write another class containing a main method to fully test your class definition.
//=================================================================================================================
//Suggest class structure (UML is optional) that could be used to represent the following:
// (a) A shop is composed of a series of departments, each with its own manager. There is also a store manager and
// many shop assistants. Each item sold has a price and a tax rate.
// (b) Vehicles are either motor-driven (cars, trucks, motorbikes) or human-powered (bikes, skateboards).
// All cars have 3 or 4 wheels and all bikes have two wheels. Every vehicle has an owner and a tax disc.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Employee("emp1", "male", 15000, 2020, "177545254");
        Employee person2 = new Employee("emp2", "female", 14500, 2021, "288454754");
        Person person3 = new Person("emp1","male");
        Employee person4 = new Employee("emp2", "female", 14540, 2020, "288454754");
        System.out.println("are obj equals? - " + person1.checkEquals(person2));
        System.out.println("is obj equals with himself? - " + person1.checkEquals(person1));
        System.out.println("is emp1 == person3? - "+person1.checkEquals(person3));
        System.out.println("is emp2 == emp4? - "+person2.checkEquals(person4));
    }
}
