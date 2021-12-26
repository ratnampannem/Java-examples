package com.files;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		File f = new File("Text.txt");
		if(f.exists()){
			System.out.println("File name is " + f.getName());
			System.out.println("The absolute path is " + f.getAbsolutePath());
			System.out.println("Is  file writeble? " + f.canWrite());
			System.out.println("Is file readable? " +f.canRead());
			System.out.println("File lengtn is "+ f.length());
		
		}else{
			System.out.println("File does not exist");
		}
	}

}
