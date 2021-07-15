package com.sdaJavaAdvanced.concurrency.synchronization;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

//*You are the manager. You have 5 employees.
//Simulate the situation in which each of them comes at a different time to work.
//- Every employee, after getting to work, displays the information "<name: I came to work at <time HH:MM>."
//- Every 10 seconds, the employee displays „name: I'm still working!" c) Every 30 seconds, we release one of
// the employees to home (remember about stopping the thread!) and remove the employee from the „active employees list"
//- When you release your employee to home, print „, it's time to go home!"
//- *When you release a given employee, all of the others speed up. From that moment, display the information about work
// 2 seconds faster. f) ** The manager decides in which order release employees (e.g. through an earlier defined list)
public class Employee extends Thread {
    private static final AtomicLong SLEEP_TIME = new AtomicLong(10000);
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.printf("<%s: I came to work at <time %s>\n", name, Instant.now().toString());
        try {
            while (true) {
                Thread.sleep(SLEEP_TIME.get());
                System.out.println("I'm still working" + name);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void stopEmployee() {
        System.out.println("is time to go home" + name);
        if (SLEEP_TIME.get() > 21) {
            SLEEP_TIME.set(SLEEP_TIME.get() - 20);
        }
        stop();
    }
}
