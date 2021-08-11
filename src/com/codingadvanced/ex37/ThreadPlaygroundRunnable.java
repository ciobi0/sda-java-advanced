package com.codingadvanced.ex37;

public class ThreadPlaygroundRunnable implements Runnable {
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " " + this.name + " " + i);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
    }
}
