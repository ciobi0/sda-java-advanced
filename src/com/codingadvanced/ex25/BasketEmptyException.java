package com.codingadvanced.ex25;

public class BasketEmptyException extends Exception{
    public BasketEmptyException() {
        super("No more items!");
    }
}
