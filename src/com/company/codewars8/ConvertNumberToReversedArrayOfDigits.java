package com.company.codewars8;

//Convert number to reversed array of digits
//        Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
//        Example:
//        348597 => [7,9,5,8,4,3]

public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String[] nums = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
        return result;
    }
}


//    public static int[] digitize(long n) {
//        //STEP 1: Find the length of n by converting it into a string.
//        String numStr = String.valueOf(n); //Convert n into a string first, called numStr
//        int digits[] = new int[numStr.length()]; //Create a new array of integer called "digits" and set it equal to numStr (a string's) length
//        int counter = 0;
//
//        for(int i = numStr.length() - 1; i >= 0; i--) { //We use numStr.length() - 1 because the first item in an array has index [0]
//            digits[i] = Integer.parseInt(Character.toString(numStr.charAt(counter++)));
//        }
//
//        return digits;
//    }
