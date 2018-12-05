package com.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToCollection {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1,2,3,4,5,6,676};

        Stream<Integer> stream = Stream.of(intArr);
        Integer[] arr = stream.toArray(Integer[]::new);
        System.out.println(Arrays.asList(arr));
    }

}
