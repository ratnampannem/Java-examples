package com.general;

public class Driver {
	
	public static void main(String args[])
    {
        InterviewBit obj1 = new InterviewBit();
        int result = obj1.calculate(2, 3);
        System.out.println("Result: " + result);   
        
        String i = 100+100+"Hai";
        
        System.out.println(100 + 100 +"Simplilearn");   

        System.out.println("E-Learning Company" + 100 + 100); 
    }
	
	
	/**public static void main(String args[])
    {
        InterviewBit obj1 = new InterviewBit();
        InterviewBit obj2 = new InterviewBit();   
        obj1.num1 = 0;
        obj1.num2 = 0;
        obj1.calculate(1, 2);
        obj2.num1 = 0;
        obj2.calculate(2, 3);
        System.out.println(obj1.num1 + " " + obj2.num2);     
    }*/
}



class InterviewBit{
	
	int calculate(int a, int b)
    {
        try{
            return a-b;
        }catch(Exception e){
            return a+b;
        }finally{
            return a*b;
        }
    }
	
	
    /**public int num1;
    static int num2;
    void calculate(int a, int b)
    {
        num1 +=  a ;
        num2 +=  b;
    }*/
}