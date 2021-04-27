package com.company.codewars6;

//Given a lowercase string that has alphabetic characters only and no spaces, return the highest value of consonant substrings. Consonants are any letters of the alphabet except "aeiou".
//
//        We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.
//
//        For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"
//
//        -- The consonant substrings are: "z", "d" and "cs" and the values are z = 26, d = 4 and cs = 3 + 19 = 22. The highest is 26.
//        solve("zodiacs") = 26
//
//        For the word "strength", solve("strength") = 57
//        -- The consonant substrings are: "str" and "ngth" with values "str" = 19 + 20 + 18 = 57 and "ngth" = 14 + 7 + 20 + 8 = 49. The highest is 57.

public class ConsonantValue {
    public static int solve(final String s) {
        int sum = 0, maxsum = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if ("aeiou".indexOf(c)>=0) sum = 0;
            else {
                sum += c-'a'+1;
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
}

    static int solve(String s) {
        int max = 0;
        for (var sil : s.replaceAll("[aeiou]", " ").split(" ")) {
            int value = sil.chars().map(c -> c - 96).sum();
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public static int solve(final String s) {
        int maxSum = 0;
        for (String consonantSequence : s.split("[aeiou]+")) {
            int sum = consonantSequence.chars().sum() - (consonantSequence.length() * 96);
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
