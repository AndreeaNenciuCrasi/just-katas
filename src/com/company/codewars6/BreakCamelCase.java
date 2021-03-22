package com.company.codewars6;

//Complete the solution so that the function will break up camel casing, using a space between words.
//
//        Example
//        solution("camelCasing")  ==  "camel Casing"

public class BreakCamelCase {
    class Solution {
        public static String camelCase(String input) {
            return input.replaceAll("([A-Z])", " $1");
        }
}

    public static String camelCase(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
        }
        return output;
    }

    public static String camelCase(String input) {
        StringBuilder builder = new StringBuilder();
        for(char c: input.toCharArray()){
            if(Character.isLowerCase(c)) builder.append(c);
            else builder.append(" "+c);
        }
        return builder.toString();
    }

    public static String camelCase(String input) {

        String x="";
        for(int i=0;i<input.length();i++)
        {
            if(Character.isUpperCase(input.charAt(i)))
            {
                x=x+" ";
            }
            x=x+input.charAt(i);

        }
        return x;
    }
