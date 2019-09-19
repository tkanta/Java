package com.algorithm;

public class MinMaxSum {

	static void minMaxSum(int[] arr) {
		
		long min = 0;
		long max = 0;
		boolean minAssigned=true;
		for(int i=0; i<arr.length; i++) {
			long sum = 0;
			for(int j=0; j<arr.length; j++) {
				if(i!=j) {
					sum+=arr[j];
				}
			}
			if(minAssigned) {
				min=sum;
				minAssigned=false;
			}
			System.out.println(sum);
			if(sum<min) min = sum;
			if(max<sum) max = sum;
		}
		
		System.out.println(min+" "+max);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};//{942381765, 627450398, 954173620, 583762094, 236817490};
		
		minMaxSum(arr);
	}
	
}
