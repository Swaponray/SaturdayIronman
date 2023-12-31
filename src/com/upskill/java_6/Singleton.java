package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object
	//Private constructor, it prevents any other class from instantiating
	
	private Singleton(){
		
		
		
		
	}
	
	//Private static object of the class
	
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){
		
		return SingletonObj;
		
	}
	protected static void demo1(){
		
		System.out.println(" Demo i method for singleton class");
		
	}
	
	protected static void demo2(){
		
		System.out.println(" Demo i method for singleton class");
		
	}
	
	protected static void demo3(){
		
		System.out.println(" Demo i method for singleton class");
		
	}
	
	// Singleton.java
	//Changes for Git Pull request practice
	
     protected static void demo4(){
		
		System.out.println(" Demo i method for singleton class");
		
	}

}
