package com.codingadvanced.ex17;

public enum ConversionType {
    METERS_TO_YARDS(new MeterToYardsConverter()),
    YARDS_TO_METERS(yards -> yards * 0.914),
    CENTIMETERS_TO_INCHES(centimeters -> centimeters * 2.5),
    INCHES_TO_CENTIMETERS(inch -> inch * 0.25),
    KILOMETERS_TO_MILES(kilometer -> kilometer * 1.6),
    MILES_TO_KILOMETERS(miles -> miles * 0.8);

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }
}
