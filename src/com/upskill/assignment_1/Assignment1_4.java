package com.upskill.assignment_1;

public class Assignment1_4 {
	
	//A function returns 30, another function returns 50. 
	//Write a java program which will display subtraction value from bigger number to smaller.
 
	public static int function1(){
	   
		return 30;
	}
	
	 
		public static int function2(){
		
			return 50;
		}
		
	public static void main(String[] args) {
		
		int num1 = function1();
		int num2 = function2();
		
		int result;
		
		if(num1 > num2){
			
			result = num1-num2;
		
		}
		else {
	
             result = num2-num1;
	}
		
		System.out.println("Subtraction value from the larger number to the smaller number:" + result);

}
}
