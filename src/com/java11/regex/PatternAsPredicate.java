package com.java11.regex;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PatternAsPredicate {

	public static void main(String[] args) {
		var patternFoundInGivenString = Pattern.compile("123132").asPredicate();
		System.out.println("check if pattern Found In Given String : "+patternFoundInGivenString.test("123132asdads"));
		
		Predicate<String> patternMatchToGivenString = Pattern.compile("123132").asMatchPredicate();
		System.out.println("Check if pattern exactly Match To Given String : "+patternMatchToGivenString.test("123132"));
		
		Pattern pattern = Pattern.compile("123132");
		System.out.println(pattern.matcher("123132").matches()); // same as asMatchPredicate() method
		System.out.println(Pattern.quote("1313132"));
	}
}
