package com.java8.function.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalFlatMap {

	public static void main(String[] args) {
        
        Optional<String> optional1 = Optional.of("Hello Java 8");
        Optional<Optional<String>> optional2 = Optional.of(optional1);
        
        System.out.println("Optional2 value : " + optional2);
        
        Optional<String> output = optional2.flatMap(value -> value.map(String::toLowerCase));
        Optional<String> output1 = optional1.flatMap(value -> Optional.of(value+value));
        
        System.out.println("output value : " + output);
        System.out.println("output1 value : " + output1);
        
        
    }
}
