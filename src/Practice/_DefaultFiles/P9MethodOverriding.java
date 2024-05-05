package Practice._DefaultFiles;

class First {
    int x;
    int y;

    First(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}

class Second extends First {
    int z;

    // Calling the constructor of the superclass (First) using 'super'
    Second(int a, int b, int c) {
        super(a, b); // calling the constructor of the parent class
        z = c; // initializing variable in child class
    }

    void display() {
        super.display(); // calling the method of the parent class
        System.out.println("z: " + z);
    }
}

public class P9MethodOverriding {
    public static void main(String[] args) {
        Second sc = new Second(100, 200, 300);
        sc.display();
    }
}
