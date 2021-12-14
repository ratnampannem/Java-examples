package com.strings;

public class PalindromeExample {
	public static void main(String[] args) {
		int sum=0,r,temp;
		int n=962;
		
		temp=n;
		while(n>0){
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		
		if(temp == sum){
			System.out.println(" Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
		
	}
}
