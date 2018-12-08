package java8.datetime;

import java.time.LocalTime;

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.of(15, 30, 28);
        LocalTime localTime2 = LocalTime.now();     //toString() in format 09:57:59.744
        LocalTime localTime3 = LocalTime.of(12, 20);
        LocalTime localTime4 = LocalTime.ofSecondOfDay(10160);
        LocalTime localTime5 = LocalTime.parse("06:30");

        System.out.println(localTime1);               // 15:30:28
        System.out.println(localTime1.getHour());     // 15
        System.out.println(localTime1.getMinute());   // 30
        System.out.println(localTime1.getSecond());   // 28
        System.out.println(localTime1.MIDNIGHT);      // 00:00
        System.out.println(localTime1.NOON);          // 12:00
        System.out.println("seconds of the day: " + localTime4); // seconds of the day: 02:49:20



    }
}
