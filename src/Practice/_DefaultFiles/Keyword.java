package Practice._DefaultFiles;

// This file is for P11FinalKeywordAsMethod.java
public class Keyword {
    final void display() {
        System.out.println("This is a final Method");
    }
}

class Hello extends Keyword {
    public static void main(String[] args) {
        Hello hl = new Hello();
        hl.display();
    }
}