package Practice._DefaultFiles;

public class P13StaticVariable {
    int Reg_No;
    String Name;
    static String Company = "Gstevewall";

    P13StaticVariable(int a, String b) {
        Reg_No = a;
        Name = b;
    }

    void display() {
        System.out.println("Your details are: " + Reg_No + " " + Name + " " + Company);
    }

    public static void main(String[] args) {
        P13StaticVariable em = new P13StaticVariable(201, "Ejike");
        em.display();
    }
}
