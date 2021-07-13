package com.sdaJavaAdvanced.generics.exercise2;

public class Generic <T>{
    private T item;
    public Generic(T item){
        this.item=item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}


