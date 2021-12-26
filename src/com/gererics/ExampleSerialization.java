package com.gererics;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;




	
public class ExampleSerialization {
	public static void main(String[] args) {
		try{
			
			StudentInfo s1 = new StudentInfo(22, "mahi", 30);
			FileOutputStream fout = new FileOutputStream("C:\\Mahi\\JavaGitWorkspace\\Java-examples\\f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println(" Success......");
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
