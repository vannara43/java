public class PrintFormat {
    public static void main(String[] args) {
        double num1 = 15.50;
        String name = "Jessica";

        // format specifier %n creates a new line
        System.out.printf("This is a string.%nThis is a new line.%n");

        // format specifier %f is a placeholder for float variables
        System.out.printf("The number you entered is %f%n", num1);

        // format specifier %.2f sets precision for float variables
        System.out.printf("The number you entered is %.2f%n", num1);

        // format specifier %s is a placeholder for float variables
        System.out.printf("Hello %s, welcome to my world.", name);
    }
}
