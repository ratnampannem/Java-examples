package com.strings123;

public class CamelCaseToSnakeCase {
	public static void main(String[] args) {
		CamelCaseToSnakeCase cs = new CamelCaseToSnakeCase();
		cs.camelCaseToSnakeCase();
		//cs.camelCaseToSnakeCaseWords();
	}
	
	
	private void camelCaseToSnakeCaseWords() {
		String s = "HAI HELLO WELCOME abc";
		if(s != null){
			String[] strArray = s.split(" ");
			StringBuilder sb = new StringBuilder();
			for(String str : strArray) {
				System.out.println(str);
				sb.append(str + "_");
			}
			System.out.println(sb.toString());
		}
		
	}


	public void camelCaseToSnakeCase(){
		
		char nc;
		String  camel = "FileNotFoundException";
		StringBuilder stringBuilder = new StringBuilder();
		
		
		for ( char c : camel.toCharArray()) {
		    nc = true ? Character.toUpperCase(c) : Character.toLowerCase(c);
		    	if (Character.isUpperCase(c)) {
		    		stringBuilder.append('_').append(nc);
		    	} else {
		    		stringBuilder.append(nc);
		    		System.out.println(stringBuilder.toString()); 
		    	}
		}
		
	}	    
}
