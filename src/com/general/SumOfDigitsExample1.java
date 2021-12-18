package com.general;

public class SumOfDigitsExample1 {
	public static void main(String[] args) {
		
		int n=586256,sum=0,digit;
		
		while(n>0){
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		
		/**for(sum=0; n!=0; n=n/10){
			sum = sum+n%10;
				
		}*/
		System.out.println("Sum is " + sum);
				
	}
}
