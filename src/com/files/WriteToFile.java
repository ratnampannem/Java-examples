package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try{
			
			FileWriter fwrite = new  FileWriter("Text1.txt");
			fwrite.write("A named location used to store the data is called a file.");
			fwrite.write("File Operations  are");
			fwrite.write("1.Create a File");
			fwrite.write("2.Get File Information");
			fwrite.write("3.Write to a File");
			fwrite.write("4.Read from a File");
			fwrite.write("5.Delete a File");


			fwrite.close();
			System.out.println("Content is successfully written into file");
			
		}catch(IOException e){
			System.out.println("Filed does not exists");
			e.printStackTrace();
		}
		
		
	}

}
