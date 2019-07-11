package com.designpattern.visitor;

public class TestVisitor {

	public static void main(String[] args) {
		Element taxi = new TaxiElement();
		
		Visitor person = new PersonVisitor();
		
		taxi.accept(person);
		
		
		
	}
}
