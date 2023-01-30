package com.aurionpro.test;

import java.util.Scanner;

public class Treasure {

	public static void main(String []args)
	{
		System.out.println("please choose left or right");
		Scanner sc=new Scanner(System.in);
		String option=sc.nextLine();   //to take user input
		if(option.equalsIgnoreCase("left"))
		{
			System.out.println("swim or wait");
			String option1=sc.nextLine();
			if(option1.equalsIgnoreCase("wait"))
			{
				System.out.println("which door");
				String option2=sc.nextLine();
				if(option2.equalsIgnoreCase("red"))
				{
					System.out.println("burned by fire");
				}
				else if(option2.equalsIgnoreCase("blue"))
				{
				    System.out.println("eaten by beasts");
				}
				else if(option2.equalsIgnoreCase("yellow")) {
					System.out.println("you win");
				}
				else {
					System.out.println("game over");
				}
			}
			else {
				System.out.println("attacked by trout");
			}
		}
		else
		{
			System.out.println("fall into hole");
		}	
	}
}