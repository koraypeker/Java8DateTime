package java8.datetime;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {

        LocalTime givenTime = LocalTime.of(2, 30, 15); // 02:30:15
        LocalTime updatedTime = givenTime.plus(Duration.ofMinutes(20)).plus(Duration.ofSeconds(30)); // 02:50:45

        Duration drt = Duration.between(givenTime, updatedTime); // PT20M30S
        System.out.println("İki saat arasındaki saniye farkı : " + drt.getSeconds()); // 1230
        System.out.println("iki saat arasındaki dakika farkı : " + drt.toMinutes()); // 20

    }
}
