package com.readinginput;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class FactorialExample {
	Logger logger = Logger.getLogger(FactorialExample.class);
	public static void main(String[] args) {
		FactorialExample f = new FactorialExample();
		f.getFactorial();
	}

	private void getFactorial() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 20 :");
		int n= sc.nextInt();
		
			logger.info("Provided value is : " + n +" Ecpected input value should be less than 20" );
		
			logger.info("Provided input value is : " + n);
			int fact=1;
			for(int i=1; i<=n; i++){
				fact = fact*i;
			}
			System.out.println("Factorial is " + fact);
			logger.info("Output factorial value is : " + fact);
		
	}
}
