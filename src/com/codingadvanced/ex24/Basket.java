package com.codingadvanced.ex24;

public class Basket {
    private int items;

    void addToBasket() {
        if (items >= 10) {
            throw new BasketFullException();
        } else {
            items++;
        }
    }

    void removeFromBasket() {
        if (items < 1) {
            throw new BasketEmptyException();
        } else {
            items--;
        }
    }
}
