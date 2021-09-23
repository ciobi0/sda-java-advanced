package com.lambdaExpressions.calculator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculator {

    public static void main(String[] args) {
        Calculator myApp = new Calculator();

        IntegerMath addition = Integer::sum;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath multiplication = (a, b) -> a * b;
        IntegerMath division = (a, b) -> a / b;

        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
        System.out.println("40 - 2 = " + myApp.operateBinary(40, 2, subtraction));
        System.out.println("40 * 2 = " + myApp.operateBinary(40, 2, multiplication));
        System.out.println("40 / 2 = " + myApp.operateBinary(40, 2, division));

        BiFunction<Integer,Integer,Integer> add = Integer::sum;
        BiFunction<Integer,Integer,Integer> diff = (a, b) -> a - b;
        BiFunction<Integer,Integer,Integer> mult = (a, b) -> a * b;
        BiFunction<Integer,Integer,Integer> div = (a, b) -> a / b;

        System.out.println("40 + 2 = " + myApp.operateFunction(40, 2, add));
        System.out.println("40 - 2 = " + myApp.operateFunction(40, 2, diff));
        System.out.println("40 * 2 = " + myApp.operateFunction(40, 2, mult));
        System.out.println("40 / 2 = " + myApp.operateFunction(40, 2, div));

    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public int operateFunction(int a, int b, BiFunction<Integer, Integer, Integer> mapper){
        return mapper.apply(a, b);
    }
}
