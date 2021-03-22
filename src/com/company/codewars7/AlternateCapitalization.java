package com.example.codewars7;

//Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
//
//        For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
//
//        The input will be a lowercase string with no spaces.
public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String u = s.toUpperCase();
        String o = "";
        String t = "";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                o += u.charAt(i);
                t += s.charAt(i);
            }else{
                o += s.charAt(i);
                t += u.charAt(i);
            }
        }
        return new String[]{o, t};
    }
}

    public static String[] capitalize(String s){
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        for(int i = 0; i<sb.length(); i+=2) sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        for(int i = 1; i<sb2.length(); i+=2) sb2.setCharAt(i, Character.toUpperCase(sb2.charAt(i)));
        return new String[]{sb.toString(), sb2.toString()};
    }

    public static String[] capitalize(String s){
        // Gorillaz - Do Ya Thing (2010)
        String[] result = new String[2];

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++){

            if (i%2 == 0){
                sb1.append(s.toUpperCase().charAt(i));
                sb2.append(s.toLowerCase().charAt(i));
            } else {
                sb1.append(s.toLowerCase().charAt(i));
                sb2.append(s.toUpperCase().charAt(i));
            }
        }
        result[0] = sb1.toString();
        result[1] = sb2.toString();
        return result;
    }
