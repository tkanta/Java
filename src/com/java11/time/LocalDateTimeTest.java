package com.java11.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        //LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("America/Chicago"));
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // Format and Parse
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyyHH:mm:ss.SS");
        String text = dateTime.format(formatter);
        System.out.println("formatted text :"+text);

        LocalDateTime newDateTime = LocalDateTime.parse(text, formatter);
        System.out.println(newDateTime);

    }
}
