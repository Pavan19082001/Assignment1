package com.patterns;

public class Pyramid {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int space=1; space<=i; space++) {
				System.out.print(space+" ");
			}
			System.out.println();
		}
	}
}
