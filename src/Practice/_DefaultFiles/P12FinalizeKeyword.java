package Practice._DefaultFiles;

class First {
    int x;

    public First(int x) {
        this.x = x;
    }

    protected void finalize() throws Throwable {
        System.out.println("Welcome to Finalize Keyword in Java Programming" + x);
    }
}

public class P12FinalizeKeyword {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        First f1 = new First(100);
        First f2 = new First(200);
        f1 = f2;
        System.gc(); // Calling the Garbage Collector Making Object f1
                     // Eligible For GC But Since, We
                     // Have Assigned f2 To f1 So It Is Not Eligible For
                     // GC Now
        System.out.println("Hello World");
    }
}
