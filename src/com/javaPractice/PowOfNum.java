package com.javaPractice;

public class PowOfNum {
	public static void main(String[] args) {
		int base = 2;
		int exponent = -3;
		double pow = power(base, exponent);
		System.out.println(pow);
	}
	
	public static double power(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		}
		if(exponent > 0) {
			return base * power(base, exponent-1);
		}else {
			return 1.0/(base * power(base, -exponent-1));
		}
	}
}
