package com.java11.regex;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PatternAsPredicate {

	public static void main(String[] args) {
		
		//--------------- Match the pattern ----------------
		var patternFoundInGivenString = Pattern.compile("123132").asPredicate();
		System.out.println("check if pattern Found In Given String : "+patternFoundInGivenString.test("123132asdads"));
		
		Predicate<String> patternMatchToGivenString = Pattern.compile("123132").asMatchPredicate();
		System.out.println("Check if pattern exactly Match To Given String : "+patternMatchToGivenString.test("123132"));
		
		Pattern pattern = Pattern.compile("123132");
		System.out.println(pattern.matcher("123132").matches()); // same as asMatchPredicate() method
		System.out.println(Pattern.quote("1313132"));
		
		//--------------- Get Matched pattern -------------
		//		String info = "Grid generation started with start (Lat,lon,height): [19.42661, -99.1693, 0.0],and end (Lat,lon,height): [19.42101, -99.1633, 0.0]";
//		Pattern MY_PATTERN = Pattern.compile("\\[(.*?)\\]");
//		Matcher m = MY_PATTERN.matcher(info);
//		while (m.find()) {
//		    String s = m.group(1);
//		    System.out.println(s);
//		    // s now contains "BAR"
//		}
		
		//if ? is removed, it will try to match characters between first '[' and last ']'
		//19.42661, -99.1693, 0.0],and end (Lat,lon,height): [19.42101, -99.1633, 0.0
		
		//if ? is placed (*?), this is reluctant/non-greedy quantifier, it tries to find the smallest match 
		//19.42661, -99.1693, 0.0
		//19.42101, -99.1633, 0.0
	}
}
