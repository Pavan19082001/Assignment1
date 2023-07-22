package com.javaPractice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOfTwoStrings {
	public static void main(String[] args) {
		String s1 = "Madam", s2 = "madam";
		
		// reversing string s1...
		String rev = Stream.of(s1.toLowerCase()).map(i -> new StringBuilder(i).reverse()).collect(Collectors.joining());
		
		if(rev.equals(s2)) System.out.println("Given strings are reverse to eachother");
		else System.out.println("Given strings are not reverse to eachother");
	}
}
