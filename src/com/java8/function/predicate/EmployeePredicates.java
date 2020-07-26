package com.java8.function.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
     
    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }
     
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
    
    
    
    public static List<Employee> filterEmployees (List<Employee> employees, 
                                                Predicate<Employee> predicate) 
    {
        return employees.stream()
                    .filter( predicate )
                    .collect(Collectors.<Employee>toList());
    }
    
    //------- using method reference ---------
    //when using method reference the implemented method should be mimicking the functional interface method signature.
    // basically arguments, return type etc.
    
    public static boolean filterEmp(Employee e) {
    	return   e.getAge() > 21 && e.getGender().equalsIgnoreCase("M");
    }
	public static List<Employee> filterEmp(List<Employee> employees) {
		return employees.stream().filter(EmployeePredicates::filterEmp).collect(Collectors.<Employee>toList());
	}
}
