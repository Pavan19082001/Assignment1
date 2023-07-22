package com.javaPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharInString {
	public static void main(String[] args) {
		String s = "adapt";
		Map<Character, Long> map = s.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<Character> list = map.entrySet().stream().filter(i -> i.getValue() == 1L)
				.map(k -> k.getKey()).collect(Collectors.toList());
		System.out.println(list);
	}
}
