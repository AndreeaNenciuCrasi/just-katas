package com.company.codewars6;

For building the encrypted string:
        Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
        Do this n times!

        Examples:

        "This is a test!", 1 -> "hsi  etTi sats!"
        "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
        Write two methods:

        String encrypt(final String text, final int n)
        String decrypt(final String encryptedText, final int n)
        For both methods:
        If the input-string is null or empty return exactly this value!
        If n is <= 0 then return the input text.



public class SimpleEncryptionAlternatingSplit {

    public static String encrypt(final String text, final int n) {
        String out=text;
        for(int i=0; i<n; i++) {
            String temp="";
            for(int j=1; j<out.length(); j+=2) temp+=out.charAt(j);
            for(int j=0; j<out.length(); j+=2) temp+=out.charAt(j);
            out=temp;
        }
        return out;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String out=encryptedText;
        for(int i=0; i<n; i++) {
            String temp="";
            for(int j=0; j<out.length()/2; j+=1) temp+=""+out.charAt(out.length()/2+j)+out.charAt(j);
            out=temp+encryptedText.substring(encryptedText.length()/2*2);
        }
        return out;
    }}
