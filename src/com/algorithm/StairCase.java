package com.algorithm;

import java.util.Scanner;
import java.util.stream.IntStream;

public class StairCase {
	
	private static final Scanner scanner = new Scanner(System.in);
	private static void stairCase(int n) {
		StringBuffer buf = new StringBuffer();
		
		for(int j=1; j<=n; j++) {
			IntStream.range(0, j).forEach(k -> buf.append("#"));
			String format = "%"+n+"s\n";
			System.out.printf(format, buf.toString());
			buf.delete(0,buf.length());
		}
	}
	public static void main(String[] args) {
		//System.out.printf("%.5s", "#*********");
		//stairCase(6);
		//System.out.println(String.format("%1$s", 32, "HelloTarini"));
//		StringBuffer buf = new StringBuffer();
//		IntStream.range(0, 6).forEach(i -> buf.append("#"));
//		System.out.println(buf);
		int n = scanner.nextInt();
		stairCase(n);
	}
}
