package com.polymorphism.overloading;

public class TestOverloading1 {
	public static void main(String[] args){  

		TestOverloading1 t = new TestOverloading1();
		System.out.println(t.add(117777777,11));  
		System.out.println(t.add(11,11,11));  
		System.out.println(t.add(11,"abc")); 
		System.out.println(t.add("hello ","wold"));

		}
	
		int add(int a,int b){return a+b;}  
		int add(int a,int b,int c){return a+b+c;}  
		int add(int b,String c){return 10;} 
		String add(String b,String c){return b + c;}
		long add(long a,long b){return 2000;}

}
