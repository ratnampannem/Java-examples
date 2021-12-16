package com.gererics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	
	public static void main(String[] args) {
		
		List<Laptop> laptopList = new ArrayList<>();
		Laptop lap = new Laptop();
		lap.setPrice(5000);lap.setName("HP");
		Laptop lap1 = new Laptop();
		lap1.setPrice(1000);lap1.setName("DELL");
		Laptop lap2 = new Laptop();
		lap2.setPrice(500);lap2.setName("LENOVO");
		Laptop lap3 = new Laptop();
		lap3.setPrice(10000);lap3.setName("MSI");
		
		laptopList.add(lap);
		laptopList.add(lap1);
		laptopList.add(lap2);
		laptopList.add(lap3);
		
		
		Collections.sort(laptopList);
		
		for(Laptop l : laptopList){
			System.out.println(l.getName());
		}
				
	}
}
