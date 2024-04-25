public class P3Arithmetic {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int result1, result2, result4;
        result1 = num1 + num2; // Addition
        result2 = num1 * num2; // Multiplication
        float result3 = num2 % num1; // Modulus (remainder of division)
        result4 = num2 - num1; // Subtraction

        // Display Output
        System.out.println("Addition of Result is " + result1);
        System.out.println("Multiplication of Result is " + result2);
        System.out.println("Division of Result is " + result3);
        System.out.println("Subtraction of Result is " + result4);

        System.exit(0);
    }
}
