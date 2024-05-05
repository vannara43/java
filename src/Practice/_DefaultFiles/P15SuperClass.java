package Practice._DefaultFiles;

class FirstSuper {
    int x, y;

    /* Method Overriding */
    FirstSuper(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println("Value of x : " + x);
        System.out.println("Value of y : " + y);
    }
}

class SecondSuper extends FirstSuper {
    int z;

    /* Method Overriding */
    SecondSuper(int a, int b, int c) {
        super(a, b);
        z = c;
    }

    void show() {
        super.show();
        System.out.println("Value of Z is: " + z);
    }
}

public class P15SuperClass {
    public static void main(String[] args) {
        SecondSuper fs = new SecondSuper(100, 200, 300);
        fs.show();
    }
}
