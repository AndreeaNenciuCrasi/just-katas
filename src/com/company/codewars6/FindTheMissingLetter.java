package com.company.codewars6;

#Find the missing letter

        Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

        You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
        The array will always contain letters in only one case.

        Example:

        ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'

        ["a","b","c","d","f"] -> "e"
        ["O","Q","R","S"] -> "P"
        (Use the English alphabet with 26 letters!)

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array){
        char expectableLetter = array[0];
        for(char letter : array){
            if(letter != expectableLetter) break;
            expectableLetter++;
        }
        return expectableLetter;
    }
}

    public static char findMissingLetter(char[] array)
    {
        for(int i=1; i< array.length; i++){
            char prev = array[i-1];
            char current = array[i];
            if(current-prev != 1){
                return (char)(prev+1);
            }
        }
        return ' ';
    }
