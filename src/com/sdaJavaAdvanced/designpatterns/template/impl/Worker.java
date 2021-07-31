package com.sdaJavaAdvanced.designpatterns.template.impl;

import javax.sound.midi.Soundbank;

public abstract class Worker {

    public final void printDailyRoutine() {
        getUp();
        eatBreakfast();
        goToWork();
        work();
        returnHome();
        relax();
        sleep();
    }

    protected void getUp() {
        System.out.println("getting up at 7:00");
    }

    protected void eatBreakfast() {
        System.out.println("eating breakfast at 7:30");
    }

    protected void goToWork() {
        System.out.println("go to work at 8:00");
    }

    protected abstract void work();

    protected void returnHome() {
        System.out.println("coming home at 18:00");
    }

    protected void relax() {
        System.out.println("going for a walk 17:00 to 18:00");
    }

    protected  void sleep(){
        System.out.println("sleeping");
    }


}
