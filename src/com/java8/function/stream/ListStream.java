package com.java8.function.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListStream {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection.add("ddd3");

         Optional<String> optional = stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted()
                .filter((s) -> s.startsWith("D"))
                .reduce((s1, s2) -> s1+":"+s2);
                // .forEach(System.out::println);
                //.count();


        optional.ifPresent(System.out::println);
    }
}
