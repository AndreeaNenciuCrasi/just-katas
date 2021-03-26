package com.company.codewars6;

//Write Number in Expanded Form
//        You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        Kata.expandedFor12); # Should return "10 + 2"
//        Kata.expandedForm(42); # Should return "40 + 2"
//        Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.



public class WriteNumberInExpandedForm {
    public static String expandedForm(int num)
    {
        String result="";
        for(int i=10; i<num ; i*=10){
            int rest = num%i;
            result = (rest>0) ? " + " + rest + result : result;
            num = num-rest;
        }
        result =num +result;
        return result;
    }
}

    public static String expandedForm(int num)
    {
        String result ="";
        for(int i=1; num>0; i*=10){
            int x = num%10;
            result = x!=0 ? String.valueOf(x*i) +" + " +result: result;
            num=num/10;
        }
        return result.substring(0,result.length()-3);
    }
