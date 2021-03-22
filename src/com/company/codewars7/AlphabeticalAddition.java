package com.company.codewars7;


//Your task is to add up letters to one letter.
//
//        The function will be given an array of single character Strings, each one being a letter to add.
//
//        Notes:
//        Letters will always be lowercase.
//        Letters can overflow (see second to last example of the description)
//        If no letters are given, the function should return 'z'
//        Examples:
//        addLetters("a", "b", "c") = "f"
//        addLetters("a", "b") = "c"
//        addLetters("z") = "z"
//        addLetters("z", "a") = "a"
//        addLetters("y", "c", "b") = "d" // notice the letters overflowing
//        addLetters() = "z"
public class AlphabeticalAddition {
    public static String addLetters(String... letters) {
        String abc = "zabcdefghijklmnopqrstuvwxyz";
        int sum = 0;
        for (int i = 0; i < letters.length; i++) {
            sum += abc.indexOf(letters[i]);
        }
        return String.valueOf(abc.charAt(sum % 26));
    }
}

    public static String addLetters(String... letters) {
        String alphabet = "zabcdefghijklmnopqrstuvwxy";
        int sum = 0;
        for(String str : letters) sum += str.charAt(0) - 'a' + 1;
        return alphabet.charAt(sum % 26) + "";
    }
