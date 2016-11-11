package com.designpattern.strategy1;

public class Bird extends Animal {

	public Bird(){
		flyStrategy = new CanFlyStrategy();
	}
}
