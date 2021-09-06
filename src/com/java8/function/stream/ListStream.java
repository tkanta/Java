package com.java8.function.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        
        //======================= List<List<String>> ====================
        List<List<String>> list = Arrays.asList(
      		  Arrays.asList("a", "c"),
      		  Arrays.asList("b"));
      		System.out.println(list);
      		
		System.out.println(list
				  .stream()
				  .flatMap(Collection::stream)
				  .map( l -> l.length() )
				  .collect(Collectors.toList()));
		
		System.out.println(list
				  .stream()
				  .map(l -> l.size() )
				  .collect(Collectors.toList()));
    }
}
