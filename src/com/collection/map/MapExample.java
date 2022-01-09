package com.collection.map;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.Arrays.IntegerArraySum;

public class MapExample {
	
	static Logger logger = Logger.getLogger(MapExample.class);
	public static void main(String[] args) {
		logger.debug("this is a debug log message MMMMMM");
		MapExample mapEx = new MapExample();
		mapEx.getInfo();
	}

	private void getInfo() {
		
		logger.debug("this is a debug log message MMMMMM 1");
        logger.info("this is a information log message MMMMMM 1");
        logger.warn("this is a warning log message MMMMMM 1");
		
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
