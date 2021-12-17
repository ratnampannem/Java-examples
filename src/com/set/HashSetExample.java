package com.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
		HashSetExample hsetEx = new HashSetExample();
		hsetEx.sortHashset();
		
		
		
	}

	private void sortHashset() {
		
		Set<String> hset = new HashSet<String>();
		hset.add("Hari");
		hset.add("Ravi");  
		hset.add("Mahesh");
		hset.add("ravi");  
		hset.add("Ajay");
		hset.add("ravi");
		
		for( String s : hset){
			
			System.out.println(s);
			
		}
		
	}
}
