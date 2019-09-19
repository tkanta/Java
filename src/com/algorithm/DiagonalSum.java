package com.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiagonalSum {

	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	        int sum = 0, sum1 = 0, sum2=0;
	        for(int i=0, j=arr.size()-1; i<arr.size();i++,j--){
	            sum1 += arr.get(i).get(i);
	            sum2 += arr.get(i).get(j);
	            sum = Math.abs(sum1-sum2);
	        }
	        return sum;
	    }
	
	public static void main(String[] args) {
		
		try {
			 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		        int n = Integer.parseInt(bufferedReader.readLine().trim());

		        List<List<Integer>> arr = new ArrayList<>();

		        IntStream.range(0, n).forEach(i -> {
		            try {
		                arr.add(
		                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
		                        .map(Integer::parseInt)
		                        .collect(Collectors.toList())
		                );
		            } catch (IOException ex) {
		                throw new RuntimeException(ex);
		            }
		        });

		        int result = diagonalDifference(arr);
		        System.out.println(result);
//		        bufferedWriter.write(String.valueOf(result));
//		        bufferedWriter.newLine();

		        bufferedReader.close();
		        //bufferedWriter.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
	}
}

//1 1 1 1
//1 1 1 1
//1 1 1 1
//1 1 1 1
//
//1 1 1
//1 1 1
//1 1 1

//1 1 1 1 1
//1 1 1 1 1 
//1 1 1 1 1
//1 1 1 1 1
//1 1 1 1 1

//0, 4, 8
//0, 5, 10, 15
//00,11,22 | 02,11,22
//00,11,22,33 | 03,12,21,20

