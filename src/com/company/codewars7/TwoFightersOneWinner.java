package com.example.codewars7;

//Create a function that returns the name of the winner in a fight between two fighters.
//
//        Each fighter takes turns attacking the other and whoever kills the other first is victorious. Death is defined as having health <= 0.
//
//        Each fighter will be a Fighter object/instance. See the Fighter class below in your chosen language.
//
//        Both health and damagePerAttack (damage_per_attack for python) will be integers larger than 0. You can mutate the Fighter objects.
//
//        Example:
//public class Fighter {
//    public String name;
//    public int health, damagePerAttack;
//    public Fighter(String name, int health, int damagePerAttack) {
//        this.name = name;
//        this.health = health;
//        this.damagePerAttack = damagePerAttack;
//    }
//}

public class TwoFightersOneWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a=fighter1, b=fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2; b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
            if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
        }
    }
}


    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean fa = fighter1.name.equals(firstAttacker);
        while(true){
            if(fighter1.health <= 0) return fighter2.name;
            if(fighter2.health <= 0) return fighter1.name;
            if(fa) fighter2.health -= fighter1.damagePerAttack;
            else fighter1.health -= fighter2.damagePerAttack;
            fa = !fa;
        }
    }


    static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        int health1 = (int) Math.ceil((double) fighter2.health / fighter1.damagePerAttack);
        int health2 = (int) Math.ceil((double) fighter1.health / fighter2.damagePerAttack);
        return health1 < health2 ? fighter1.name : health1 > health2 ? fighter2.name : firstAttacker;
    }
