package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	 public static void main(String[] args)
	    {
	 
	        // Content to be assigned to a file
	        // Custom input just for illustratinon purposes
	        String text
	            = "Computer Science Portal GeeksforGeeks \n hello";
	 
	        // Try block to check if exception/s occurs
	        try {
	            // Create a FileWriter object
	            // to write in the file
	            FileWriter fWriter = new FileWriter(
	                "D:\\JAVA\\JavaGitWorkspace\\Java-examples\\Text1.txt");
	 
	            // Write into the file
	            // The content taken above inside the string
	            fWriter.write(text);
	 
	          // Printing the contents of a file
	            System.out.println(text);
	 
	            // Close the file writer object
	            fWriter.close();
	 
	            // Display message to be printed on the console
	            // window after successful execution of the
	            // program
	            System.out.println(
	                "File is created successfully with the content.");
	        }
	 
	        // Catch block to handle if exception occurs
	        catch (IOException e) {
	            // Print the exception
	            System.out.print(e.getMessage());
	        }
	    }
}
