import java.io.*;

public class P17PrintNumbersMatrixFormat {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1[][] = new int[3][3];
        int x;
        int y;
        System.out.println("Please  enter 9 numbers to fill the matrix:");

        for (x = 0; x < 3; x++) {
            /* num1[x++][y] */
            for (y = 0; y < 3; y++) {
                /* num1[x][y++] */
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }

        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print("" + num1[x][y]);
            }
            System.out.println(); // Makes a new line
        }
    }
}
