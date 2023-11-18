package com.upskill.assignment_2;

public class Assignment2_3 {
	
	//Write two java functions which will return two different integer values, write a 
   // program to compare those numbers and send message that one number is bigger 
	
	public static void main (String[]args){
		
		compareNumbers();
		
		
	}	
	
	
	public static int myFunction1(){
		
		int a=15;
		return a;
		
		}
	
   public static int myFunction2(){
	   
	   int b=15;
	   return b;
	   
	   
   }
   
   public static void compareNumbers(){
	   
	   if (myFunction1()> myFunction2()){
		   
		   System.out.println(" 1st Function is bigger then 2nd Function");
		   
		 }
	   
	   else if (myFunction1()== myFunction2()){
		   
		   System.out.println("They are equal");
	   }
	   
	   else {
		   
		   System.out.println(" 2st Function is bigger then 1nd Function");
		   
	   }
	   
   }

}
