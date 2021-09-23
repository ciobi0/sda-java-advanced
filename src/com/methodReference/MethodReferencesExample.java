package com.methodReference;

import java.util.function.BiFunction;

public class MethodReferencesExample {

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b){
        return a + b;
    }

    public String appendString2(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        MethodReferencesExample myApp = new MethodReferencesExample();

        // Calling the method mergeThings with lambda expression
        System.out.println(MethodReferencesExample.mergeThings("Hello ", "world!", (a, b) -> a + b));

        // Reference to a static method
        System.out.println(MethodReferencesExample.mergeThings("Hello ", "world!", MethodReferencesExample::appendStrings));

        // Reference to an instance method of a particular object
        System.out.println(MethodReferencesExample.mergeThings("Hello ", "world!", myApp::appendString2));

        // Reference to an instance method of an arbitrary object of a particular type
        System.out.println(MethodReferencesExample.mergeThings("Hello ", "world!", String::concat));
    }
}
