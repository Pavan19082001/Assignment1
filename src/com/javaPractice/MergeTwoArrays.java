package com.javaPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] arr1 = {34,56,23,78};
		int[] arr2 = {3,2,6,7,9};
		
		int[] mergedList = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
		for(int a: mergedList) {
			System.out.print(a+" ");
		}
	}
}
