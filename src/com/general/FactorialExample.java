package com.general;

public class FactorialExample {
	public static void main(String[] args) {
		FactorialExample factEx = new FactorialExample();
		factEx.getFactorial();
	}

	private void getFactorial() {
		
		int n=9,fact=1;
		for(int i=1; i<=n; i++){
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}
}
