package com.gererics;

import java.util.Comparator;

public class AgeComparator implements Comparator<StudentInfo>{

		/**public int compare(Object o1,Object o2){
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
		}*/

		@Override
		public int compare(StudentInfo s1, StudentInfo s2) {
			if(s1.age==s2.age) 
				return 0;  
			else if(s1.age>s2.age)  
				return 1;  
			else  
				return -1;
		}  

}



