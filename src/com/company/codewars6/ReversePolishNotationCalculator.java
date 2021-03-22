package com.company.codewars6;

//Your job is to create a calculator which evaluates expressions in Reverse Polish notation.
//
//        For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.
//
//        For your convenience, the input is formatted such that a space is provided between every token.
//
//        Empty expression should evaluate to 0.
//
//        Valid operations are +, -, *, /.
//
//        You may assume that there won't be exceptional situations (like stack underflow or division by zero).


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReversePolishNotationCalculator {
    public double evaluate(String expr) {
        if (expr.length() == 0) return 0;
        List<String> list = new LinkedList<>(Arrays.asList(expr.split(" ")));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches("\\D")) {
                List<String> sublist = list.subList(i-2, i + 1);
                String result = calculate(sublist).toString();
                sublist.clear();
                list.add(i-2, result);
                i = 0;
            }
        }
        return Double.valueOf(list.get(list.size() - 1));
    }

    private Double calculate(List<String> list) {
        switch (list.get(2)) {
            case "+" : return Double.valueOf(list.get(0)) + Double.valueOf(list.get(1));
            case "-" : return Double.valueOf(list.get(0)) - Double.valueOf(list.get(1));
            case "*" : return Double.valueOf(list.get(0)) * Double.valueOf(list.get(1));
            case "/" : return Double.valueOf(list.get(0)) / Double.valueOf(list.get(1));
        }
        return 0d;
    }
}


    public double evaluate(String expr) {
        if (expr == null || expr.isEmpty()) return 0;
        LinkedList<String> stack = new LinkedList<>();
        String[] tokens = expr.split("\\s+");
        for (String token : tokens) {
            if (token.matches("[-+/*]"))
                stack.push(String.valueOf(apply(Double.parseDouble(stack.pop()),
                        Double.parseDouble(stack.pop()), token)));
            else
                stack.push(token);
        }
        return Double.parseDouble(stack.pop());
    }

    private static double apply(double number1, double number2, String operation) {
        switch (operation) {
            case "+": return number2 + number1;
            case "-": return number2 - number1;
            case "/": return number2 / number1;
            case "*": return number2 * number1;
            default: return -1;
        }
    }
