package com.codingadvanced.ex25;

public class BasketFullException extends Exception{
    public BasketFullException() {
        super("Basket is full!");
    }
}
