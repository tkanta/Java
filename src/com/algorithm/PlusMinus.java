package com.algorithm;

import java.util.Scanner;

public class PlusMinus {
	private static Scanner scanner = new Scanner(System.in);
	
	private static void plusMinus(int[] arr) {
		int negCnt = 0;
		int posCnt = 0;
		int zeroCnt = 0;
		
		for(int i: arr) {
			if(i<0) negCnt++;
			else if(i>0) posCnt++;
			else zeroCnt++;
		}
		double length = arr.length;
		System.out.printf("%.6f\n",posCnt/length);
		System.out.printf("%.6f\n",negCnt/length);
		System.out.printf("%.6f",zeroCnt/length);
	}
	
	public static void main(String[] args) {
//		int n = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//		
//		int[] arr = new int[n];
//		
//		String[] arrItems = scanner.nextLine().split(" ");
//		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//		
//		for(int i=0; i<n; i++) {
//			 int item = Integer.parseInt(arrItems[i]);
//			 arr[i] = item;
//		}
		int[] arr = {0, 0, -1, 1, 1};
		plusMinus(arr);
	}
}
