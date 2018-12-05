package com.java8.stream;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {
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
    }
}
