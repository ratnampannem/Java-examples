package com.designpatterns;

public class SingleObject {

		private static SingleObject sobj = new SingleObject();
		
		private SingleObject(){}
		
		public static SingleObject getInstance(){
			
			return sobj;
		}
		
		public void showMessage(){
			System.out.println(" Hello world ");
		}
		
		
}
