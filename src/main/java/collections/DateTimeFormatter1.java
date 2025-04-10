package collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter1 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.now();
        String format = date.format(formatter);
        System.out.println(format);
    }
}
