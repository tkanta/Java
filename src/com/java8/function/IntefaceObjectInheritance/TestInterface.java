package com.java8.function.IntefaceObjectInheritance;

public interface TestInterface {
    public void testMethod();

    default void move(){
        System.out.println("I am moving");
    }
}
