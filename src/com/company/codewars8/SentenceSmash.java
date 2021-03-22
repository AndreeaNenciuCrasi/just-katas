package com.company.codewars8;

//Sentence Smash
//        Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!
//
//        Example
//        ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
public class SentenceSmash {
    public static String smash(String... words) {
        return String.join(" ", words);
    }
}

    public static String smash(String... words) {
        return words != null ? String.join(" ", words) : null;
    }

    public static String smash(String... words) {
        String s = "";
        for (String st: words){
            s += st + " ";
        }
        return s.trim();
    }
