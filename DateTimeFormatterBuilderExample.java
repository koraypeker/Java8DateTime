package java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

public class DateTimeFormatterBuilderExample {

    public static void main(String[] args) {

        LocalDate fromString = LocalDate.parse( "2014-01-20" );
        LocalDate parsedFromPatern = LocalDate.parse( "2014/03/03", DateTimeFormatter.ofPattern( "yyyy/MM/dd" ) );

        DateTimeFormatter builder = new DateTimeFormatterBuilder()
                .appendLiteral("Day of Month is :")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral(", Month is :")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(", Year is : ")
                .appendValue(ChronoField.YEAR)
                .appendLiteral(", Time is :")
                .appendValue(ChronoField.HOUR_OF_DAY)
                .appendLiteral(":")
                .appendText(ChronoField.MINUTE_OF_HOUR, TextStyle.FULL_STANDALONE)
                .parseCaseSensitive()
                .toFormatter();

        LocalDateTime localDateTime = LocalDateTime.now();
        String date = localDateTime.format(builder);
        System.out.println(date);

    }
}
