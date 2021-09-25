package com.interfaces.timeClient;

public class TestSimpleTimeClient {
    public static void main(String[] args) {

        SimpleTimeClient simpleTimeClient = new SimpleTimeClient();

        System.out.println(simpleTimeClient);
        simpleTimeClient.setTime(22,10,50);
        System.out.println(simpleTimeClient);
        simpleTimeClient.setDate(10,1,2022);
        System.out.println(simpleTimeClient);
        simpleTimeClient.setDateAndTime(30,10,1984,22,12,10);
        System.out.println(simpleTimeClient.getLocalDateTime());
        System.out.println(simpleTimeClient.getZonedDateTime("+03:00"));
    }
}
