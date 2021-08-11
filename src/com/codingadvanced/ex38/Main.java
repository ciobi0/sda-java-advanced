package com.codingadvanced.ex38;

/**
 * Write an application that will simulate a coffee making machine. In the event that any coffee brewing service
 * finds an empty water tank, the thread should stop. When the water is refilled in the machine, the thread
 * should be excited.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine = new CoffeeMachine(10);
        coffeeMachine.start();
        for (int i = 0; i<10; i++){
            Thread.sleep(4000);
            coffeeMachine.fillWaterTank();
        }

        coffeeMachine.stop();
    }
}
