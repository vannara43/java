import java.io.*;

public class P18MatrixAddition {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1[][] = new int[2][2];
        int num2[][] = new int[2][2];
        int num3[][] = new int[2][2];

        int x;
        int y;

        System.out.println("Please insert 1st integer values for matrix addiction: ");

        int counter = 1;
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print("Enter integer#" + counter++ + ": ");
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Please insert second integer values for matrix addition.");

        for (x = 0; x < num2.length; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print("Enter integer#" + counter++ + ": ");
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }

        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print("\t" + num1[x][y]);
            }
        }
        System.out.println();

        for (x = 0; x < num2.length; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print("\t" + num2[x][y]);
            }
        }
        System.out.println();

        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                num3[x][y] = num1[x][y] + num2[x][y];
            }
        }
        System.out.println("The sum of the matrix is: ");

        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print("\t" + num3[x][y]);
            }
        }
    }
}
