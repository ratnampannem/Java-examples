package com.gererics;

public class Laptop implements Comparable<Laptop>{

		String name;
		int ram; 
		int price;
		
		/**public Laptop(String name,int ram,int price){
			
			this.name = name;
			this.ram = ram;
			this.price = price;
		}*/
		
		public void setName(String name){
			this.name=name;
		}
		public String getName(){
			return name;
		}
		public void setRam(int ram){
			this.ram=ram;
		}
		public int getRam(){
			return ram;
		}
		public void setPrice(int price){
			this.price=price;
		}
		public int getPrice(){
			return price;
		}
		
		public int compareTo(Laptop lap){
			/**if(this.price > lap.price){
				return  -1;
			}else if(this.price < lap.price){
				return  1;
			}else{
				return  0;
			}*/
			return this.name.compareTo(lap.name);
			
			
		}
		
}
