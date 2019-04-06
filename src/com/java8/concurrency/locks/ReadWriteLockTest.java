package com.java8.concurrency.locks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

public class ReadWriteLockTest {

	static ExecutorService executorService = Executors.newFixedThreadPool(3);
	
	static Map<String, String> map = new HashMap<>();
	
	static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	static Runnable writeTask = () -> {
		readWriteLock.writeLock().lock();
		try {
			TimeUnit.SECONDS.sleep(4);
			map.put("name", "Tarini Kanta");
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());	
		}finally {
			readWriteLock.writeLock().unlock();
		}
	};
	
	static Runnable readTask = () -> {
		readWriteLock.readLock().lock();
		try {
			System.out.println(map.get("name"));
			//TimeUnit.SECONDS.sleep(1);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			readWriteLock.readLock().unlock();
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
