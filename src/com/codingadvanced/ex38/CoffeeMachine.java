package com.codingadvanced.ex38;

public class CoffeeMachine extends Thread {
    private int waterTank;

    public CoffeeMachine(int waterTank) {
        this.waterTank = waterTank;
    }

    @Override
    public void run() {
        while (true) {
            if (waterTank > 0) {
                System.out.println("coffee machine is preparing coffee");
                waterTank--;
                System.out.println("coffee is ready");
            } else {
                try {
                    System.out.println("water tank is empty");
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void fillWaterTank() {
        waterTank = 10;
    }
}
