package Assignments.program7;

// Vannara Thong CIS-18A Chapter 8, p.831, #8.4
/**************************************************************
 * Programmer Name: Vannara Thong
 * Assignment Start: 04/22/2024 07:30PM
 * Assignment Completion:03/24/2024 9:00AM
 * Total Hours for Assignment: 1.5 Hours
 * Comments:  N/A
 **************************************************************/

/**************************************************************
 * 
 * GET AREA AND PERIMETER       
 * ____________________________________________________________
 * This program allows the user to get the area and perimeter
 * of a rectangle. This is done by prompting the user to enter
 * the length and width of the rectangle. The program then
 * calculates and displays the area and perimeter using these
 * values.
 * 
 * Calculation is based on this formula:
 * area = r.length * r.width;
 * perimeter = 2 * (r.length + r.width);
 * ____________________________________________________________
 * INPUT
 *  input                       : get length and width
 * 
 * OUTPUT
 *  r.length                    : Length of rectangle
 *  r.width                     : Width of rectangle
 *  area                        : Total results
 *  perimeter                   : Total results
 * 
 **************************************************************/

import java.util.Scanner;

public class Rectangle {

    float length = 0;
    float width = 0;

    public static float setLength(float length) {
        Scanner input = new Scanner(System.in);
        while (length < 1 || length > 20) {
            System.out.printf("Enter numbers larger than 0.0 and less than 20.0 for Length: ");
            length = input.nextFloat();
        }
        return length;
    }

    public static float setWidth(float width) {
        Scanner input = new Scanner(System.in);
        while (width < 1 || width > 20) {
            System.out.printf("Enter numbers larger than 0.0 and less than 20.0 for Width: ");
            width = input.nextFloat();
        }
        return width;
    }

    public void getLength(float length) {
        System.out.printf("The Length is: %.2f\n", length);
    }

    public void getWidth(float width) {
        System.out.printf("The Width is: %.2f\n", width);
    }

    public static void main(String[] args) {
        System.out.println("Testing Rectangle Class");
        Rectangle r = new Rectangle();
        r.length = setLength(r.length);
        r.width = setWidth(r.width);
        r.getLength(r.length);
        r.getWidth(r.width);

        // Calculate Area and Perimeter
        float area = r.length * r.width;
        float perimeter = 2 * (r.length + r.width);

        System.out.printf("The Area is: %.2f%nThe Perimeter is: %.2f%n", area, perimeter);
        System.out.println("\nThank you for using the Rectangle application.\n" + "Time of calculation is "
                + java.time.LocalDate.now() + " | " + java.time.LocalTime.now());
        System.exit(0);
    }
}
