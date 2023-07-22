package com.javaPractice;

//count the vowels and consonants count...

public class VowelsAndConsonants {
	public static void main(String[] args) {
		String s = "capgemini";
		char[] c = s.toCharArray();

		int vowelCount = 0, consonantCount = 0;

		for (char ch : c) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}

		System.out.println("Vowel count: " + vowelCount);
		System.out.println("Consonant count: " + consonantCount);
	}
}
