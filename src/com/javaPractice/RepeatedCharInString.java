package com.javaPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharInString {
	public static void main(String[] args) {
		String s = "capgemini";
		
		Map<Character, Long> hm = s.chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<Character> list = hm.entrySet().stream().filter(i -> i.getValue() > 1L).map(k -> k.getKey()).collect(Collectors.toList());
		System.out.println(list);
;
	}
}
