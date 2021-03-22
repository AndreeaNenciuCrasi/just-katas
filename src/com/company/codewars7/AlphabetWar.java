package com.company.codewars7;

//Introduction
//        There is a war and nobody knows - the alphabet war!
//        There are two groups of hostile letters. The tension between left side letters and right side letters was too high and the war began.
//
//        Task
//        Write a function that accepts fight string consists of only small letters and return who wins the fight. When the left side wins return Left side wins!, when the right side wins return Right side wins!, in other case return Let's fight again!.
//
//        The left side letters and their power:
//
//        w - 4
//        p - 3
//        b - 2
//        s - 1
//        The right side letters and their power:
//
//        m - 4
//        q - 3
//        d - 2
//        z - 1
//        The other letters don't have power and are only victims.
//
//        Example
//        AlphabetWar("z");        //=> Right side wins!
//        AlphabetWar("zdqmwpbs"); //=> Let's fight again!
//        AlphabetWar("zzzzs");    //=> Right side wins!
//        AlphabetWar("wwwwwwz");  //=> Left side wins!


import java.util.HashMap;

public class AlphabetWar {
    public static String alphabetWar(String fight){
        int right = 0, left = 0;
        for (char c : fight.toCharArray()) {
            switch (c) {
                case 'w' : left += 4; break;
                case 'p' : left += 3; break;
                case 'b' : left += 2; break;
                case 's' : left += 1; break;

                case 'm' : right += 4; break;
                case 'q' : right += 3; break;
                case 'd' : right += 2; break;
                case 'z' : right += 1; break;
            }
        }
        if (left == right) return "Let's fight again!";
        return (left > right ? "Left" : "Right") + " side wins!";
    }
}

    public static String alphabetWar(String str){
        int left=0;
        int right=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='w')left+=4;
            else if(c=='p')left+=3;
            else if(c=='b')left+=2;
            else if(c=='s')left+=1;
            else if(c=='m')right+=4;
            else if(c=='q')right+=3;
            else if(c=='d')right+=2;
            else if(c=='z')right+=1;
        }
        if(left>right) return "Left side wins!";
        else if(left<right) return "Right side wins!";
        return "Let's fight again!";
    }


    public static String alphabetWar(String fight){
        HashMap<Character, Integer> letters = new HashMap<>();
        letters.put('w', 4);
        letters.put('p', 3);
        letters.put('b', 2);
        letters.put('s', 1);
        letters.put('m', -4);
        letters.put('q', -3);
        letters.put('d', -2);
        letters.put('z', -1);

        int total = 0;

        for (Character letter : fight.toCharArray()){
            if (letters.containsKey(letter))
                total += letters.get(letter);
        }

        if (total == 0) return "Let's fight again!";
        return total > 0 ? "Left side wins!" : "Right side wins!";
    }
}
