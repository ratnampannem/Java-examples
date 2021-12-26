package com.strings123;

public class SubStrExample {
	
public static void main(String[] args) {
		
		String str = "Hello hai how are u ";
		String s1 = "HAI",s2 = "hello",s3,s4;
		int index,len;
		s3 = s1.toLowerCase();
		if(str!= null){
			len = str.length();
			System.out.println("Length is " + len);
			index = str.indexOf("are");
			System.out.println("Index is " + index);
		}else{
			System.out.println("Sting is null");
		}
		if(s1.equals(s2)){
			System.out.println("Stings  are same");
		}else{
			System.out.println("Stings are different");
		}
		System.out.println("LowerCase i" + s3);
	}

}
