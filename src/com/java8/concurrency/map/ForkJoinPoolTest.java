package com.java8.concurrency.map;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPoolTest {

	public static void main(String[] args) {
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
	}
}
