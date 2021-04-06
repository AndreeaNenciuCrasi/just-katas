package com.company.codewars6;

//Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"
//
//        Your task is to process a string with "#" symbols.
//
//        Examples
//        "abc#d##c"      ==>  "ac"
//        "abc##d######"  ==>  ""
//        "#######"       ==>  ""
//        ""              ==>  ""


public class BackspacesInString {
    public String cleanString(String s) {
        int idx = s.indexOf("#");
        return idx < 0 ? s : idx == 0 ? cleanString(s.substring(1)) : cleanString(s.substring(0, idx-1) + s.substring(idx+1));
    }
}

    public String cleanString(String s) {
        int length = s.replaceAll("[^#]", "").length();
        for (int i = 0; i < length; i++) {
            s = s.replaceFirst(".#", "");
        }
        return s.replaceAll("#", "");
    }

    public String cleanString(String s)
    {
        while (s.contains("#"))
            s = s.replaceAll("^#+|[^#]#", "");

        return s;
    }
