package com.javaPractice;

public class RemoveSpaces {
	public static void main(String[] args) {
		String s = "Hello Java Developers";
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}
}
