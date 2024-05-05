package Practice.WarmUp;

import java.util.Date;

public class _3Printf {
    public static void main(String[] args) {
        System.out.println("\nFormatting rules: %[flags][width][.precision]conversion-character");
        System.out.println("New Line: %n");
        System.out.println("Add Spaces/Align Right: %5");
        System.out.println("Add Spaces/Align Left: %-5");
        System.out.println("Fix Decimal Point: %.2f");
        System.out.println("String: %s");
        System.out.println("Byte: %d");
        System.out.println("Char: %c");
        System.out.println("Integer: %d");
        System.out.println("Float: %f");
        System.out.println("Double: %f");
        System.out.println("Boolean: %b");
        System.out.println("Date/Time: %t");
        System.out.println("Rid of multiple arguments: 1$");

        int intNum1 = 5;
        int intNum2 = 10;
        int intTotal = intNum1 + intNum2;
        System.out.printf("The sum of %d and %d is %d\n", intNum1, intNum2, intTotal);

        double doubleNum1 = 15.0212;
        double doubleNum2 = 15.1333;
        double doubleTotal = doubleNum1 + doubleNum2;
        System.out.printf("The sum of %.2f and %.2f is %.2f\n", doubleNum1, doubleNum2, doubleTotal);
        System.out.printf("%2.2s%n", "Hi there!");

        Date date = new Date();
        System.out.printf("%tT %n", date);
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %n", date);
        System.out.printf("%1$tA, %1$tB %1$tY %n", date);
        System.out.printf("%1$td.%1$tm.%1$ty %n", date);
    }
}
