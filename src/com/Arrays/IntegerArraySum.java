package com.Arrays;

import org.apache.log4j.Logger;

public class IntegerArraySum {
	static Logger logger = Logger.getLogger(IntegerArraySum.class);
	public static void main(String[] args) {
		
		logger.debug("this is a debug log message 111");
        logger.info("this is a information log message 111");
        logger.warn("this is a warning log message 1111");
		
		int[] intArray = {10,20,5,50,30,60,70};
		int sum=0,length = intArray.length;
			System.out.println( "length is " + length);
			System.out.println( "index is " + intArray[0]);
		
		for( int i=0; i<length; i++){
			
			sum = sum + intArray[i];
			
		}
		System.out.println( "Sum is 11111sss " + sum);
	}
}
