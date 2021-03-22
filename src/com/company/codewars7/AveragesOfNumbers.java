package com.company.codewars7;

//#Get the averages of these numbers
//
//        Write a method, that gets an array of integer-numbers and return an array of the averages of each integer-number and his follower, if there is one.
//
//        Example:
//
//        Input:  [ 1, 3, 5, 1, -10]
//        Output:  [ 2, 4, 3, -4.5]
//        If the array has 0 or 1 values or is null, your method should return an empty array.
//
//        Have fun coding it and please don't forget to vote and rank this kata! :-)


import java.util.stream.IntStream;

public class AveragesOfNumbers {
    public static double[] averages(final int[] numbers) {
        final double res[] = new double[(numbers == null || numbers.length == 0) ? 0 : numbers.length - 1];
        for (int i = 0; i < res.length; i++) res[i] = (numbers[i]+numbers[i+1]) / 2.0;
        return res;
    }
}


    public static double[] averages(int[] numbers)
    {

        if(numbers==null) return new double[0];
        if(numbers.length==0) return new double[0];
        if(numbers.length==1) return new double[0];
        double[] avg = new double[numbers.length-1];
        for(int i=0; i <numbers.length-1; i++){
            avg[i]=(double)(numbers[i]+numbers[i+1])/2;
        }
        return avg;
    }

    public static double[] averages(int[] numbers)
    {
        return numbers == null || numbers.length<2
                ? new double[0]
                : IntStream.range(0, numbers.length-1).mapToDouble(i -> (numbers[i] + numbers[i+1])/2d).toArray();
    }