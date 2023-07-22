package com.javaPractice;

public class ArmstrongNum {
	public static void main(String[] args) {
		int n = 370;
		int m = n;
		int sum = 0;
		while(n>0) {
			int r = n % 10;
			sum += r * r * r;
			n = n / 10;
		}
		
		if(sum == m) {
			System.out.println(m+" is armstrong num");
		}else {
			System.out.println("not an armstrong num");
		}
	}
}
