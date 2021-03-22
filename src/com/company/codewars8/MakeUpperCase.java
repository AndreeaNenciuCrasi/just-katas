package com.company.codewars8;

//Write a function which converts the input string to uppercase.


public class MakeUpperCase {
    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
}

    public static String MakeUpperCase(String str){
        char[] sc = str.toCharArray();
        String s = "";
        for(char c:sc){
            s+=Character.toUpperCase(c);
        }
        return s;

    }

    public static String MakeUpperCase(String str){
        String str1 = "abcdefghilmnopqrstuvzxyjkw";
        String str2 = "ABCDEFGHILMNOPQRSTUVZXYJKW";
        for (int k=0; k<str1.length(); k++){
            str=str.replace(str1.charAt(k),str2.charAt(k));
        }
        return str;
    }
