package com.company.codewars8;

import java.util.Arrays;

//Sum all the numbers of the array (in F# and Haskell you get a list) except the highest and the lowest element (the value, not the index!).
//        (The highest/lowest element is respectively only one element at each edge, even if there are more than one with the same value!)
//
//        Example:
//
//        { 6, 2, 1, 8, 10 } => 16
//        { 1, 1, 11, 2, 3 } => 6
public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
        int min,max,sum;
        sum = min = max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            sum += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        return sum - min - max;
    }
}

    public static int sum(int[] numbers) {
        return (numbers == null || numbers.length <= 2) ? 0 : of(numbers).sum() - of(numbers).max().getAsInt() - of(numbers).min().getAsInt();
    }


    public static int sum(int[] numbers) {
        if(numbers == null || numbers.length <= 2) return 0;
        int sum = 0;
        Arrays.sort(numbers);
        for(int i = 1; i < numbers.length-1; i++){
            sum += numbers[i];
        }
        return sum;
    }

    {
public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;
        return Arrays.stream(numbers).sorted().skip(1).limit(numbers.length - 2).sum();
        }
