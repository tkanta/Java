package com.java8.collection.list;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String args[]) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("Tarini");
		linkedList.add("kanta");
		linkedList.add("Negi");
		linkedList.removeFirst();
		linkedList.forEach(l -> {
			System.out.println(l+" **");
		});
	}
}
