package com.sdaJavaAdvanced.abstractclass.sdawebexample;

public class Data {
    private String info;
    private int value;

    public Data(String info, int value) {
        this.info = info;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "info='" + info + '\'' +
                ", value=" + value +
                '}';
    }
}
