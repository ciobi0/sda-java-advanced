package com.codingadvanced.ex17;

public class MeterToYardsConverter implements Converter {
    @Override
    public double convert(double measurement) {
        return measurement*1.093;
    }
}
