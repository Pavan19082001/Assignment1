package com.javaPractice;

public class LeapYear {
	public static void main(String[] args) {
		int year = 1992;
		
		if((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
			System.out.println("Given year is a leap year");
		}else {
			System.out.println("Given year is not a leap year");
		}
	}
}
