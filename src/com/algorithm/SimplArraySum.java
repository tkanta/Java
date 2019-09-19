package com.algorithm;

import java.util.Scanner;

public class SimplArraySum {

	static int simpleArraySum(int[] arr) {
		
		int sum = 0;
		
		for(int i : arr) {
			sum += i;
		}
		
		return sum;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			
			int count = Integer.parseInt(scanner.nextLine().trim());
			int[] arr = new int[count];
			
			String[] arrItems = scanner.nextLine().split(" ");
			
			for(int i=0; i<count; i++) {
				arr[i] = Integer.parseInt(arrItems[i]); 
			}
			
			int sum = simpleArraySum(arr);
			System.out.println("sum : "+sum);
			
		}catch(Exception ex) {
			
		}
	}
}
