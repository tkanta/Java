package com.java8.function.functionalInterface;

import java.util.function.Function;

public class ClosureTest {

	public static void main(String[] args) {
		ClosureTest cls = new ClosureTest();
		Function<Integer,Integer> add5 = cls.add(5);
		Function<Integer,Integer> add10 = cls.add(10);
		System.out.println(add10.apply(10));
		System.out.println(add5.apply(10));
	}
	
	Function<Integer, Integer> add(Integer x){
		return y -> x+y;
	}
}
