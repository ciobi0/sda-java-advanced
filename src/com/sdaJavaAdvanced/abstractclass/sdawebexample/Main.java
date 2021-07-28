package com.sdaJavaAdvanced.abstractclass.sdawebexample;

public class Main {
    public static void main(String[] args) {
        DataParser dataParser = new CSVParser();
        dataParser.setData("list,150");
        System.out.println(dataParser.parse());
    }
}
