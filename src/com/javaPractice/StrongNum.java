package com.javaPractice;

import java.util.stream.IntStream;

public class StrongNum {                               // sum of factorials of each digit of num  == number;
	public static void main(String[] args) {
		int n = 145; 
		int strongNum = String.valueOf(n).chars().map(Character::getNumericValue).map(StrongNum::factorial).sum();
		if(strongNum == n) {
			System.out.println(n+" is a strong number");
		}else {
			System.out.println("not a strong num");
		}
	}
	
	public static int factorial(int n) {
		if(n==0||n==1) return 1;
		return IntStream.rangeClosed(2, n).reduce(1, (a, b) -> a*b);
	}
}
