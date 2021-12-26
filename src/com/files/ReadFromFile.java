package com.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) {
		
		try{
			File f = new File("Text1.txt");
			Scanner dataReader = new Scanner(f);
			while(dataReader.hasNextLine()){
				String fileData = dataReader.nextLine();
				System.out.println(fileData);
			}
			dataReader.close();
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
}
