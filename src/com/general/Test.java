package com.general;

public class Test {
	public static void main(String[] args) {
	
		String str = "Hello hai how are you? welcome hhh nnn jjj bhgjhg kji";
		String[] strArray = str.split(" ");
		
		System.out.println(strArray.length);
		
		/**for(int i=0; i<=strArray.length ;i++) {
			System.out.println(strArray[i]);
		}*/
		
		for(String s:strArray) {
			System.out.println(s);
		}
	}
}
