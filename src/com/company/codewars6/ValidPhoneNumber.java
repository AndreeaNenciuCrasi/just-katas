package com.company.codewars6;

//Write a function that accepts a string, and returns true if it is in the form of a phone number.
//        Assume that any integer from 0-9 in any of the spots will produce a valid phone number.
//
//        Only worry about the following format:
//        (123) 456-7890 (don't forget the space after the close parentheses)
//
//        Examples:
//
//        validPhoneNumber("(123) 456-7890")  =>  returns true
//        validPhoneNumber("(1111)555 2345")  => returns false
//        validPhoneNumber("(098) 123 4567")  => returns false


import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        return Pattern.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$", phoneNumber);
    }
}

    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^(\\(\\d{3}\\)) \\d{3}-\\d{4}$");
    }

    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[(][1-9]{3}[)][ ][0-9]{3}[-][0-9]{4}");
    }

    public static boolean validPhoneNumber(String phoneNumber){
        String correct = "(###) ###-####";
        String number = phoneNumber.replaceAll("\\d", "#");
        if(number.equals(correct)){
            return true;
        }
        return false;
    }
