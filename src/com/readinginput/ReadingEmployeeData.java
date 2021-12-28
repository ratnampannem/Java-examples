package com.readinginput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingEmployeeData {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name :");
		String name = br1.readLine();
		//System.out.println(" your name :" + name);
		System.out.println("Enter your age :");
		int age = Integer.parseInt(br1.readLine());
		System.out.println("Enter your phone number :");
		int number =Integer.parseInt(br1.readLine());
	
		Employee e = new Employee(name, age, number);
		e.getEmployee();
	}
}



class Employee{
	
		String name;
		int age;
		int number;
		public Employee(String name, int age, int number) {
			super();
			this.name = name;
			this.age = age;
			this.number = number;
		}
		
		public void getEmployee(){
			System.out.println("Name :" + this.name);
			System.out.println("Age :" + this.age);
			System.out.println("Number :" + this.number);
		}
		
}