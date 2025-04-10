package collections;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTime {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime specificZonedatetime =ZonedDateTime.
                of(2024,12,27,14,30,0,0,zoneId);
        System.out.println(specificZonedatetime);
    }
}
