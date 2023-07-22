package com.javaPractice;

// find the string length without inbuilt method

public class StringLength {
	public static void main(String[] args) {
		String s = "capgemini";
		long count = s.chars().count();
		System.out.println(count);
	}
}
