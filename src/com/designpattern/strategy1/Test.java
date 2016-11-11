package com.designpattern.strategy1;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Bird bird = new Bird();
		System.out.println("Dog :"+ dog.tryToFly());
		System.out.println("Bird :"+ bird.tryToFly());
	}
}
