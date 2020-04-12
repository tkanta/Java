package com.java8.function.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Tarini", "Kanta", "Negi");
		
		List<Integer> mapList = mapToLen(list, s-> s.length());
		System.out.println(mapList);
	}
	private static <T,S> List<S> mapToLen(List<T> arr, Function<T,S> fn){
		List<S> newArray = new ArrayList<S>();
		
		arr.forEach(t -> {
			newArray.add(fn.apply(t));
		});
		return newArray;
	}
}
