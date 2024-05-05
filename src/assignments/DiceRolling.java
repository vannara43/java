// Vannara Thong CIS-18A Chapter 6, p.639, #6.17
/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 03/24/2024 07:00PM
 * Assignment Completion:03/24/2024 8:30AM
 * Total Hours for Assignment: 1.5 Hours
 * Comments:  N/A
 **************************************************************/

/**************************************************************
 * 
 * GET DICE STATS        
 * ____________________________________________________________
 * This program rolls 2 dices and gets information about how
 * many times the results occur. Also this programs give a 
 * chance result.
 * 
 * Calculation is based on this formula:
 * dice1 = 1 + randomNumbers.nextInt(6);
 * dice2 = 1 + randomNumbers.nextInt(6);
 * ____________________________________________________________
 * INPUT
 *  N/A
 * 
 * OUTPUT
 *  totals                      : Total results
 * 
 **************************************************************/

package Assignments;

import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {
        // Declare Variables
        Random randomNumbers = new Random(); // Random Object
        int dice1; // Result of dice 1
        int dice2; // Result of dice 2
        int[] totals = new int[13]; // List of sum

        // Initialize the array index to 0
        for (int i = 0; i < totals.length; i++) {
            totals[i] = 0;
        }

        // Rolling the dice
        for (int rolls = 0; rolls < 36000000; rolls++) {
            dice1 = 1 + randomNumbers.nextInt(6);
            dice2 = 1 + randomNumbers.nextInt(6);
            totals[dice1 + dice2]++;
        }
        System.out.printf("%5s%16s%10s%n", "Total", "Frequent time", "Chances");

        // ignore subscripts 0 and 1
        for (int k = 2; k < totals.length; k++) {
            int percent = totals[k] / (360000);
            System.out.printf("%5d%16d%10d\n", k, totals[k], percent);
        }

        // End of the game
        System.out.println("\nThank you for using the Dice Rolling application.\n" + "Time of calculation is "
                + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        System.exit(0);
    }
}
