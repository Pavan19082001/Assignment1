package com.javaPractice;

import java.util.HashSet;
import java.util.Set;

// remove all the characters from 1st string that are present in 2nd string...

public class Example11 {
	public static void main(String[] args) {
		String s1 = "abbd", s2 = "cdeb";
		
		Set<Character> hm1 = new HashSet<>();
		Set<Character> hm2 = new HashSet<>();
		
		for(char ch2: s2.toCharArray()) {
			hm2.add(ch2);
		}
		
		for(char ch1: s1.toCharArray()) {
			if(!hm2.contains(ch1)) {
				hm1.add(ch1);
			}
		}
		
		System.out.println(hm1);
	}
}
