package com.set;

import java.util.HashSet;
import java.util.Set;

import com.gererics.Laptop;

import java.util.Objects;


public class Employee {
	 
	 String name;
	 int salary;
	 
	 public Employee(String name, int salary){
		 this.name = name;
		 this.salary = salary;
	
	 } 
		 
		public boolean equals(Object o) {

		        //if (o == this) return true;
		        if (!(o instanceof  Employee)) {
		            return false;
		           
		        }
		        Employee emp = ( Employee) o;
		        return salary == emp.salary && Objects.equals(name, emp.name);
		                //&& Objects.equals(passport, user.passport);
		    }

		    @Override
		    public int hashCode() {
		        return Objects.hash(name, salary);
		    }
	 
	 
	 public static void main(String[] args) {
		 
		 Set<Employee> empSet = new HashSet<Employee>();
		 
		 empSet.add(new Employee("abc", 6000));
		 empSet.add(new Employee("xz", 5000));
		 empSet.add(new Employee("abc", 6000));
		 empSet.add(new Employee("pqr", 3000));
		 empSet.add(new Employee("abc", 6000)); 
		 empSet.add(new Employee("abc", 6000));
		 
		 for(Employee e : empSet){
			 
			 System.out.println(e.name +" "  +e.salary);
		 }
		 
		 /**Employee e1 = new Employee("abc", 10000);
		 Employee e2 = new Employee("abc", 10000);
		 
		 if(e1.equals(e2))
			 System.out.println("Both are equal");
		 else 
			 System.out.println("Both are different");*/
	}
}
