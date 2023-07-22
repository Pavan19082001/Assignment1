package com.javaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,2,3,6,3,9,6);
		Set<Integer> hs1 = new HashSet<>();
		hs1.addAll(list);
		
		int even_sum = 0, odd_sum = 0;
		
		for(int a: hs1) {
			if(a%2 == 0) {
				even_sum += a;
			}else {
				odd_sum += a;
			}
		}
		
		System.out.println("sum of even num: "+even_sum);
		System.out.println("sum of odd num: "+odd_sum);
		
	}
}
