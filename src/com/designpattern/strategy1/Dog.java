package com.designpattern.strategy1;

public class Dog extends Animal {

	public Dog(){
		flyStrategy = new CantFlyStrategy();
	}
}
