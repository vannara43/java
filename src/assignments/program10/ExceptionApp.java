package Assignments.program10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 05/16/2024 05:00PM
 * Assignment Completion:05/16/2024 6:30PM
 * Total Hours for Assignment: 1.5 Hours
 * Comments: N/A
 **************************************************************/

public class ExceptionApp {

    public static void main(String[] args) {

        // ExceptionA
        try {
            System.out.print("Enter a positive integer greater than 0: ");
            Scanner input = new Scanner(System.in);
            int pNum = input.nextInt();
            if (pNum < 0) {
                throw new ExceptionA();
            } else {
                System.out.println("You entered the number " + pNum);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        // ExceptionB
        try {
            System.out.print("Enter a negative integer less than 0: ");
            Scanner input = new Scanner(System.in);
            int nNum = input.nextInt();
            if (nNum > 0) {
                throw new ExceptionB();
            } else {
                System.out.println("You entered the number " + nNum);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // NullPointerException
        try {
            String s = null;
            if (s == null) {
                throw new NullPointerException();
            }

        } catch (NullPointerException e) {
            System.out.println(e);
        }

        // IOException
        try {
            File file = new File("input.txt");
            Scanner fileFile = new Scanner(file);
            if (fileFile.hasNextLine()) {
                System.out.println(fileFile.nextLine());
            } else {
                throw new IOException();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nThank you for using the Exception application.\n" + "Time of calculation is "
                + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        System.exit(0);
    }

}

class ExceptionA extends Exception {
}

class ExceptionB extends ExceptionA {
}
