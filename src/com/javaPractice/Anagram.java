package com.javaPractice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "AATA";
		String s2 = "ATAA";
		if (s1.length() == s2.length()) {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean res = Arrays.equals(ch1, ch2);

			if (res == true) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not an anagram");
			}
		} else {
			System.out.println("Not an anagram");
		}
	}

}
