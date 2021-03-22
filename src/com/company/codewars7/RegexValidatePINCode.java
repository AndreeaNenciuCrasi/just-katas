package com.example.codewars7;

//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//        If the function is passed a valid PIN string, return true, else return false.
//
//        Examples
//        "1234"   -->  true
//        "12345"  -->  false
//        "a234"   -->  false


public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}


    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6)
            return pin.chars().allMatch(Character::isDigit);
        return false;
    }


    public static boolean validatePin(String pin) {
        // Your code here...
        return (pin.length() == 4 || pin.length() == 6) && pin.replaceAll("[0-9]","").length() == 0;
    }
