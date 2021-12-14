package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class StringEncodingExample {
	public static void main(String[] args) {
		StringEncodingExample en = new StringEncodingExample();
		en.getEncodedString();
	}

	private void getEncodedString() {
		 
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String s = "abcdaabbbcddpmmxyzxrtrt";
		if(s!= null){
			char[] chArray = s.toCharArray();
			for(char ch : chArray){
				//System.out.println(ch);
				if(map.get(ch)== null){
					map.put(ch, 1);
				}else{
					map.put(ch, map.get(ch)+1);
				}
			}
		}else{
			System.out.println("String is null");
		}
		//System.out.println(map);
		for(Character c : map.keySet()){
			System.out.println(" KEY " + c + " VALUE " + map.get(c));
		}
		
	}
	
}
