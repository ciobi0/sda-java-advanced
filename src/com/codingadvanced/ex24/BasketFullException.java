package com.codingadvanced.ex24;

public class BasketFullException extends RuntimeException{
    public BasketFullException() {
        super("Basket is full!");
    }
}
