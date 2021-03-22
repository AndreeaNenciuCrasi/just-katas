package com.company.codewars6;

import java.util.Arrays;

//Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.
//
//        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//        If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
//
//        Examples
//        "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//        "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//        ""  -->  ""
public class YourOrderPlease {
    public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }
}

    public static String order(String words) {
        String[] strs = words.split(" ");
        Arrays.sort(strs, (String s1, String s2) -> s1.replaceAll("[a-zA-Z]","").compareTo(s2.replaceAll("[a-zA-Z]",""))  );
        String f = "";
        for(String st:strs) f+=st + " ";
        return f.substring(0,f.length()-1);
    }

    public static String order(String words) {
        if (words == "") return words;
        String newWords[] = new String[words.split(" ").length];
        for (String word : words.split(" ")) {
            int index = Integer.valueOf(word.replaceAll("[^0-9]", "")) - 1;
            newWords[index] = word;
        }
        return String.join(" ", newWords);
    }

    public static String order(String words) {
        String[] strs = words.split(" ");
        Arrays.sort(strs, (String s1, String s2) -> s1.replaceAll("[a-zA-Z]","").compareTo(s2.replaceAll("[a-zA-Z]",""))  );
        return String.join(" ", Arrays.asList(strs));
    }


    public static String order(String words) {
        if(words.length()==0 || words == null) return "";
        String [] arr = words.split(" ");
        String[] temp = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j].contains(String.valueOf(i+1))){
                    temp[i]=arr[j];
                }
            }
        }
        return String.join(" ", temp);
    }