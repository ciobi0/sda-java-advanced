package com.codingadvanced.ex15;

public enum Car {
    FERRARI(100000, "400",true),
    PORSCHE(150000, "500",true),
    MERCEDES(25000, "350",true),
    BMW(35000,"380",true),
    OPEL(25000,"180",false),
    FIAT(15000,"170",false),
    TOYOTA(10000,"300",false);

    private int price;
    private String power;
    private boolean isPremium;

    public boolean isPremium() {
        return isPremium;
    }
    public boolean isRegular(){
        return !this.isPremium;
    }

    public boolean isFasterThan(Car car){
        int currentCarPower = Integer.parseInt(this.power);
        int receivedCarPower = Integer.parseInt(car.power);
        return Integer.compare(currentCarPower, receivedCarPower)==1;
    }
    Car(int price, String power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium=isPremium;
    }

    public int getPrice() {
        return price;
    }

    public String getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", power='" + power + '\'' +
                '}';
    }
}
