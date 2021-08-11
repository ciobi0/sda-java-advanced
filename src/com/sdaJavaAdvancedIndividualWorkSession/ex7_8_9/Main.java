package com.sdaJavaAdvancedIndividualWorkSession.ex7_8_9;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create Employee class with id, name and salary fields .
 * Create necessary methods and constructor .
 * Create 3 instances of the Employee class and add them to a list.
 * Using streams , find first Employee that is not null and has salary of at least 30000.
 * If not found , throw exception
 * <p>
 * exercise 8
 * Based on employees list from previous exercise , using streams create new list with
 * employees sorted by name
 * <p>
 * exercise 9
 * Based on employees list from exercise 7, using streams get a number representing
 * maximum salary of all employees
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Emp1", 45000);
        Employee employee2 = new Employee("Emp2", 25000);
        Employee employee3 = new Employee("Emp3", 55000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        Employee emp = employees.stream()
                .filter(Objects::nonNull)
                .filter(employee -> employee.getSalary() >= 30000)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found!"));

//        List<Employee> employeesSortByName = employees.stream()
//                .sorted((emp1, emp2) -> emp2.getName().compareTo(emp1.getName()))
//                .collect(Collectors.toList());
//        System.out.println(employeesSortByName);
        List<Employee> employeesSortByName = employees.stream()
                .sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder()))
                .collect(Collectors.toList());
        System.out.println(employeesSortByName);

//        int maximumSalary = employees
//                .stream()
//                .max(Comparator.comparingInt(Employee::getSalary))
//                .get()
//                .getSalary();
        int maximumSalary = employees.stream()
                        .map(Employee::getSalary)
                                .max(Comparator.naturalOrder())
                                        .orElseThrow(NoSuchElementException::new);


        System.out.println("max salary is: " + maximumSalary);


    }
}
