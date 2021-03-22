package com.company.codewars6;

import java.util.stream.IntStream;Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

        Example:
        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
        The returned format must be correct in order to complete this challenge.

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}

    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");

        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }

        return phoneNumber;
    }

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }


    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        //int start = 0
        for(int i = 0;i<3;i++){
            sb.append(String.valueOf(numbers[i]));
        }
        sb.append(") ");
        for(int i = 3;i<6;i++){
            sb.append(String.valueOf(numbers[i]));
        }
        sb.append("-");
        for(int i= 6;i<10;i++){
            sb.append(String.valueOf(numbers[i]));
        }
        return sb.toString();
    }
