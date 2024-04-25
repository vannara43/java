// Vannara Thong CIS-18A Chapter 4, p.455, #4.17
/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 03/08/2024 09:00AM
 * Assignment Completion:03/08/2024 11:30AM
 * Total Hours for Assignment: 2.5 Hours
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

package assignments;

import java.util.Scanner;
import java.time.LocalDate;

@SuppressWarnings({ "unused", "resource" })

public class CalculatingSales {
    public static void main(String[] args) {
        // Variable Declarations
        Scanner input = new Scanner(System.in); // to use inputs
        double totalCost = 0.00; // Hold all calculated values

        // Prompt user to enter product number
        System.out.println("Enter product number(1-5 or 0 to stop)");
        int productID = input.nextInt(); // INPUT - Product ID

        // Ask user to enter quantity
        while (productID != 0) { // Check product ID is not equal to 0
            if (productID >= 1 && productID <= 5) {
                // Prompt user to enter a quantity number
                System.out.println("Enter quantity sold:");
                int quantity = input.nextInt(); // INPUT - quantity

                // Calculate product type and quantity
                switch (productID) {
                    case 1: // Calculate total cost for product 1
                        totalCost = quantity * 2.91;
                        break;
                    case 2: // Calculate total cost for product 2
                        totalCost = quantity * 4.50;
                        break;
                    case 3: // Calculate total cost for product 3
                        totalCost = quantity * 9.98;
                        break;
                    case 4: // Calculate total cost for product 4
                        totalCost = quantity * 4.49;
                        break;
                    case 5: // Calculate total cost for product 5
                        totalCost = quantity * 6.87;
                        break;
                }
            } else {
                // Promp user to enter 1-5
                System.out.println("Product number must be between 1 and 5.");
            }
            // Continue to prompt user to enter product number
            System.out.println("Enter product number(1-5 or 0 to stop)");
            productID = input.nextInt();
        }
        // Display results of total cost
        System.out.printf("Total value of all products sold is: $%.2f%n", totalCost);

        // End of program
        System.out.println("Thank you for using the Gas Mileage application.\n"
                + "Time of calculation is " + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        System.exit(0);
    }
}
