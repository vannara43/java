package Practice._DefaultFiles;

public class P10FinalKeyword {

    final int Reg_No; // final keyword makes the variable unchangeable after initialization.

    P10FinalKeyword(int num) {
        Reg_No = num; // Initialization of the variable with a value.
    }

    void Display() {
        System.out.println("Employee number is: " + Reg_No);
    }

    public static void main(String[] args) {
        P10FinalKeyword em = new P10FinalKeyword(201);
        em.Display();
    }
}
