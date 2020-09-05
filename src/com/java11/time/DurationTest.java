package com.java11.time;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DurationTest {

	public static void main(String[] args) {
		TimeUnit convert = TimeUnit.DAYS;
		System.out.println("Days : "+convert.convert(Duration.ofHours(72)));
	}
}
