package com.gererics;

public class Student implements Comparable<Student>{

		String name;
		int id;
		int age;
		double percentage;
		
		public void setName(String name){
			 this.name = name;
		}
		public void setId(int id){
			 this.id = id;
		}
		public void setAge(int age){
			 this.age = age;
		}
		public void setPercentage(double percentage){
			 this.percentage = percentage;
		}
		public int getId(){
			return id;
		}
		public int getAge(){
			return age;
		}
		public String getName(){
			return name;
		}
		public double getPercentage(){
			return percentage;
		}
	
		public int compareTo(Student s){
			
			/**if(this.id > s.id){
				//return 1;
				return -1;
			}else if(this.id < s.id){
				//return -1;
				return 1;
			}else{
				return 0;
			}*/
			return this.name.compareTo(s.name);
		}
}
