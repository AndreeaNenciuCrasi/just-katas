package com.company.codewars8;

import java.util.Arrays;

//Messi goals function
//        Messi is a soccer player with goals in three leagues:
//
//        LaLiga
//        Copa del Rey
//        Champions
//        Complete the function to return his total number of goals in all three leagues.
//
//        Note: the input will always be valid.
//
//        For example:
//
//        5, 10, 2  -->  17
public class MessiGoalsFunction {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}

    public static int goals(int...array) {
        return Arrays.stream(array).sum();
    }
