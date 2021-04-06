package com.company.codewars6;

//Given a variable n,
//
//        If n is an integer, Return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark. If n is negative, then the negative sign should be removed.
//
//        If n is not an integer, return an empty value.
//
//        Ex:
//
//        dashatize(274) -> '2-7-4'
//        dashatize(6815) -> '68-1-5'

public class DashatizeIt {
    public static String dashatize(int num) {
        return Integer.toString(num).replaceAll("([13579])","-$1-").replaceAll("--","-").replaceAll("^-","").replaceAll("-$","");
    }
}

    static String dashatize(int num) {
        return String.join("-", (num + "").substring(num < 0 ? 1 : 0).split("(?=[13579])|(?<=[13579])"));
    }

    public static String dashatize(int num) {
        return String.valueOf(num)
                .replaceAll("([13579])", "-$1-")
                .replaceAll("(?<=^)-+|-+(?=-|$)", "");
    }

    public static String dashatize(int num) {
        String line = String.valueOf(num);
        return line.replaceAll("([1|3|5|7|9])", "-$1-").replaceAll("--", "-").replaceAll("^-|-$", "");
    }