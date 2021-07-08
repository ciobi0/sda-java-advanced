package com.company.billapp;

public abstract class Banknote implements PayableType{
    private int length;
    private int width;
    private int receivedLength;
    private int receivedWidth;

    public Banknote(int length, int width, int receivedLength, int receivedWidth) {
        this.length = length;
        this.width = width;
        this.receivedLength = receivedLength;
        this.receivedWidth = receivedWidth;
    }

    @Override
    public boolean isFake(){
        return !(length == receivedLength && width == receivedWidth);
    }
}
