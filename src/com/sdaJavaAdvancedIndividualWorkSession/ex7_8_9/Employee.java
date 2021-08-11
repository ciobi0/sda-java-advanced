package com.sdaJavaAdvancedIndividualWorkSession.ex7_8_9;

import java.util.Objects;

public class Employee {
    private static int count = 0;
    private final int id;
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        id=++count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id + "\n" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
