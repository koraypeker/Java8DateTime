package java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(1987, Month.APRIL, 11, 14, 0, 0);
        LocalDateTime localDateTime3 = LocalDateTime.parse("2018-02-13T06:30");
        LocalDateTime localDateTime4 = LocalDate.parse("2018-02-13").atTime(LocalTime.parse("06:30"));
        LocalDateTime localDateTime5 = LocalTime.parse("06:30").atDate(LocalDate.parse("2018-02-13"));

        LocalTime timeNow = LocalTime.now();
        LocalDate dateToday = LocalDate.now();
        LocalDateTime localDateTime6 = LocalDateTime.of(dateToday, timeNow);



    }
}
