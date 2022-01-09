package com.gererics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameComparatorCheck {

	public static void main(String[] args) {
		
		NameComparatorCheck nameCheck = new NameComparatorCheck();
		nameCheck.sortList();
	}

	private void sortList() {
		
		List<StudentInfo> sinfoList = new ArrayList<StudentInfo>();
		
		sinfoList.add(new StudentInfo(65, "xyz", 25));
		sinfoList.add(new StudentInfo(120, "ABC", 31));
		//sinfoList.add(new StudentInfo(39, " MEEA", 28));
		//sinfoList.add(new StudentInfo(240, " KRUTIKA", 40));
		sinfoList.add(new StudentInfo(55, "hai", 12));
		sinfoList.add(new StudentInfo(87, "HAI", 29));
		sinfoList.add(new StudentInfo(30, "haI", 10));
		sinfoList.add(new StudentInfo(99, "HAi", 66));
		
		sinfoList.add(new StudentInfo(99, "H11", 66));
		sinfoList.add(new StudentInfo(99, "H111", 66));
		sinfoList.add(new StudentInfo(99, "H222", 66));
		sinfoList.add(new StudentInfo(99, "H22", 66));
		
		Collections.sort(sinfoList, new NameComparator());
		
		for(StudentInfo sinfo : sinfoList){
			System.out.println("Student name is " + sinfo.name + " \t "+ "Student age is " + sinfo.age);
		}
		
	}
}



class NameComparator implements Comparator<StudentInfo>{

	@Override
	public int compare(StudentInfo s1, StudentInfo s2) {
		
		return s1.name.compareTo(s2.name);
	}
	
	
}