package com.suresh.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

// File: src/test/java/com/suresh/utility/DiceUtilityTest.java


public class DiceUtilityTest {

    @Test
    public void testRollDiceWithOneDice() {
        DiceUtility diceUtility = new DiceUtility();
        int result = diceUtility.rollDice(1);
        System.out.println("result: " + result);
        assertTrue(result >= 1 && result <= 6, "Result should be between 1 and 6");
    }

    @Test
    public void testRollDiceWithMultipleDices() {
        DiceUtility diceUtility = new DiceUtility();
        int numberOfDices = 3;
        int result = diceUtility.rollDice(numberOfDices);
        System.out.println("result: " + result);
        assertTrue(result >= 1 && result <= 6 * numberOfDices, "Result should be between 1 and " + (6 * numberOfDices));
    }

    @Test
    public void testRollDiceWithZeroDices() {
        DiceUtility diceUtility = new DiceUtility();
        int result = diceUtility.rollDice(0);
        assertTrue(result == 1, "Result should be 1 when number of dices is 0");
    }
}
