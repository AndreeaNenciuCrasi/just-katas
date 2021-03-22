package com.company.codewars6;

import java.util.regex.Pattern;

//Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
//
//        Examples
//        toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
//
//        toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
public class ConvertStringToCamelCase {
    static String toCamelCase(String s){
        String[] words = s.split("[_\\-]");
        s=words[0];
        for(int i=1; i<words.length; i++)
            s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        return s;
    }
}

    static String toCamelCase(String s){
        return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());
    }

    static String toCamelCase(String s){
        String result = "";
        char[] chars =  s.toCharArray();
        for(int ii = 0; ii < chars.length; ii++) {
            if(chars[ii] == '-' || chars[ii] == '_') {
                result += Character.toUpperCase(chars[ii + 1]);
                ii++;
            } else {
                result += chars[ii];
            }
        }
        return result;
    }
