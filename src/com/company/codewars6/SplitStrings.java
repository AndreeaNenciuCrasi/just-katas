package com.company.codewars6;

//Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
//        Examples:
//
//        StringSplit.solution("abc") // should return {"ab", "c_"}
//        StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}

import java.util.ArrayList;
import java.util.List;

public class SplitStrings {
    public static String[] solution(String s) {
        s = (s.length() % 2 == 0)?s:s+"_";
        return s.split("(?<=\\G.{2})");
    }
}


    public static String[] solution(String s) {
        //Write your code here
        if(s.length()%2==1) s+="_";
        int n=s.length()/2;


        String[] sub=new String[n];
        for(int i=0;i<n;++i)
            sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);

        return sub;
    }


    public static String[] solution(String s) {
        List<String> result = new ArrayList<String>();
        if(s.length() %2 == 1){
            s = s+"_";
        }
        for(int i=0;i<s.length() - 1;i+=2){
            result.add(s.substring(i, i+2));
        }
        return result.toArray( new String[0] );
    }
