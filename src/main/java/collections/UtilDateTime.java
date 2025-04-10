package collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDateTime {
    public static void main(String[] args) {
        Date d = new Date(200,1,1);
        System.out.println(d);
        SimpleDateFormat s =new SimpleDateFormat("yyyy-MMMM-dd");
    }
}
