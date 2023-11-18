package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car(2, true);
		
	Polymorphism obj = new Polymorphism();
	obj.annualIncomeVoid();

	}
	
	
	//Void Method
	
	
	public void annualIncomeVoid(){
		
		
	int calculateAnnualIncome = hourlyIncome *2000;
	
	int bonus =25000;
	int rent =15000;
	int side =10000;
	int totalIncome = calculateAnnualIncome +bonus +rent +side;
	
	System.out.println( "My Annual Income = "+ totalIncome);
	
	}
	
	
	public static void car(){
		
		System.out.println("My car is Tesla");
	}
	
	
	
	public static void car(String color){
		
		System.out.println("My car is Tesla It has color:" +color);
	}
	
	public static void car(int door, String name){
		
		System.out.println("My car is Tesla It has door: " +door + ", It has name: " + name);
	}
	
	public static void car(int door, int seat){
		
		System.out.println("My car is Tesla! It has door" +door + ",It has seat :"+seat);
	

     }
	
        public static void car(int mirror, Boolean key){
		
		System.out.println("My car is Tesla! It has door" +mirror + ",It has key :"+ key);
	

     }
	
	
   
	

	
	
}
