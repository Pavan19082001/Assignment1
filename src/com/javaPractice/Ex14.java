package com.javaPractice;

import java.util.stream.Collectors;

// print the string by ascending order of its characters...

public class Ex14 {
	public static void main(String[] args) {
		String s = "program";
		String res = s.chars().sorted().mapToObj(Character::toString).collect(Collectors.joining());
		System.out.println(res);
	}
}
