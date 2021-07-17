package com.sdaJavaAdvanced.inheritance.exercise3;

public class Employee extends Person {
    private double annualSalary;
    private int yearOfEmployment;
    private String nationalSecurityNumber;

    public Employee(String name, String gender, double annualSalary, int yearOfEmployment, String nationalSecurityNumber) {
        super(name, gender);
        this.annualSalary = annualSalary;
        this.yearOfEmployment = yearOfEmployment;
        this.nationalSecurityNumber = nationalSecurityNumber;
    }

    public boolean checkEquals(Employee obj){
        return (this.getName().equals(obj.getName()) &&
                this.getGender().equals(obj.getGender()) &&
                this.nationalSecurityNumber.equals(obj.nationalSecurityNumber));
    }


}
