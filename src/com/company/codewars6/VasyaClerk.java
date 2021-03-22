package com.company.codewars6;

The new "Avengers" movie has just been released! There are a lot of people at the cinema box office standing in a huge line. Each of them has a single 100, 50 or 25 dollar bill. An "Avengers" ticket costs 25 dollars.

        Vasya is currently working as a clerk. He wants to sell a ticket to every single person in this line.

        Can Vasya sell a ticket to every person and give change if he initially has no money and sells the tickets strictly in the order people queue?

        Return YES, if Vasya can sell a ticket to every person and give change with the bills he has at hand at that moment. Otherwise return NO.

        Examples:
        Line.Tickets(new int[] {25, 25, 50}) // => YES
        Line.Tickets(new int[] {25, 100}) // => NO. Vasya will not have enough money to give change to 100 dollars
        Line.Tickets(new int[] {25, 25, 50, 50, 100}) // => NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)

public class VasyaClerk {
    public static String Tickets(final int[] peopleInLine) {
        int k25=0, k50=0;
        for (int n : peopleInLine) {
            if (n==25) k25++; // correct
            else if (n==50 && k25>0) { k50++; k25--; } // $25 change for $50
            else if (n==100 && k50>0 && k25 > 0) { k50--; k25--; } // $50+$25 change for $100
            else if (n==100 && k25>2) k25-=3; // 3x$25 change for $100
            else return "NO";
        }
        return "YES";
    }
}
