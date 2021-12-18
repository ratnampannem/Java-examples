package com.threads;

public class ThreadByRunnable implements Runnable {
	public static void main(String[] args) {
		
		ThreadByRunnable thobj = new ThreadByRunnable();
		Thread th = new Thread(thobj);
		th.start();
		 System.out.println("This code is outside of the thread");
	}

	@Override
	public void run() {
		System.out.println("This code is running in a thread");
	  }
		
	
}
