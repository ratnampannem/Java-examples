package com.strings;

public class PalindromeStringExample {
	
	public static void main(String[] args) {
		String s = "MADAMA";
		if(s!= null){
			char[] chArray = s.toCharArray();
			/**for(char c :chArray){
				System.out.println(c);
			}*/
			System.out.println("INPUT String is " + s);
			StringBuilder sb = new StringBuilder();
			for( int i=chArray.length-1; i>=0; i--){
				sb.append(chArray[i]);
				
			}
			
			System.out.println(sb.toString());
			
			String s2 = sb.toString();
			 if(s2.equals(s)){
				 System.out.println("String is Palindrome.");
			 }else{
				 System.out.println("String is  not Palindrome.");
			 }
			
			
		
		}else{
			System.out.println("String is null");
		}
	}
}
