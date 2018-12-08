package java8.datetime;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZoneId currentZone = ZoneId.systemDefault(); // Asia/Istanbul
        ZoneId id = ZoneId.of("Asia/Istanbul");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2018-12-03T10:15:30+05:30[Asia/Istanbul]");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(); // 2018-12-08T10:20:45.063+03:00[Asia/Istanbul]
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        OffsetDateTime now = OffsetDateTime.now();

    }
}
