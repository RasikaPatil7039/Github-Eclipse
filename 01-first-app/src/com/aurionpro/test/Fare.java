package com.aurionpro.test;

import java.util.Scanner;

public class Fare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalfair = 0;
		System.out.println("welcome");
		System.out.println("enter height");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt(); // to take user input
		// System.out.println("enter height");
		if (height > 12) {
			System.out.println("can ride");
			System.out.println("enter age");
			int age = sc.nextInt();
			if (age < 12) {
				totalfair = 5;
			} else if (age >= 12 && age < 18) {
				totalfair = 7;
			} else if (age >= 18 && age < 45) {
				totalfair = 12;
			} else if (age >= 45 && age <= 55) {
				totalfair = 0;
			}
			System.out.println("want photo yes or no");
			String photo = sc.next(); // for user input
			if (photo.equalsIgnoreCase("yes")) {
				totalfair = totalfair + 3;
				System.out.println("bill is" + totalfair);
			} else {
				System.out.println("bill is" + totalfair);
			}

		} else {
			System.out.println("cant ride");
		}

	}

}
