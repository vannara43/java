// Please view file: Keyword2.java to see how finalize keyword
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
