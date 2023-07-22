package com.javaPractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedDigits {
	public static void main(String[] args) {
		int n = 12343343;
		Map<Character, Long> hm = String.valueOf(n).chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		hm.entrySet().stream().filter(i -> i.getValue() == 1L).map(Map.Entry::getKey).forEach(System.out::println);
	}
}
