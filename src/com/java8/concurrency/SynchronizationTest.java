package com.java8.concurrency;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class SynchronizationTest {

    private int count=0;
    ReentrantLock lock = new ReentrantLock();
    static ExecutorService executor = Executors.newFixedThreadPool(5);

    void incrementSync() {
        //System.out.println("-----HI");
        lock.lock();
        try {
            this.count = this.count + 1;
        } finally {
            lock.unlock();
        }

    }

    void increment(int i) {
        count = count + i;
    }
    /*private static synchronized SynchronizationTest  createSynchronizationTest(){
            if(synInstance == null){
                synInstance = new SynchronizationTest();
            }
            return synInstance;
    }*/
    private void incrementTest(){

//        IntConsumer consumer = i ->  count = count + i ;
        //IntStream.range(0, 10).parallel()
        //        .forEach( i ->  increment(i) );

        /*IntStream.range(0, 10).forEach(i -> executor.submit(() -> {
            System.out.println("Locked: " + lock.isLocked());
            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
            boolean locked = lock.tryLock();
            System.out.println("Lock acquired: " + locked);
        }));*/

        //IntStream.range(0, 10).parallel().forEach( i -> executor.submit(this::incrementSync) );

        IntStream.range(0, 10000).forEach( i -> executor.submit(this::incrementSync) );
        // IntStream.range(0, 10).forEach( i -> this.incrementSync() ); // working
        //IntStream.range(0, 10000).parallel().forEach( i -> this.incrementSync() );
        // IntStream.range(0, 10).forEach( i -> executor.submit(this::incrementSync) );
        /*for(int i=0 ; i < 10 ; i++){
            executor.submit(this::incrementSync);
        }*/
        executor.shutdown();
        try {
            executor.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println("count : "+this.count);  // 10000
    }

    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(2);
        //IntStream.range(0, 10000).forEach( i -> executorService.submit(new SynchronizationTest()::increment) );
        //executorService.shutdown();
        /*int count = 0;
        IntStream.range(0, 10000).forEach( i -> i++ );
        System.out.println("count : "+ count);*/
        //IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10)).limit(10).forEach(System.out::println);
       //int[] arr =  IntStream.iterate(0, i -> i + 1).limit(10).toArray();
       //System.out.println(Arrays.asList(arr).toArray());
        /*for (int i : arr) {
            System.out.println(i);
        }*/
        SynchronizationTest test = new SynchronizationTest();
        test.incrementTest();

    }
}
