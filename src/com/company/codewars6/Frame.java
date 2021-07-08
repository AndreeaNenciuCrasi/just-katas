package com.company.codewars6;

//Alex is a devoted fan of snooker Masters and in particular, he recorded results of all matches. Help Alex to know the score of matches.
//
//        Hint:
//        A string with a score presented as follows: "24-79(72); 16-101(53); ..."
//        "24" - Points scored the first player;
//        "79" - the number of points of the second player.
//        "(72)" - the maximum score for one approach.
//        Also, the player's account may be expressed as 105(53,52):
//        "105" - points in the frame, "53" and "52" - two separate numbers(not float) maximum points in the frame.
//        Frames are separated by ";" and players score - "-"
//        It should count the number of frames won by one and another player, and output the data as a "[10,7]"


public class Frame {
    static int[] frame(String score) {
        int[] result = new int[2];
        for (var match : score.replaceAll("\\([^)]+\\)", "").split(";")) {
            var one = Integer.parseInt(match.substring(0, match.indexOf('-')).trim());
            var two = Integer.parseInt(match.substring(match.indexOf('-') + 1).trim());
            result[one > two ? 0 : 1]++;
        }
        return result;
    }
}

    public static int[] frame(String score) {
        score = score.replaceAll("\\([\\d,]+\\)", "");
        int cnt = 0;
        String[] arr = score.split("; ");
        for (int i = 0; i < arr.length; i++) {
            var aux  = arr[i].split("-");
            if (Integer.parseInt(aux[0]) > Integer.parseInt(aux[1]))
                cnt++;
        }
        return new int[] {cnt, arr.length - cnt};
    }
