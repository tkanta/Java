package com.java8.concurrency.locks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.StampedLock;

public class StampedLockTest {

static ExecutorService executorService = Executors.newFixedThreadPool(3);
	
	static Map<String, String> map = new HashMap<>();
	
	static StampedLock stampedLock = new StampedLock();
	
	static Runnable writeTask = () -> {
		long stamp = stampedLock.writeLock();
		try {
			//TimeUnit.SECONDS.sleep(2);
			map.put("name", "Tarini Kanta");
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());	
		}finally {
			stampedLock.unlock(stamp);
		}
	};
	
	static Runnable readTask = () -> {
		//long stamp = stampedLock.readLock();
		long stamp = stampedLock.tryOptimisticRead();
		try {
			//TimeUnit.SECONDS.sleep(1);
			//System.out.println(stampedLock.validate(stamp));
			if(stampedLock.validate(stamp)) {
				System.out.println(map.get("name"));
			}
			
			//TimeUnit.SECONDS.sleep(1);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			stampedLock.unlock(stamp);
		}
	};
	
	
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
	public static void main(String[] args) {
		map.put("name", "default");
		executorService.submit(writeTask);
		
		//IntStream.range(0, 10).forEach(i -> executorService.submit(readTask));
		executorService.submit(readTask);
		executorService.submit(readTask);
		
		
		
		stop(executorService);
	}
}
