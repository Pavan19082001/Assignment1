package com.javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// find the min & max num from an array...

public class Min_Max {
	public static void main(String[] args) {
		int[] arr = {3,5,7,4,9,13,25,67,56};
		
		List<Integer> list = new ArrayList<>();
		for(int a: arr) {
			list.add(a);
		}
		
		int max = list.stream().max(Integer::compareTo).get();
		int min = list.stream().min(Integer::compareTo).get();
		
		System.out.println("Max element in the list: "+max);
		System.out.println("Min element in the list: "+min);
	}
}
