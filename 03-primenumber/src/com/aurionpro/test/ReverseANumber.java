package com.aurionpro.test;

public class ReverseANumber {

	public static void main(String[] args) {
		int n = 12345, reverse = 0;
		for (; n != 0; n = n / 10) { // n divide by 10
			int digit = n % 10; // remainder of n
			reverse = reverse * 10 + digit;
		}
		System.out.println("reverse no is: " + reverse);

	}

}
