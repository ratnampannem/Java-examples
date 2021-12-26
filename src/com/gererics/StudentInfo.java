package com.gererics;

import java.io.Serializable;

public class StudentInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int rollno;  
	String name;  
	int age;  
	StudentInfo(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
}
