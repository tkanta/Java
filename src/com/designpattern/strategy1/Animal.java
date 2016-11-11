package com.designpattern.strategy1;

public abstract class Animal {
	
	public FlysStrategy flyStrategy;
	
	public void setFlyingStrategy(FlysStrategy strategy){
		flyStrategy = strategy;
	}
	
	public String tryToFly(){
		return flyStrategy.fly();
	}
}
