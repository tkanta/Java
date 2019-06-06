package com.java8.concurrency.map;

import java.time.Duration;
import java.time.Instant;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ConcurrentMapTesting {

	public static void main(String[] args) {
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		
		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
		IntStream.range(0, 100000).forEach(i -> {
			map.put(i, i);
		});
		
		System.out.println(map.size());
		Instant before = Instant.now();
		
		/*map.forEach(1, (key, value) -> {
			System.out.printf("key : %s, value : %s, thread: %s\n", key, value, Thread.currentThread().getName());
		});*/
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			System.out.printf("key : %s, value : %s, thread: %s\n", key, map.get(key), Thread.currentThread().getName());
		}
		Instant after = Instant.now();
		System.out.println(Duration.between(before, after).toMillis());
	}
}
