package com.ioconsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	
	public static void main(String[] args) throws IOException    
    {   
		System.out.println("Enter the name of the person");  
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
        String name = reader.readLine();   
        System.out.println("Welcome " + name);           
    }
}
