import java.io.*;

class Overload {
    String add(String a, String b) {
        return (a + b);
    }
}

public class P8StringOverloading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x;
        String y;
        System.out.println("Please enter a string:");
        x = br.readLine(); // Reading integer from user input
        System.out.println("Please enter another string:");
        y = br.readLine(); // Reading another integer from user input

        Overload ol = new Overload();
        System.out.println("Result of your two values are: " + ol.add(x, y));
    }
}
