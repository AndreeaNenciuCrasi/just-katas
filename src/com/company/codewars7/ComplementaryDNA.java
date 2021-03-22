package com.example.codewars7;


import java.util.HashMap;
import java.util.Map;

//Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
//
//        If you want to know more http://en.wikipedia.org/wiki/DNA
//
//        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
//
//        More similar exercise are found here http://rosalind.info/problems/list-view/ (source)
//
//        DnaStrand.makeComplement("ATTGC") // return "TAACG"
//
//        DnaStrand.makeComplement("GTAT") // return "CATA"
public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        return dna.replace("A","B")
                .replace("C","D")
                .replace("T","A")
                .replace("G","C")
                .replace("B","T")
                .replace("D","G");
    }
}

//    private static Map<Character, String> DNAMap = new HashMap<>();
//
//    static {
//        DNAMap.put('A', "T");
//        DNAMap.put('T', "A");
//        DNAMap.put('C', "G");
//        DNAMap.put('G', "C");
//        }
//
//public static String makeComplement(String dna) {
//        return dna
//        .chars()
//        .mapToObj(val -> DNAMap.get((char)val))
//        .collect(Collectors.joining(""));
//        }

    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (char c : chars){
            switch (c){
                case 'A': {builder.append("T"); break;}
                case 'T': {builder.append("A"); break;}
                case 'C': {builder.append("G"); break;}
                case 'G': {builder.append("C"); break;}
            }
        }

        return builder.toString();
    }