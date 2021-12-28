package com.readinginput;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String[] args) {
		
		FactorialExample f = new FactorialExample();
		f.getFactorial();
		
	}

	private void getFactorial() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++){
			fact = fact*i;
		}
		System.out.println("Factorial is " + fact);
		
	}
}
