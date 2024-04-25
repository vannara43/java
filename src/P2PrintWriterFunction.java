import java.io.PrintWriter;

public class P2PrintWriterFunction {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        String st = "Project 2";
        pw.println("This is " + st);
    }
}
