package com.java8.date;

import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(ZoneId.of("America/Chicago"));
        System.out.println(date);
    }
}
