package com.aurionpro.test;

public class OverLoad {
public static void main(String[]args) {
	
	printinfo(1,2,3);
	printinfo(1,2);
	
}

private static void printinfo(int i, int j) {
	System.out.println("printinfo");
	
}

private static void printinfo(int i, int j, int k) {
	System.out.println("printinfo");
	
}


}
