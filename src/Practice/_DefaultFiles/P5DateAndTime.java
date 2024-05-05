package Practice._DefaultFiles;

import java.util.*;

public class P5DateAndTime {
    public static void main(String[] args) {
        int day, month, year;
        int second, minute, hour;

        GregorianCalendar date = new GregorianCalendar(); // get the current date and time

        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR_OF_DAY);

        System.out.println("Date is " + (month + 1) + "/" + day + "/" + year);
        System.out.println("Time is " + hour + ":" + minute + ":" + second);
    }
}
