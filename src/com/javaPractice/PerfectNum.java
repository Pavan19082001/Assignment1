package com.javaPractice;

public class PerfectNum {
	public static void main(String[] args) {          //sum of divisors of num == num i.e, perfect number
		int n = 28;
		if(PerfectNum.isPerfectNumber(n)) {
			System.out.println(n+" is a perfect num");
		}else {
			System.out.println("not a perfect num");
		}
	}
	
	private static boolean isPerfectNumber(int num) {
		if(num <= 0) return false;
		
		int sum = 0;
		for(int i=1; i<=num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		return sum == num;
	}
}
