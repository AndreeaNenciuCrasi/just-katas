package com.example.codewars7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//Task
//        Given a list of digits, return the smallest number that could be formed from these digits, using the digits only once (ignore duplicates).
//
//        Notes:
//        Only positive integers will be passed to the function (> 0 ), no negatives or zeros.
//        Input >> Output Examples
//        minValue ({1, 3, 1})  ==> return (13)
//        Explanation:
//        (13) is the minimum number could be formed from {1, 3, 1} , Without duplications
//
//        minValue({5, 7, 5, 9, 7})  ==> return (579)
//        Explanation:
//        (579) is the minimum number could be formed from {5, 7, 5, 9, 7} , Without duplications
//
//        minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
//        Explanation:
//        (134679) is the minimum number could be formed from {1, 9, 3, 1, 7, 4, 6, 6, 7} , Without duplications
public class FormMinimum {
    public static int minValue(int[] values){

        Set<Integer> uniqueDigits = new TreeSet<>();

        for(int i = 0; i < values.length; i++) {
            uniqueDigits.add(values[i]);
        }


        String output = "";
        for(Integer digit : uniqueDigits) {
            output += digit;
        }
        return Integer.valueOf(output);
    }

}

    public static int minValue(int[] values){
        Set<Integer> list = new HashSet<>();
        for (int number : values) {
            list.add(number);

        }
        StringBuilder sb = new StringBuilder();
        for (Integer number : list) {
            sb.append(number);
        }
        return Integer.valueOf(sb.toString());
    }


    import java.util.Arrays;
public class Minimum{

    public static int minValue(int[] values){

        return Integer.parseInt(Arrays.toString(Arrays.stream(values).distinct().sorted().toArray()).replaceAll("[^0-9]",""));
    }

}