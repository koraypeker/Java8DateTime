package java8.datetime;

import java.time.LocalDate;

public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2018, 4, 11);
        LocalDate localDate2 = LocalDate.parse("2018-02-13");
        LocalDate localDate3 = LocalDate.now();
        LocalDate localDate4 = LocalDate.ofYearDay(2015, 100);

        System.out.println(localDate1.toString());                //2018-04-11
        System.out.println(localDate1.getDayOfWeek().toString()); //WEDNESDAY
        System.out.println(localDate1.getDayOfMonth());           //11
        System.out.println(localDate1.getDayOfYear());            //101
        System.out.println(localDate1.isLeapYear());              //false
        System.out.println(localDate1.plusDays(12).toString());   //2018-04-23

    }
}
