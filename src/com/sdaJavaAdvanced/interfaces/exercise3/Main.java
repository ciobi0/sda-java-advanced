package com.sdaJavaAdvanced.interfaces.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graphic graphic1 = new Line();
        Graphic graphic2 = new Square();
        Graphic graphic3 = new Text();
        List<Graphic> list = new ArrayList<>();
        list.add(graphic1);
        list.add(graphic2);
        list.add(graphic3);

        for (Graphic graphic : list){
            graphic.draw();
        }
    }
}
