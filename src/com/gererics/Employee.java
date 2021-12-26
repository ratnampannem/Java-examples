package com.gererics;

public class Employee implements Cloneable {
	
		int empno; 
		String name;
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}	
		
		  
		Employee(int empno,String name){  
			this.empno = empno;  
			this.name = name;  
		}
				  
		public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}
		
		  
		public static void main(String args[]){  
			try{  
				Employee e1=new Employee(101,"xyz");  
				System.out.println("e1 object " + e1.empno+" "+e1.name); 
				
				
				Employee e3 = e1;
				System.out.println("e3 object " + e3.empno+" "+e3.name);
				
				Employee e2=(Employee)e1.clone();  
		  				  
				System.out.println("e2 object " + e2.empno+" "+e2.name); 
				
				e1.setName("ABC");
				
				System.out.println("e1 object " + e1.empno+" "+e1.name); 
				
				System.out.println("e3 object " + e3.empno+" "+e3.name);
		  				  
				System.out.println("e2 object " + e2.empno+" "+e2.name);
				
				
		  
			}catch(CloneNotSupportedException e){
				System.out.println(e);
			}  
		}
}
