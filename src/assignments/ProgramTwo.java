// Vannara Thong CIS-18A Chapter 3, p.356, #3.17
/**************************************************************
 * 
 * GET TOTAL MPG FOR CAR TRIPS                
 * ____________________________________________________________
 * This program accepts users input to get results of total
 * miles per gallon. This program will display the calculations
 * after every trip.
 * 
 * Calculation is based on this formula:
 * miles/gallons = mpg
 * totalMiles/totalGallon = total mpg
 * ____________________________________________________________
 * INPUT
 *  inputMiles                  : Input numbers for miles
 *  inputGallons                : Input numbers for gallons
 * 
 * OUTPUT
 *  tripMPG                     : Total MPG for one trip
 *  totalMPG                    : Total MPG for all trips
 * 
 **************************************************************/

/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 02/28/2024 01:00AM
 * Assignment Completion:02/28/2024 03:34AM
 * Total Hours for Assignment: 2 Hours
 * Comments:  N/A
 **************************************************************/
package Assignments;

import java.util.Scanner;
import java.time.LocalDate;

@SuppressWarnings({ "unused", "resource" })
public class ProgramTwo {
    public static void main(String[] args) {
        // Variable Declarations
        Scanner input = new Scanner(System.in);
        int miles = 0; // miles for trip
        int gallons = 0; // gallons for trip
        int totalMiles = 0; // total miles for all trip
        int totalGallons = 0; // total gallons for all trip
        boolean activeSearch = true; // search is active

        // While Loop: Continue until activeSearch is false
        while (activeSearch) {
            // Prompts user to enter miles
            System.out.print("Enter miles for each trip(enter \"-1\" to exit): ");
            // Input for miles
            int inputMiles = input.nextInt();
            // Store input to miles variable
            miles = inputMiles;

            // Validates that miles is not -1
            if (miles != -1) {
                // Prompts user to enter gallons
                System.out.print("Enter Gallon: ");
                // Input for gallons
                int inputGallons = input.nextInt();
                // Store input to gallons variable
                gallons = inputGallons;
            } else {
                // Program will end if -1
                activeSearch = false;
            }

            // Calculation to get miles per gallon
            if (activeSearch) {
                totalMiles += miles;
                totalGallons += gallons;
                double tripMPG = (double) miles / gallons;
                double totalMPG = (double) totalMiles / totalGallons;

                // Display output
                if (gallons != 0) { // Check value of gallons
                    System.out.printf("Total MPG for this trip: %.2f%n", tripMPG);

                    if (totalGallons != 0) { // Check value of totalGallons
                        System.out.printf("Total MPG so far: %.2f%n", totalMPG);
                    }
                }
            }
        }

        // End of program prompt
        System.out.println("Thank you for using the Gas Mileage application.\n"
                + "Time of calculation is " + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        // Exit program
        System.exit(0);
    }
}