package com.javaPractice;

// first & last char of each of string must be capital

public class Ex39 {
	public static void main(String[] args) {
		String s = "welcome to java community";
		String[] str = s.split(" ");
		for(String a: str) {
			a = a.substring(0, 1).toUpperCase()+a.substring(1, a.length()-1)+a.substring(a.length()-1, a.length()).toUpperCase();
			System.out.print(a+" ");
		}
	}
}
