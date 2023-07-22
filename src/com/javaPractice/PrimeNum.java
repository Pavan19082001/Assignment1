package com.javaPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNum {
	public static void main(String[] args) {
		List<Integer> res = IntStream.rangeClosed(0, 30).filter(PrimeNum::isPrime).boxed().collect(Collectors.toList());
		System.out.println(res);
	}
	
	private static boolean isPrime(int num) {
		if(num < 0) {
			return false;
		}
		
		if(num == 0 || num == 1) {
			return false;
		}
		
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
