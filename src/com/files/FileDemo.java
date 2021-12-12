package com.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		try{
			File file = new File("Text.txt");
			if(file.createNewFile()){
				System.out.println("New file created");
			}else{
				System.out.println("File aleady exists");
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
