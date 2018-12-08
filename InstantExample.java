package java8.datetime;

import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {

        Instant currTimeStamp = Instant.now();
        System.out.println("current timestamp: "+currTimeStamp);

        // get current time in milli seconds
        System.out.println("current time in milli seconds: "+currTimeStamp.toEpochMilli());

        // get current time in unix time
        System.out.println("current time in unix time: "+currTimeStamp.getEpochSecond());

        //parsing date from ISO 8601
        Instant strToDate = Instant.parse("2015-11-01T12:00:00Z");
        System.out.println("string to date conversion: "+strToDate);

    }
}
