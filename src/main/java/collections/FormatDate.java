package collections;


import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat s =new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        String formatedDate =s.format(d);
        System.out.println(formatedDate);
    }
}
