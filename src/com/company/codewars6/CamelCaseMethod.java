package com.company.codewars6;

//Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings. All words must have their first letter capitalized without spaces.
//
//        For instance:
//
//        camelCase("hello case"); // => "HelloCase"
//        camelCase("camel case word"); // => "CamelCaseWord"

public class CamelCaseMethod {
    public static String camelCase(String str) {
        // your code here
        String[] strings = str.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (String string : strings) {
            if (string.length()>0){
                stringBuilder.append(string.replaceFirst(string.substring(0, 1), string.substring(0, 1).toUpperCase()));
            }

        }
        return new String(stringBuilder);

    }
}

    public static String camelCase(String str) {
        String result = "";
        for(String s : str.trim().split(" ")){
            result += WordUtils.capitalize(s);
        }
        return result;
    }

    public static String camelCase(String str) {
        str = WordUtils.capitalize(str);
        str = str.replaceAll(" ","");
        return str;
    }

    public static String camelCase(String str) {
        for (char c = 'a'; c <= 'z'; c++){
            String regex = "^"+c+"|[\\ ]{1,}"+c, replaced = (c+"").toUpperCase();
            str = str.replaceAll(regex, replaced);
        }
        return str.trim();
    }