package com.sdaJavaAdvanced.designpatterns.template;

import com.sdaJavaAdvanced.designpatterns.template.impl.FireFighter;
import com.sdaJavaAdvanced.designpatterns.template.impl.Manager;
import com.sdaJavaAdvanced.designpatterns.template.impl.Postman;
import com.sdaJavaAdvanced.designpatterns.template.impl.Worker;

public class Main {
    public static void main(String[] args) {
        Worker postman = new Postman();
        Worker fireFighter = new FireFighter();
        Worker manager = new Manager();

       postman.printDailyRoutine();
       fireFighter.printDailyRoutine();
       manager.printDailyRoutine();
    }
}
