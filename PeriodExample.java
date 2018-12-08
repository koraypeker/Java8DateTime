package java8.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate currTime = LocalDate.now();
        LocalDate dateAfter10Days = currTime.plus(Period.ofDays(10));
        LocalDate dateBeforeWeek = currTime.minus(Period.ofWeeks(3));

        Period periofDiff = Period.between(dateBeforeWeek, dateAfter10Days); //P1M1D
        System.out.println("day difference: " + periofDiff.getDays());
        System.out.println("months difference: " + periofDiff.getMonths());

    }
}
