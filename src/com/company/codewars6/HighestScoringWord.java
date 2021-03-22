package com.company.codewars6;

//Given a string of words, you need to find the highest scoring word.
//
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//        You need to return the highest scoring word as a string.
//
//        If two words score the same, return the word that appears earliest in the original string.
//
//        All letters will be lowercase and all inputs will be valid.


public class HighestScoringWord {
    public static String high(String s) {

        String winner = "";
        int highScore = 0;

        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }
            if (score > highScore) {
                winner = word;
                highScore = score;
            }
        }

        return winner;
    }
}

    public static String high(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int bestScore =0;
        int index=0;
        String[] words =s.split(" ");

        for(int i=0; i<words.length;i++){
            int score= 0;
            for(int y=0;y<words[i].length();y++){
                score+=1+alphabet.indexOf(words[i].charAt(y));
            }
            if(score>bestScore){
                bestScore=score;
                index=i;
            }
        }

        return words[index];
    }
