package com.codingadvanced.ex24;

public class BasketEmptyException extends RuntimeException{
    public BasketEmptyException() {
        super("No more items!");
    }
}
