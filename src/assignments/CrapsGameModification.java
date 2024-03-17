// Vannara Thong CIS-18A Chapter 5, p.455, #5.33
/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 03/16/2024 08:15PM
 * Assignment Completion:03/16/2024 11:30PM
 * Total Hours for Assignment: 3.15 Hours
 * Comments:  N/A
 **************************************************************/

/**************************************************************
 * 
 * GET TOTAL PRODUCT SALES          
 * ____________________________________________________________
 * This program accepts users input to enter product ID and
 * quantity. The program will calculate and return a total
 * cost.
 * 
 * Calculation is based on this formula:
 * totalCost = quantity * 2.91;
 * totalCost = quantity * 4.50;
 * totalCost = quantity * 9.98;
 * totalCost = quantity * 4.49;
 * totalCost = quantity * 6.87;
 * ____________________________________________________________
 * INPUT
 *  productID                   : Input numbers for product
 *  quantity                    : Input numbers for quantity
 * 
 * OUTPUT
 *  totalCost                   : Total cost for all products
 * 
 **************************************************************/

/*
 5.33 (Craps Game Modification) Modify the craps program of Fig. 5.8 to
allow wagering. Initialize variable bankBalance to 1000 dollars. Prompt the
player to enter a wager. Check that wager is less than or equal to
bankBalance, and if it’s not, have the user reenter wager until a valid wager
is entered. Then, run one game of craps. If the player wins, increase
bankBalance by wager and display the new bankBalance. If the player
loses, decrease bankBalance by wager, display the new bank-Balance,
check whether bankBalance has become zero and, if so, display the
message "Sorry. You busted!" As the game progresses, display various
messages to create some “chatter,” such as "Oh, you're going for
broke, huh?" or "Aw c'mon, take a chance!" or "You're up big.
Now's the time to cash in your chips!". Implement the “chatter” as a
separate method that randomly chooses the string to display.
 */

package assignments;

import java.util.Random;
import java.util.Scanner;

public class CrapsGameModification {

    public static void main(String[] args) {
        System.out.println("Thank you for using the Casino application.\n"
                + "Time of calculation is " + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        System.exit(0);
    }
}