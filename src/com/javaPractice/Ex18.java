package com.javaPractice;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		Map<Character, Long> hm = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		hm.entrySet().stream().filter(i -> i.getKey().equals('a')).map(k -> k.getValue()).forEach(System.out::println);
	}
}
