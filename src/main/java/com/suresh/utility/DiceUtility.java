package com.suresh.utility;

public class DiceUtility {

    /*public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }*/
    public int rollDice(int numberOfDices) {
        int min = 1;
        int max =6 * numberOfDices;
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;



    }

}
