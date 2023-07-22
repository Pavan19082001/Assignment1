package com.javaPractice;

// diff b/w .equals and == operators
public class StringMethods {
	public static void main(String[] args) {
		String s1 = "daniel", s2 = new String("daniel");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
