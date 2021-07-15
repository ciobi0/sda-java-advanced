package com.sdaJavaAdvanced.concurrency;

public class Main {
    public static void main(String[] args) {
        ThreadA thread1 = new ThreadA("first thread");
        ThreadA thread2 = new ThreadA("second thread");

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new ThreadGc());
        Thread thread4 = new Thread(new ThreadGc());

        thread3.start();
        thread4.start();


    }
}
