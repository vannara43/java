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
 * Wager in Craps game       
 * ____________________________________________________________
 * This program accepts users input to enter wager. The program
 * will start a game of craps.
 * 
 * Calculation is based on this formula:
 * totalCost = quantity * 2.91;
 * totalCost = quantity * 4.50;
 * totalCost = quantity * 9.98;
 * totalCost = quantity * 4.49;
 * totalCost = quantity * 6.87;
 * ____________________________________________________________
 * INPUT
 *  wager                       : Input numbers for wagering
 * 
 * OUTPUT
 *  balance                     : Total balance to gamble
 * 
 **************************************************************/

package assignments;

import java.util.Random;
import java.util.Scanner;

public class CrapsGameModification {
    // create random number genertator
    private static final Random randomNumbers = new Random();

    // enum for continue won and lost
    private enum Status {
        CONTINUE, WON, LOST
    };

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    private static int balance; // user balance
    private static int wager; // wager to bet

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        balance = 1000; // Start with a balance of 1000

        do {
            // Prompt user to enter wager
            System.out.printf("Current balance is %d%n", balance);
            System.out.print("Enter wager (-1 to quit): ");
            wager = input.nextInt();

            if (wager >= 0) {
                if (wager > balance) {
                    System.out.println("You don't have enough money!");
                } else {
                    play(); // Start play function

                    if (balance <= 0) {
                        System.out.println("Sorry. You busted!");
                    } else {
                        System.out.println(chatter());
                    }
                }

                // reset the wager
                wager = 0;
                System.out.println();
            }
        } while ((wager != -1) && (balance > 0)); // terminate if the user quits or runs out of money
    }

    // plays one game of craps
    public static void play() {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE) { // not WON or LOST
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint) { // win by making point
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                    gameStatus = Status.LOST;
                }
            }
        }

        // display won or lost message and change the balance
        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
            balance += wager; // add wager to balance
        } else {
            System.out.println("Player loses");
            balance -= wager; // subtract wager to balance
        }

        System.out.println("\nThank you for using the Casino application.\n" + "Time of calculation is "
                + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        System.exit(0);
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int dice1 = 1 + randomNumbers.nextInt(6); // first die roll
        int dice2 = 1 + randomNumbers.nextInt(6); // second die roll

        int result = dice1 + dice2; // result of dice values

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n",
                dice1, dice2, result);

        return result;
    }

    // randomly chooses a phrase to respond to the player's action
    public static String chatter() {

        // Chatter will chat with user if balance is above 0
        switch (randomNumbers.nextInt(5)) {
            case 0: // Prompt 1
                return "Oh, you're going for broke huh?";
            case 1: // Prompt 2
                return "Aw cmon, take a chance!";
            case 2: // Prompt 3
                return "You're up big. Now's the time to cash in your chips!";
            case 3: // Prompt 4
                return "You're way too lucky! ";
            default: // Prompt default
                return "I'm betting all my money on you.";
        }
    }
}