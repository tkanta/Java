package com.java8.IntefaceObjectInheritance;

public class TestInterfaceDemo {


    public static void main(String[] args) {
        TestInterface testInterface = new TestInterfaceImpl();
        System.out.println(testInterface.toString());
        System.out.println(testInterface.getClass());
        testInterface.move();
    }
}
