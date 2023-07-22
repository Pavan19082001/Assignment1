package com.javaPractice;

import java.util.Arrays;
import java.util.List;

public class SecondLargestInArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,2,4,6,7,11,15);
		int secondMax = list.stream().sorted().limit(list.size()-1).max(Integer::compareTo).get();
		System.out.println(secondMax);
	}
}
