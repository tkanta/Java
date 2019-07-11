package com.designpattern.visitor;

public class PersonVisitor implements Visitor {

	@Override
	public void visit(TaxiElement taxi) {
		System.out.println("Fare :"+taxi.getFare());
	}

}
