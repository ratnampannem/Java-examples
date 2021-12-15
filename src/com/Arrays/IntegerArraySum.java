package com.Arrays;

public class IntegerArraySum {
	public static void main(String[] args) {
		
		int[] intArray = {10,20,5,50,30};
		int sum=0,length = intArray.length;
			System.out.println( "length is " + length);
			System.out.println( "index is " + intArray[0]);
		
		for( int i=0; i<length; i++){
			
			sum = sum + intArray[i];
			
		}
		System.out.println( "Sum is  " + sum);
	}
}
