package com.javaPractice;

import java.util.stream.Collectors;

//print 28156437 to 12345678 order wise...

public class Ex15 {
	public static void main(String[] args) {
		int n = 28156437;
		String s = String.valueOf(n);
		String res = s.chars().sorted().mapToObj(Character::toString).collect(Collectors.joining());
		int r = Integer.parseInt(res);
		System.out.println(r);
	}
}
