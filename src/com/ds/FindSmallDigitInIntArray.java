package com.ds;

public class FindSmallDigitInIntArray {
	public static void main(String[] args) {
		
		int[] numArray = {9,  6, 8,  7, 5};
		int small=0;
		for(int i : numArray){
			if(small<i && small==0){
				small = i;
			}else if(small>i){
				small = i;
			}
		}
		System.out.println("Small digit is " + small);
	}
}
