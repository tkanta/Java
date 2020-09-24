package com.datastructure.map.enummap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class TestEnumMap {

	enum Color{
		RED, GREEN, BLUE, WHITE
	}
	
	public static void main(String[] args) {
		EnumMap<Color, Integer> colorMap = new EnumMap<>(Color.class);
		
		colorMap.put(Color.RED, 1); 
		colorMap.put(Color.GREEN, 2); 
		colorMap.replace(Color.RED, 3);
		
		System.out.println("EnumMap colorMap: " + colorMap); 
		System.out.println(colorMap.get(Color.GREEN));
		testWithMapConstructor();
	}
	
	
	public static void testWithMapConstructor() {
		Map<Color,String> map = new HashMap<>();
		map.put(Color.GREEN, "test1");
		
		EnumMap<Color,String> enumMap = new EnumMap<>(map);
		System.out.println(enumMap);
	}
	
	//EnumMap is much faster than HashMap
}
