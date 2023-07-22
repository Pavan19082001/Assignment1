package com.javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyList {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = new ArrayList<>(list1);
		list2.add(6);
		list2.add(7);
		System.out.println(list2);
	}
}
