package com.sdaJavaAdvanced.concurrency;

//- Inherit a class from Thread and override the run( ) method.
//- Inside run( ), print a message, and then call sleep( ).
//  - Repeat this three times, then return from run( ).
//- Put a start-up message in the constructor.
//- Make a separate thread class that calls System.gc( ) and System.runFinalization( ) inside run( ), printing a message as it does so.
//- Make several thread objects of both types and run them to see what happens.
//- Experiment with different sleep times to see what happens.
public class ThreadA extends Thread {
    private String custom;

    public ThreadA(String custom) {
        this.custom = custom;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("hi I am threadA");
                Thread.sleep(3000);
                System.out.println(custom);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
