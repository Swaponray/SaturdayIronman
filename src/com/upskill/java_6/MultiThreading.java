package com.upskill.java_6;

public class MultiThreading {
	
	/* Multitreading is java feature that allowa concurrent execution of two or more parts of program.
	 * Threads can be created by using two mechanism.
	 * 
	 * 1. Extending the thread class
	 * 2.Implementing the Runnable Interface
	 */
	

	public static void main(String[] args) {
		 
		int n = 6;
		for ( int i= 0; i<n; i++){
			
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.start();
			
			Thread obj2 = new Thread (new MultithreadingRunable());
			obj2.start();
			
		}

	}

}
