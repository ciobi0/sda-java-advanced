package com.codingadvanced.ex17;

public class MeasurementConverter {
    public static double convert(double value, ConversionType conversionType) {
        return conversionType.getConverter().convert(value);
    }
}
