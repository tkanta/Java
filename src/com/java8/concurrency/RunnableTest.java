package com.java8.concurrency;

import java.util.concurrent.TimeUnit;

public class RunnableTest {

	public static void main(String[] args) {
		Runnable task = () -> {
			try {
				String threadName = Thread.currentThread().getName();
				TimeUnit.SECONDS.sleep(6);
				System.out.println(threadName);
				
			}catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}
			
		};
		
		Thread th = new Thread(task);
		th.start();
		System.out.println("Done!");
	}
}	