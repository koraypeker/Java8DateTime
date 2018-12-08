package java8.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("1 hafta sonra : " + nextWeek);

        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("1 ay sonra : " + nextMonth);

        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("1 yıl sonra : " + nextYear);

        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("10 yıl sonra : " + nextDecade);

    }
}
