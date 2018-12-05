package com.java8.IntefaceObjectInheritance;

public class TestInterfaceImpl implements TestInterface {
    public void testMethod(){

        System.out.println("Test Method if the Interface");

    }

    public void move(){
        System.out.println("I am overridden of moving");
    }
}
