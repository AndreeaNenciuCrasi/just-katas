package com.company.codewars6;

//Given a string, return the minimal number of parenthesis reversals needed to make balanced parenthesis.
//
//        For example:
//
//        solve(")(") = 2 Because we need to reverse ")" to "(" and "(" to ")". These are 2 reversals.
//        solve("(((())") = 1 We need to reverse just one "(" parenthesis to make it balanced.
//        solve("(((") = -1 Not possible to form balanced parenthesis. Return -1.
//        Parenthesis will be either "(" or ")".

public class SimpleReversedParenthesis {
    public static int solve(String expr){
        int len = expr.length();
        int ans;

        if (len % 2 != 0) {
            return -1;
        }
        int left = 0, right = 0;
        for (int i = 0; i < len; i++) {
            char ch = expr.charAt(i);

            if (ch == '(') {
                left++;
            }

            else {
                if (left == 0) {
                    right++;
                }
                else {
                    left--;
                }
            }
        }
        ans = (int)(Math.ceil((0.0 + left) / 2)
                + Math.ceil((0.0 + right) / 2));
        return ans;
    }
}
