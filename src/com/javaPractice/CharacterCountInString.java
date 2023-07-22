package com.javaPractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountInString {
	public static void main(String[] args) {
		String s = "Hello Java Developer";
		
		s = s.replaceAll(" ", "");
		
		Map<Character, Long> hm = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(hm);
	}
}
