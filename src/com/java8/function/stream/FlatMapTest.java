package com.java8.function.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args)
    {
        // making the arraylist object of List of Integer
        List<List<Integer> > number = new ArrayList<>();
        
        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        
        System.out.println("List of list-" + number);
        
        // using flatmap() to flatten this list
        List<Integer> flatList
            = number.stream()
                  //.flatMap(list -> list.stream())
            	  .flatMap(Collection::stream)	
            	  .map( l -> l*2)
                  .collect(Collectors.toList());
        
        // printing the list
        System.out.println("List generate by flatMap-"
                           + flatList);
    }
}
