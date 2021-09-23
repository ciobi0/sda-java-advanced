package com.sdaJavaAdvanced.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Function<String, Integer> functionExample = s -> Integer.parseInt(s);
        System.out.println(functionExample.apply("785")+5);

        Supplier<String> supplierExample = () -> "supplier example";
        System.out.println(supplierExample.get());

        Consumer<String> consumerExample = s -> System.out.println(s.trim());
        consumerExample.accept("  trimmed  ");

        Predicate<Integer> predicate = value -> value>0;
        checkTest(predicate);
    }

    static void checkTest(Predicate<Integer> predicate){
        System.out.println(predicate.test(-8));
    }
}
