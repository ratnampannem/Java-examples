package com.general;

public class MethodOverloadingEx {

	public void method1 (int num1,float num2){
        System.out.println("int-float method");
   }
   public void method1(float num1,int num2){
        System.out.println("float-int method");
   }
    public static void main(String[] args){
    	MethodOverloadingEx obj = new MethodOverloadingEx();
        //  obj.method1(40,20);
    }
}
