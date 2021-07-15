package com.sdaJavaAdvanced.concurrency.synchronization;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            EMPLOYEE_LIST.add(new Employee("Employee" + i));
        }

        for (Employee employee : EMPLOYEE_LIST) {
            employee.start();
        }

        for (Employee employee : EMPLOYEE_LIST) {
            try {
                Thread.sleep(30);
                employee.stopEmployee();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
