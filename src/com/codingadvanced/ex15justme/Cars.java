package com.codingadvanced.ex15justme;

public enum Cars {
    FERRARI(2000, 200),
    PORSCHE(3000, 180),
    MERCEDES(5000, 189),
    BMW(5600, 220),
    OPEL(2000, 90),
    FIAT(1800, 65),
    TOYOTA(3500, 170);
    private int price;
    private double power;

    Cars(int price, double power) {
        this.price = price;
        this.power = power;
    }

    boolean isPremium() {
        if (this.price > 2900) {
            return true;
        }
        return false;
    }

    boolean isRegular() {
        if (this.price <= 2900) {
            return true;
        }
        return false;
    }

    boolean isFasterThan(Cars car) {
        return this.compareTo(car) == 1;
    }

//
//    public int compareTo(Cars o1) {
//        int result;
//        if (this.power > o1.power) {
//            result = 1;
//        } else if (this.power == o1.power) {
//            result = 0;
//        } else {
//            result = -1;
//        }
//        return result;
//    }
}
