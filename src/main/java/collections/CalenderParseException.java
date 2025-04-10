package collections;

import java.text.ParseException;
import java.util.Calendar;

public class CalenderParseException {
    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        int year = cal.get(Calendar.YEAR);
        System.out.println("Current year: " + year);

        int month = cal.get(Calendar.MONTH);
        System.out.println("Current month: " + month);

        int date = cal.get(Calendar.DATE);
        System.out.println("Current date: " + date);
    }

}
