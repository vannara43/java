package Practice._DefaultFiles;

class SwapFirst {
    // Declare Variables
    int num1, num2, a, b;

    // Constructor to initialize the object
    SwapFirst(int a, int b) {
        num1 = a;
        num2 = b;
    }
}

class SwapSecond {
    void swap(SwapFirst s) {
        int output = s.num1;
        s.num1 = s.num2;
        s.num2 = output;
    }
}

public class P6SwapTwoDifferentValues {
    public static void main(String[] args) {
        SwapFirst s1 = new SwapFirst(20, 10);
        System.out.println("Before swapping:" + s1.num1 + "\t" + s1.num2);
        SwapSecond s2 = new SwapSecond();
        s2.swap(s1);
        System.out.println("\nAfter swapping: " + s1.num1 + "\t" + s1.num2);
    }
}
