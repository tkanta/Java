package com.java8.date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.system(ZoneId.of("Europe/Berlin"));
        long millis = clock.millis();

        System.out.println(millis);
        System.out.println(System.currentTimeMillis());

        Instant instant = clock.instant();
        System.out.println(LocalDate.now(clock));
    }
}
