package com.codingadvanced.ex25;

public class Basket {
    private int items;

    void addToBasket() throws BasketFullException {
        if (items >= 10) {
            throw new BasketFullException();
        } else {
            items++;
        }
    }

    void removeFromBasket () throws BasketEmptyException {
        if (items < 1) {
            throw new BasketEmptyException();
        } else {
            items--;
        }
    }
}
