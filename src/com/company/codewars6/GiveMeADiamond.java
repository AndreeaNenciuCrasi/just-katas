package com.company.codewars6;

//You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (\n).
//
//        Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
//
//        Examples
//        A size 3 diamond:
//
//        *
//        ***
//        *
//        ...which would appear as a string of " *\n***\n *\n"
//
//        A size 5 diamond:
//
//        *
//        ***
//        *****
//        ***
//        *
//        ...that is:
//
//        "  *\n ***\n*****\n ***\n  *\n"



public class GiveMeADiamond {
    public static String print(int n) {
        if (n % 2  == 0 || n <= 0) {return null;}
        StringBuffer expected = new StringBuffer();
        for (int i = 1; i <= n; i+=2) {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        for (int i = n - 2; i >= 1; i-=2) {
            expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        return expected.toString();
    }
}

    public static String print(int n) {
        if (n < 0 || (n & 1) == 0) return null;
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++) s.append(" ");
            for (int j = 0; j < i; j++) s.append("*");
            s.append("\n");
        }
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < i / 2 + 1; j++) s.append(" ");
            for (int j = 1; j < n - i; j++) s.append("*");
            s.append("\n");
        }
        return s.toString();
    }

    public static String print(int n) {
        if(n<0 || n%2==0) return null;
        String result= "";
        for(int i=1; i<=n; i+=2){
            result+=" ".repeat((n - i) / 2) + "*".repeat(i) + "\n";
        }
        for (int i = n - 2; i >= 1; i-=2) {
            result+=" ".repeat((n - i) / 2) + "*".repeat(i) + "\n";
        }


        return result;
    }
