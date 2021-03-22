package com.example.codewars7;

Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.
//
//        a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
//
//        The four operators are "add", "subtract", "divide", "multiply".
//
//        A few examples:
//
//        arithmetic(5, 2, "add")      => returns 7
//        arithmetic(5, 2, "subtract") => returns 3
//        arithmetic(5, 2, "multiply") => returns 10
//        arithmetic(5, 2, "divide")   => returns 2.5
//        ArithmeticFunction.arithmetic(5, 2, "add")      => returns 7
//        ArithmeticFunction.arithmetic(5, 2, "subtract") => returns 3
//        ArithmeticFunction.arithmetic(5, 2, "multiply") => returns 10
//        ArithmeticFunction.arithmetic(5, 2, "divide")   => returns 2

public class FunctionThatDoesArithmetic {
    public static int arithmetic(int a, int b, String operator) {
        // your code here
        int result;
        switch(operator)
        {
            case "add":
                result=a+b;
                break;
            case "subtract":
                result=a-b;
                break;
            case "multiply":
                result=a*b;
                break;
            case "divide":
                result=a/b;
                break;
            default:
                throw new IllegalArgumentException("Invalid argument: " + operator);
        }

        return result;

    }
}

    public static int arithmetic(int m, int n, String s) {
        return s == "add" ? m + n : s == "multiply" ? m * n : s == "subtract" ? m - n : m / n;
    }


    public static int arithmetic(int a, int b, String operator) {
        if (operator.equals("add")) return a + b;
        if (operator.equals("subtract")) return a - b;
        if (operator.equals("multiply")) return a * b;
        return a / b;
    }
