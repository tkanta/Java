package com.designpattern.visitor;

public class TaxiElement implements Element {

	@Override
	public void accept(Visitor visitor) {
		
		visitor.visit(this);

	}
	
	public int getFare() {
		return 23;
	}

}
