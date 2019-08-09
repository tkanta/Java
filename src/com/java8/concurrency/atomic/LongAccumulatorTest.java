package com.java8.concurrency.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;
import java.util.stream.IntStream;

public class LongAccumulatorTest {
	private static LongBinaryOperator op = (x,y) -> x+y;
	private static LongAccumulator accumulator = new LongAccumulator(op,0L);
	private static ExecutorService service = Executors.newFixedThreadPool(2);
	
	public static void main(String[] args) {
		IntStream.range(0, 11).forEach(i -> service.submit(() -> accumulator.accumulate(i)));
		stop(service);
		System.out.println(accumulator.getThenReset());
		System.out.println(accumulator.get());
	}
	
	
	private static void stop(ExecutorService service) {
		
		try {
			service.shutdown();
			service.awaitTermination(5, TimeUnit.SECONDS);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(!service.isTerminated()) {
				System.out.println("killing non-finished task");
				service.shutdownNow();
			}
		}
	}
}
