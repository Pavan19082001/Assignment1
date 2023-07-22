package com.javaPractice;

//find the sum of consecutive num from given array.

public class MinSum {
	public static void main(String[] args) {
		int[] n = new int[] {1,2,-1,-3,4,-5};
		
		int minSum = Integer.MAX_VALUE;
		int currSum = 0;
		
		for(int num: n) {
			currSum += num;
			minSum = Math.min(minSum, currSum); 
			
			if(currSum > 0) {
				currSum = 0;
			}
		}
		System.out.println(minSum);
	}
}
