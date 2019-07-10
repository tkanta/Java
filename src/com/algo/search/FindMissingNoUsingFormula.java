package com.algo.search;

public class FindMissingNoUsingFormula {

	private static int getMissingNumber(int[] intArr, int size) {
		
		int total = ((size+1) * (size+2)) / 2;
		
		for(int i: intArr) {
			total -= i;
		}
		
		return total;
	}
	public static void main(String[] args) {
		int[] intArr = {1,4,3,6,7,2,8};
		System.out.println(getMissingNumber(intArr, 7));
	}
}
