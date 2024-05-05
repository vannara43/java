package Practice.WarmUp;

import java.util.Scanner;

public class _2Inputs {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Your name is " + name);
    }
}
