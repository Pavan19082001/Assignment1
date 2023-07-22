package com.javaPractice;

// find the no of digits in a integer value

public class Ex32 {
	public static void main(String[] args) {
		int n = 35274;
		int m = n;
		int count = 0;
		while(n != 0) {
			int r = n % 10;
			count += 1;
			n = n / 10;
		}
		System.out.println("Length of "+m+" is "+count);
	}
}
