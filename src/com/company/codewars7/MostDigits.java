package com.company.codewars7;

//Find the number with the most digits.
//
//        If two numbers in the argument array have the same number of digits, return the first one in the array.



public class MostDigits {
    public static int findLongest(int[] numbers) {
        int digits =0;
        int max =0;
        for (int i =0 ; i< numbers.length ; i++){
            int length = (int) (Math.log10(Math.abs(numbers[i])) + 1);
            if (length > digits){
                digits = length;
                max= numbers[i];
            }

        }
        return max;
    }
}


    public static int findLongest(int[] numbers) {

        int currentNumber = 0;

        for( int number : numbers ) {
            // Take absolute number to count digits, otherwise "-" will be counted
            if( Integer.toString( Math.abs(number) ).length() > Integer.toString( Math.abs(currentNumber) ).length() ) {
                currentNumber = number;
            }
        }
        return currentNumber;

    }

    public static int findLongest(int[] numbers) {
        int[] arrLength = new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            arrLength[i]=String.valueOf(Math.abs(numbers[i])).length();
        }
        int max = arrLength[0];
        for(int i=1; i<arrLength.length; i++){
            if(arrLength[i]>max)
                max=arrLength[i];}

        for(int i=0; i<arrLength.length; i++){
            if(arrLength[i]==max)
                return numbers[i];}
        return 0;
    }
