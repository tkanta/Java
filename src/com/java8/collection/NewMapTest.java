package com.java8.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class NewMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        BiFunction<String, String, String> biFunction = (v1,v2) -> v1.concat(v2);
        map.merge(9, "val9", biFunction);
        //map.entrySet().stream().forEach(System.out::println);
        System.out.println(map.get(9));

        map.merge(9, "concat", biFunction);
        System.out.println(map.get(9));
    }
}
