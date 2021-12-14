package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		MapExample mapEx = new MapExample();
		mapEx.getInfo();
	}

	private void getInfo() {
		
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "Apple");
		hmap.put(2, "Banana");
		hmap.put(3, "Grapes");
		hmap.put(4, "Mango");
		
		for(Map.Entry entry : hmap.entrySet()){
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
			
		}
		
		
		for(Integer i : hmap.keySet()){
			System.out.println(" KEY " + i + " VALUE " + hmap.get(i));
		}
	
	
	
	}
	
}
