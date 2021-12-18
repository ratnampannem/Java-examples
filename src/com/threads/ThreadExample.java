package com.threads;

public class ThreadExample extends Thread{
	public static void main(String[] args) {
		
		ThreadExample th = new ThreadExample();
		th.start();
		System.out.println(" the code isoutside of a thread  ");
		
	}
	public void run(){
		System.out.println(" the code is running in a thread  ");
	}
}
