package com.codingadvanced.ex37;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Create a class containing the standard static method main and a variable of type
 * Executor and using the factory method newFixedThreadPool of the Executors class to create a pool of 2 executors.
 * In iteration, add 10 ThreadPlaygroundRunnable objects from the previous task to the executor. Use any
 * string and current iteration number as the name.
 */
public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        for (int i =0; i<10; i++){
            executor.execute(new ThreadPlaygroundRunnable("name"+i));
        }
        ((ExecutorService)executor).shutdown();

    }
}
