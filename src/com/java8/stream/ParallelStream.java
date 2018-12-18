package com.java8.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ParallelStream {

   /* public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 1000 ; i++){
            list.add(i);
        }
        Instant first_1  = Instant.now();
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbers = stream.filter( n -> n % 2 == 0).toArray(Integer[] :: new);
        Instant second = Instant.now();
        System.out.println(Duration.between(first_1, second).getSeconds());
        System.out.println(Arrays.asList(evenNumbers));
    }*/

    private static List<String> getValues(){
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values;
    }
    private static void callStream(){
        List<String> values = getValues();
        long t0 = System.nanoTime();

        long count = values.stream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }

    private static void callParallelStream(){
        List<String> values = getValues();
        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("parallel sort took: %d ms", millis));
    }
    public static void main(String[] args) {

       callStream();
        //callParallelStream();

    }
}
