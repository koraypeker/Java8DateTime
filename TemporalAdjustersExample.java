package java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        // Bir sonraki ilk cumartesi
        LocalDate nextTuesday = localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));

        //Ayın ikinci cumartesisi
        LocalDate firstInYear = LocalDate.of(localDate.getYear(),localDate.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

    }
}
