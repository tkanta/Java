package com.java8.concurrency.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicIntegerTest {

	static AtomicInteger atomicInt = new AtomicInteger();
	static ExecutorService service = Executors.newFixedThreadPool(2);
	
	static Runnable updateTask = () -> {
			atomicInt.updateAndGet(n -> n+2);
	};
	/*static Runnable accumulateTask = () -> {
		atomicInt.accumulateAndGet(x, (n,m) -> n+m );
	};*/


	public static void main(String[] args) {
		accumulateAndGet();
	}
	
	
	static void accumulateAndGet() {
		IntStream.range(0, 10).forEach(i -> {
			System.out.println(i);
			Runnable task = () -> atomicInt.accumulateAndGet(i,  (n,m)->n+m);
			service.submit(task);
		});
		
		stop(service);
		System.out.println(atomicInt.get());
	}
	static void updateAndGet() {
		
		IntStream.range(0, 1000).forEach(i -> service.submit(updateTask));
		stop(service);
		System.out.println(atomicInt.get());
	}
	
	static void increamentAndGet() {
			
		
		
		IntStream.range(0, 1000).forEach(i -> service.submit(atomicInt::incrementAndGet));
		
		stop(service);
		
		System.out.println(atomicInt.get());
	}
	static void stop(ExecutorService service) {
		
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
