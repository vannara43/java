package assignments;

import java.util.Scanner;

public class ProgramOne {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        // Prompt for input radius
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();

        // Display output
        System.out.printf("Diameter is %d%n", (2 * radius));
        System.out.printf("Circumference is %f%n", (2 * Math.PI * radius));
        System.out.printf("The area of the circle is %f%n", (Math.PI * Math.pow(radius, 2)));
        System.out.println(
                "Thank you for using the DCA of a Circle application.\nTime of calculation is 02/20/2024 12:42am");
        System.out.println("Once upon a time");
        System.out.println("There was");
        System.out.println("a dinosaur");
        System.exit(0);
    } // End of Main
}
