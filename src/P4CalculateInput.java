import java.io.*;

public class P4CalculateInput {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num1;
        int num2;
        int output;

        // Create a buffered reader to handle user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter two numbers and store them in variables
        System.out.println("Enter a number:");
        num1 = Integer.parseInt(br.readLine()); // Convert input from String to integer
        System.out.println("Enter another number:");
        num2 = Integer.parseInt(br.readLine()); // Read next line of input
        output = num1 * num2;
        System.out.println("Result is:" + output);
    }
}
