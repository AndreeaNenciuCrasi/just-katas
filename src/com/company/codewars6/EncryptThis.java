package com.company.codewars6;

//Encrypt this!
//
//        You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:
//
//        Your message is a string containing space separated words.
//        You need to encrypt each word in the message using the following rules:
//        The first letter needs to be converted to its ASCII code.
//        The second letter needs to be switched with the last letter
//        Keepin' it simple: There are no special characters in input.
//        Examples:
//        Kata.encryptThis("Hello") => "72olle"
//        Kata.encryptThis("good") => "103doo"
//        Kata.encryptThis("hello world") => "104olle 119drlo"


public class EncryptThis {
    public static String encryptThis(String text) {
        StringBuilder enc = new StringBuilder();
        for (String word : text.split(" ")) {
            StringBuilder sb = new StringBuilder(word);
            int lastIdx = sb.length() - 1;
            if (lastIdx > 0) {
                char lastCh = sb.charAt(lastIdx);
                sb.setCharAt(lastIdx, sb.charAt(1));
                sb.setCharAt(1, lastCh);
            }
            enc.append(lastIdx < 0 ? "" : (byte)sb.charAt(0) + sb.substring(1)).append(" ");
        }
        return enc.toString().replaceFirst("\\s++$", ""); // trim tail only
    }
}


    public static String encryptThis(String text) {
        String[] arr = text.split(" ");
        for(int i=0; i<arr.length ; i++){
            if(arr[i]==""){continue;}

            else if(arr[i].length()<3){
                StringBuilder sb = new StringBuilder();
                int ascii = arr[i].charAt(0);
                sb.append(""+ascii);
                sb.append(arr[i].substring(1));
                arr[i] = sb.toString();
            }else{
                StringBuilder sb = new StringBuilder();
                String tempSecond=arr[i].substring(1, 2);
                String tempLast = arr[i].substring(arr[i].length()-1);
                int ascii = arr[i].charAt(0);
                sb.append(""+ascii);
                sb.append(tempLast);
                sb.append(arr[i].substring(2, arr[i].length()-1));
                sb.append(tempSecond);
                arr[i] = sb.toString();
            }
            System.out.println(arr[i]);
        }
        if(arr.length==1 && arr[0]=="") return "";
        String result="";
        for(int i=0; i<arr.length ; i++){
            result+=arr[i]+" ";
        }
        return result.trim();
    }

    public static String encryptThis(String text) {

        return text.length() == 0 ? text : Arrays.stream(text.split(" "))
                .map(s -> "" + (int) s.charAt(0)
                        + (s.length() > 2 ? s.charAt(s.length() - 1)
                        + s.substring(2, s.length() - 1)
                        + s.charAt(1) : s.substring(1)))
                .collect(Collectors.joining(" "));
    }
