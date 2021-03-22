package com.company.codewars6;

//A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
//
//        Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DetectPangram {
    public boolean check(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
}


    public boolean check(String s){
        return new HashSet<>(Arrays.asList(s.toUpperCase().replaceAll("[^A-Z]","").split(""))).size() == 26;
    }


    public boolean check(String sentence){
        String x = sentence.toLowerCase();
        if(x.contains("a") && x.contains("b") && x.contains("c") && x.contains("d")
                && x.contains("e") && x.contains("f") && x.contains("g")
                && x.contains("h") && x.contains("i") && x.contains("j")
                && x.contains("k") && x.contains("l") && x.contains("m")
                && x.contains("n") && x.contains("o") && x.contains("p")
                && x.contains("q") && x.contains("r") && x.contains("s")
                && x.contains("t") && x.contains("u") && x.contains("v")
                && x.contains("w") && x.contains("x") && x.contains("y")
                && x.contains("z")){
            return true;
        }else{
            return false;
        }
    }


    public boolean check(String str){
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

                index = str.charAt(i) - 'a';
            else
                continue;
            mark[index] = true;
        }

        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);

        return (true);
    }

    public boolean check(String sentence){
        String str = sentence.toLowerCase().replaceAll("[^a-z]", "");
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }
