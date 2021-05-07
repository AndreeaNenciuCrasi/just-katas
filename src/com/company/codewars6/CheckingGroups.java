package com.company.codewars6;

//In English and programming, groups can be made using symbols such as () and {} that change meaning. However, these groups must be closed in the correct order to maintain correct syntax.
//
//        Your job in this kata will be to make a program that checks a string for correct grouping. For instance, the following groups are done correctly:
//
//        ({})
//        [[]()]
//        [{()}]
//        The next are done incorrectly:
//
//        {(})
//        ([]
//        [])
//        A correct string cannot close groups in the wrong order, open a group but fail to close it, or close a group before it is opened.
//
//        Your function will take an input string that may contain any of the symbols (), {} or [] to create groups.
//
//        It should return True if the string is empty or otherwise grouped correctly, or False if it is grouped incorrectly.


public class CheckingGroups {
    public static boolean groupCheck(String s) {
        int len;
        do {
            len = s.length();
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        } while (len != s.length());
        return s.length() == 0;
    }
}

    public static boolean groupCheck(String s) {
        long len;
        do {
            len = s.length();
            s = s.replaceAll("\\(\\)|\\{\\}|\\[\\]", "");
        } while (len > s.length());

        return s.isEmpty();
    }

    static boolean groupCheck(String s) {
        for (int i = s.length() / 2; i > 0; i--)
            s = s.replaceAll("\\(\\)|\\[]|\\{}", "");
        return s.isEmpty();
    }
