package com.javaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// shuffle an array

public class Ex45 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Collections.shuffle(list);
		
		System.out.println(list);
	}
}
