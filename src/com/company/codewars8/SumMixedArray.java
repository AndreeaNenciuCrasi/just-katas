package com.company.codewars8;

//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//        Return your answer as a number.

import java.util.List;

public class SumMixedArray {
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }
}

    public int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed)
        {
            if (element instanceof Integer)
            {
                sum += (Integer) element;
            }
            else if (element instanceof String){
                sum += Integer.parseInt( (String) element );
            }
        }
        return sum;
    }


    public int sum(List<?> mixed) {

        int x = 0;
        for(Object s: mixed){
            x+=Integer.parseInt(s.toString());
        }

        return x;
    }
