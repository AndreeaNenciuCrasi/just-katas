package com.company.codewars8;


//Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
//
//        For example,
//
//        [true,  true,  true,  false,
//        true,  true,  true,  true ,
//        true,  false, true,  false,
//        true,  false, false, true ,
//        true,  true,  true,  true ,
//        false, false, true,  true]
//        The correct answer would be 17.
//
//        Hint: Don't forget to check for bad values like null/undefined
public class CountingSheep {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean present : arrayOfSheeps) {
            if (present != null && present) {
                counter += 1;
            }
        }
        return counter;
    }
}


//    public int countSheeps(Boolean[] arrayOfSheeps) {
//        int count = 0;
//        //Iterate through the Sheep array
//        for(int i = 0; i < arrayOfSheeps.length; i++) {
//            //If not null and true, increment count
//            if(arrayOfSheeps[i] != null && arrayOfSheeps[i])
//                count++;
//        }
//        return count;
//    }
