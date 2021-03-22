package com.company.codewars8;

//Rock Paper Scissors
//        Let's play! You have to return which player won! In case of a draw return Draw!.
//
//        Examples:
//
//        rps('scissors','paper') // Player 1 won!
//        rps('scissors','rock') // Player 2 won!
//        rps('paper','paper') // Draw!

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if(p1 == p2) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }
}

    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
    }

    public static String rps(String p1, String p2) {
        // your code

        if (p1 == p2) {
            return "Draw!";
        }

        else if (p1 == "rock" && p2 == "scissors") {
            return "Player 1 won!";
        }

        else if  ( p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        }

        else if ( p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        }

        else {
            return "Player 2 won!";
        }
    }
