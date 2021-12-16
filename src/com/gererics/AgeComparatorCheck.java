package com.gererics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgeComparatorCheck {

	public static void main(String[] args) {
		
		AgeComparatorCheck a = new AgeComparatorCheck();
		a.sortList();
		
	}

	private void sortList() {
		
		List<StudentInfo> sinfoList = new ArrayList<StudentInfo>();
		sinfoList.add(new StudentInfo(12, "AMAN", 100));
		sinfoList.add(new StudentInfo(26, "SAI", 60));
		sinfoList.add(new StudentInfo(5, "HEMA", 20));
		
		Collections.sort(sinfoList, new AgeComparator());
		
		for(StudentInfo s : sinfoList){
			System.out.println("Student Age is " + s.age);
		}
	}
	
	
}
