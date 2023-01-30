package com.aurionpro.test;

import com.aurionpro.test.model.Circle;

public class ReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle=new Circle();
		circle.radius=10;
		changeReferenceTestByValue(circle.radius);
		System.out.println(circle.radius);
		changeReferenceTestToZero(circle);
		System.out.println(circle.radius);
	}

	private static void changeReferenceTestByValue(double radius) {
		// TODO Auto-generated method stub
		
	}

	private static void changeReferenceTestToZero(Circle cir) {
		// TODO Auto-generated method stub
		cir.radius=0;
	}

}
