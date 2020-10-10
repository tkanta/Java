package com.java8.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestStringList {
    public static void main(String[] args) {
        String[] strList = new String[] {"abc", "cde"};
        
        boolean test = Arrays.asList(strList).stream().anyMatch( s -> s.contains("abcd"));
        
        System.out.println(test);
    }
}
