package com.company.codewars8;

//Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:
//
//        I love you
//        a little
//        a lot
//        passionately
//        madly
//        not at all
//        When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
//
//        Your goal in this kata is to determine which phrase the girls would say for a flower of a given number of petals, where nb_petals > 0.
public class ILoveYou {
    public static String howMuchILoveYou(int nb_petals) {

        String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};

        return arr[nb_petals%6];
    }
}

    public static String howMuchILoveYou(int nb_petals) {

        //your code here :)
        switch (nb_petals % 6){
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 0:
                return "not at all";
            default:
                return "";
        }
    }

    public static String howMuchILoveYou(int nb_petals) {
        nb_petals = nb_petals % 6;
        String[] strings = new String[]{"I love you",
                "a little",
                "a lot",
                "passionately",
                "madly",
                "not at all"};
        return nb_petals == 0 ? strings[5] : strings[nb_petals-1];
    }
}
