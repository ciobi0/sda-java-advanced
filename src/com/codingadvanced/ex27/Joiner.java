package com.codingadvanced.ex27;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... values) {
//        String result = "";
//        for (int i = 0; i < values.length; i++) {
//            if (i == values.length - 1) {
//                result += values[i];
//            } else {
//                result += values[i] + separator;
//            }
//        }
//        return result;
        return String.join(
                separator,
                Arrays.asList(values)
                        .stream()
                        .map(value -> value.toString())
                        .collect(Collectors.toList())
        );
    }
}
