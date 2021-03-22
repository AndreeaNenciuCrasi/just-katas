package com.company.codewars8;

//When provided with a number between 0-9, return it in words.
//
//        Input :: 1
//
//        Output :: "One".
//
//        If your language supports it, try using a switch statement.


public class SwitchItUp {
    public static String switchItUp(int number)
    {
        switch (number)
        {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
        }
        return "Nine";
    }
}


    public static String switchItUp(int number) {
        return new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}[number];
    }