package com.java8.function.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	private static List<Employee> getEmployees(){
	    List<Employee> employees  = new ArrayList<>();
	    employees.add(new Employee(6,"Yash", "Chopra", 25));
	    employees.add(new Employee(2,"Aman", "Sharma", 28));
	    employees.add(new Employee(12,"Aman", "Tataudi", 28));
	    employees.add(new Employee(3,"Aakash", "Yaadav", 52));
	    employees.add(new Employee(5,"David", "Kameron", 19));
	    employees.add(new Employee(4,"James", "Hedge", 72));
	    employees.add(new Employee(8,"Balaji", "Subbu", 88));
	    employees.add(new Employee(7,"Karan", "Johar", 59));
	    employees.add(new Employee(1,"Lokesh", "Gupta", 32));
	    employees.add(new Employee(9,"Vishu", "Bissi", 33));
	    employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
	    return employees;
	}
	
	public static void main(String[] args) {
		List<Employee> employees  = getEmployees();
	     
		Comparator<Employee> com1 = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName)
				.thenComparing(Employee::getAge);
		Comparator<Employee> com2 = Comparator.comparing(e -> e.getFirstName());
		Comparator<Employee> com3 = Comparator.comparing(e -> e.getFirstName());
	    //Sort all employees by first name
	    //employees.sort(Comparator.comparing(e -> e.getFirstName()));
	     
	    //OR you can use below
	    employees.sort(com1);
	     
	    //Let's print the sorted list
	    System.out.println(employees);
	}
}
