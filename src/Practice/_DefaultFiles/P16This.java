package Practice._DefaultFiles;

public class P16This {

    int num1;
    int num2;

    /* Method Overriding */
    P16This(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void show() {
        System.out.println("Value of num 1 is " + num1);
        System.out.println("Value of num 2 is " + num2);
    }

    public static void main(String[] args) {
        P16This ut = new P16This(100, 200);
        ut.show();
    }
}
