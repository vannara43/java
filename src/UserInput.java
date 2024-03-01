import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("-------Input-------");
        System.out.println("-------------------");

        // Input to enter String
        System.out.println("Enter a string");
        String inputString = input.nextLine();

        // Input to enter Byte
        System.out.println("Enter a Byte");
        byte inputByte = input.nextByte();

        // Input to enter Char
        System.out.println("Enter a Char");
        char inputChar = input.next().charAt(0);

        // Input to enter Integer
        System.out.println("Enter an integer");
        int inputInt = input.nextInt();

        // Input to enter Float
        System.out.println("Enter a float");
        float inputFloat = input.nextFloat();

        // Input to enter Double
        System.out.println("Enter a double");
        double inputDouble = input.nextDouble();

        // Input to enter Boolean
        System.out.println("Enter a boolean");
        boolean inputBoolean = input.nextBoolean();
        System.out.println("-------------------");
        System.out.println("-------result------");
        System.out.println("-------------------");
        System.out.printf("String: %s%n", inputString);
        System.out.printf("Byte: %d%n", inputByte);
        System.out.printf("Char: %c%n", inputChar);
        System.out.printf("Integer: %d%n", inputInt);
        System.out.printf("Float: %f%n", inputFloat);
        System.out.printf("Double: %f%n", inputDouble);
        System.out.printf("Boolean: %b%n", inputBoolean);
    }
}
