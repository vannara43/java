package Practice._DefaultFiles;

import java.io.*;

class Overloading {
    int sum(int num1, int num2) {
        return (num1 + num2);
    }
}

public class P7MethodOverloading {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int x;
        int y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a integer:");
        x = Integer.parseInt(br.readLine()); // Reading integer from user input
        System.out.println("Please enter another integer:");
        y = Integer.parseInt(br.readLine()); // Reading another integer from user input

        Overloading ol = new Overloading();
        System.out.println("Result of your numbers are:" + ol.sum(x, y));
    }
}
