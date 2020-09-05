package com.java11.string;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class StringTest {

	public static void main(String[] args) {
		String str = "Tarini";
		System.out.println(str.strip());
		
		
		IntStream.of(1, 2, 3, 5, 6, 7) 
        .filter((var i) -> i % 2 == 0) 
        .forEach(System.out::println); 
		
		StringJoiner sj = new StringJoiner(":", "[", "]");
		 sj.add("George").add("Sally").add("Fred");
		 String desiredString = sj.toString();
		 System.out.println(desiredString);
		
	}
}
