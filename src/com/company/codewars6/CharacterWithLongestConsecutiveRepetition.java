package com.company.codewars6;

//For a given string s find the character c (or C) with longest consecutive repetition and return:
//
//        Object[]{c, l};
//        where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.
//
//        For empty string return:
//
//        Object[]{"", 0}

public class CharacterWithLongestConsecutiveRepetition {
    public static Object[] longestRepetition(String str) {
        if(str=="") return new Object[]{"", 0};
        int len = str.length();
        int count = 0;

        // Find the maximum repeating character
        // starting from str[i]
        char res = str.charAt(0);
        for (int i=0; i<len; i++)
        {
            int cur_count = 1;
            for (int j=i+1; j<len; j++)
            {
                if (str.charAt(i) != str.charAt(j))
                    break;
                cur_count++;
            }

            // Update result if required
            if (cur_count > count)
            {
                count = cur_count;
                res = str.charAt(i);
            }
        }
        return new Object[]{res+"", count};
    }
}

public class Solution {
    private static final Pattern PATTERN = Pattern.compile("(.)(\\1*)");

    public static Object[] longestRepetition(String s) {
        Object[] result = new Object[]{"", 0};
        Matcher matcher = PATTERN.matcher(s);
        while (matcher.find()) {
            if (matcher.group().length() > (int) result[1]) {
                result[0] = matcher.group().substring(0, 1);
                result[1] = matcher.group().length();
            }
        }
        return result;
    }
}
