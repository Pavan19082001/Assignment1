package com.javaPractice;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AvgOfNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt(), n2 = in.nextInt(), n3 = in.nextInt(), n4 = in.nextInt(), n5 = in.nextInt(), n6 = in.nextInt(),
				n7 = in.nextInt(), n8 = in.nextInt(), n9 = in.nextInt(), n10 = in.nextInt();
		
		OptionalDouble avgOfNum = IntStream.of(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10).average();
		System.out.println(avgOfNum);
	}
}
