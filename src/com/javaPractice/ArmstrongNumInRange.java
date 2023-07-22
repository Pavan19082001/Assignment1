package com.javaPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArmstrongNumInRange {
	public static void main(String[] args) {
		List<Integer> res = IntStream.range(1, 400).boxed().filter(ArmstrongNumInRange::isArmstrongNum).collect(Collectors.toList());
		System.out.println(res);
	}
	
	private static boolean isArmstrongNum(int n) {
		int m = n;
		int sum = 0;
		while(n>0) {
			int r = n % 10;
			sum += r * r * r;
			n = n / 10;
		}
		
		if(sum != m) return false;
		else return true;
	}
}
