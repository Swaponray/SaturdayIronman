package com.upskill.java_1;

public class MethodType {
	
	
	
	/* Types of Method
	 * 1.Void Method
	 * 2.State Method
	 * 3.Return Type Method
	 */

	
	public static int hourlyIncome =65;
	
	public static void main (String[]args){
		
		MethodType obj = new MethodType();
		
		obj.annualIncomeVoid();
		obj.monthlyIncomeReturn();
		
		System.out.println( "My Monthly Income = "+obj.monthlyIncomeReturn());
		
		weeklyIncomeStatic();
	}
	//Void Method
	
	
	public void annualIncomeVoid(){
		
		
	int calculateannualIncome = hourlyIncome *2000;
	
	System.out.println( "My Annual Income = "+calculateannualIncome);
	
	}
	
	//Return Type Method
	
	public int monthlyIncomeReturn(){
		
		
	int calculatemonthlyIncome = hourlyIncome *180;
	
	return calculatemonthlyIncome;
	
	
	}
	
	//Static Method
	
	public static void weeklyIncomeStatic(){
		
		
	int calculateweeklyIncome = hourlyIncome *40;
	
	System.out.println( "My Weekly Income = "+calculateweeklyIncome);
	
	
	}
}
