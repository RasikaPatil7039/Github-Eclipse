package com.aurionpro.test;

public class ArrayReferenceTest {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		convertArrayElementsToZero(numbers);
		for (int i = 0; i < numbers.length; i++)//for read
		System.out.println(numbers[i]);

	}

	private static void convertArrayElementsToZero(int[] numbers) {

		for (int i = 0; i < numbers.length; i++)//for write
			numbers[i] = 0;

	}

}

