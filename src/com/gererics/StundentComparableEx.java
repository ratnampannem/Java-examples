package com.gererics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StundentComparableEx {

		public static void main(String[] args) {
			
			List<Student> studentList = new ArrayList<Student>();
			Student s1 = new Student();
			s1.setId(15);
			s1.setName("likith");
			Student s2 = new Student();
			s2.setId(70);
			s2.setName("lirith");
			Student s3 = new Student();
			s3.setId(7);
			s3.setName("kalyan");
			Student s4 = new Student();
			s4.setId(40);
			s4.setName("mahi");
			
			studentList.add(s1);
			studentList.add(s2);
			studentList.add(s3);
			studentList.add(s4);
			
			
			Collections.sort(studentList);
			
			for(Student student : studentList){
				System.out.println("Student  name : " + student.getName() + "   Id : " + student.getId());
			}
			
			
			
			
		}
	
}
