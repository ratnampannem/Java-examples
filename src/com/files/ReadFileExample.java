package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
	public static void main(String[] args) {
		
		BufferedReader brReader = null;
		try {
			String strCurrentLine;

			//FileReader fr = new FileReader("D:\\JAVA\\JavaGitWorkspace\\Java-examples\\Text.txt");
			//BufferedReader br = new BufferedReader(fr);
			
			brReader = new BufferedReader(new FileReader("D:\\JAVA\\JavaGitWorkspace\\Java-examples\\Text.txt"));
			//brReader = new BufferedReader(new FileReader("D:\\Aari work\\aari1.jpg"));


			while ((strCurrentLine = brReader.readLine()) != null) {

				System.out.println(strCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {
				if (brReader != null)
					brReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
