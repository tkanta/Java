package com.java8.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorTest {
    /*public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });
    }*/

    private static Callable<String> callableInstance(String result, long sleepSeconds){
        return () -> {
            TimeUnit.SECONDS.sleep(1);
            return result;
        };
    }
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool();

        List<Callable<String>> callableList = Arrays.asList(
                callableInstance("task1", 1),
                callableInstance("task2", 2),
                callableInstance("task3", 3));
        try {
            String result = executorService.invokeAny(callableList);
            System.out.println("result : "+result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
