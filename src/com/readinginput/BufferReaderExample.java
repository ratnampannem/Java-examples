package com.readinginput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter your name :");
		String name = br.readLine();
		System.out.println("Your name is "+ name);
		
	}
}
