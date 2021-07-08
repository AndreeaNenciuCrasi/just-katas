package com.company.codewars6;

//Complete the method so that it formats the words into a single comma separated value. The last word should be separated by the word 'and' instead of a comma. The method takes in an array of strings and returns a single formatted string. Empty string values should be ignored. Empty arrays or null/nil values being passed into the method should result in an empty string being returned.
//
//        Kata.formatWords(new String[] {"ninja", "samurai", "ronin"}) => "ninja, samurai and ronin"
//        Kata.formatWords(new String[] {"ninja", "", "ronin"}) => "ninja and ronin"
//        Kata.formatWords(new String[] {}) => ""

public class FormatWordsIntoASentence {
    public static String formatWords(String[] words) {
        if (words == null || words.length == 0)
            return "";
        List<String> clearWords = new ArrayList<>(Arrays.asList(words));
        clearWords.removeIf(String::isEmpty);
        if (clearWords.isEmpty())
            return "";
        if (clearWords.size() == 1)
            return clearWords.get(0);
        String start = String.join(", ", clearWords.subList(0, clearWords.size() - 1));
        return start + " and " + clearWords.get(clearWords.size() - 1);
    }
}

    public static String formatWords(String[] words) {
        if (words == null) return "";
        String ans = Arrays.stream(words).filter( s -> !s.isEmpty() ).collect(Collectors.joining(", "));
        return ans.replaceAll(", ([^,]+)$", " and $1");
    }
