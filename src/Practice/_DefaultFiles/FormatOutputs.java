package Practice._DefaultFiles;

public class FormatOutputs {
    public static void main(String[] args) {
        int num1 = 15;
        double num2 = 12345.90;
        String name = "Jessica";

        // format specifier %n creates a new line
        System.out.printf("This is a string.%nThis is a new line.%n");

        // format specifier %f is a placeholder for float variables
        System.out.printf("The number you entered is %d%n", num1);

        // format specifier %.2f sets precision for float variables
        System.out.printf("The number you entered is %.2f%n", num2);

        // format specifier %s is a placeholder for float variables
        System.out.printf("Hello %s, welcome to my world.%n", name);

        // Width Flags: Used to specify the total width
        System.out.printf("%8d%n", 12);
        System.out.printf("%8s%n", "Wendy");

        // The "thousands separator" flag(,)
        System.out.printf("%,.2f", num2);

    }
}
