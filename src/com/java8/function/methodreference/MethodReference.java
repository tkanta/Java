package com.java8.function.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

    public static void instanceMethod(){
        List<String> list = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sortedList = list.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static void main(String[] args) {
        instanceMethod();
        /*List<Integer> integers = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));

        Optional<Integer> max = integers.stream().reduce(Math::max);

        max.ifPresent(System.out::println);
        */

    }


}
