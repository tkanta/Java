package com.java8.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        /*ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Consumer<Integer> action = System.out::print;

        numberList.stream().filter(n -> n%2  != 0).forEach( action );*/
        //-----------------------------------------------------
         /*Map<String, Integer> map = new HashMap<>();
         map.put("A", 1);
         map.put("B", 2);
         map.put("C", 3);
         List<Integer> list = new ArrayList<>();
        Consumer<Integer> action = n -> {
            list.add(n*n);
        };
         map.values().stream().filter(n -> n%2 != 0).forEach(action);
         System.out.println(list);*/

        Stream<Integer> stream = Stream.generate(() -> { return new Random().nextInt(100); });
        Consumer<Integer> action = System.out::println;
        stream.forEach(action);


    }
}
